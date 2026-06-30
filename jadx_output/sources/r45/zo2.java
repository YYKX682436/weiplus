package r45;

/* loaded from: classes2.dex */
public class zo2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public zo2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.r(5, "sns_poi_detail", r45.v96.class), com.tencent.mm.protobuf.i.r(6, "contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.u(7, "notice_wording"), com.tencent.mm.protobuf.i.i(8, "only_show_poi_name"), com.tencent.mm.protobuf.i.i(9, "total_feeds_count"), com.tencent.mm.protobuf.i.r(10, "poi_prepare", r45.s95.class), com.tencent.mm.protobuf.i.i(12, "poi_friend_like_count"), com.tencent.mm.protobuf.i.r(13, "tab_list", r45.bp2.class), com.tencent.mm.protobuf.i.i(14, "current_tab_id"), com.tencent.mm.protobuf.i.i(15, "address_disable_click"), com.tencent.mm.protobuf.i.i(16, "nearby_flag"), com.tencent.mm.protobuf.i.r(17, "nearby_info", r45.xo2.class), com.tencent.mm.protobuf.i.i(18, "prefetch_count"));
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
