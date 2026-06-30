package y45;

/* loaded from: classes11.dex */
public class s extends sc0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc0.a f459388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y45.t f459389e;

    public s(y45.t tVar, sc0.a aVar) {
        this.f459389e = tVar;
        this.f459388d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f459389e.f459391b) {
            y45.t tVar = this.f459389e;
            if (tVar.f459391b[0] == null) {
                return;
            }
            try {
                d55.u.b("MicroMsg.RecoveryWatchDog", "[+] %s: bark action triggered.", tVar.f459390a);
                this.f459388d.run();
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.RecoveryWatchDog", "[-] %s: bark action throws exception.", th6, this.f459389e.f459390a);
            }
        }
    }
}
