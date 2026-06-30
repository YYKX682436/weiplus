package rs3;

/* loaded from: classes5.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399336d;

    public f(boolean z17) {
        this.f399336d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f399336d;
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginReaderApp", "set pluginReaderApp install %b", java.lang.Boolean.valueOf(z17));
        int n17 = c01.z1.n();
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-524289) : n17 | 524288));
        r45.u85 u85Var = new r45.u85();
        u85Var.f387136d = 524288;
        u85Var.f387137e = !z17 ? 1 : 0;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (z17) {
            rs3.h.Ai(true);
        } else {
            ss3.d0.wi(null);
            rs3.h.Ai(false);
        }
    }
}
