package th5;

/* loaded from: classes12.dex */
public final class o extends th5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419419d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f419420e;

    /* renamed from: f, reason: collision with root package name */
    public mf3.w f419421f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f419422g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f419423h;

    /* renamed from: i, reason: collision with root package name */
    public float f419424i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f419425j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.a f419426k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, java.lang.String originUrl, java.lang.String thumbUrl, long j17, com.tencent.mm.feature.gallery.api.BizData bizData) {
        super(i17, j17, bizData);
        kotlin.jvm.internal.o.g(originUrl, "originUrl");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(bizData, "bizData");
        this.f419419d = originUrl;
        this.f419420e = thumbUrl;
        this.f419421f = mf3.w.f326128d;
        this.f419422g = "";
        this.f419423h = "";
        th5.m mVar = th5.m.f419407a;
        java.lang.String a17 = mVar.a(b());
        if (com.tencent.mm.vfs.w6.j(a17)) {
            this.f419423h = a17;
            if (d()) {
                this.f419421f = mf3.w.f326129e;
            }
        }
        java.lang.String b17 = mVar.b(b());
        if ((this.f419422g.length() == 0) && com.tencent.mm.vfs.w6.j(b17)) {
            this.f419422g = b17;
        }
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    public final java.lang.String b() {
        th5.a1 a1Var = th5.a1.f419340a;
        java.lang.String a17 = a1Var.a(this.f419419d);
        java.lang.String a18 = a1Var.a(this.f419420e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f419342a);
        sb6.append('_');
        sb6.append(a17.hashCode());
        sb6.append('_');
        sb6.append(a18.hashCode());
        return r26.i0.u(sb6.toString(), '-', '_', false, 4, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final boolean d() {
        java.lang.String str = this.f419419d;
        if (!r26.n0.N(str)) {
            java.lang.String str2 = this.f419420e;
            if ((!r26.n0.N(str2)) && !kotlin.jvm.internal.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path = this.f419422g;
        if (path.length() == 0) {
            path = th5.m.f419407a.b(b());
        }
        java.lang.String path2 = this.f419423h;
        if (path2.length() == 0) {
            path2 = th5.m.f419407a.a(b());
        }
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407406h;
        kotlin.jvm.internal.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        sf3.m mVar2 = sf3.m.f407404f;
        linkedHashMap.put(mVar2, path);
        sf3.m mVar3 = sf3.m.f407403e;
        kotlin.jvm.internal.o.g(path2, "path");
        linkedHashMap.put(mVar3, path2);
        java.util.Map map = (60 & 1) != 0 ? kz5.q0.f314001d : linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f407402d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        kotlin.jvm.internal.o.g(previewPath, "previewPath");
        kotlin.jvm.internal.o.g(detectPath, "detectPath");
        kotlin.jvm.internal.o.g(detectType, "detectType");
        kotlin.jvm.internal.o.g(loadStrategy, "loadStrategy");
        if (th5.n.f419414a[this.f419421f.ordinal()] != 1) {
            if (!(this.f419423h.length() > 0) || !com.tencent.mm.vfs.w6.j(this.f419423h)) {
                mVar3 = mVar2;
            }
        }
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f407387a.get(mVar3);
        gVar.f407390d = str != null ? str : "";
        gVar.f407391e = mVar3;
        gVar.f407392f = new th5.x();
        return gVar;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f419421f = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        if ((this.f419423h.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419423h)) {
            return this.f419423h;
        }
        if ((this.f419422g.length() > 0) && com.tencent.mm.vfs.w6.j(this.f419422g)) {
            return this.f419422g;
        }
        java.lang.String str = this.f419422g;
        return str.length() == 0 ? this.f419423h : str;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return "biz_photo_img_".concat(b());
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f419421f;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326123e;
    }
}
