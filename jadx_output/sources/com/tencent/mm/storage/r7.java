package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.q7 f195277a;

    /* renamed from: b, reason: collision with root package name */
    public final l75.k0 f195278b;

    public r7(com.tencent.mm.storage.q7 storage, l75.k0 db6) {
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(db6, "db");
        this.f195277a = storage;
        this.f195278b = db6;
    }

    public final com.tencent.mm.storage.p7 a(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        p75.i0 i17 = dm.f3.f236806p.i();
        p75.y yVar = (p75.y) dm.f3.f236807q.j(str).c(dm.f3.f236808r.i(1));
        yVar.f(dm.f3.f236810t.i(1));
        i17.f352657d = yVar;
        i17.e(dm.f3.f236809s.u());
        i17.c(1, 0);
        return (com.tencent.mm.storage.p7) i17.a().o(this.f195278b, com.tencent.mm.storage.p7.class);
    }

    public final com.tencent.mm.storage.p7 b(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        p75.i0 i17 = dm.f3.f236806p.i();
        i17.f352657d = dm.f3.f236807q.j(str).c(dm.f3.f236808r.i(1));
        i17.e(dm.f3.f236809s.u());
        i17.c(1, 0);
        return (com.tencent.mm.storage.p7) i17.a().o(this.f195278b, com.tencent.mm.storage.p7.class);
    }
}
