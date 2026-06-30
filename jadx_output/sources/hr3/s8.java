package hr3;

/* loaded from: classes9.dex */
public class s8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t8 f283970d;

    public s8(hr3.t8 t8Var) {
        this.f283970d = t8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetWxGame", "doClearData");
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetWxGame", "doClearData result:%d", java.lang.Integer.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("gh_25d9ac85a4bc")));
        if (((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
            this.f283970d.f284023d.a("clearAllMessage", true);
        } else {
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Zi();
        }
    }
}
