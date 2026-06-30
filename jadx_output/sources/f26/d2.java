package f26;

/* loaded from: classes16.dex */
public final class d2 extends f26.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f259141c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f259142d;

    public d2(java.util.Map map, boolean z17) {
        this.f259141c = map;
        this.f259142d = z17;
    }

    @Override // f26.q2
    public boolean a() {
        return this.f259142d;
    }

    @Override // f26.q2
    public boolean e() {
        return this.f259141c.isEmpty();
    }

    @Override // f26.f2
    public f26.l2 g(f26.c2 key) {
        kotlin.jvm.internal.o.g(key, "key");
        return (f26.l2) this.f259141c.get(key);
    }
}
