package pg2;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f354147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co0.s f354148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.FinderLiveSurfaceView f354149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354150i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354151m;

    public l(android.view.View view, pg2.j0 j0Var, android.app.Activity activity, co0.s sVar, com.tencent.mm.live.core.view.FinderLiveSurfaceView finderLiveSurfaceView, android.view.View view2, ug5.v vVar) {
        this.f354145d = view;
        this.f354146e = j0Var;
        this.f354147f = activity;
        this.f354148g = sVar;
        this.f354149h = finderLiveSurfaceView;
        this.f354150i = view2;
        this.f354151m = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f354145d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$3$onFirstFrameRender$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        co0.s sVar = this.f354148g;
        int i17 = sVar != null ? sVar.U1 : 0;
        int i18 = sVar != null ? sVar.V1 : 0;
        pg2.j0 j0Var = this.f354146e;
        android.app.Activity activity = this.f354147f;
        jz5.l wi6 = pg2.j0.wi(j0Var, activity, i17, i18);
        int intValue = ((java.lang.Number) wi6.f302833d).intValue();
        int intValue2 = ((java.lang.Number) wi6.f302834e).intValue();
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "changeSurfaceViewToLiveRoom w=" + intValue + " h=" + intValue2);
        this.f354149h.a(intValue, intValue2);
        android.view.Window window = activity.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        ug5.x.e(window, -16777216);
        android.view.View view2 = this.f354150i;
        if (view2 != null) {
            pm0.v.B(view2);
        }
        ug5.f fVar = ug5.v.f427655g;
        this.f354151m.b(false);
    }
}
