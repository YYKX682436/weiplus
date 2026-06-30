package r45;

/* loaded from: classes5.dex */
public class hb2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public hb2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "antispam_custom_text"), com.tencent.mm.protobuf.i.c(3, "has_customized"), com.tencent.mm.protobuf.i.u(4, "upload_id"));
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
