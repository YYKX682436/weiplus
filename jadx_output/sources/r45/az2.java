package r45;

/* loaded from: classes8.dex */
public class az2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public az2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "oldCmdList", r45.c50.class), com.tencent.mm.protobuf.i.i(3, "continueFlag"), com.tencent.mm.protobuf.i.r(4, "keyBuf", r45.cu5.class), com.tencent.mm.protobuf.i.s(5, "contacts", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.s(6, "self", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.s(7, "cmdList", r45.hx0.class), com.tencent.mm.protobuf.i.i(8, "round_robin_interval"), com.tencent.mm.protobuf.i.r(9, "check_expire_info", r45.qw0.class), com.tencent.mm.protobuf.i.r(10, "entrance_expose_switch", r45.hl0.class), com.tencent.mm.protobuf.i.a(11, "last_buffer"), com.tencent.mm.protobuf.i.r(12, "object_ctrl", r45.ml2.class), com.tencent.mm.protobuf.i.s(13, "reddot_freq_ctrl", r45.sm5.class), com.tencent.mm.protobuf.i.s(14, "reddot_discard_config", r45.om5.class), com.tencent.mm.protobuf.i.r(15, "popup_client_freq_config", r45.ep2.class));
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
