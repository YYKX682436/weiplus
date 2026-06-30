package d7;

/* loaded from: classes13.dex */
public class g implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final d7.y f226804a;

    public g(d7.y yVar) {
        this.f226804a = yVar;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = q7.c.f360290a;
        return this.f226804a.a(new q7.a((java.nio.ByteBuffer) obj), i17, i18, lVar, d7.y.f226855j);
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        this.f226804a.getClass();
        return true;
    }
}
