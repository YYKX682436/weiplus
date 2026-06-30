package dk2;

/* loaded from: classes3.dex */
public final class v7 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        com.tencent.mm.protobuf.f pi1Var;
        int type = getType();
        r45.ch1 ch1Var = this.f234101a;
        if (type == 20090) {
            pi1Var = new r45.pi1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 == null) {
                return null;
            }
            try {
                pi1Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                return null;
            }
        } else {
            if (type != 20091) {
                return null;
            }
            pi1Var = new r45.wi1();
            com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
            byte[] g18 = byteString2 != null ? byteString2.g() : null;
            if (g18 == null) {
                return null;
            }
            try {
                pi1Var.parseFrom(g18);
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                return null;
            }
        }
        return pi1Var;
    }
}
