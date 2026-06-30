package r45;

/* loaded from: classes.dex */
public class t71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public t71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "items", r45.b53.class), com.tencent.mm.protobuf.i.r(3, "live_mic_info", r45.wz1.class), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.i(5, "continue_flag"), com.tencent.mm.protobuf.i.i(6, "interval_in_second"), com.tencent.mm.protobuf.i.i(7, "is_invalid"), com.tencent.mm.protobuf.i.u(8, "description"), com.tencent.mm.protobuf.i.r(9, "live_room_img", r45.ba4.class), com.tencent.mm.protobuf.i.u(1000, "local_params_request_unique_code"));
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
