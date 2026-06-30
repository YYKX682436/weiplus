package pg3;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f354207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg3.q f354208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.vs2 vs2Var, pg3.q qVar) {
        super(1);
        this.f354207d = vs2Var;
        this.f354208e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LongVideo-Trace, optimize prefetch end, success:");
        sb6.append(booleanValue);
        sb6.append(",redDotCtrlInfo:[business_type:");
        r45.vs2 vs2Var = this.f354207d;
        sb6.append(vs2Var != null ? java.lang.Integer.valueOf(vs2Var.f388505z) : null);
        sb6.append(", uuid:");
        r45.vs2 vs2Var2 = this.f354207d;
        sb6.append(vs2Var2 != null ? vs2Var2.f388503x : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.LongVideoFeedsPrefetchService", sb6.toString());
        vn2.a1 a1Var = this.f354208e.f354218f;
        if (a1Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.TopStoryMegaVideoPreload", "LongVideo-Trace, optimize onPreloadEnd listener size=" + a1Var.a().size());
            java.util.LinkedList<java.lang.ref.WeakReference> a17 = a1Var.a();
            synchronized (a17) {
                for (java.lang.ref.WeakReference weakReference : a17) {
                    com.tencent.mm.plugin.finder.megavideo.topstory.flow.h hVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.h) weakReference.get();
                    if (hVar != null) {
                        com.tencent.mm.plugin.finder.megavideo.topstory.flow.y yVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.y) hVar;
                        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader.b(yVar.f121033a, yVar.f121034b);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("Finder.TopStoryMegaVideoPreload", "onPreloadEnd but listener " + weakReference + " is null!");
                    }
                }
                a17.clear();
            }
        }
        this.f354208e.f354218f = null;
        return jz5.f0.f302826a;
    }
}
