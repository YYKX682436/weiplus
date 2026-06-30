package d55;

/* loaded from: classes12.dex */
public abstract class f0 extends d55.g0 {
    @Override // d55.g0
    public void j() {
        this.f226570m = java.lang.System.currentTimeMillis();
        int i17 = this.f226573p.f226591d.f226597a;
        if (i17 > 0) {
            super.j();
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.safePointLazy", "no need check, crash count = " + i17);
        this.f226583r.set(true);
        l();
        java.util.concurrent.Executors.newCachedThreadPool().submit(new d55.e0(this));
    }
}
