package sy;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0$$b implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f413784a;

    public /* synthetic */ b0$$b(long j17) {
        this.f413784a = j17;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = this.f413784a;
        java.lang.String str = (java.lang.String) obj;
        sy.c0 c0Var = (sy.c0) obj2;
        try {
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null) {
                return;
            }
            c0Var.f413790e = j17;
            c0Var.f413787b = c01.e2.Q(str);
            c0Var.f413789d = r2.d1();
            c0Var.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PluginMsgReporter", "get report data filed " + e17);
        }
    }
}
