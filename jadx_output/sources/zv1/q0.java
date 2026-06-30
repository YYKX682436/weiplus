package zv1;

/* loaded from: classes10.dex */
public final class q0 extends zv1.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.cache.CacheClassifyType f476353b;

    /* renamed from: c, reason: collision with root package name */
    public final zv1.j0 f476354c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f476355d;

    /* renamed from: e, reason: collision with root package name */
    public final zv1.w0 f476356e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f476357f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f476358g;

    public q0(com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType, zv1.j0 policy, java.util.List additionalPaths, zv1.w0 w0Var) {
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        kotlin.jvm.internal.o.g(policy, "policy");
        kotlin.jvm.internal.o.g(additionalPaths, "additionalPaths");
        this.f476353b = cacheType;
        this.f476354c = policy;
        this.f476355d = additionalPaths;
        this.f476356e = w0Var;
        this.f476357f = jz5.h.b(new zv1.p0(this));
        this.f476358g = jz5.h.b(new zv1.o0(this));
    }

    @Override // zv1.d
    public com.tencent.mm.plugin.clean.cache.CacheClassifyType a() {
        return this.f476353b;
    }

    @Override // zv1.d
    public zv1.w0 d() {
        return (zv1.n0) ((jz5.n) this.f476358g).getValue();
    }

    @Override // zv1.d
    public java.util.List e() {
        java.util.List list = (java.util.List) ((jz5.n) this.f476357f).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((jz5.l) it.next()).f302833d);
        }
        return kz5.n0.Q(kz5.n0.t0(arrayList, this.f476355d));
    }

    @Override // zv1.c
    public zv1.j0 f() {
        return this.f476354c;
    }
}
