package xe2;

/* loaded from: classes3.dex */
public final class l1 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.gk1 gk1Var = new r45.gk1();
        byte[] g17 = (ch1Var == null || (byteString = ch1Var.getByteString(4)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                gk1Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        r45.lq1 lq1Var = (r45.lq1) gk1Var.getCustom(0);
        if (lq1Var != null) {
            dk2.vf vfVar = new dk2.vf(lq1Var);
            ((mm2.f6) this.f445267a.a(mm2.f6.class)).X6(vfVar);
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null) {
                if (lq1Var.getInteger(0) != 0) {
                    hg2.h hVar = (hg2.h) k0Var.getController(hg2.h.class);
                    if (hVar != null) {
                        pm0.v.X(new hg2.b(hVar));
                        return;
                    }
                    return;
                }
                hg2.h hVar2 = (hg2.h) k0Var.getController(hg2.h.class);
                if (hVar2 != null) {
                    hVar2.Z6();
                }
                com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = dk2.ef.f233380e;
                android.content.Context context = k0Var2 != null ? k0Var2.getContext() : null;
                if (context == null) {
                    context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                }
                hg2.s.b(vfVar, context, k0Var);
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20087};
    }
}
