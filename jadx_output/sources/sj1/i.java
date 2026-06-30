package sj1;

/* loaded from: classes7.dex */
public final class i implements sj1.b, pb.b {

    /* renamed from: b, reason: collision with root package name */
    public static final sj1.i f408368b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb.b f408369a = new com.luggage.trace.PerfettoTrace();

    static {
        sj1.i iVar = new sj1.i();
        f408368b = iVar;
        iVar.init();
        iVar.i();
    }

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
        this.f408369a.getClass();
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
        ((com.luggage.trace.PerfettoTrace) this.f408369a).getClass();
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        ((com.luggage.trace.PerfettoTrace) this.f408369a).c(category, name);
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        ((com.luggage.trace.PerfettoTrace) this.f408369a).d(j17, j18);
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        ((com.luggage.trace.PerfettoTrace) this.f408369a).e(filePath);
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        ((com.luggage.trace.PerfettoTrace) this.f408369a).f(category, name, d17, d18);
    }

    @Override // sj1.b
    public void flush() {
    }

    @Override // pb.b
    public void g() {
        ((com.luggage.trace.PerfettoTrace) this.f408369a).g();
    }

    @Override // pb.b
    public com.luggage.trace.ProfileInfo h() {
        ((com.luggage.trace.PerfettoTrace) this.f408369a).getClass();
        return null;
    }

    @Override // pb.b
    public void i() {
        ((com.luggage.trace.PerfettoTrace) this.f408369a).i();
    }

    @Override // pb.b
    public void init() {
        ((com.luggage.trace.PerfettoTrace) this.f408369a).init();
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF45816a() {
        return ((com.luggage.trace.PerfettoTrace) this.f408369a).f45816a;
    }

    @Override // pb.b
    public void j(int i17) {
        this.f408369a.getClass();
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        return this.f408369a.k(category, name);
    }

    @Override // pb.b
    public void release() {
        this.f408369a.getClass();
    }
}
