package tu5;

/* loaded from: classes12.dex */
public class k extends uu5.a {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f422177b;

    public k(int i17) {
        this.f422177b = i17;
    }

    @Override // uu5.b
    public boolean a(tu5.h hVar) {
        return this.f422177b >= hVar.f422173b.f422171c.get();
    }

    @Override // uu5.b
    public long d(tu5.h hVar, java.util.concurrent.TimeUnit timeUnit) {
        return -1L;
    }
}
