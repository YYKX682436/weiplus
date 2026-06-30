package mp0;

/* loaded from: classes15.dex */
public final class b implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mp0.f f330429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mp0.e f330430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f330431c;

    public b(mp0.f fVar, mp0.e eVar, long j17) {
        this.f330429a = fVar;
        this.f330430b = eVar;
        this.f330431c = j17;
    }

    @Override // zo0.c
    public void a() {
        this.f330430b.k(null, this.f330431c, this.f330429a);
    }

    @Override // zo0.c
    public void b(hp0.i resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f330430b.k(resp, this.f330431c, this.f330429a);
    }
}
