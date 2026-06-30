package fk2;

/* loaded from: classes3.dex */
public final class j3 extends dk2.t4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(r45.ch1 msg) {
        super(msg);
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (getType() != 20098) {
            return null;
        }
        r45.di1 di1Var = new r45.di1();
        com.tencent.mm.protobuf.g byteString = this.f234101a.getByteString(4);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            di1Var.parseFrom(g17);
            return di1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            return null;
        }
    }
}
