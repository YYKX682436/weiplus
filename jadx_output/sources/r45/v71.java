package r45;

/* loaded from: classes.dex */
public class v71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public v71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "live_notice_info", r45.h32.class), com.tencent.mm.protobuf.i.r(3, "live_status_info", r45.aa2.class), com.tencent.mm.protobuf.i.r(4, "anchor_contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.r(5, "live_notice_list_info", r45.j32.class), com.tencent.mm.protobuf.i.i(6, "member_status"), com.tencent.mm.protobuf.i.i(7, "notice_aggregate_type"));
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
