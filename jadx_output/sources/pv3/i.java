package pv3;

/* loaded from: classes4.dex */
public final class i implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ub f358597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pv3.m f358598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f358599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f358600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f358601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358602i;

    public i(pv3.m mVar, android.widget.FrameLayout frameLayout, android.view.View view, long j17, in5.s0 s0Var) {
        this.f358598e = mVar;
        this.f358599f = frameLayout;
        this.f358600g = view;
        this.f358601h = j17;
        this.f358602i = s0Var;
        if (!zy2.ub.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(zy2.ub.class.getClassLoader(), new java.lang.Class[]{zy2.ub.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IFinderVideoViewCallback");
        }
        this.f358597d = (zy2.ub) newProxyInstance;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        this.f358597d.E(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f358597d.I(str, str2, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.e(this.f358598e.f358615b, "[onError] sessionId:" + str + " mediaId:" + str2 + " errorMsg:" + str3 + " what:" + i17 + " extra:" + i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        android.view.View view;
        this.f358598e.getClass();
        android.widget.FrameLayout frameLayout = this.f358599f;
        if (!kotlin.jvm.internal.o.a(frameLayout != null ? java.lang.Float.valueOf(frameLayout.getAlpha()) : null, 0.0f) || (view = this.f358600g) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "showLoading", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "showLoading", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        this.f358597d.e3(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        this.f358597d.i(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        this.f358597d.l(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f358598e.a(this.f358600g);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f358597d.o(str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f358597d.onSeekComplete(iTPPlayer);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        pv3.m mVar = this.f358598e;
        nv3.l lVar = (nv3.l) ((jz5.n) mVar.f358618e).getValue();
        if (lVar != null) {
            lVar.a(this.f358601h);
        }
        com.tencent.mars.xlog.Log.i(mVar.f358615b, "[onVideoFirstFrameDraw] sessionId:" + str + " mediaId:" + str2);
        mVar.b(this.f358602i, true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.f358597d.v3(str, str2, i17, i18, i19);
    }
}
