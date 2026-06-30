package r45;

/* loaded from: classes.dex */
public class x71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public x71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "live_contacts", r45.xn1.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.s(4, "offline_contacts", r45.xn1.class), com.tencent.mm.protobuf.i.n(5, "reward_total_amount_in_heat"), com.tencent.mm.protobuf.i.i(6, "online_member_count"), com.tencent.mm.protobuf.i.i(7, "offline_member_count"), com.tencent.mm.protobuf.i.r(8, "self_contact", r45.xn1.class), com.tencent.mm.protobuf.i.a(9, "live_contacts_last_buffer"), com.tencent.mm.protobuf.i.i(10, "live_contacts_continue_flag"), com.tencent.mm.protobuf.i.i(11, "live_contacts_max_display_count"), com.tencent.mm.protobuf.i.s(12, "recent_reward_contacts", r45.r62.class), com.tencent.mm.protobuf.i.n(13, "live_heat_value"), com.tencent.mm.protobuf.i.u(14, "ad_img_url"), com.tencent.mm.protobuf.i.n(15, "preview_live_online_member_count"), com.tencent.mm.protobuf.i.u(16, "live_heat_value_str"), com.tencent.mm.protobuf.i.i(17, "board_member_count"), com.tencent.mm.protobuf.i.u(18, "live_participate_member_count_str"), com.tencent.mm.protobuf.i.u(19, "live_online_count_str"), com.tencent.mm.protobuf.i.i(20, "live_online_member_board_version"), com.tencent.mm.protobuf.i.a(21, "business_filter_buffer"), com.tencent.mm.protobuf.i.r(24, "promotion_page", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.i(25, "mic_audience_like_count"));
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
