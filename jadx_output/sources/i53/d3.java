package i53;

/* loaded from: classes8.dex */
public class d3 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f288545o = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH) + "haowan/";

    /* renamed from: p, reason: collision with root package name */
    public static int f288546p = 5;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f288547a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f288548b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f288549c;

    /* renamed from: d, reason: collision with root package name */
    public i53.c3 f288550d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f288551e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f288552f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f288553g;

    /* renamed from: h, reason: collision with root package name */
    public int f288554h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f288555i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f288556j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f288557k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f288558l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.n0 f288559m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.m0 f288560n;

    public d3(java.lang.String str, int i17, java.util.LinkedList linkedList, boolean z17) {
        boolean z18;
        android.database.Cursor rawQuery;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f288548b = linkedList2;
        this.f288551e = new java.util.HashSet();
        this.f288552f = new java.util.HashSet();
        this.f288553g = new java.util.HashSet();
        new java.util.HashMap();
        this.f288555i = false;
        this.f288556j = false;
        this.f288557k = new java.util.HashMap();
        this.f288558l = new i53.x2(this);
        this.f288559m = new i53.z2(this);
        this.f288560n = new i53.a3(this);
        this.f288547a = str;
        this.f288549c = z17;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        if (i17 == 2) {
            linkedList2.add((java.lang.String) linkedList.get(0));
        } else {
            linkedList2.addAll(linkedList);
        }
        i53.w wi6 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
        wi6.getClass();
        if (str == null || (rawQuery = wi6.rawQuery(java.lang.String.format("select * from %s where %s=\"%s\"", "GameHaowanMedia", "hostTaskId", str), new java.lang.String[0])) == null) {
            z18 = false;
        } else {
            z18 = rawQuery.getCount() != 0;
            rawQuery.close();
        }
        if (!z18) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str2);
                if (b17 != null) {
                    i53.u uVar = new i53.u();
                    uVar.field_localId = b17.f182736e;
                    uVar.field_mediaId = b17.f182740i;
                    uVar.field_filePath = b17.f182738g;
                    uVar.field_thumbPath = b17.f182737f;
                    uVar.field_mediaType = b17.f182742n;
                    uVar.field_size = b17.f182743o;
                    uVar.field_width = b17.f182744p;
                    uVar.field_height = b17.f182745q;
                    uVar.field_editFlag = b17.f182750v.getInt("mark_edit_flag", 0);
                    if (b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) {
                        uVar.field_duration = ((com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem) b17).f182754w;
                    }
                    if (b17 instanceof com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) {
                        uVar.field_isGif = ((com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem) b17).f182751w;
                    }
                    uVar.field_hostTaskId = this.f288547a;
                    if (b17.f182742n == 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(f288545o);
                        sb6.append("microMsg.compress.");
                        sb6.append(java.lang.System.currentTimeMillis());
                        sb6.append((str2 == null ? "" : str2).hashCode() & 65535);
                        java.lang.String sb7 = sb6.toString();
                        if (this.f288549c && c(sb7, b17.f182738g)) {
                            uVar.field_compressPath = sb7;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "compress, originSize: %d, dstSize: %d", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(b17.f182738g)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(uVar.field_compressPath)));
                            b17.f182738g = sb7;
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                        } else {
                            uVar.field_compressPath = b17.f182738g;
                        }
                    }
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().insert(uVar);
                }
            }
        }
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.n0 n0Var = this.f288559m;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182937d;
        if (copyOnWriteArraySet != null && n0Var != null && !copyOnWriteArraySet.contains(n0Var)) {
            copyOnWriteArraySet.add(n0Var);
        }
        com.tencent.mm.plugin.webview.modeltools.z.bj().b(this.f288560n);
    }

    public static int a(i53.d3 d3Var, int i17) {
        d3Var.getClass();
        if (i17 == 4) {
            return 2;
        }
        return i17 == 1 ? 1 : 0;
    }

    public void b() {
        this.f288556j = true;
        java.util.LinkedList linkedList = this.f288548b;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.modeltools.z.bj().f((java.lang.String) it.next());
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().y0(linkedList);
        d();
    }

    public final boolean c(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.y1.c(str2)) {
            return false;
        }
        try {
            ((et.k) ((ft.z3) i95.n0.c(ft.z3.class))).getClass();
            boolean a17 = com.tencent.mm.plugin.appbrand.utils.e0.a(str, str2, 1440, 1080, 70);
            if (a17) {
                com.tencent.mm.vfs.w6.h(str2);
            }
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Haowan.GameUploadMediaEngine", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void d() {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f288559m);
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.m0 m0Var = this.f288560n;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182938e;
        if (copyOnWriteArraySet != null && m0Var != null) {
            copyOnWriteArraySet.remove(m0Var);
        }
        ((java.util.HashSet) this.f288551e).clear();
        ((java.util.HashSet) this.f288553g).clear();
        ((java.util.HashSet) this.f288552f).clear();
        this.f288548b.clear();
        this.f288550d = null;
    }

    public final synchronized void e() {
        i53.c3 c3Var;
        if (this.f288556j) {
            return;
        }
        this.f288552f.addAll(this.f288551e);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, list : %s", this.f288552f.toString());
        this.f288555i = false;
        synchronized (this.f288551e) {
            java.util.Iterator it = ((java.util.HashSet) this.f288551e).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (this.f288556j) {
                    return;
                }
                i53.u z07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(str);
                if (z07 != null && z07.field_localId != null && com.tencent.mm.sdk.platformtools.t8.K0(z07.field_mediaUrl)) {
                    if (com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str) == null) {
                        int i17 = z07.field_mediaType;
                        if (i17 == 1) {
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem webViewJSSDKImageItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem();
                            webViewJSSDKImageItem.f182736e = z07.field_localId;
                            webViewJSSDKImageItem.f182740i = z07.field_mediaId;
                            if (!this.f288549c || com.tencent.mm.vfs.w6.j(z07.field_compressPath)) {
                                webViewJSSDKImageItem.f182738g = z07.field_filePath;
                            } else {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(f288545o);
                                sb6.append("microMsg.compress.");
                                sb6.append(java.lang.System.currentTimeMillis());
                                sb6.append((str == null ? "" : str).hashCode() & 65535);
                                java.lang.String sb7 = sb6.toString();
                                if (c(sb7, z07.field_filePath)) {
                                    z07.field_compressPath = sb7;
                                } else {
                                    z07.field_compressPath = z07.field_filePath;
                                }
                                webViewJSSDKImageItem.f182738g = z07.field_compressPath;
                            }
                            webViewJSSDKImageItem.f182737f = z07.field_thumbPath;
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(webViewJSSDKImageItem);
                        } else if (i17 == 4) {
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem();
                            webViewJSSDKVideoItem.f182736e = z07.field_localId;
                            webViewJSSDKVideoItem.f182740i = z07.field_mediaId;
                            webViewJSSDKVideoItem.f182738g = z07.field_filePath;
                            webViewJSSDKVideoItem.f182737f = z07.field_thumbPath;
                            webViewJSSDKVideoItem.f182754w = z07.field_duration;
                            webViewJSSDKVideoItem.f182744p = z07.field_width;
                            webViewJSSDKVideoItem.f182745q = z07.field_height;
                            webViewJSSDKVideoItem.f182743o = (int) z07.field_size;
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(webViewJSSDKVideoItem);
                        }
                    }
                    int i18 = z07.field_mediaType;
                    if (i18 != 1) {
                        if (i18 == 4 && !f(str, 20302, 214, 2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, ret is false, remvoe: %s", str);
                            ((java.util.HashSet) this.f288552f).remove(str);
                        }
                    } else if (!f(str, 20301, 215, 2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, ret is false, remvoe: %s", str);
                        ((java.util.HashSet) this.f288552f).remove(str);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload, remvoe: %s", str);
                ((java.util.HashSet) this.f288552f).remove(str);
            }
            this.f288555i = true;
            if (((java.util.HashSet) this.f288552f).isEmpty() && (c3Var = this.f288550d) != null) {
                ((i53.y) c3Var).a(true);
            }
        }
    }

    public final boolean f(java.lang.String str, int i17, int i18, int i19) {
        this.f288557k.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "uploadMediaFile, localId : %s", str);
        p95.a.a(new i53.b3(this, str));
        return com.tencent.mm.plugin.webview.modeltools.z.bj().c("", str, i17, i18, i19, null);
    }
}
