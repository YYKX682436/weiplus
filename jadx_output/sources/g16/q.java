package g16;

/* loaded from: classes15.dex */
public final class q implements g16.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f267649a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g16.t f267650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n16.g f267651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g16.r f267652d;

    public q(g16.t tVar, n16.g gVar, g16.r rVar) {
        this.f267650b = tVar;
        this.f267651c = gVar;
        this.f267652d = rVar;
    }

    @Override // g16.n0
    public void a() {
        java.util.ArrayList elements = this.f267649a;
        g16.s sVar = (g16.s) this.f267652d;
        sVar.getClass();
        kotlin.jvm.internal.o.g(elements, "elements");
        n16.g gVar = this.f267651c;
        if (gVar == null) {
            return;
        }
        o06.p b17 = y06.c.b(gVar, sVar.f267657d);
        if (b17 != null) {
            java.util.HashMap hashMap = sVar.f267655b;
            java.util.List b18 = o26.a.b(elements);
            f26.o0 type = ((r06.t1) b17).getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            hashMap.put(gVar, new t16.d0(b18, type));
            return;
        }
        if (sVar.f267656c.p(sVar.f267658e) && kotlin.jvm.internal.o.b(gVar.h(), "value")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = elements.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof t16.a) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sVar.f267659f.add((p06.c) ((t16.a) it6.next()).f414613a);
            }
        }
    }

    @Override // g16.n0
    public void b(java.lang.Object obj) {
        this.f267649a.add(g16.t.u(this.f267650b, this.f267651c, obj));
    }

    @Override // g16.n0
    public void c(t16.f value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f267649a.add(new t16.x(value));
    }

    @Override // g16.n0
    public g16.m0 d(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        return new g16.p(this.f267650b.q(classId, o06.x1.f342004a, arrayList), this, arrayList);
    }

    @Override // g16.n0
    public void e(n16.b enumClassId, n16.g enumEntryName) {
        kotlin.jvm.internal.o.g(enumClassId, "enumClassId");
        kotlin.jvm.internal.o.g(enumEntryName, "enumEntryName");
        this.f267649a.add(new t16.k(enumClassId, enumEntryName));
    }
}
