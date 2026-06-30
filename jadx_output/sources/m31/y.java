package m31;

/* loaded from: classes.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323236d;

    public y(android.view.View view) {
        this.f323236d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f323236d.requestLayout();
    }
}
