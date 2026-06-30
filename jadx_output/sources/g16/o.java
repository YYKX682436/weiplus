package g16;

/* loaded from: classes15.dex */
public final class o implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f267640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f267641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.r f267642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n16.g f267643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267644e;

    public o(g16.m0 m0Var, g16.r rVar, n16.g gVar, java.util.ArrayList arrayList) {
        this.f267641b = m0Var;
        this.f267642c = rVar;
        this.f267643d = gVar;
        this.f267644e = arrayList;
        this.f267640a = m0Var;
    }

    @Override // g16.m0
    public void a() {
        this.f267641b.a();
        this.f267642c.g(this.f267643d, new t16.a((p06.c) kz5.n0.z0(this.f267644e)));
    }

    @Override // g16.m0
    public void b(n16.g gVar, java.lang.Object obj) {
        this.f267640a.b(gVar, obj);
    }

    @Override // g16.m0
    public void c(n16.g gVar, n16.b enumClassId, n16.g enumEntryName) {
        kotlin.jvm.internal.o.g(enumClassId, "enumClassId");
        kotlin.jvm.internal.o.g(enumEntryName, "enumEntryName");
        this.f267640a.c(gVar, enumClassId, enumEntryName);
    }

    @Override // g16.m0
    public g16.n0 d(n16.g gVar) {
        return this.f267640a.d(gVar);
    }

    @Override // g16.m0
    public g16.m0 e(n16.g gVar, n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        return this.f267640a.e(gVar, classId);
    }

    @Override // g16.m0
    public void f(n16.g gVar, t16.f value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f267640a.f(gVar, value);
    }
}
