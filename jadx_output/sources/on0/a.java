package on0;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f346759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on0.b f346760e;

    public a(android.view.View view, on0.b bVar) {
        this.f346759d = view;
        this.f346760e = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f346759d;
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            this.f346760e.c(view.getWidth(), view.getHeight());
            return;
        }
        com.tencent.mars.xlog.Log.e("LiveVisitorScaleManager", "bindAnimateView view: " + view + ", width: " + view.getWidth() + ", height: " + view.getHeight());
    }
}
