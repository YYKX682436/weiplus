package r45;

/* loaded from: classes.dex */
public class du1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public du1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "brand_logo", r45.cs5.class), com.tencent.mm.protobuf.i.s(3, "sponsor_logo_list", r45.cs5.class), com.tencent.mm.protobuf.i.r(4, "signature_logo", r45.cs5.class), com.tencent.mm.protobuf.i.u(5, "nickname_suffix"), com.tencent.mm.protobuf.i.u(6, "subject"), com.tencent.mm.protobuf.i.u(7, "qrcode_url"), com.tencent.mm.protobuf.i.r(8, "qrcode_center_logo", r45.cs5.class), com.tencent.mm.protobuf.i.r(9, "left_button", r45.ua5.class), com.tencent.mm.protobuf.i.r(10, "right_top", r45.ua5.class), com.tencent.mm.protobuf.i.u(11, "qrcode_content"), com.tencent.mm.protobuf.i.i(12, "signature_right_px"), com.tencent.mm.protobuf.i.i(13, "signature_button_px"), com.tencent.mm.protobuf.i.i(14, "vertical_pixel"), com.tencent.mm.protobuf.i.i(15, "horizontal_pixel"), com.tencent.mm.protobuf.i.a(16, "qrcode"));
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
