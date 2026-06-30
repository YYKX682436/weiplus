package xe2;

/* loaded from: classes3.dex */
public final class y0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453929c = "LiveNoticeTriggerInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.m32 m32Var = new r45.m32();
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        if (ch1Var != null) {
            if (!(ch1Var.getByteString(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        m32Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f453929c, "pb = " + pm0.b0.g(m32Var));
        mm2.c1 c1Var = (mm2.c1) this.f445267a.a(mm2.c1.class);
        c1Var.f328822i5 = (c1Var.T || c1Var.N7()) ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) m32Var.getCustom(0) : null;
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20105};
    }
}
