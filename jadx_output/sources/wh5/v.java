package wh5;

/* loaded from: classes12.dex */
public final class v implements mf3.k, uh5.i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f446096a;

    /* renamed from: b, reason: collision with root package name */
    public final bm5.b0 f446097b;

    /* renamed from: c, reason: collision with root package name */
    public mf3.w f446098c;

    public v(com.tencent.mm.storage.f9 msgInfo, bm5.b0 fileDescriptor) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(fileDescriptor, "fileDescriptor");
        this.f446096a = msgInfo;
        this.f446097b = fileDescriptor;
        this.f446098c = mf3.w.f326128d;
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String id6 = getId();
        java.lang.String c17 = e().a(sf3.m.f407404f).c();
        if (c17 == null) {
            c17 = "";
        }
        return new gg3.c(id6, c17, g(), null, 0L, false, 40, null);
    }

    @Override // uh5.i
    public com.tencent.mm.storage.f9 b() {
        return this.f446096a;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final l70.d d() {
        s70.c cVar = wh5.t.f446094a[this.f446098c.ordinal()] == 1 ? s70.c.f403920h : s70.c.f403919g;
        try {
            i95.m c17 = i95.n0.c(xs.d1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return xs.d1.H5((xs.d1) c17, this.f446096a, cVar, false, 4, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String mediaId = getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.Map linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407404f;
        bm5.f0 f0Var = bm5.f0.f22563h;
        bm5.b0 b0Var = this.f446097b;
        linkedHashMap.put(mVar, bm5.b0.a(b0Var, f0Var, false, 2, null));
        sf3.m mVar2 = sf3.m.f407403e;
        linkedHashMap.put(mVar2, bm5.b0.a(b0Var, bm5.f0.f22562g, false, 2, null));
        linkedHashMap.put(sf3.m.f407406h, bm5.b0.a(b0Var, bm5.f0.f22564i, false, 2, null));
        if ((60 & 1) != 0) {
            linkedHashMap = kz5.q0.f314001d;
        }
        java.util.Map map = linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f407402d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        kotlin.jvm.internal.o.g(previewPath, "previewPath");
        kotlin.jvm.internal.o.g(detectPath, "detectPath");
        kotlin.jvm.internal.o.g(detectType, "detectType");
        kotlin.jvm.internal.o.g(loadStrategy, "loadStrategy");
        sf3.m mVar3 = wh5.t.f446094a[this.f446098c.ordinal()] == 1 ? mVar2 : mVar;
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f407387a.get(mVar3);
        gVar.f407390d = str != null ? str : "";
        gVar.f407391e = mVar3;
        gVar.f407392f = new wh5.u(this);
        return gVar;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f446098c = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        int i17 = wh5.t.f446094a[this.f446098c.ordinal()];
        bm5.b0 b0Var = this.f446097b;
        return i17 == 1 ? bm5.b0.a(b0Var, bm5.f0.f22569q, false, 2, null) : bm5.b0.a(b0Var, bm5.f0.f22568p, false, 2, null);
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return java.lang.String.valueOf(this.f446096a.getMsgId());
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        return this.f446098c;
    }

    @Override // mf3.k
    public mf3.u getType() {
        return mf3.u.f326125g;
    }

    public final l70.d h() {
        s70.c cVar = wh5.t.f446094a[this.f446098c.ordinal()] == 1 ? s70.c.f403922m : s70.c.f403921i;
        try {
            i95.m c17 = i95.n0.c(xs.d1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return xs.d1.H5((xs.d1) c17, this.f446096a, cVar, false, 4, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
