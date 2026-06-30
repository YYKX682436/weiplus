package fg;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.s f261804e;

    public q(fg.b0 b0Var, fg.s sVar) {
        this.f261803d = b0Var;
        this.f261804e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg.b0 b0Var = this.f261803d;
        if (b0Var.f261733j) {
            fg.s sVar = this.f261804e;
            sVar.b(sVar.f261807d);
        }
        b0Var.f261737n = false;
    }
}
