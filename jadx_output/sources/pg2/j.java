package pg2;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f354134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View view, boolean z17, boolean z18, android.view.View view2) {
        super(0);
        this.f354132d = view;
        this.f354133e = z17;
        this.f354134f = z18;
        this.f354135g = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "timeOutCompleteBlock");
        android.view.View view2 = this.f354132d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$changeSurfaceViewToLiveRoom$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if ((this.f354133e || !this.f354134f) && (view = this.f354135g) != null) {
            pm0.v.B(view);
        }
        return jz5.f0.f302826a;
    }
}
