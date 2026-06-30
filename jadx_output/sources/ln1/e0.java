package ln1;

/* loaded from: classes12.dex */
public class e0 implements sn1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln1.c0 f319748a;

    public e0(ln1.c0 c0Var) {
        this.f319748a = c0Var;
    }

    public void a(sn1.a0 a0Var) {
        if (ln1.s.f319797r.f319796k.get() > this.f319748a.f319740k) {
            while (true) {
                long j17 = ln1.s.f319797r.f319796k.get();
                ln1.c0 c0Var = this.f319748a;
                if (j17 <= c0Var.f319740k) {
                    break;
                }
                c0Var.f319739j.b();
                this.f319748a.f319739j.a(500L);
            }
        }
        a0Var.K();
        ln1.r rVar = ln1.s.f319797r;
        rVar.f319796k.addAndGet(a0Var.f409976y.value == null ? 0 : r6.length);
        rVar.f319791f.c();
    }
}
