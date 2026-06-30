package yn1;

/* loaded from: classes11.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.AccountExpiredEvent f463716d;

    public j0(com.tencent.mm.autogen.events.AccountExpiredEvent accountExpiredEvent) {
        this.f463716d = accountExpiredEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn1.z0.f463933a.t(Integer.MAX_VALUE);
        this.f463716d.c("MM.Mig.MigrationGlobalHolder");
    }
}
