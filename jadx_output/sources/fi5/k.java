package fi5;

/* loaded from: classes3.dex */
public final class k implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f263083a;

    /* renamed from: b, reason: collision with root package name */
    public final sf3.g f263084b;

    public k(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f263083a = path;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        linkedHashMap.put(mVar, path);
        this.f263084b = new sf3.g(linkedHashMap, path, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return new eg3.i(this.f263083a, null, null, 6, null);
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f263084b;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return this.f263083a;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return this.f263083a;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }
}
