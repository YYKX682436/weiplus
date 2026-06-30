package y06;

/* loaded from: classes16.dex */
public class e implements p06.c, z06.j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f458666e = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(y06.e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f458667a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.x1 f458668b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f458669c;

    /* renamed from: d, reason: collision with root package name */
    public final e16.b f458670d;

    public e(a16.l c17, e16.a aVar, n16.c fqName) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        this.f458667a = fqName;
        a16.d dVar = c17.f649a;
        this.f458668b = aVar != null ? ((t06.m) dVar.f624j).a(aVar) : o06.x1.f342004a;
        this.f458669c = ((e26.u) dVar.f615a).b(new y06.d(c17, this));
        this.f458670d = aVar != null ? (e16.b) kz5.n0.Y(((u06.j) aVar).c()) : null;
    }

    @Override // p06.c
    public n16.c a() {
        return this.f458667a;
    }

    @Override // z06.j
    public boolean b() {
        return false;
    }

    @Override // p06.c
    public java.util.Map c() {
        return kz5.q0.f314001d;
    }

    @Override // p06.c
    public o06.x1 getSource() {
        return this.f458668b;
    }

    @Override // p06.c
    public f26.o0 getType() {
        return (f26.z0) e26.b0.a(this.f458669c, this, f458666e[0]);
    }
}
