package dk2;

/* loaded from: classes3.dex */
public final class k5 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20074) {
            return null;
        }
        r45.bi1 bi1Var = new r45.bi1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        bi1Var.parseFrom(byteString != null ? byteString.g() : null);
        return bi1Var;
    }

    @Override // dk2.t4, dk2.zf
    public java.lang.String j() {
        java.lang.String string;
        java.lang.Object D = D();
        com.tencent.mm.protobuf.e eVar = null;
        r45.bi1 bi1Var = D instanceof r45.bi1 ? (r45.bi1) D : null;
        if (bi1Var == null) {
            return "";
        }
        int integer = bi1Var.getInteger(0);
        if (integer == 2) {
            r45.g42 g42Var = new r45.g42();
            com.tencent.mm.protobuf.g byteString = bi1Var.getByteString(1);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    g42Var.parseFrom(g17);
                    eVar = g42Var;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (eVar == null || (string = eVar.getString(0)) == null) {
                return "";
            }
        } else {
            if (integer != 3) {
                return "";
            }
            r45.ip1 ip1Var = new r45.ip1();
            com.tencent.mm.protobuf.g byteString2 = bi1Var.getByteString(1);
            byte[] g18 = byteString2 != null ? byteString2.g() : null;
            if (g18 != null) {
                try {
                    ip1Var.parseFrom(g18);
                    eVar = ip1Var;
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                }
            }
            if (eVar == null || (string = eVar.getString(0)) == null) {
                return "";
            }
        }
        return string;
    }
}
