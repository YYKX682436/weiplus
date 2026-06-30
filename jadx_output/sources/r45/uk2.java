package r45;

/* loaded from: classes2.dex */
public class uk2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public uk2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.r(3, "config", r45.sk2.class), com.tencent.mm.protobuf.i.r(4, "jump_tab_info", r45.dd2.class), com.tencent.mm.protobuf.i.i(5, "jump_type"), com.tencent.mm.protobuf.i.i(6, "req_interval"), com.tencent.mm.protobuf.i.s(7, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(8, "last_buffer"), com.tencent.mm.protobuf.i.i(9, "continue_flag"), com.tencent.mm.protobuf.i.r(10, "live_notice_preload_config", r45.wo1.class), com.tencent.mm.protobuf.i.u(11, "left_content"), com.tencent.mm.protobuf.i.n(12, "request_id"), com.tencent.mm.protobuf.i.c(13, "is_enable"), com.tencent.mm.protobuf.i.a(14, "jump_navlive_buffer"));
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
