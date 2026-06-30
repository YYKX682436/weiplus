package xe2;

/* loaded from: classes3.dex */
public final class b extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.protobuf.g byteString2;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.hh1 hh1Var = new r45.hh1();
        r45.eu0 eu0Var = null;
        byte[] g17 = (ch1Var == null || (byteString2 = ch1Var.getByteString(4)) == null) ? null : byteString2.g();
        if (g17 != null) {
            try {
                hh1Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        r45.eu0 eu0Var2 = new r45.eu0();
        r45.hg1 hg1Var = (r45.hg1) hh1Var.getCustom(0);
        byte[] g18 = (hg1Var == null || (byteString = hg1Var.getByteString(0)) == null) ? null : byteString.g();
        if (g18 != null) {
            try {
                eu0Var2.parseFrom(g18);
                eu0Var = eu0Var2;
            } catch (java.lang.Exception e18) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
            }
        }
        ((mm2.f6) this.f445267a.a(mm2.f6.class)).W6(eu0Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20088};
    }
}
