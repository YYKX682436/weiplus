package dk2;

/* loaded from: classes3.dex */
public final class w6 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20047) {
            return null;
        }
        r45.li1 li1Var = new r45.li1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 != null) {
            try {
                li1Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return li1Var;
    }
}
