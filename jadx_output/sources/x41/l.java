package x41;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f451780d;

    public l(android.view.View view) {
        this.f451780d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f451780d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
