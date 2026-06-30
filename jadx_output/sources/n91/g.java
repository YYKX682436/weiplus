package n91;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f335872b;

    /* renamed from: c, reason: collision with root package name */
    public n91.j f335873c = n91.j.NOT_STARTED;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f335874d = new java.util.LinkedList();

    /* renamed from: a, reason: collision with root package name */
    public final n91.f f335871a = new n91.c0();

    /* renamed from: e, reason: collision with root package name */
    public final n91.c f335875e = new n91.c(this);

    public g(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f335872b = o6Var;
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData customLoadingAddHistoryRecordIPCData = new com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData();
        customLoadingAddHistoryRecordIPCData.f77547d = this.f335872b.f74803n;
        customLoadingAddHistoryRecordIPCData.f77548e = this.f335872b.f74805p.f77281g;
        customLoadingAddHistoryRecordIPCData.f77549f = this.f335872b.u0().f77298k2.f88138h;
        customLoadingAddHistoryRecordIPCData.f77550g = this.f335872b.u0().f77298k2.f88134d;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, customLoadingAddHistoryRecordIPCData, n91.i.class, new n91.g$$a());
    }

    public void b() {
        n91.j jVar = this.f335873c;
        n91.j jVar2 = n91.j.DESTROYED;
        if (jVar != jVar2) {
            n91.c0 c0Var = (n91.c0) this.f335872b.K2.f335871a;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onDestroy");
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = c0Var.f335861e;
            if (constraintLayout != null) {
                constraintLayout.removeAllViews();
            }
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Di(c0Var.f335859c);
            android.view.ViewGroup viewGroup = c0Var.f335860d;
            android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
            if (parent instanceof android.view.ViewGroup) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] removeView");
                android.view.ViewGroup viewGroup2 = c0Var.f335860d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                ((android.view.ViewGroup) parent).removeView(c0Var.f335860d);
            }
            c0Var.f335857a.dead();
            this.f335873c = jVar2;
        }
    }

    public void c() {
        if (this.f335873c.ordinal() >= 2) {
            return;
        }
        this.f335873c = n91.j.ENTERING_FULL_SCREEN;
        n91.f fVar = this.f335871a;
        n91.c0 c0Var = (n91.c0) fVar;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onStartFullScreen");
        ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("fullScreenStart", c0Var.f335859c, "");
        n91.c0 c0Var2 = (n91.c0) fVar;
        c0Var2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onRotationStart");
        ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("rotationStart", c0Var2.f335859c, "");
        com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingEnterFullscreenIPCData customLoadingEnterFullscreenIPCData = new com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingEnterFullscreenIPCData();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f335872b;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        customLoadingEnterFullscreenIPCData.f77551d = u07;
        u07.f47273p0 = true;
        customLoadingEnterFullscreenIPCData.f77552e = o6Var.l2();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, customLoadingEnterFullscreenIPCData, n91.k.class, new n91.g$$a());
    }

    public void d() {
        com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData customLoadingUpdateRecordIPCData = new com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData();
        customLoadingUpdateRecordIPCData.f77554e = this.f335872b.f74803n;
        customLoadingUpdateRecordIPCData.f77555f = this.f335872b.f74805p.f77281g;
        customLoadingUpdateRecordIPCData.f77553d = this.f335873c.ordinal() >= 2;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, customLoadingUpdateRecordIPCData, n91.l.class, new n91.g$$a());
    }
}
