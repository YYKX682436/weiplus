package dk2;

/* loaded from: classes3.dex */
public final class x6 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        r45.ch1 ch1Var = this.f234101a;
        if (ch1Var.getInteger(1) != 20127) {
            return null;
        }
        r45.uj1 uj1Var = new r45.uj1();
        com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            uj1Var.parseFrom(g17);
            return uj1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return null;
        }
    }

    @Override // dk2.zf
    public int e() {
        java.lang.Object D = D();
        r45.uj1 uj1Var = D instanceof r45.uj1 ? (r45.uj1) D : null;
        if (uj1Var == null) {
            return 0;
        }
        r45.uj1 uj1Var2 = uj1Var.getInteger(0) == 2 ? uj1Var : null;
        if (uj1Var2 != null) {
            return uj1Var2.getInteger(3);
        }
        return 0;
    }
}
