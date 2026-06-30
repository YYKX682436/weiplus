package e33;

/* loaded from: classes10.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.i0 f247243d;

    public h0(e33.i0 i0Var) {
        this.f247243d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.i0 i0Var = this.f247243d;
        if (i0Var.f247284h.f138532o.getVisibility() == 0) {
            i0Var.f247284h.f138532o.animate().alpha(0.0f).setDuration(300L).withEndAction(new e33.g0(this)).start();
        }
    }
}
