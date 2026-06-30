package r45;

/* loaded from: classes2.dex */
public class z41 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public z41() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "comment_list", r45.oo.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.n(4, "start_timestamp"), com.tencent.mm.protobuf.i.n(5, "end_timestamp"), com.tencent.mm.protobuf.i.u(6, "request_report_json"), com.tencent.mm.protobuf.i.s(7, "follow_info", r45.f43.class));
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
