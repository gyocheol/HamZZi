import React, { useRef, useEffect, useState } from "react";
import api from "../../components/api";

const ShopModal = ({
  setIsModal,
  setIsModal3,
  onBuyItem,
  id,
  cost,
  type,
  onGetItemUserNickList,
  onGetItemAllList,
}) => {
  const onCloseModal = () => {
    setIsModal(false);
  };
  const nickname = localStorage.getItem("nickname");
  console.log(id);

  const onBuyItem2 = async (id) => {
    await api
      .post(`/api/item/createItemUser/${id}`, {
        nickname: nickname,
      })
      .then((res) => {
        console.log(`아이템을 구매`);
        console.log(res);
        // setMyItem(res.data);
        // setIsModal(false) // 구매하면 모달닫기
        onGetItemAllList(); // 상점 전체 아이템
        onGetItemUserNickList(); // 내가 산 아이템 보기
        // // getAllProfile();
        // getShopUpdate()
      })
      .catch((err) => {
        console.log(err);
      });
  };

  const buybuy = () => {
    onBuyItem2(id);
    setIsModal3(true);
    setIsModal(false);
  };

  return (
    <div className="ShopmodalBody">
      <div className="ShopTitle">
        {type === "모자" ? <img src={`chara/hat/hat${id}.png`} alt="" /> : null}
        {type === "옷" ? (
          <img src={`chara/cloth/cloth${id}.png`} alt="" />
        ) : null}
        {type === "배경" ? (
          <img src={`chara/deco/deco${id}.png`} alt="" />
        ) : null}
        {/* <img src={`hamzzibody/hamzzi${id + 1}.png`} alt="" /> */}
      </div>

      <div className="Cost">
        <img src={`coin.png`} alt="" />
        {cost}
      </div>
      <div className="ShopModalBtnList">
        <div className="ShopModalBtn" onClick={buybuy}>
          <img src="shop/buybtn.png" alt="" />
        </div>
        <div className="ShopModalBtn" onClick={onCloseModal}>
          <img src="shop/cancelbtn.png" alt="" />
        </div>
      </div>

      {/* <div>안녕하세용</div> */}
    </div>
  );
};

export default ShopModal;
