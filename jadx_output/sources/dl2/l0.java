package dl2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f235237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView f235238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aw1 f235239f;

    public l0(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView finderLiveLevelProgressView, r45.aw1 aw1Var) {
        this.f235237d = h0Var;
        this.f235238e = finderLiveLevelProgressView;
        this.f235239f = aw1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.aw1 aw1Var = (r45.aw1) this.f235237d.f310123d;
        id2.v1.N = aw1Var != null ? aw1Var.getInteger(0) : 0;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        id2.v1.P = e1Var != null ? e1Var.f328985o : null;
        mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = 0;
        id2.v1.Q = e1Var2 != null ? e1Var2.f328983m : 0L;
        mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var3 != null && (nw1Var = e1Var3.f328988r) != null) {
            j17 = nw1Var.getLong(0);
        }
        id2.v1.R = j17;
        gk2.e eVar = dk2.ef.I;
        id2.v1.S = eVar != null ? zl2.r4.f473950a.b0(eVar) : 2;
        mm2.e1 e1Var4 = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var4 == null || (str = e1Var4.f328992v) == null) {
            str = "";
        }
        id2.v1.T = str;
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView finderLiveLevelProgressView = this.f235238e;
        com.tencent.mars.xlog.Log.i(finderLiveLevelProgressView.f114763d, "FinderLiveGiftPkgUIC.currentLevel = " + id2.v1.N);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P5).getValue()).r()).booleanValue()) {
            android.app.Activity activity = (android.app.Activity) com.tencent.mm.app.w.INSTANCE.i().get();
            if (activity != null) {
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).pj(activity, null);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str2 = finderLiveLevelProgressView.f114763d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        r45.aw1 aw1Var2 = this.f235239f;
        sb6.append(aw1Var2.getString(3));
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        java.lang.String u07 = zl2.r4.f473950a.u0(aw1Var2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", u07);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(finderLiveLevelProgressView.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
        mm2.s2 s2Var = (mm2.s2) efVar.i(mm2.s2.class);
        if (s2Var != null && (liveMutableData = s2Var.f329404f) != null) {
            liveMutableData.postValue(new mm2.q2(false, 0, 2, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView$update$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
