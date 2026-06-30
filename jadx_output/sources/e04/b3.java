package e04;

/* loaded from: classes15.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.c3 f245872d;

    public b3(e04.c3 c3Var) {
        this.f245872d = c3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e04.c3 c3Var = this.f245872d;
        if (c3Var.f245882e) {
            return;
        }
        c3Var.c(false);
    }
}
