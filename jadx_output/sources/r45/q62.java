package r45;

/* loaded from: classes.dex */
public class q62 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public q62() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "live_cookies"), com.tencent.mm.protobuf.i.u(3, "button_wording"), com.tencent.mm.protobuf.i.i(4, "coupon_status"), com.tencent.mm.protobuf.i.i(5, "click_button_action"), com.tencent.mm.protobuf.i.i(6, "click_button_style"), com.tencent.mm.protobuf.i.u(7, "toast_wording"));
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
