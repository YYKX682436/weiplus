package xe2;

/* loaded from: classes3.dex */
public final class q extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var != null) {
            dk2.xa xaVar = dk2.xa.f234344a;
            r45.u63 u63Var = new r45.u63();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    u63Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                xaVar.c(this.f445267a, u63Var);
            }
            u63Var = null;
            xaVar.c(this.f445267a, u63Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20040};
    }
}
