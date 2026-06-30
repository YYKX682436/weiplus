package pg2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f354139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f354140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.FinderLiveSurfaceView f354141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f354142i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354143m;

    public k(android.view.View view, pg2.j0 j0Var, android.app.Activity activity, co0.s sVar, com.tencent.mm.live.core.view.FinderLiveSurfaceView finderLiveSurfaceView, android.widget.FrameLayout frameLayout, android.view.View view2) {
        this.f354137d = view;
        this.f354138e = j0Var;
        this.f354139f = activity;
        this.f354140g = sVar;
        this.f354141h = finderLiveSurfaceView;
        this.f354142i = frameLayout;
        this.f354143m = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.j();
        }
        android.view.View view = this.f354137d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        co0.s sVar = this.f354140g;
        int i17 = sVar != null ? sVar.U1 : 0;
        int i18 = sVar != null ? sVar.V1 : 0;
        pg2.j0 j0Var = this.f354138e;
        android.app.Activity activity = this.f354139f;
        jz5.l wi6 = pg2.j0.wi(j0Var, activity, i17, i18);
        this.f354141h.a(((java.lang.Number) wi6.f302833d).intValue(), ((java.lang.Number) wi6.f302834e).intValue());
        android.view.Window window = activity.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        ug5.x.e(window, -16777216);
        this.f354142i.removeView(this.f354143m);
    }
}
