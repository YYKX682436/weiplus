package pa3;

/* loaded from: classes5.dex */
public final class e extends dp1.a {

    /* renamed from: m, reason: collision with root package name */
    public final android.app.Activity f352981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.app.Activity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f352981m = activity;
    }

    @Override // dp1.u, dp1.x
    public android.graphics.Bitmap getBitmap() {
        return pa3.w.b(pa3.w.f353012a, getMaskView(), java.lang.Integer.valueOf(getMaskView().getWidth()), java.lang.Integer.valueOf(getMaskView().getHeight()), null, 8, null);
    }

    @Override // dp1.u, dp1.x
    public android.view.View getContentView() {
        android.app.Activity activity = this.f352981m;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ext.ui.SwipeBackActivity");
        com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = ((com.tencent.mm.ext.ui.SwipeBackActivity) activity).f64958d;
        kotlin.jvm.internal.o.f(swipeBackLayout, "getSwipeBackLayout(...)");
        return swipeBackLayout;
    }

    @Override // dp1.u, dp1.x
    public android.view.View getMaskView() {
        android.view.ViewGroup a17 = a();
        kotlin.jvm.internal.o.f(a17, "getRootView(...)");
        return a17;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return true;
    }
}
