package uy3;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431984d;

    public n(android.view.View view) {
        this.f431984d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f431984d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
