package um2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428804d;

    public g0(android.view.View view) {
        this.f428804d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f428804d.animate().alpha(1.0f).setDuration(500L).start();
    }
}
