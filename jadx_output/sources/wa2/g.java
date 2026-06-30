package wa2;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f444117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f444120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444121i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f444122m;

    public g(android.view.View view, android.content.Intent intent, android.app.Activity activity, android.view.View view2, long j17, wa2.n0 n0Var, android.view.ViewGroup viewGroup) {
        this.f444116d = view;
        this.f444117e = intent;
        this.f444118f = activity;
        this.f444119g = view2;
        this.f444120h = j17;
        this.f444121i = n0Var;
        this.f444122m = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.u uVar = wa2.u.f444181d;
        android.view.View view = this.f444116d;
        android.content.Intent intent = this.f444117e;
        uVar.Ni(view, intent);
        android.view.View wi6 = uVar.wi(this.f444118f, intent);
        wa2.n0 n0Var = this.f444121i;
        n0Var.addView(wi6, n0Var.indexOfChild(n0Var.getBgView()) + 1);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f444122m.getDrawingRect(rect);
        android.graphics.Rect Vi = uVar.Vi(intent);
        float Zi = uVar.Zi(Vi, rect, false);
        float[] bj6 = uVar.bj(rect, Vi);
        uVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wi6, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        wi6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(wi6, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$enterAnimation$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator animate = wi6.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.view.ViewPropertyAnimator updateListener = wi6.animate().translationX(-bj6[0]).translationY(-bj6[1]).scaleX(Zi).scaleY(Zi).setUpdateListener(wa2.c.f444105d);
        android.view.ViewPropertyAnimator animate2 = wi6.animate();
        kotlin.jvm.internal.o.f(animate2, "animate(...)");
        android.view.ViewPropertyAnimator listener = updateListener.setListener(new wa2.a0(animate2, new wa2.d(this.f444119g, wi6, this.f444117e, this.f444116d, this.f444118f)));
        long j17 = this.f444120h;
        listener.setDuration(j17).start();
        android.view.ViewPropertyAnimator animate3 = view.animate();
        if (animate3 != null) {
            animate3.cancel();
        }
        android.view.ViewPropertyAnimator updateListener2 = view.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setUpdateListener(new wa2.e(view));
        android.view.ViewPropertyAnimator animate4 = view.animate();
        kotlin.jvm.internal.o.f(animate4, "animate(...)");
        updateListener2.setListener(new wa2.a0(animate4, new wa2.f(view))).setDuration(j17).start();
    }
}
