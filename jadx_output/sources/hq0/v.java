package hq0;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq0.e f283064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(iq0.e eVar, hq0.b0 b0Var) {
        super(0);
        this.f283064d = eVar;
        this.f283065e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        iq0.e eVar = this.f283064d;
        int i17 = eVar.f293659c;
        hq0.b0 b0Var = this.f283065e;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i(b0Var.f282971y, "innerRemoveOffScreenFrameSetViewFromCache but cacheSize <= 0");
        } else {
            java.util.List J1 = hq0.b0.J1(b0Var, eVar, wq0.b.f448495e);
            int size = J1.size() - i17;
            if (size > 0) {
                java.util.List F0 = kz5.n0.F0(J1, new hq0.u());
                if (F0.size() > size) {
                    java.util.Iterator it = kz5.n0.K0(F0, size).iterator();
                    while (it.hasNext()) {
                        fq0.x frameSet = ((com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) it.next()).getFrameSet();
                        if (frameSet != null) {
                            java.lang.String a17 = vq0.b.a(b0Var, eVar.f293657a, frameSet.f265477a);
                            d75.b.g(new hq0.w(b0Var, eVar, a17));
                            java.lang.String rootConfigId = eVar.a();
                            mq0.l0 l0Var = b0Var.E;
                            l0Var.getClass();
                            kotlin.jvm.internal.o.g(rootConfigId, "rootConfigId");
                            mq0.k0 k0Var = (mq0.k0) l0Var.f330584b.get(rootConfigId);
                            if (k0Var != null) {
                                k0Var.f330575c++;
                            }
                            com.tencent.mars.xlog.Log.i(b0Var.f282971y, "innerRemoveOffScreenFrameSetViewFromCache frameSetId: " + a17);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
