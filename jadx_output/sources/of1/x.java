package of1;

/* loaded from: classes7.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.a0 f345053d;

    public x(of1.a0 a0Var) {
        this.f345053d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            of1.a0 a0Var = this.f345053d;
            if (a0Var.f344885b.isEmpty()) {
                a0Var.f344884a = true;
                return;
            } else {
                java.lang.Object pollFirst = a0Var.f344885b.pollFirst();
                kotlin.jvm.internal.o.d(pollFirst);
                ((yz5.a) pollFirst).invoke();
            }
        }
    }
}
