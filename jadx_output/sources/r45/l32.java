package r45;

/* loaded from: classes.dex */
public class l32 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l32() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "live_notice_info", r45.h32.class), com.tencent.mm.protobuf.i.a(3, "QRCode"), com.tencent.mm.protobuf.i.u(4, "QRCodeUrl"), com.tencent.mm.protobuf.i.u(5, "bg_img_url"), com.tencent.mm.protobuf.i.i(6, "is_spam_mod_pic"), com.tencent.mm.protobuf.i.s(7, "qrcodes", r45.zf5.class), com.tencent.mm.protobuf.i.r(8, "qrcode_poster_styles", r45.t52.class), com.tencent.mm.protobuf.i.i(9, "current_style_id"), com.tencent.mm.protobuf.i.r(10, "personal_column_info", r45.u75.class), com.tencent.mm.protobuf.i.i(11, "modify_entrance_status"), com.tencent.mm.protobuf.i.c(12, "enable_desc_extend"), com.tencent.mm.protobuf.i.r(13, "function_switch", r45.m94.class));
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
