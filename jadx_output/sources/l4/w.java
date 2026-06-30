package l4;

/* loaded from: classes13.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f315769a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final l4.q f315770b;

    /* renamed from: c, reason: collision with root package name */
    public volatile p4.i f315771c;

    public w(l4.q qVar) {
        this.f315770b = qVar;
    }

    public p4.i a() {
        this.f315770b.a();
        if (!this.f315769a.compareAndSet(false, true)) {
            java.lang.String b17 = b();
            l4.q qVar = this.f315770b;
            qVar.a();
            qVar.b();
            return new q4.i(((q4.c) qVar.f315748c.d0()).f360007d.compileStatement(b17));
        }
        if (this.f315771c == null) {
            java.lang.String b18 = b();
            l4.q qVar2 = this.f315770b;
            qVar2.a();
            qVar2.b();
            this.f315771c = new q4.i(((q4.c) qVar2.f315748c.d0()).f360007d.compileStatement(b18));
        }
        return this.f315771c;
    }

    public abstract java.lang.String b();

    public void c(p4.i iVar) {
        if (iVar == this.f315771c) {
            this.f315769a.set(false);
        }
    }
}
