package u85;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final u85.i f425707a = new u85.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f425708b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f425709c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f425710d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f425711e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f425712f;

    /* renamed from: g, reason: collision with root package name */
    public static final fp0.o f425713g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f425714h;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath() + "/sticker/";
        f425708b = str;
        f425709c = str + "package/";
        f425710d = str + "temp/";
        f425711e = str + "thumb/";
        f425712f = 50;
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(Integer.MAX_VALUE, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "StickerTask"));
        f425713g = oVar;
        f425714h = new java.util.HashMap();
        u85.f fVar = new u85.f();
        com.tencent.mm.vfs.w6.u(str);
        com.tencent.mm.vfs.w6.t(str);
        oVar.g(fVar);
    }

    public static final void a(u85.i iVar, java.lang.String str, int i17) {
        iVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            kz5.h0.u(linkedList, s17);
            int size = linkedList.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerFileManager", "cleanFile: " + str + " count is " + size);
            if (size <= i17) {
                return;
            }
            if (linkedList.size() > 1) {
                kz5.g0.t(linkedList, new u85.g());
            }
            java.util.List<com.tencent.mm.vfs.x1> subList = linkedList.subList(i17, size);
            kotlin.jvm.internal.o.f(subList, "subList(...)");
            for (com.tencent.mm.vfs.x1 x1Var : subList) {
                boolean z17 = x1Var.f213236f;
                java.lang.String str2 = x1Var.f213232b;
                if (z17) {
                    com.tencent.mm.vfs.w6.f(str + str2);
                } else {
                    com.tencent.mm.vfs.w6.h(str + str2);
                }
            }
        }
    }

    public final java.lang.String b(java.lang.String lensId) {
        kotlin.jvm.internal.o.g(lensId, "lensId");
        return f425709c + lensId + '/';
    }

    public final fp0.u c(r45.p64 lensInfo) {
        kotlin.jvm.internal.o.g(lensInfo, "lensInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerFileManager", "loadByFileId: " + lensInfo.f382792d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(lensInfo.f382792d)) {
            return fp0.u.f265291g;
        }
        java.lang.String LensId = lensInfo.f382792d;
        kotlin.jvm.internal.o.f(LensId, "LensId");
        if (t85.j.f416473l.a(b(LensId))) {
            return fp0.u.f265290f;
        }
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = new com.tencent.mm.sticker.loader.StickerLoadInfo(0);
        java.lang.String str = lensInfo.f382792d;
        if (str == null) {
            str = "";
        }
        stickerLoadInfo.f193690e = str;
        r45.r64 r64Var = lensInfo.f382796h;
        java.lang.String str2 = r64Var != null ? r64Var.f384570d : null;
        if (str2 == null) {
            str2 = "";
        }
        stickerLoadInfo.f193691f = str2;
        java.lang.String str3 = r64Var != null ? r64Var.f384571e : null;
        stickerLoadInfo.f193692g = str3 != null ? str3 : "";
        stickerLoadInfo.f193693h = r64Var != null ? r64Var.f384572f : 0;
        d(stickerLoadInfo);
        return fp0.u.f265293i;
    }

    public final void d(com.tencent.mm.sticker.loader.StickerLoadInfo info) {
        fp0.d dVar;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.HashMap hashMap = f425714h;
        if (hashMap.containsKey(info.a())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerFileManager", "loadByInfo: " + info.a() + " waiting in queue");
            return;
        }
        if (((km0.c) gm0.j1.p().a()).a()) {
            dVar = info.f193689d == 1 ? new u85.q(info) : new u85.e(info);
        } else {
            u85.n nVar = new u85.n(info);
            hashMap.put(info.a(), nVar);
            dVar = nVar;
        }
        f425713g.a(dVar);
    }

    public final void e(fp0.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        f425713g.g(callback);
    }

    public final void f(fp0.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        fp0.o oVar = f425713g;
        oVar.getClass();
        pm0.v.X(new fp0.n(oVar, callback));
    }
}
