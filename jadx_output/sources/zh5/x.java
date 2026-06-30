package zh5;

/* loaded from: classes12.dex */
public final class x extends zh5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String mediaId, java.lang.String uriString, e60.t0 config) {
        super(mediaId, uriString, config);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(uriString, "uriString");
        kotlin.jvm.internal.o.g(config, "config");
    }

    @Override // mf3.k
    public gg3.c a() {
        return new gg3.c(this.f472991a, this.f472993c, this.f472995e, null, this.f472996f, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // zh5.a
    public dn.m d() {
        java.lang.String str = "favDataItem" + this.f472991a;
        dn.m mVar = this.f472994d;
        mVar.field_mediaId = str;
        e60.t0 t0Var = this.f472992b;
        mVar.f241785d = t0Var.f249733d;
        mVar.field_priority = t0Var.f249734e;
        mVar.field_fileType = 4;
        mVar.field_force_aeskeycdn = false;
        return mVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = this.f472991a;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        java.lang.String path = this.f472993c;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // zh5.a, mf3.k
    public java.lang.String g() {
        return this.f472995e;
    }

    @Override // zh5.a, mf3.k
    public java.lang.String getId() {
        return this.f472991a;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326124f;
    }
}
