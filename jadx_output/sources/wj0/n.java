package wj0;

/* loaded from: classes11.dex */
public class n extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f446566d;

    public n() {
        super(0);
        this.f446566d = new wj0.m(this);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Runnable runnable = this.f446566d;
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (kotlin.jvm.internal.o.b("HardCoderStaticOnPostSyncTaskEventListener", "PizzaWorkerCompat")) {
            throw new java.lang.IllegalStateException("Default or empty tag is not allowed for removable task!");
        }
        ((fz.l) ((cp.f) i95.n0.c(cp.f.class))).getClass();
        ((ku5.t0) ku5.t0.f312615d).A("HardCoderStaticOnPostSyncTaskEventListener");
        gm0.j1.e().d().removeCallbacks(runnable);
        cp.e.c("HardCoderStaticOnPostSyncTaskEventListener", this.f446566d, 3000L);
        return false;
    }
}
