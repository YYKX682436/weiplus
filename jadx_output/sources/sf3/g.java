package sf3;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f407387a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f407388b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f407389c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f407390d;

    /* renamed from: e, reason: collision with root package name */
    public sf3.m f407391e;

    /* renamed from: f, reason: collision with root package name */
    public sf3.h f407392f;

    public g(java.util.Map pathMap, java.lang.String mediaId, java.lang.String previewPath, java.lang.String detectPath, sf3.m detectType, sf3.h loadStrategy, int i17, kotlin.jvm.internal.i iVar) {
        pathMap = (i17 & 1) != 0 ? kz5.q0.f314001d : pathMap;
        previewPath = (i17 & 4) != 0 ? "" : previewPath;
        detectPath = (i17 & 8) != 0 ? "" : detectPath;
        detectType = (i17 & 16) != 0 ? sf3.m.f407402d : detectType;
        loadStrategy = (i17 & 32) != 0 ? new sf3.b() : loadStrategy;
        kotlin.jvm.internal.o.g(pathMap, "pathMap");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(previewPath, "previewPath");
        kotlin.jvm.internal.o.g(detectPath, "detectPath");
        kotlin.jvm.internal.o.g(detectType, "detectType");
        kotlin.jvm.internal.o.g(loadStrategy, "loadStrategy");
        this.f407387a = pathMap;
        this.f407388b = mediaId;
        this.f407389c = previewPath;
        this.f407390d = detectPath;
        this.f407391e = detectType;
        this.f407392f = loadStrategy;
    }

    public final sf3.g a(sf3.m type) {
        kotlin.jvm.internal.o.g(type, "type");
        sf3.g gVar = new sf3.g(this.f407387a, this.f407388b, this.f407389c, this.f407390d, null, this.f407392f, 16, null);
        java.lang.String str = (java.lang.String) gVar.f407387a.get(type);
        if (str == null) {
            str = "";
        }
        gVar.f407390d = str;
        gVar.f407391e = type;
        return gVar;
    }

    public final sf3.g b(sf3.m... args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (sf3.m mVar : args) {
            java.lang.String str = (java.lang.String) this.f407387a.get(mVar);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
                return a(mVar);
            }
            sb6.append(mVar);
            sb6.append(":");
            sb6.append(str);
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.e("ImageLoadParam", "detect error: " + ((java.lang.Object) sb6));
        return a(sf3.m.f407402d);
    }

    public final java.lang.String c() {
        if (this.f407391e == sf3.m.f407402d) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        return this.f407390d;
    }
}
