package t23;

/* loaded from: classes10.dex */
public final class p0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f415222n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f415223o = false;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f415224p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f415225q = false;

    /* renamed from: r, reason: collision with root package name */
    public static volatile t23.p0 f415226r = null;

    /* renamed from: s, reason: collision with root package name */
    public static int f415227s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f415228t = -1;

    /* renamed from: a, reason: collision with root package name */
    public t23.x1 f415229a;

    /* renamed from: b, reason: collision with root package name */
    public t23.j f415230b;

    /* renamed from: c, reason: collision with root package name */
    public t23.y0 f415231c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f415232d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f415233e = new java.util.LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f415234f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f415235g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f415236h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f415237i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f415238j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f415239k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f415240l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final android.util.SparseArray f415241m = new android.util.SparseArray();

    public p0() {
        if (this.f415229a == null) {
            this.f415229a = new t23.x1();
        }
        if (this.f415231c == null) {
            this.f415231c = new t23.y0();
        }
        if (this.f415230b == null) {
            this.f415230b = new t23.j();
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_album_local_name, "", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "localAlbumName: %s.", Zi);
        try {
            cl0.e f17 = new cl0.g(Zi).f("localAlbumName");
            for (int i17 = 0; i17 < f17.length(); i17++) {
                cl0.g k17 = f17.k(i17);
                t23.c1 c1Var = new t23.c1();
                c1Var.f415121a = k17.optString("key");
                c1Var.f415122b = k17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                c1Var.f415123c = k17.optString("default");
                int b17 = j33.d0.b(c1Var.f415122b);
                c1Var.f415124d = b17;
                this.f415241m.put(b17, c1Var);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
        ((java.util.HashMap) j().f415239k).put(str2, java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) j().f415239k).put(str, java.lang.Integer.valueOf(i17));
        ((java.util.ArrayList) j().f415240l).add(str2);
        java.util.Iterator it = ((java.util.HashMap) j().f415238j).keySet().iterator();
        java.lang.String str3 = null;
        boolean z17 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            if (str4 != null) {
                str3 = (java.lang.String) ((java.util.HashMap) j().f415238j).get(str4);
                z17 = str.equals(str4) || (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3) && str3.equals(str2));
                if (z17) {
                    ((java.util.HashMap) j().f415238j).put(str4, str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "alreadyFind, key = %s, editPath = %s, rawPath = %s", str4, str2, str);
                    break;
                }
            }
        }
        if (z17) {
            return str3;
        }
        ((java.util.HashMap) j().f415238j).put(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "rawPath = %s start to do edit, editPath = %s", str, str2);
        return null;
    }

    public static boolean b() {
        int i17 = f415227s;
        if (i17 > 0) {
            f415227s = i17 - 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "pennqin, defGallery %d.", java.lang.Integer.valueOf(f415227s));
        if (f415227s != 0) {
            return false;
        }
        if (f415226r != null && f415226r.f415231c != null && f415226r.f415230b != null) {
            if (f415227s != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GalleryCore", "oh, ref count not right!!! Maybe because quick enter/back.");
            } else {
                if (j().f415230b != null) {
                    t23.z1 z1Var = t23.z1.f415313d;
                    z1Var.f415314a.clear();
                    z1Var.f415315b.clear();
                    h().b();
                    f415226r.f415230b.h(null);
                    t23.o0 o0Var = f415226r.f415230b.f415186a;
                    kk.j jVar = o0Var.f415210a;
                    if (jVar != null) {
                        ((lt0.f) jVar).c(new t23.l0(o0Var));
                        o0Var.f415210a = null;
                    }
                    synchronized (o0Var.f415215f) {
                        t23.t0 t0Var = o0Var.f415211b;
                        if (t0Var != null) {
                            t0Var.i();
                            t0Var.b();
                            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", t0Var.f415271e).apply();
                            o0Var.f415211b = null;
                        }
                    }
                    f415226r.f415230b = null;
                }
                f415226r.f415229a = null;
                if (f415226r.f415231c != null) {
                    t23.y0 y0Var = f415226r.f415231c;
                    if (y0Var.f415303d == null && y0Var.f415301b != null) {
                        y0Var.f415303d = new com.tencent.mm.sdk.platformtools.n3(y0Var.f415301b.getLooper());
                    }
                    com.tencent.mm.sdk.platformtools.n3 n3Var = y0Var.f415303d;
                    if (n3Var != null) {
                        n3Var.removeCallbacksAndMessages(null);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
                    }
                    f415226r.f415231c.a().removeCallbacksAndMessages(null);
                    t23.y0 y0Var2 = f415226r.f415231c;
                    if (y0Var2.f415309j == null && y0Var2.f415308i != null) {
                        y0Var2.f415309j = new com.tencent.mm.sdk.platformtools.n3(y0Var2.f415308i.getLooper());
                    }
                    com.tencent.mm.sdk.platformtools.n3 n3Var2 = y0Var2.f415309j;
                    if (n3Var2 != null) {
                        n3Var2.removeCallbacksAndMessages(null);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    t23.y0 y0Var3 = f415226r.f415231c;
                    if (y0Var3.f415302c == null && y0Var3.f415300a != null) {
                        y0Var3.f415302c = new com.tencent.mm.sdk.platformtools.n3(y0Var3.f415300a.getLooper());
                    }
                    com.tencent.mm.sdk.platformtools.n3 n3Var3 = y0Var3.f415302c;
                    if (n3Var3 != null) {
                        n3Var3.removeCallbacksAndMessages(null);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    t23.y0 y0Var4 = f415226r.f415231c;
                    android.os.HandlerThread handlerThread = y0Var4.f415301b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        y0Var4.f415301b = null;
                    }
                    y0Var4.f415303d = null;
                    y0Var4.f415304e = null;
                    java.util.concurrent.ExecutorService executorService = y0Var4.f415305f;
                    if (executorService != null) {
                        ((ku5.f) executorService).shutdown();
                        y0Var4.f415305f = null;
                    }
                    java.util.concurrent.ExecutorService executorService2 = y0Var4.f415306g;
                    if (executorService2 != null) {
                        ((ku5.f) executorService2).shutdown();
                        y0Var4.f415306g = null;
                    }
                    java.util.concurrent.ExecutorService executorService3 = y0Var4.f415307h;
                    if (executorService3 != null) {
                        ((ku5.f) executorService3).shutdown();
                        y0Var4.f415307h = null;
                    }
                    android.os.HandlerThread handlerThread2 = y0Var4.f415308i;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        y0Var4.f415308i = null;
                    }
                    y0Var4.f415309j = null;
                    android.os.HandlerThread handlerThread3 = y0Var4.f415300a;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                        y0Var4.f415300a = null;
                    }
                    y0Var4.f415302c = null;
                    f415226r.f415231c = null;
                }
                f415226r = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "stopServices: finish.");
            }
        }
        return true;
    }

    public static void c() {
        java.util.Map map = j().f415238j;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) map;
        for (java.lang.String str : hashMap.keySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            arrayList.add(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[deleteAllEditMedia] origin path = " + str + ", album edit path = " + str2);
        }
        ((java.util.HashMap) j().f415238j).clear();
        ((java.util.ArrayList) j().f415240l).clear();
        ((java.util.HashMap) j().f415239k).clear();
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: t23.p0$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = 0;
                while (true) {
                    java.util.List list = arrayList;
                    if (i17 >= list.size()) {
                        return;
                    }
                    java.lang.String str3 = (java.lang.String) list.get(i17);
                    com.tencent.mm.vfs.w6.h(str3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[deleteAllEditMedia] VFSFileOp.deleteFile = " + str3);
                    i17++;
                }
            }
        });
    }

    public static void d(final java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        int indexOf;
        java.util.Map map = j().f415238j;
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.HashMap hashMap = (java.util.HashMap) map;
        for (java.lang.String str : hashMap.keySet()) {
            java.lang.String str2 = (java.lang.String) hashMap.get(str);
            arrayList3.add(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "origin path = " + str + ", album edit path = " + str2);
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            arrayList3.remove((java.lang.String) arrayList.get(i17));
        }
        ((java.util.HashMap) j().f415238j).clear();
        final boolean z17 = !((java.util.ArrayList) j().f415240l).isEmpty();
        ((java.util.ArrayList) j().f415240l).clear();
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e17 = e(str3);
            if (e17 == null) {
                e17 = g(str3);
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = e17;
            if (galleryItem$MediaItem == null && arrayList2 != null && (indexOf = arrayList2.indexOf(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str3, "", ""))) >= 0 && indexOf < arrayList2.size()) {
                galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList2.get(indexOf);
            }
            if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                hashMap2.put(str3, galleryItem$MediaItem);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: t23.p0$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = 0;
                while (true) {
                    java.util.List list = arrayList3;
                    if (i18 >= list.size()) {
                        break;
                    }
                    java.lang.String str4 = (java.lang.String) list.get(i18);
                    com.tencent.mm.vfs.w6.h(str4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[deleteEditMedia] VFSFileOp.deleteFile = " + str4);
                    i18++;
                }
                if (!z17) {
                    return;
                }
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList4 = arrayList;
                    if (i19 >= arrayList4.size()) {
                        ((java.util.HashMap) t23.p0.j().f415239k).clear();
                        return;
                    }
                    java.lang.String str5 = (java.lang.String) arrayList4.get(i19);
                    if (str5 != null && ((java.util.HashMap) t23.p0.j().f415239k).get(str5) != null) {
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) hashMap2.get(str5);
                        if (galleryItem$MediaItem2 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem2;
                            if (galleryItem$ImageMediaItem.f138425w) {
                                bs.b wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
                                bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission");
                                if (wi6 == null || wi7 == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCore", "create checkFileChain error");
                                } else {
                                    java.lang.String a17 = q75.c.a("jpg");
                                    qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
                                    wi7.b(wi6);
                                    aq.t0 t0Var = new aq.t0(galleryItem$ImageMediaItem.f138427y, galleryItem$ImageMediaItem.f138426x, a17, 0L, new android.os.Bundle());
                                    t23.q0 q0Var = new t23.q0();
                                    ((hs.v) r7Var).getClass();
                                    qp.b.f365674a.a(wi7, t0Var, q0Var);
                                }
                            }
                        }
                        int intValue = ((java.lang.Integer) ((java.util.HashMap) t23.p0.j().f415239k).get(str5)).intValue();
                        if (intValue > 0) {
                            t23.p0 j17 = t23.p0.j();
                            boolean z18 = intValue == 1;
                            j17.getClass();
                            if (z18) {
                                java.lang.String a18 = q75.c.a("jpg");
                                zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                ((yb0.g) b0Var).getClass();
                                com.tencent.mm.platformtools.ExportFileUtil.b(context, str5, a18);
                                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "exportPhotoToSystemAlbum = %s", a18);
                            } else {
                                java.lang.String b17 = q75.c.b("mp4");
                                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, str5, b17);
                                q75.c.f(b17, com.tencent.mm.sdk.platformtools.x2.f193071a);
                                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "exportVideoToSystemAlbum = %s", b17);
                            }
                        }
                    }
                    i19++;
                }
            }
        });
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e(java.lang.String str) {
        int indexOf;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, "", "");
        if (l() == null || (indexOf = l().indexOf(b17)) < 0) {
            return null;
        }
        return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) l().get(indexOf);
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f(java.lang.String str) {
        if (l() == null) {
            return null;
        }
        java.util.Iterator it = l().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            java.lang.String str2 = galleryItem$MediaItem.f138431f;
            if (str2 != null && str2.equals(str)) {
                return galleryItem$MediaItem;
            }
        }
        return null;
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem g(java.lang.String str) {
        java.util.LinkedHashSet m17;
        java.util.Iterator it;
        if (str == null || (m17 = m()) == null || (it = m17.iterator()) == null) {
            return null;
        }
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (str.equals(galleryItem$MediaItem.f138430e)) {
                return galleryItem$MediaItem;
            }
        }
        return null;
    }

    public static t23.j h() {
        if (j().f415230b == null) {
            j().f415230b = new t23.j();
        }
        return j().f415230b;
    }

    public static java.util.HashSet i() {
        return j().f415234f;
    }

    public static t23.p0 j() {
        if (f415226r == null) {
            f415226r = new t23.p0();
        }
        return f415226r;
    }

    public static t23.x1 k() {
        if (j().f415229a == null) {
            j().f415229a = new t23.x1();
        }
        return j().f415229a;
    }

    public static java.util.ArrayList l() {
        return j().f415232d;
    }

    public static java.util.LinkedHashSet m() {
        return j().f415233e;
    }

    public static t23.y0 n() {
        if (j().f415231c == null) {
            j().f415231c = new t23.y0();
        }
        return j().f415231c;
    }

    public static void o() {
        int i17 = f415227s + 1;
        f415227s = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "pennqin, refGallery %d.", java.lang.Integer.valueOf(i17));
    }

    public static void p(java.util.ArrayList arrayList) {
        j().f415232d = arrayList;
    }
}
