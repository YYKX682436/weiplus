package sj1;

/* loaded from: classes7.dex */
public class h implements sj1.b, pb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb.b f408367a = new pb.a();

    public h() {
        init();
    }

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
        ((pb.a) this.f408367a).a(j17, j18, d17);
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
        ((pb.a) this.f408367a).b(data, d17);
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        this.f408367a.c(category, name);
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        ((pb.a) this.f408367a).d(j17, j18);
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        ((pb.a) this.f408367a).e(filePath);
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        ((pb.a) this.f408367a).f(category, name, d17, d18);
    }

    @Override // sj1.b
    public void flush() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // pb.b
    public void g() {
        ((pb.a) this.f408367a).g();
    }

    @Override // pb.b
    public com.luggage.trace.ProfileInfo h() {
        return ((pb.a) this.f408367a).h();
    }

    @Override // pb.b
    public void i() {
        ((pb.a) this.f408367a).i();
    }

    @Override // pb.b
    public void init() {
        this.f408367a.init();
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF45816a() {
        ((pb.a) this.f408367a).getClass();
        return true;
    }

    @Override // pb.b
    public void j(int i17) {
        ((pb.a) this.f408367a).j(i17);
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        return this.f408367a.k(category, name);
    }

    @Override // pb.b
    public void release() {
        ((pb.a) this.f408367a).release();
    }
}
