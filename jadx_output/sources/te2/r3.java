package te2;

/* loaded from: classes10.dex */
public final class r3 implements te2.n3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418371d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f418372e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f418373f;

    /* renamed from: g, reason: collision with root package name */
    public te2.o3 f418374g;

    /* renamed from: h, reason: collision with root package name */
    public r45.p73 f418375h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f418376i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f418377m;

    public r3(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l plugin) {
        kotlin.jvm.internal.o.g(viewRoot, "viewRoot");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f418371d = viewRoot;
        this.f418372e = context;
        this.f418373f = plugin;
    }

    public final boolean c() {
        r45.q73 q73Var;
        r45.t73 t73Var;
        r45.p73 p73Var = this.f418375h;
        if (p73Var != null && (q73Var = (r45.q73) p73Var.getCustom(3)) != null) {
            int integer = q73Var.getInteger(0);
            int i17 = qs5.j.f366435a;
            if (!(integer == 1)) {
                q73Var = null;
            }
            if (q73Var != null && (t73Var = (r45.t73) q73Var.getCustom(1)) != null) {
                java.lang.String string = t73Var.getString(0);
                if (!(string == null || string.length() == 0)) {
                    java.lang.String string2 = t73Var.getString(0);
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String string3 = t73Var.getString(1);
                    if (string3 == null) {
                        string3 = "";
                    }
                    int integer2 = t73Var.getInteger(2);
                    com.tencent.mm.protobuf.g byteString = t73Var.getByteString(3);
                    android.content.Context context = this.f418372e;
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mars.xlog.Log.i("GameWelfareTaskMiniAppHelper", "#preRenderMiniApp appId=" + string2 + " path=" + string3 + " version=" + integer2 + " extraData=" + byteString);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317014b = string2;
                    b1Var.f317022f = string3;
                    b1Var.f317016c = integer2;
                    b1Var.f317028i = new te2.nc(byteString);
                    b1Var.H = k91.z3.TRANSPARENT;
                    k91.y3 y3Var = k91.y3.DISABLED;
                    b1Var.S = y3Var;
                    b1Var.T = y3Var;
                    b1Var.U = true;
                    b1Var.f317024g = true;
                    b1Var.f317032k = 1205;
                    b1Var.I = "";
                    b1Var.K = true;
                    b1Var.f317038p = new te2.oc(null);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new te2.pc());
                    return true;
                }
                com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePresenter", "#preloadMiniApp appid is null, preload return");
            }
        }
        return false;
    }

    public final void f() {
        te2.o3 o3Var = this.f418374g;
        if (o3Var != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = ((te2.t3) o3Var).f418430g;
            if (finderLiveGameWelfareTaskProgressView != null) {
                finderLiveGameWelfareTaskProgressView.setVisibility(8);
            }
            if (finderLiveGameWelfareTaskProgressView != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskProgressView", "#reset");
                finderLiveGameWelfareTaskProgressView.a();
                kotlinx.coroutines.r2 r2Var = finderLiveGameWelfareTaskProgressView.f115923e;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                ((java.util.ArrayList) finderLiveGameWelfareTaskProgressView.f115930o).clear();
                finderLiveGameWelfareTaskProgressView.f115931p = null;
                finderLiveGameWelfareTaskProgressView.f115925g.removeAllViews();
                finderLiveGameWelfareTaskProgressView.f115932q = null;
                kotlinx.coroutines.r2 r2Var2 = finderLiveGameWelfareTaskProgressView.f115924f;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        if ((((kotlinx.coroutines.a) r3).a() ^ true) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(r45.p73 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.r3.g(r45.p73, boolean):void");
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.o3 callback = (te2.o3) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f418374g = callback;
        ((te2.t3) callback).f418431h = new te2.q3(this);
    }

    @Override // fs2.a
    public void onDetach() {
        f();
        this.f418376i = false;
    }
}
