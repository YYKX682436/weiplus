package d55;

/* loaded from: classes12.dex */
public class i0 extends d55.j0 {
    public i0(d55.j0 j0Var) {
        super(j0Var);
    }

    @Override // d55.j0
    public void j(int i17) {
        this.f226570m = java.lang.System.currentTimeMillis();
        d55.j c17 = d55.j.c(this.f226564d);
        this.f226573p = c17;
        c17.a();
        d55.j jVar = this.f226573p;
        long j17 = jVar.f226588a;
        java.lang.String str = jVar.f226589b;
        d55.k kVar = jVar.f226591d;
        this.f226572o = new d55.j(j17, str, new d55.k(kVar.f226597a, kVar.f226598b), jVar.f226590c);
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "#begin");
        this.f226592r = i17;
        long j18 = this.f226594t;
        if (j18 > 0) {
            this.f226595u = this.f226570m - j18;
        }
        long j19 = this.f226595u;
        if (j19 <= 0) {
            j19 = this.f226570m - this.f226573p.f226588a;
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery interval = " + j19);
        if (j19 < this.f226574q.f226558d) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "within interval, inc");
        } else {
            d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "over signal interval, clear point");
            b();
        }
        e();
        int i18 = this.f226572o.f226591d.f226597a;
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery crashCount = " + i18);
        if (i18 < this.f226574q.f226555a) {
            i(true);
            return;
        }
        if (!f()) {
            d55.o0.a(5, "MicroMsg.recovery.signalHandlerFallback", "launch recovery fail");
            i(true);
            return;
        }
        if (i18 < this.f226574q.f226556b) {
            g(1);
        } else {
            g(2);
            a();
        }
        i(true);
        h();
    }
}
