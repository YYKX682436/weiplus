package i53;

/* loaded from: classes8.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f288738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.u2 f288739f;

    public t2(i53.u2 u2Var, java.util.LinkedList linkedList, boolean z17) {
        this.f288739f = u2Var;
        this.f288737d = linkedList;
        this.f288738e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.u2 u2Var = this.f288739f;
        if (((android.app.Activity) u2Var.f288744a.getContext()).isFinishing() || ((android.app.Activity) u2Var.f288744a.getContext()).isDestroyed()) {
            return;
        }
        u2Var.f288744a.postDelayed(new i53.s2(this), 100L);
        u2Var.f288744a.c(this.f288737d, this.f288738e, false);
    }
}
