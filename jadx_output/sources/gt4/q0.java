package gt4;

/* loaded from: classes14.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275509d;

    public q0(gt4.s0 s0Var) {
        this.f275509d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gt4.s0 s0Var = this.f275509d;
        android.widget.FrameLayout frameLayout = s0Var.C;
        if (frameLayout != null) {
            s0Var.I = frameLayout.getBottom();
        } else {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
    }
}
