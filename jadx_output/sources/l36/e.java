package l36;

/* loaded from: classes16.dex */
public class e extends x36.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n36.h f315478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l36.f f315479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l36.f fVar, x36.f0 f0Var, l36.j jVar, n36.h hVar) {
        super(f0Var);
        this.f315479f = fVar;
        this.f315478e = hVar;
    }

    @Override // x36.p, x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f315479f.f315491e) {
            l36.f fVar = this.f315479f;
            if (fVar.f315490d) {
                return;
            }
            fVar.f315490d = true;
            fVar.f315491e.getClass();
            super.close();
            this.f315478e.b();
        }
    }
}
