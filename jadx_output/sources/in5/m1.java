package in5;

/* loaded from: classes10.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.v0 f293093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f293094e;

    public m1(in5.v0 v0Var, in5.s0 s0Var) {
        this.f293093d = v0Var;
        this.f293094e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f293094e;
        int measuredWidth = s0Var.itemView.getMeasuredWidth();
        in5.v0 v0Var = this.f293093d;
        v0Var.f293144b = measuredWidth;
        v0Var.f293145c = s0Var.itemView.getMeasuredHeight();
    }
}
