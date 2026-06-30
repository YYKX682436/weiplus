package r45;

/* loaded from: classes5.dex */
public class dv1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public dv1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, ya.b.ITEM_LIST, r45.l92.class), com.tencent.mm.protobuf.i.r(3, "add_product_url", r45.c33.class), com.tencent.mm.protobuf.i.a(4, "live_cookies"), com.tencent.mm.protobuf.i.r(5, "customed_cs_app", r45.c33.class), com.tencent.mm.protobuf.i.r(6, "preload_info", r45.ve2.class), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.r(8, "order_info_url", r45.c33.class), com.tencent.mm.protobuf.i.u(9, "shop_request_id"), com.tencent.mm.protobuf.i.i(10, "product_count"), com.tencent.mm.protobuf.i.i(11, "coupon_count"), com.tencent.mm.protobuf.i.r(12, "direct_cs_info", r45.h92.class), com.tencent.mm.protobuf.i.r(13, "replay_record_setting", r45.nt2.class), com.tencent.mm.protobuf.i.n(14, "ext_flag"), com.tencent.mm.protobuf.i.c(15, "has_virtual_product"), com.tencent.mm.protobuf.i.u(16, "business_license_path"), com.tencent.mm.protobuf.i.r(17, "shop_window_profile_info", r45.e56.class), com.tencent.mm.protobuf.i.u(18, "coupon_list_wording"), com.tencent.mm.protobuf.i.r(19, "license_jump_info", r45.qv2.class), com.tencent.mm.protobuf.i.r(20, "flash_sale_order_setting", r45.j31.class), com.tencent.mm.protobuf.i.r(21, "jump_shop_bag_url", r45.c33.class), com.tencent.mm.protobuf.i.r(22, "shop_shelf_order_setting", r45.yv2.class), com.tencent.mm.protobuf.i.r(23, "shop_vip_info", r45.a56.class), com.tencent.mm.protobuf.i.r(24, "order_info_hint_info", r45.wv2.class), com.tencent.mm.protobuf.i.s(25, "label_classify_info_list", r45.xv2.class), com.tencent.mm.protobuf.i.r(26, "flash_sale_setting", r45.k31.class), com.tencent.mm.protobuf.i.r(27, "select_product_center_home_page", r45.c33.class), com.tencent.mm.protobuf.i.r(28, "add_prelive_products_page_info", r45.l11.class), com.tencent.mm.protobuf.i.i(29, "anchor_open_shelf_jump_page_type"), com.tencent.mm.protobuf.i.i(30, "anchor_thousand_fans_limit_flag"), com.tencent.mm.protobuf.i.i(31, "anchor_can_use_pre_hot_or_live_exclusive_price_flag"), com.tencent.mm.protobuf.i.r(32, "anchor_money_off_coupon_list_info", r45.tv2.class), com.tencent.mm.protobuf.i.r(35, "ask_for_promote_setting", r45.uv2.class), com.tencent.mm.protobuf.i.r(36, "shop_window_coupon_info", r45.c56.class), com.tencent.mm.protobuf.i.r(37, "platform_discount_coupon_list_info", r45.zv2.class), com.tencent.mm.protobuf.i.r(38, "click_product_management_open_page", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.r(41, "top_guide_bar", bw5.zv.class), com.tencent.mm.protobuf.i.s(42, "header_buttons", bw5.xv.class), com.tencent.mm.protobuf.i.u(43, "coupon_list_extra_report_json"), com.tencent.mm.protobuf.i.r(44, "shelf_coupon_banner_info", bw5.jj0.class), com.tencent.mm.protobuf.i.r(45, "shelf_message_entrance_info", bw5.kj0.class), com.tencent.mm.protobuf.i.r(46, "live_presenter_info", bw5.q30.class), com.tencent.mm.protobuf.i.r(47, "add_product_jump_info", bw5.x7.class), com.tencent.mm.protobuf.i.u(48, "live_room_buffer"), com.tencent.mm.protobuf.i.r(49, "shop_bag_jump_info", bw5.x7.class), com.tencent.mm.protobuf.i.u(50, "shop_bag_top_pag_url"), com.tencent.mm.protobuf.i.a(100, "last_buffer"), com.tencent.mm.protobuf.i.i(101, "continue_flag"), com.tencent.mm.protobuf.i.a(102, "coupon_list_last_buffer"), com.tencent.mm.protobuf.i.i(103, "coupon_list_continue_flag"), com.tencent.mm.protobuf.i.n(104, "version"));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
