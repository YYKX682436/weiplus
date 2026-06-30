package o06;

/* loaded from: classes15.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f341934a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f341935b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.v f341936c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.v f341937d;

    public c1(e26.c0 storageManager, o06.v0 module) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(module, "module");
        this.f341934a = storageManager;
        this.f341935b = module;
        this.f341936c = ((e26.u) storageManager).c(new o06.b1(this));
        this.f341937d = ((e26.u) storageManager).c(new o06.a1(this));
    }

    public final o06.g a(n16.b classId, java.util.List typeParametersCount) {
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(typeParametersCount, "typeParametersCount");
        return (o06.g) ((e26.r) this.f341937d).invoke(new o06.y0(classId, typeParametersCount));
    }
}
