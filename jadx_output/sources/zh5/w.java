package zh5;

/* loaded from: classes12.dex */
public final class w extends zh5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String mediaId, java.lang.String uriString, e60.t0 config) {
        super(mediaId, uriString, config);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(uriString, "uriString");
        kotlin.jvm.internal.o.g(config, "config");
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String str = this.f472991a;
        java.lang.String str2 = this.f472995e;
        return new gg3.c(str, str2, str2, null, 0L, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        dn.m mVar = this.f472994d;
        java.lang.String field_fileId = mVar.field_fileId;
        kotlin.jvm.internal.o.f(field_fileId, "field_fileId");
        java.lang.String field_aesKey = mVar.field_aesKey;
        kotlin.jvm.internal.o.f(field_aesKey, "field_aesKey");
        return new eg3.i(this.f472995e, field_fileId, field_aesKey);
    }

    @Override // zh5.a
    public dn.m d() {
        java.lang.String str = "favDataItem" + this.f472991a;
        dn.m mVar = this.f472994d;
        mVar.field_mediaId = str;
        e60.t0 t0Var = this.f472992b;
        mVar.f241785d = t0Var.f249733d;
        mVar.field_priority = t0Var.f249734e;
        mVar.field_fileType = 1;
        mVar.field_force_aeskeycdn = false;
        return mVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = this.f472991a;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407406h;
        java.lang.String path = this.f472993c;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        sf3.m mVar2 = sf3.m.f407404f;
        java.lang.String path2 = this.f472995e;
        kotlin.jvm.internal.o.g(path2, "path");
        linkedHashMap.put(mVar2, path2);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar2);
        a17.f407392f = new sf3.a();
        return a17;
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
        return mf3.u.f326123e;
    }
}
