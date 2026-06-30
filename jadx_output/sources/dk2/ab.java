package dk2;

/* loaded from: classes3.dex */
public final class ab extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20035) {
            return null;
        }
        r45.gj1 gj1Var = new r45.gj1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        gj1Var.parseFrom(byteString != null ? byteString.g() : null);
        return gj1Var;
    }

    @Override // dk2.t4, dk2.zf
    public java.lang.String j() {
        r45.ze2 ze2Var;
        java.lang.Object D = D();
        java.lang.String str = null;
        r45.gj1 gj1Var = D instanceof r45.gj1 ? (r45.gj1) D : null;
        java.lang.String string = (gj1Var == null || (ze2Var = (r45.ze2) gj1Var.getCustom(0)) == null) ? null : ze2Var.getString(2);
        if (string != null) {
            java.lang.Object D2 = D();
            r45.gj1 gj1Var2 = D2 instanceof r45.gj1 ? (r45.gj1) D2 : null;
            java.lang.String string2 = gj1Var2 != null ? gj1Var2.getString(1) : null;
            if (string2 == null || string2.length() == 0) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, string);
            } else {
                java.lang.Object D3 = D();
                r45.gj1 gj1Var3 = D3 instanceof r45.gj1 ? (r45.gj1) D3 : null;
                if (gj1Var3 != null) {
                    str = gj1Var3.getString(1);
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
