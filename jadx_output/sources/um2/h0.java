package um2;

/* loaded from: classes2.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428817d;

    public h0(android.view.View view) {
        this.f428817d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f428817d.animate().alpha(1.0f).setDuration(500L).start();
    }
}
