package g16;

/* loaded from: classes15.dex */
public final class p implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f267645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f267646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.q f267647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267648d;

    public p(g16.m0 m0Var, g16.q qVar, java.util.ArrayList arrayList) {
        this.f267646b = m0Var;
        this.f267647c = qVar;
        this.f267648d = arrayList;
        this.f267645a = m0Var;
    }

    @Override // g16.m0
    public void a() {
        this.f267646b.a();
        this.f267647c.f267649a.add(new t16.a((p06.c) kz5.n0.z0(this.f267648d)));
    }

    @Override // g16.m0
    public void b(n16.g gVar, java.lang.Object obj) {
        this.f267645a.b(gVar, obj);
    }

    @Override // g16.m0
    public void c(n16.g gVar, n16.b enumClassId, n16.g enumEntryName) {
        kotlin.jvm.internal.o.g(enumClassId, "enumClassId");
        kotlin.jvm.internal.o.g(enumEntryName, "enumEntryName");
        this.f267645a.c(gVar, enumClassId, enumEntryName);
    }

    @Override // g16.m0
    public g16.n0 d(n16.g gVar) {
        return this.f267645a.d(gVar);
    }

    @Override // g16.m0
    public g16.m0 e(n16.g gVar, n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        return this.f267645a.e(gVar, classId);
    }

    @Override // g16.m0
    public void f(n16.g gVar, t16.f value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f267645a.f(gVar, value);
    }
}
