package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class w extends com.tencent.mm.plugin.lite.LiteAppCenter implements com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.List f144511n = java.util.Arrays.asList("wxalitecce81f5fba338df4dd5f74df8229c600", "wxalitea95723728764364c6f996b4bdab3af52");

    /* renamed from: o, reason: collision with root package name */
    public static final boolean[] f144512o = {false};

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Set f144513p = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f144514q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.ArrayList f144515r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f144516s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f144517t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f144518u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f144519v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f144520w = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public e60.z0 f144524d;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f144527g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f144521a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f144522b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f144523c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f144525e = 3;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144526f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144528h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f144529i = 0;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.HandOff f144530j = null;

    /* renamed from: k, reason: collision with root package name */
    public final e60.x0 f144531k = new e60.x0() { // from class: com.tencent.mm.plugin.lite.w$$j
        @Override // e60.x0
        public final boolean a(java.util.LinkedList linkedList, java.lang.Boolean bool) {
            com.tencent.mm.plugin.lite.w wVar = com.tencent.mm.plugin.lite.w.this;
            wVar.getClass();
            java.lang.Object obj = com.tencent.mm.plugin.lite.w.f144520w;
            synchronized (obj) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "albums result size:%d", java.lang.Integer.valueOf(linkedList.size()));
                wVar.f144527g = linkedList;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "after albums result size:%d", java.lang.Integer.valueOf(linkedList.size()));
                wVar.f144526f = true;
                obj.notifyAll();
            }
            return true;
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f144532l = new com.tencent.mm.plugin.lite.i0(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.network.b0 f144533m = new com.tencent.mm.plugin.lite.j0(this);

    public w() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.lite.h0 h0Var = new com.tencent.mm.plugin.lite.h0(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(h0Var, 30000L, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r3 = r5.getInteger("frame-rate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(java.lang.String r8) {
        /*
            java.lang.String r0 = "frame-rate"
            java.lang.String r1 = "MicroMsg.MMWxaLiteAppCenter"
            gp.c r2 = new gp.c
            r2.<init>()
            r3 = 0
            r2.k(r8)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            int r8 = r2.d()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r4 = r3
        L12:
            if (r4 >= r8) goto L3e
            android.media.MediaFormat r5 = r2.e(r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r6 = "mime"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r7 = "video/"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            if (r6 == 0) goto L31
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            if (r6 == 0) goto L31
            int r3 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            goto L3e
        L31:
            int r4 = r4 + 1
            goto L12
        L34:
            r8 = move-exception
            goto L53
        L36:
            r8 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r4)     // Catch: java.lang.Throwable -> L34
        L3e:
            r2.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "getVideoFrameRate fps: %d"
            com.tencent.mars.xlog.Log.i(r1, r0, r8)
            float r8 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r0
            return r8
        L53:
            r2.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.a(java.lang.String):float");
    }

    public static d85.f0 b(java.lang.String str) {
        int i17;
        java.lang.String str2 = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getConfigModel(str).systemPermission.businessScene;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "businessScene is null!");
            return null;
        }
        try {
            i17 = java.lang.Integer.parseInt(str2);
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWxaLiteAppCenter", e17, "parse businessScene error!", new java.lang.Object[0]);
            i17 = 0;
        }
        for (d85.f0 f0Var : d85.f0.values()) {
            int i18 = f0Var.f227177e;
            if (i18 == i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "business matched! %d %s", java.lang.Integer.valueOf(i18), f0Var.f227176d);
                return f0Var;
            }
        }
        return null;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getConfigModel(str).systemPermission.businessName;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "businessName: %s", str2);
        return str2;
    }

    public static android.content.Context d(long j17) {
        java.lang.Object uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(j17);
        if (uICallback != null) {
            if (uICallback instanceof android.app.Activity) {
                return (android.content.Context) uICallback;
            }
            if (uICallback instanceof androidx.fragment.app.Fragment) {
                return ((androidx.fragment.app.Fragment) uICallback).getActivity();
            }
            if (uICallback instanceof android.view.View) {
                return ((android.view.View) uICallback).getContext();
            }
            if (uICallback instanceof com.tencent.liteapp.WxaLiteAppWidgetAdapter) {
                return ((com.tencent.liteapp.WxaLiteAppWidgetAdapter) uICallback).f45975q;
            }
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a;
    }

    public static java.lang.String e(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, boolean z17) {
        java.lang.String concat;
        if (galleryItem$MediaItem == null) {
            return null;
        }
        java.lang.String o17 = galleryItem$MediaItem.o();
        if (o17 == null || galleryItem$MediaItem.getType() != 2) {
            return o17;
        }
        int lastIndexOf = o17.lastIndexOf(".");
        if (lastIndexOf != -1) {
            concat = o17.substring(0, lastIndexOf) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        } else {
            concat = o17.concat(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        }
        java.lang.String name = new java.io.File(concat).getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.plugin.lite.logic.y2.f("photoalbum", null, null) + "LiteAppPhotoAlbum";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        sb6.append(str);
        sb6.append("/");
        sb6.append(name);
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "realProcessThumbnail async");
            ku5.u0 u0Var = ku5.t0.f312615d;
            ((ku5.t0) u0Var).h(new com.tencent.mm.plugin.lite.w0(galleryItem$MediaItem, sb7), "liteappphotoalbum" + name);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "realProcessThumbnail sync");
            m(galleryItem$MediaItem, sb7);
        }
        return sb7;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[Catch: JSONException -> 0x003f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x003f, blocks: (B:18:0x002c, B:20:0x0034, B:10:0x0048, B:8:0x0041), top: B:17:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.tencent.liteapp.storage.LiteAppReferrerInfo r8) {
        /*
            com.tencent.mm.plugin.lite.logic.g1 r0 = com.tencent.mm.plugin.lite.logic.g1.s()
            r1 = 0
            com.tencent.liteapp.storage.WxaLiteAppInfo r0 = r0.y(r5, r1)
            java.lang.String r1 = "MicroMsg.MMWxaLiteAppCenter"
            if (r0 != 0) goto L13
            java.lang.String r5 = "getLiteAppInfo return null"
            com.tencent.mars.xlog.Log.e(r1, r5)
            return
        L13:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "appId"
            r0.put(r2, r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r3.put(r2, r5)
            java.lang.String r2 = "page"
            r3.put(r2, r6)
            if (r7 == 0) goto L41
            java.lang.String r6 = ""
            boolean r6 = r7.equals(r6)     // Catch: org.json.JSONException -> L3f
            if (r6 != 0) goto L41
            java.lang.String r6 = "query"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r2.<init>(r7)     // Catch: org.json.JSONException -> L3f
            r3.put(r6, r2)     // Catch: org.json.JSONException -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L73
        L41:
            java.lang.String r6 = "onOpenLiteAppEvent::query is null"
            com.tencent.mars.xlog.Log.w(r1, r6)     // Catch: org.json.JSONException -> L3f
        L46:
            if (r8 == 0) goto L80
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r6.<init>()     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "scene"
            com.tencent.liteapp.gen.LiteAppOpenScene r4 = r8.scene     // Catch: org.json.JSONException -> L3f
            int r4 = r4.getValue()     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "sceneId"
            java.lang.String r4 = r8.sceneId     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "scenePath"
            java.lang.String r4 = r8.scenePath     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "extraData"
            org.json.JSONObject r8 = r8.extraData     // Catch: org.json.JSONException -> L3f
            r6.put(r2, r8)     // Catch: org.json.JSONException -> L3f
            java.lang.String r8 = "referrerInfo"
            r3.put(r8, r6)     // Catch: org.json.JSONException -> L3f
            goto L80
        L73:
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "onOpenLiteAppEvent::parse query to json fail. %s, query: %s"
            com.tencent.mars.xlog.Log.e(r1, r7, r6)
        L80:
            java.lang.String r6 = "openLiteApp"
            o(r6, r5, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.h(java.lang.String, java.lang.String, java.lang.String, com.tencent.liteapp.storage.LiteAppReferrerInfo):void");
    }

    public static boolean initLib() {
        boolean[] zArr = f144512o;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        com.tencent.mm.plugin.lite.LiteAppCenter.initLib();
                        fp.d0.n("paymarshelper");
                        fp.d0.n(org.chromium.net.impl.CronetLibraryLoader.libraryName());
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true)) {
                            wp5.e.a(com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.plugin.lite.p0());
                        }
                        fp.d0.n("rosseta");
                        com.tencent.rosseta.ConstructProxy.proxyDefaultConstructor(com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.class, "LiteAppReporterDependency");
                        zArr[0] = true;
                    } catch (java.lang.UnsatisfiedLinkError e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "initLib fail. %s", e17.toString());
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static java.util.Map.Entry j(com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, pa3.s sVar) {
        pa3.p pVar;
        pa3.i iVar = null;
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            pa3.p pVar2 = wxaLiteAppLiteUI.O1;
            if (pVar2 != null) {
                pVar = pVar2;
            } else {
                pVar = new pa3.p(new pa3.r(wxaLiteAppLiteUI));
                wxaLiteAppLiteUI.O1 = pVar;
                pVar.e0(c(str));
                kotlin.jvm.internal.o.g(str, "<set-?>");
                pVar.f352995x = str;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                pVar.f352996y = str2;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                pVar.f352997z = str3;
                java.lang.String a17 = pa3.p.I.a(pVar.G, pVar.f352995x, pVar.f352996y, str3, sVar.f353006g);
                pVar.F = a17;
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = pVar.f300077a;
                if (multiTaskInfo != null) {
                    multiTaskInfo.field_id = a17;
                }
                pVar.B = j17;
                pVar.A = sVar.f353005f;
                java.lang.String str4 = sVar.f353001b;
                if (str4 == null) {
                    str4 = "";
                }
                pVar.C = str4;
                java.lang.String str5 = sVar.f353002c;
                if (str5 == null) {
                    str5 = "";
                }
                pVar.D = str5;
                java.lang.String str6 = sVar.f353003d;
                pVar.E = str6 != null ? str6 : "";
            }
        } else {
            pVar = null;
        }
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di()) {
            pa3.i iVar2 = wxaLiteAppLiteUI.P1;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                pa3.i iVar3 = new pa3.i(new pa3.e(wxaLiteAppLiteUI));
                wxaLiteAppLiteUI.P1 = iVar3;
                java.lang.String bizName = c(str);
                kotlin.jvm.internal.o.g(bizName, "bizName");
                iVar3.B = bizName;
                int i17 = kotlin.jvm.internal.o.b(bizName, "ask") ? 55 : 54;
                android.content.Intent intent = iVar3.f352983v.getIntent();
                android.os.Bundle bundleExtra = intent.getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                intent.putExtra("key_enter_from_float_ball", bundleExtra != null ? java.lang.Boolean.valueOf(bundleExtra.getBoolean("key_enter_from_float_ball")) : null);
                android.os.Bundle bundleExtra2 = intent.getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                intent.putExtra("key_enter_with_animation", bundleExtra2 != null ? java.lang.Boolean.valueOf(bundleExtra2.getBoolean("key_enter_with_animation")) : null);
                android.os.Bundle bundleExtra3 = intent.getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                intent.putExtra("key_enter_group_type", bundleExtra3 != null ? java.lang.Integer.valueOf(bundleExtra3.getInt("key_enter_group_type")) : null);
                iVar3.b(i17, null);
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = iVar3.f93132d;
                kotlin.jvm.internal.o.f(ballInfo, "ballInfo");
                ballInfo.f93048f = 1;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                iVar3.f352984w = str;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                iVar3.f352985x = str2;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                iVar3.f352986y = str3;
                iVar3.f93132d.f93049g = pa3.i.C.a(iVar3.B, iVar3.f352984w, iVar3.f352985x, str3, sVar.f353006g);
                iVar3.A = j17;
                iVar3.f352987z = sVar.f353005f;
                iVar3.t0();
                iVar = iVar3;
            }
        }
        f144519v.put(java.lang.Long.valueOf(j17), sVar);
        return new java.util.AbstractMap.SimpleEntry(pVar, iVar);
    }

    public static void k(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        if (!f144512o[0]) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "publishGlobalEventToAll %s without initlib", str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "publishGlobalEventToAll %s", str2);
            com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToAll(str, str2, jSONObject == null ? "{}" : jSONObject.toString());
        }
    }

    public static void l(java.lang.String str, org.json.JSONObject jSONObject) {
        k("", str, jSONObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:14|15|16|(3:18|(1:20)(1:42)|(2:22|(2:40|41)(7:26|27|28|29|30|31|33)))|43|44|45|46|(2:48|(1:52))(1:53)|(1:24)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0151, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r5 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "exception: %s", com.tencent.mm.sdk.platformtools.z3.c(r0));
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.m(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, java.lang.String):void");
    }

    public static void o(java.lang.String str, java.lang.String str2, java.util.Map map, java.util.Map map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str2, null);
        java.lang.String jSONObject = new org.json.JSONObject(map2).toString();
        if (y17 == null) {
            com.tencent.mm.plugin.lite.logic.g1.s().l(str2, true, 1, 0L, com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(str2), new com.tencent.mm.plugin.lite.o0(str2, hashMap, str, jSONObject, map));
        } else {
            hashMap.put("appId", y17.appId);
            hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, y17.path);
            hashMap.put("signatureKey", y17.signatureKey);
            com.tencent.mm.plugin.lite.LiteAppCenter.triggerLiteAppEvent(str, str2, jSONObject, map, hashMap);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void addTask(final java.lang.String str, final long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[addTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] context get null");
            return;
        }
        final com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) d17;
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f353000a)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI2 = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this;
                    pa3.p pVar = (pa3.p) ((java.util.AbstractMap.SimpleEntry) com.tencent.mm.plugin.lite.w.j(wxaLiteAppLiteUI2, str, j17, str2, str3, sVar)).getKey();
                    if (pVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] liteAppMultiTaskHelper is null");
                        return;
                    }
                    pVar.B(true);
                    wxaLiteAppLiteUI2.d7(180);
                    wxaLiteAppLiteUI2.f46104l1 = 1;
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$f
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI2 = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this;
                    pa3.i iVar = (pa3.i) ((java.util.AbstractMap.SimpleEntry) com.tencent.mm.plugin.lite.w.j(wxaLiteAppLiteUI2, str, j17, str2, str3, sVar)).getValue();
                    if (iVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[addTask] liteappFloatBallHelper is null");
                        return;
                    }
                    iVar.A(true, 2);
                    wxaLiteAppLiteUI2.d7(180);
                    wxaLiteAppLiteUI2.f46104l1 = 2;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (r12 == null) goto L23;
     */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String callNativeRecorder(long r29, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.callNativeRecorder(long, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void callNativeSpeechRecognition(long r15, java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, boolean r22, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.callNativeSpeechRecognition(long, java.lang.String, long, java.lang.String, java.lang.String, boolean, com.tencent.mm.plugin.lite.LiteAppCenter$NativeCallback):void");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String checkGlobalPkg(java.lang.String str, java.lang.String str2) {
        if (str.isEmpty()) {
            return "";
        }
        java.lang.String[] split = str.split(",");
        java.lang.String[] split2 = str2.split(",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (i18 < split.length) {
            java.lang.String str3 = split[i18];
            java.lang.String str4 = i18 < split2.length ? split2[i18] : "";
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str3, null);
            if (y17 == null || !(str4.isEmpty() || com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(y17.version, str4))) {
                arrayList.add(str3);
            } else {
                arrayList2.add(str3);
            }
            i18++;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.logic.g1.s().l((java.lang.String) it.next(), false, 2, 0L, null, null);
        }
        if (!arrayList.isEmpty()) {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.tencent.mm.plugin.lite.logic.g1.s().g(arrayList, new com.tencent.mm.plugin.lite.k0(this, countDownLatch));
            try {
                countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkGlobalPkg " + e17.toString());
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        while (i17 < split.length) {
            java.lang.String str5 = split[i17];
            java.lang.String str6 = i17 < split2.length ? split2[i17] : "0";
            com.tencent.liteapp.storage.WxaLiteAppInfo y18 = com.tencent.mm.plugin.lite.logic.g1.s().y(str5, null);
            if (y18 != null && !y18.path.isEmpty() && com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(y18.version, str6)) {
                try {
                    jSONObject.put(str5, y18.path);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkGlobalPkg " + e18.toString());
                }
            }
            i17++;
        }
        return jSONObject.toString();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String checkLiteAppAndGetPath(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(str);
        wxaLiteAppStartReport.I = liteAppReporter;
        f144517t.put(str, wxaLiteAppStartReport);
        if (y17 != null && !z18) {
            if (z17) {
                com.tencent.mm.plugin.lite.logic.g1.s().l(str, false, 1, 0L, liteAppReporter, null);
            }
            return y17.path;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.lang.String[] strArr = {""};
        com.tencent.mm.plugin.lite.logic.g1.s().l(str, z18, 1, 0L, liteAppReporter, new com.tencent.mm.plugin.lite.s0(this, strArr, countDownLatch));
        try {
            countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath " + e17.toString());
        }
        return strArr[0];
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void clearScheduleWakeUp(java.lang.String str) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.f0(this, str));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void dataReporting(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null) {
            return;
        }
        if (str.equals("LiteAppReporter")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", str2);
            return;
        }
        reportKv(23449, str + "," + str2.replaceAll(",", ";") + "," + str3);
    }

    public final void f(final java.lang.String str, final java.lang.String str2, boolean z17, final com.tencent.mm.plugin.lite.x0 x0Var) {
        if (!str.startsWith("http")) {
            x0Var.a(str);
        } else {
            if (!z17) {
                com.tencent.mm.plugin.lite.jsapi.comms.d.a(str2, str, new com.tencent.mm.plugin.lite.jsapi.comms.b() { // from class: com.tencent.mm.plugin.lite.w$$b
                    @Override // com.tencent.mm.plugin.lite.jsapi.comms.b
                    public final void a(java.lang.String str3, int i17, int i18) {
                        java.lang.String str4 = "";
                        if (str3 != null && str3.endsWith(".temp")) {
                            java.lang.String replace = str3.replace(".temp", "");
                            com.tencent.mm.vfs.w6.w(str3, replace);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "download videoPath:%s", replace);
                            str3 = replace;
                        }
                        if (i17 == 0) {
                            str4 = str3;
                        } else if (i17 == 2) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "video %s download fail", str);
                        }
                        x0Var.a(str4);
                    }
                });
                return;
            }
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str, new k70.u() { // from class: com.tencent.mm.plugin.lite.w$$a
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // k70.u
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(android.graphics.Bitmap r9, byte[] r10) {
                    /*
                        Method dump skipped, instructions count: 343
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w$$a.a(android.graphics.Bitmap, byte[]):void");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[Catch: JSONException -> 0x00ca, TRY_ENTER, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9 A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: JSONException -> 0x00ca, TryCatch #0 {JSONException -> 0x00ca, blocks: (B:3:0x0007, B:6:0x001c, B:9:0x0023, B:10:0x002b, B:13:0x0044, B:14:0x0096, B:16:0x00b9, B:17:0x00c4, B:21:0x004a, B:23:0x0052, B:24:0x0058, B:26:0x0060, B:27:0x0066, B:29:0x006e, B:30:0x0074, B:32:0x007c, B:33:0x0082, B:35:0x008a, B:36:0x0091, B:37:0x0027), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject g() {
        /*
            r6 = this;
            java.lang.Class<com.tencent.mars.cdn.CdnManager> r0 = com.tencent.mars.cdn.CdnManager.class
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "http.proxyHost"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r3 = "https.proxyHost"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)     // Catch: org.json.JSONException -> Lca
            r4 = 0
            java.lang.String r5 = "hasSystemProxy"
            if (r2 == 0) goto L27
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: org.json.JSONException -> Lca
            if (r2 != 0) goto L23
            goto L27
        L23:
            r1.put(r5, r4)     // Catch: org.json.JSONException -> Lca
            goto L2b
        L27:
            r2 = 1
            r1.put(r5, r2)     // Catch: org.json.JSONException -> Lca
        L2b:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.isWifi(r2)     // Catch: org.json.JSONException -> Lca
            long r2 = com.tencent.mars.comm.PlatformComm.C2Java.getSignal(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r5 = "signalStrength"
            r1.put(r5, r2)     // Catch: org.json.JSONException -> Lca
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.isConnected(r2)     // Catch: org.json.JSONException -> Lca
            java.lang.String r3 = "networkType"
            if (r2 != 0) goto L4a
            java.lang.String r2 = "none"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L4a:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.is2G(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L58
            java.lang.String r2 = "2g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L58:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.is3G(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L66
            java.lang.String r2 = "3g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L66:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.is4G(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L74
            java.lang.String r2 = "4g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L74:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.is5G(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L82
            java.lang.String r2 = "5g"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L82:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r2 = com.tencent.mars.comm.NetStatusUtil.isWifi(r2)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto L91
            java.lang.String r2 = "wifi"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
            goto L96
        L91:
            java.lang.String r2 = "unknown"
            r1.put(r3, r2)     // Catch: org.json.JSONException -> Lca
        L96:
            java.lang.String r2 = "isWeakNet"
            boolean r3 = r6.f144528h     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            java.lang.String r2 = "rtt"
            int r3 = r6.f144529i     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            java.lang.String r2 = "isConnected"
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: org.json.JSONException -> Lca
            boolean r3 = com.tencent.mars.comm.NetStatusUtil.isConnected(r3)     // Catch: org.json.JSONException -> Lca
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.app.Context r2 = com.tencent.mars.MarsContext.getContext()     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.app.BaseManager r2 = r2.getManager(r0)     // Catch: org.json.JSONException -> Lca
            if (r2 == 0) goto Lc4
            com.tencent.mars.app.BaseManager r0 = com.tencent.mars.MarsContext.getManager(r0)     // Catch: org.json.JSONException -> Lca
            com.tencent.mars.cdn.CdnManager r0 = (com.tencent.mars.cdn.CdnManager) r0     // Catch: org.json.JSONException -> Lca
            r2 = 2
            int r4 = r0.getRecentAverageSpeed(r2)     // Catch: org.json.JSONException -> Lca
        Lc4:
            java.lang.String r0 = "downlink"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> Lca
            goto Ld4
        Lca:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.MMWxaLiteAppCenter"
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r2, r0)
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.g():org.json.JSONObject");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String[] getAppInfo(java.lang.String str) {
        return new java.lang.String[]{checkLiteAppAndGetPath(str, false, false), ""};
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public long getAppMemory() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        activityManager.getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length != 0) {
            return processMemoryInfo[0].getTotalPss() * 1024;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "getProcessMemoryInfo return null or emtpy array");
        return 0L;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getBatteryInfo() {
        android.os.BatteryManager batteryManager = (android.os.BatteryManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
        if (batteryManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "no batteryManager");
            return "{}";
        }
        int intProperty = batteryManager.getIntProperty(4);
        boolean isCharging = batteryManager.isCharging();
        boolean c17 = wh.e1.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "BatteryInfo level = %d, isCharging = %b, isLowPowerModeEnabled = %b", java.lang.Integer.valueOf(intProperty), java.lang.Boolean.valueOf(isCharging), java.lang.Boolean.valueOf(c17));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.LEVEL, intProperty);
            jSONObject.put("isCharging", isCharging);
            jSONObject.put("isLowPowerModeEnabled", c17);
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWxaLiteAppCenter", e17, "getBatteryInfo fail.", new java.lang.Object[0]);
            return "{}";
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getClientVersion() {
        return com.tencent.mm.sdk.platformtools.a0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, o45.wf.f343029g);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public android.content.Context getContext(long j17) {
        return d(j17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public float getCpu() {
        wo.w wVar = new wo.w(android.os.Process.myPid());
        wVar.d();
        return wVar.f447836c != null ? r0.f447812a : 0;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getDynamicLibraryPath(java.lang.String str) {
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6d71aa8c", str);
        return Ui != null ? Ui.getPath() : "";
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getFilePathByLocalId(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.plugin.webview.model.o5.d(str), false);
        return i17 == null ? "" : i17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo getHostInfo() {
        com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo hostInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.HostInfo();
        hostInfo.system = "Android";
        hostInfo.systemVersion = "Android " + android.os.Build.VERSION.RELEASE;
        hostInfo.appVersion = com.tencent.mm.sdk.platformtools.z.f193111g;
        hostInfo.appRevision = com.tencent.mm.sdk.platformtools.z.f193109e;
        hostInfo.appBranch = com.tencent.mm.sdk.platformtools.z.f193105a;
        hostInfo.appBuildJob = com.tencent.mm.sdk.platformtools.z.f193106b;
        hostInfo.appBuildTime = com.tencent.mm.sdk.platformtools.z.f193107c;
        hostInfo.appFlavor = "release";
        return hostInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void getImageInfo(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        f(str, str2, true, new com.tencent.mm.plugin.lite.c0(this, str, nativeCallback));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public int getKeepAliveInfoCountLimit(int i17) {
        if (i17 == 1) {
            return com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getEngineConfigModel().starTask.aliveCount;
        }
        if (i17 == 2) {
            return com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getEngineConfigModel().minimizeTask.aliveCount;
        }
        return 1;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public int getKeepAliveTimeSecondsLimit(int i17, int i18) {
        return i18 == 1 ? com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getEngineConfigModel().starTask.aliveTime : i18 == 2 ? com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getEngineConfigModel().minimizeTask.aliveTime : i17;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo getLiteAppBaselibInfo(java.lang.String str) {
        initLib();
        return com.tencent.mm.plugin.lite.logic.g1.s().w(str);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getLiteAppEngineModelConfig() {
        java.lang.String str;
        com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppEngineConfigInfo = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getLiteAppEngineConfigInfo();
        if (liteAppEngineConfigInfo == null || (str = liteAppEngineConfigInfo.field_configJson) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppEngineModelConfig, Json:%s", str);
        return str;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.liteapp.storage.WxaLiteAppInfo getLiteAppInfo(java.lang.String str, java.lang.String str2) {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        if (y17 == null || !com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(str2, y17.version)) {
            return y17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "getLiteAppInfo fail, can't get minVersion%s for appId:%s", str2, str);
        return null;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getLiteAppModelConfig(java.lang.String str) {
        com.tencent.mm.plugin.lite.config.LiteAppConfigModel configModel = com.tencent.mm.plugin.lite.config.LiteAppConfigMgr.getInstance().getConfigModel(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppModelConfig:%s %s", str, configModel.toString());
        return configModel.toString();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getLiteAppRoot() {
        return com.tencent.mm.storage.v3.f196275c;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics getLiteAppViewportMetrics(android.content.Context context) {
        if (com.tencent.mm.app.w.k() != null && com.tencent.mm.app.w.k().get() != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "getLiteAppViewportMetrics getTopActivity");
            context = (android.content.Context) com.tencent.mm.app.w.k().get();
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics liteAppViewportMetrics = new com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppViewportMetrics();
        android.graphics.Point i17 = com.tencent.mm.ui.bk.i(context);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean isInMultiWindowMode = context instanceof android.app.Activity ? ((android.app.Activity) context).isInMultiWindowMode() : false;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        int c17 = com.tencent.mm.ui.bl.c(context);
        int p17 = com.tencent.mm.ui.bk.p(context);
        int a18 = com.tencent.mm.ui.bl.a(context);
        liteAppViewportMetrics.width = i17.x;
        liteAppViewportMetrics.height = i17.y;
        liteAppViewportMetrics.deviceWidth = h17.x;
        liteAppViewportMetrics.deviceHeight = h17.y;
        liteAppViewportMetrics.statusBarHeight = p17;
        liteAppViewportMetrics.actionBarHeight = a18;
        liteAppViewportMetrics.navigationBarHeight = c17;
        liteAppViewportMetrics.densityDpi = displayMetrics.densityDpi;
        liteAppViewportMetrics.density = displayMetrics.density;
        liteAppViewportMetrics.inMultiWindowMode = isInMultiWindowMode;
        liteAppViewportMetrics.multiWindowWidth = a17.f197135a;
        liteAppViewportMetrics.multiWindowHeight = a17.f197136b;
        return liteAppViewportMetrics;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.liteapp.report.WxaLiteAppStartReport getLiteAppWidgetStartReporter(java.lang.String str) {
        java.util.HashMap hashMap = f144517t;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = (com.tencent.liteapp.report.WxaLiteAppStartReport) hashMap.get(str);
        hashMap.remove(str);
        if (wxaLiteAppStartReport == null) {
            wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
            wxaLiteAppStartReport.I = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(str);
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        wxaLiteAppStartReport.I.setVersion(com.tencent.mm.plugin.lite.LiteAppCenter.getLiteAppVersion(y17.path, y17.appId, y17.signatureKey));
        wxaLiteAppStartReport.I.logStart(com.tencent.liteapp.gen.StartAction.START, new com.tencent.mm.plugin.lite.u0(this));
        return wxaLiteAppStartReport;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public boolean getMulitExpt(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getNetworkInfo() {
        return g().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:4:0x0014->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getOfflineResource(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.lite.logic.g1 r0 = com.tencent.mm.plugin.lite.logic.g1.s()
            java.util.HashMap r0 = r0.f143962p
            java.lang.Object r0 = r0.get(r10)
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld0
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            q80.t r2 = (q80.t) r2
            c64.a r2 = (c64.a) r2
            r2.getClass()
            java.lang.String r2 = "getOfflineResource, tag is "
            java.lang.String r3 = "getOfflineResource"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.liteapp.offline.AdLiteAppOfflineResTask"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            r6 = 0
            if (r10 == 0) goto L3b
            int r7 = r10.length()
            if (r7 != 0) goto L39
            goto L3b
        L39:
            r7 = r6
            goto L3c
        L3b:
            r7 = r5
        L3c:
            java.lang.String r8 = "SnsAd.LiteAppOffRes"
            if (r7 != 0) goto Lc0
            if (r12 == 0) goto L4a
            int r7 = r12.length()
            if (r7 != 0) goto L49
            goto L4a
        L49:
            r5 = r6
        L4a:
            if (r5 == 0) goto L4e
            goto Lc0
        L4e:
            java.lang.String r5 = "pag-view"
            boolean r5 = kotlin.jvm.internal.o.b(r5, r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r7 = "adId"
            if (r5 == 0) goto L5f
            java.lang.String r5 = za4.t0.m(r7, r12)     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L6e
            goto L6d
        L5f:
            java.lang.String r5 = "image"
            boolean r5 = kotlin.jvm.internal.o.b(r5, r11)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L6d
            java.lang.String r5 = za4.t0.l(r7, r12)     // Catch: java.lang.Throwable -> La6
            if (r5 != 0) goto L6e
        L6d:
            r5 = r1
        L6e:
            boolean r7 = com.tencent.mm.vfs.w6.j(r5)     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L7a
            java.lang.String r6 = com.tencent.mm.vfs.w6.i(r5, r6)     // Catch: java.lang.Throwable -> La6
            if (r6 != 0) goto L7b
        L7a:
            r6 = r1
        L7b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r7.<init>(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", url is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r12)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", r is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = ", result is "
            r7.append(r2)     // Catch: java.lang.Throwable -> La6
            r7.append(r6)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> La6
            com.tencent.mars.xlog.Log.i(r8, r2)     // Catch: java.lang.Throwable -> La6
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> La6
            goto Lc9
        La6:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "there is an exception "
            r5.<init>(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.mars.xlog.Log.e(r8, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto Lc8
        Lc0:
            java.lang.String r2 = "the app id or url is empty!!"
            com.tencent.mars.xlog.Log.e(r8, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        Lc8:
            r6 = r1
        Lc9:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r2 != 0) goto L14
            r1 = r6
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.getOfflineResource(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getOpenOption(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getOpenOption] appId: %s", str);
        com.tencent.liteapp.storage.WxaLiteAppInfo z17 = com.tencent.mm.plugin.lite.logic.g1.s().z(str);
        if (z17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "can't get liteapp iteminfo");
            return "{}";
        }
        org.json.JSONObject jSONObject = z17.openOption;
        return jSONObject != null ? jSONObject.toString() : "{}";
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.util.List getPermissionBlackList(java.lang.String str) {
        java.util.HashMap hashMap = this.f144521a;
        if (hashMap.containsKey(str)) {
            return (java.util.List) hashMap.get(str);
        }
        java.util.LinkedList wi6 = ((com.tencent.mm.plugin.magicbrush.k7) ((com.tencent.mm.plugin.magicbrush.r4) i95.n0.c(com.tencent.mm.plugin.magicbrush.r4.class))).wi(str, "liteapp");
        hashMap.put(str, wi6);
        return wi6;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getRecentForward(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.f(str, "bundle", null) + "headImage";
        java.lang.String str3 = str2 + "/defaultHeadForLiteApp.png";
        if (!com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2);
            if (!r6Var.m()) {
                r6Var.J();
            }
            if (r6Var.m()) {
                try {
                    android.graphics.Bitmap c17 = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
                    if (c17 != null) {
                        com.tencent.mm.sdk.platformtools.x.D0(c17, 100, android.graphics.Bitmap.CompressFormat.PNG, str3, true);
                    }
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "getRecentForward can't get defaultHeadImage", e17);
                }
            }
        }
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
        if (Ui.isEmpty()) {
            return "";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < Ui.size(); i17++) {
            try {
                o25.m2 m2Var = (o25.m2) Ui.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, m2Var.f342561b);
                jSONObject.put("content", com.tencent.mm.sdk.platformtools.w2.a(m2Var.f342560a));
                jSONObject.put("icon", m2Var.f342562c);
                jSONObject.put("defaultHeadIcon", str3);
                jSONObject.put("iconType", "img");
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWxaLiteAppCenter", e18, "getRecentForward fail.", new java.lang.Object[0]);
                return "";
            }
        }
        java.lang.String e19 = u46.k.e(jSONArray.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "result0 %s", e19);
        return e19;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getRecentForwardTitle(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.ifh);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getRegionInfo(java.lang.String str, java.lang.String str2) {
        sa3.e eVar = (sa3.e) ((q80.q) i95.n0.c(q80.q.class));
        eVar.getClass();
        cl0.e eVar2 = new cl0.e();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                eVar2 = new cl0.e(str2);
            }
            cl0.e eVar3 = new cl0.e();
            if (str.equals("province")) {
                java.util.Iterator it = ((java.util.ArrayList) eVar.f405308e).iterator();
                while (it.hasNext()) {
                    eVar3.q(((com.tencent.mm.plugin.address.model.RcptItem) it.next()).f74371d);
                }
            } else {
                boolean equals = str.equals("city");
                q71.f0 f0Var = eVar.f405307d;
                int i17 = 0;
                if (equals) {
                    java.util.Iterator it6 = ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) eVar.f405308e).get(eVar2.getInt(0))).f74372e)).iterator();
                    while (it6.hasNext()) {
                        eVar3.q(((com.tencent.mm.plugin.address.model.RcptItem) it6.next()).f74371d);
                    }
                } else if (str.equals("region")) {
                    java.util.Iterator it7 = ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) eVar.f405308e).get(eVar2.getInt(0))).f74372e)).get(eVar2.getInt(1))).f74372e)).iterator();
                    while (it7.hasNext()) {
                        eVar3.q(((com.tencent.mm.plugin.address.model.RcptItem) it7.next()).f74371d);
                    }
                } else if (str.equals("subDistrict")) {
                    java.util.Iterator it8 = ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) f0Var.e(((com.tencent.mm.plugin.address.model.RcptItem) ((java.util.ArrayList) eVar.f405308e).get(eVar2.getInt(0))).f74372e)).get(eVar2.getInt(1))).f74372e)).get(eVar2.getInt(2))).f74372e)).iterator();
                    while (it8.hasNext()) {
                        eVar3.q(((com.tencent.mm.plugin.address.model.RcptItem) it8.next()).f74371d);
                    }
                    if (eVar3.length() == 0) {
                        eVar3.q("");
                    }
                } else if (str.equals("internationalCountry")) {
                    com.tencent.mm.storage.RegionCodeDecoder$Region[] g17 = com.tencent.mm.storage.ha.k().g();
                    int length = g17.length;
                    while (i17 < length) {
                        eVar3.q(g17[i17].getName());
                        i17++;
                    }
                } else if (str.equals("internationalProvince")) {
                    com.tencent.mm.storage.RegionCodeDecoder$Region[] n17 = com.tencent.mm.storage.ha.k().n(com.tencent.mm.storage.ha.k().g()[eVar2.getInt(0)].getCode());
                    int length2 = n17.length;
                    while (i17 < length2) {
                        eVar3.q(n17[i17].getName());
                        i17++;
                    }
                    if (eVar3.length() == 0) {
                        eVar3.q("");
                    }
                } else if (str.equals("internationalCity")) {
                    com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region = com.tencent.mm.storage.ha.k().g()[eVar2.getInt(0)];
                    com.tencent.mm.storage.RegionCodeDecoder$Region[] n18 = com.tencent.mm.storage.ha.k().n(regionCodeDecoder$Region.getCode());
                    if (n18.length == 0) {
                        eVar3.q("");
                    } else {
                        com.tencent.mm.storage.RegionCodeDecoder$Region[] e17 = com.tencent.mm.storage.ha.k().e(regionCodeDecoder$Region.getCode(), n18[eVar2.getInt(1)].getCode());
                        int length3 = e17.length;
                        while (i17 < length3) {
                            eVar3.q(e17[i17].getName());
                            i17++;
                        }
                    }
                    if (eVar3.length() == 0) {
                        eVar3.q("");
                    }
                }
            }
            return eVar3.toString();
        } catch (cl0.f e18) {
            com.tencent.mars.xlog.Log.e("LiteAppAddressService", e18.toString());
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getScheduleWakeUpInfo(java.lang.String str) {
        java.lang.String[] strArr = new java.lang.String[1];
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.g0(this, strArr, str, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "error: " + e17.toString());
        }
        return strArr[0];
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo();
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.content.Context context = (k17 == null || k17.get() == null) ? com.tencent.mm.sdk.platformtools.x2.f193071a : (android.content.Context) k17.get();
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            systemInfo.networkType = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        } else if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            systemInfo.networkType = "2g";
        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            systemInfo.networkType = "3g";
        } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            systemInfo.networkType = "4g";
        } else if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            systemInfo.networkType = "5g";
        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            systemInfo.networkType = "wifi";
        } else {
            systemInfo.networkType = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        float f17 = context.getResources().getDisplayMetrics().density;
        systemInfo.brand = android.os.Build.MANUFACTURER;
        systemInfo.model = wo.w0.m();
        systemInfo.language = com.tencent.mm.sdk.platformtools.m2.f(context);
        systemInfo.platform = "Android";
        systemInfo.system = "Android" + android.os.Build.VERSION.RELEASE;
        systemInfo.fontScale = com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem ? context.getResources().getConfiguration().fontScale : com.tencent.mm.plugin.lite.LiteAppCenter.fontScale;
        systemInfo.version = "0x" + java.lang.Integer.toHexString(o45.wf.f343029g).toUpperCase();
        systemInfo.pixelRatio = f17;
        if (i17 > 0) {
            float f18 = i17 / f17;
            systemInfo.navigationBarHeight = f18;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "navigationBarHeight: %f", java.lang.Float.valueOf(f18));
        } else if (com.tencent.mm.plugin.lite.LiteAppCenter.cachedNavigationBarHeight > 0) {
            float f19 = com.tencent.mm.plugin.lite.LiteAppCenter.cachedNavigationBarHeight / f17;
            systemInfo.navigationBarHeight = f19;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "use cached NavigationBarHeight: %f", java.lang.Float.valueOf(f19));
        } else {
            try {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.r0(this, context, systemInfo, f17)).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", e17.toString());
                systemInfo.navigationBarHeight = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a) / f17;
            }
        }
        systemInfo.statusBarHeight = com.tencent.mm.ui.bl.j(context) / f17;
        systemInfo.titleBarHeight = com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a) / f17;
        systemInfo.darkMode = com.tencent.mm.ui.bk.C();
        return systemInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getTaskState(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] appId: %s | appUuid: %d | page: %s | key: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] context get null");
            return "{}";
        }
        java.lang.String bizName = c(str);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        pa3.l lVar = pa3.p.I;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        multiTaskInfo.field_type = kotlin.jvm.internal.o.b(bizName, "ask") ? 29 : 28;
        multiTaskInfo.field_id = lVar.a(bizName, str, str2, str3, str4);
        boolean Ri = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = new com.tencent.mm.plugin.ball.model.BallInfo(kotlin.jvm.internal.o.b(bizName, "ask") ? 55 : 54, pa3.i.C.a(bizName, str, str2, str3, str4), null);
        ballInfo.f93048f = 1;
        boolean z17 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().t0(ballInfo) != null;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("star", Ri);
            jSONObject.put("minimize", z17);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskState] exception: %s", e17.toString());
            return "{}";
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getTaskSwitch() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[getTaskSwitch] ");
        boolean Ai = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai();
        boolean Di = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("star", Ai);
            jSONObject.put("minimize", Di);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[getTaskSwitch] exception: %s", e17.toString());
            return "{}";
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getUin() {
        return kk.k.g(("" + gm0.l.d()).getBytes());
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getUserAgent() {
        java.lang.String str;
        java.lang.Object obj;
        android.net.NetworkInfo activeNetworkInfo;
        try {
            java.lang.String str2 = "NoNet";
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        str2 = "WIFI";
                    } else if (type != 2 && type != 3 && type != 4 && type != 5) {
                        str2 = "OtherNet";
                    }
                }
                str2 = "4G";
            }
            java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                str = "arm64";
                if (i17 >= length) {
                    obj = "arm32";
                    break;
                }
                if ("arm64-v8a".equals(strArr[i17])) {
                    obj = "arm64";
                    break;
                }
                i17++;
            }
            android.content.Context context = zc.c.f471339b;
            if (context == null) {
                kotlin.jvm.internal.o.o("appContext");
                throw null;
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String str3 = zc.c.f471340c;
            if (str3 == null) {
                kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
                throw null;
            }
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str3, 0);
            java.lang.String str4 = packageInfo.versionName;
            int i18 = packageInfo.versionCode;
            java.lang.Object[] objArr = new java.lang.Object[10];
            objArr[0] = android.os.Build.VERSION.RELEASE;
            objArr[1] = wo.w0.m();
            objArr[2] = android.os.Build.ID;
            objArr[3] = str4;
            objArr[4] = java.lang.Integer.valueOf(i18);
            objArr[5] = com.tencent.mm.sdk.platformtools.z.f193111g;
            objArr[6] = str2;
            objArr[7] = com.tencent.mm.sdk.platformtools.m2.d();
            objArr[8] = obj;
            if (!com.tencent.mm.sdk.platformtools.z.f193115k) {
                str = "arm32";
            }
            objArr[9] = str;
            java.lang.String format = java.lang.String.format("Mozilla/5.0 (Linux; Android %s; %s Build/%s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/66.0.3359.126 MQQBrowser/6.2 TBS/045140 Mobile Safari/537.36 MMWEBID/3371 MicroMessenger/%s.%d(%s) Process/lite NetType/%s Language/%s ABI/%s WeChat/%s", objArr);
            if (com.tencent.mm.ui.bk.A()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (format == null) {
                    format = "";
                }
                if (!format.contains("Android Tablet")) {
                    format = format.concat(" Android Tablet");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "get user agent:" + format);
            return format;
        } catch (java.lang.Exception unused) {
            return java.lang.System.getProperty("http.agent");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.STORAGE, r13) == false) goto L56;
     */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getUserAlbums(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.getUserAlbums(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void getVideoInfo(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        f(str, str2, false, new com.tencent.mm.plugin.lite.d0(this, str, nativeCallback));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getVolume() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f17 = streamVolume / streamMaxVolume;
        int ringerMode = audioManager.getRingerMode();
        java.lang.String str = "normal";
        java.lang.String str2 = ringerMode == 0 ? "silent" : ringerMode == 1 ? "vibrate" : "normal";
        int mode = audioManager.getMode();
        if (mode == 1) {
            str = "ringtone";
        } else if (mode == 2) {
            str = "call";
        } else if (mode == 3) {
            str = "communication";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "currentVolume = %d, maxVolume = %d, mode = %s, ringerMode = %s", java.lang.Integer.valueOf(streamVolume), java.lang.Integer.valueOf(streamMaxVolume), str, str2);
        return "{\"volume\": " + java.lang.String.format("%.4f", java.lang.Float.valueOf(f17)) + ", \"mode\": \"" + str + "\", \"ringerMode\": \"" + str2 + "\"}";
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getWebviewLocalIdByPath(java.lang.String str, java.lang.String str2) {
        return str2.isEmpty() ? "" : ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(str2).f182736e;
    }

    public final com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo i(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo liteAppHandOffInfo = new com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWxaLiteAppCenter", e17, "create paramsJson fail", new java.lang.Object[0]);
        }
        liteAppHandOffInfo.f143404id = jSONObject.optString(dm.i4.COL_ID);
        liteAppHandOffInfo.title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        liteAppHandOffInfo.icon = jSONObject.optString("icon");
        liteAppHandOffInfo.appId = jSONObject.optString("appId");
        liteAppHandOffInfo.page = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        liteAppHandOffInfo.query = jSONObject.optString("query");
        liteAppHandOffInfo.url = jSONObject.optString("url");
        liteAppHandOffInfo.type = jSONObject.optString("bizType");
        liteAppHandOffInfo.extraData = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        return liteAppHandOffInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public boolean isDarkMode() {
        return com.tencent.mm.ui.bk.C();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetCreateStore(java.lang.String str, int i17, boolean z17, int i18) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, i17, z17, i18, new com.tencent.mm.plugin.lite.v0(this, str));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetCreateStoreWithPkgPath(java.lang.String str, int i17, java.lang.String str2) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pj(str, i17, str2);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public int liteAppWidgetDispatchStore(java.lang.String str, java.lang.String str2, java.util.Map map) {
        return ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, str2, map);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetPublishEventToTopPage(int i17, int i18, java.lang.String str, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        long j17 = i17;
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        initLib();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishEventToTopPage(j17, i18, str, jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetPublishGlobalEvent(int i17, int i18, java.lang.String str, java.util.Map map) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(i17, i18, str, new org.json.JSONObject(map));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetPublishGlobalEventToAll(java.lang.String str, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        l(str, jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetPublishGlobalEventToAllByAppId(java.lang.String str, java.lang.String str2, java.util.Map map) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        k(str, str2, jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetPublishGlobalEventToTopPage(int i17, java.lang.String str, java.util.Map map) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(i17, str, new org.json.JSONObject(map));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetReleaseStore(java.lang.String str) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(str);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public boolean liteAppWidgetStoreIsAlive(java.lang.String str) {
        return ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(str);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetSubscribeStore(java.lang.String str, java.util.List list) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).uk(str, list);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void liteAppWidgetUnsubscribeStore(java.lang.String str, java.util.List list) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).vk(str, list);
    }

    public final java.lang.String n(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            jSONObject.put("error", str2);
            jSONObject.put("isNoisy", z17);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.logic.g1.s().B(null);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.lite.logic.g1.s().C(str, null);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onClearCurrentHandOff(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.lite.n0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onInitJsRuntime(java.lang.String str, long j17, long j18, long j19, long j27) {
        java.util.HashMap hashMap = this.f144522b;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        }
        hashMap.put(java.lang.Long.valueOf(j17), new da3.c(str, j17, j18, j19, j27));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onLiteAppWidgetPrepared() {
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        oVar.b(4, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        oVar.d();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onOpenCurrentPageOnPC(java.lang.String str) {
        com.tencent.mm.plugin.lite.LiteAppCenter.LiteAppHandOffInfo i17 = i(str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Bi(i17.type, i17.icon, i17.title, i17.appId, i17.page, i17.query, i17.url, i17.extraData, i17.f143404id));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onPreReleaseLiteApp(java.lang.String str, long j17, java.lang.String str2, boolean z17) {
        if (z17) {
            da3.c cVar = (da3.c) this.f144522b.remove(java.lang.Long.valueOf(j17));
            if (cVar == null || cVar.f227764a == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAudioBinding", "destroy wxAudio");
            cVar.f227764a.destroyWebAudioContext();
            cVar.f227764a = null;
            return;
        }
        ga3.f fVar = (ga3.f) this.f144523c.remove(java.lang.Long.valueOf(j17));
        if (fVar != null) {
            fVar.a();
        }
        ia3.e.c().e(j17, null);
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) iVar.f67174i;
        java.util.Set set = (java.util.Set) concurrentHashMap.get(str);
        if (set != null && set.remove(java.lang.Long.valueOf(j17)) && set.isEmpty()) {
            concurrentHashMap.remove(str);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) iVar.f67175m;
        java.util.Set set2 = (java.util.Set) concurrentHashMap2.get(str);
        if (set2 != null && set2.remove(str2) && set2.isEmpty()) {
            concurrentHashMap2.remove(str);
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ri(j17, 0L, "releaseLiteApp", null, null);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onPreloadLitePageViewFailed(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "onPreloadLitePageViewFailed appId: " + str + ", page: " + str2);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Yj(str, str2);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onPreloadLitePageViewFinish(long j17, java.lang.String str, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onPreloadLitePageViewFinish appId: " + str);
        com.tencent.mm.autogen.events.LiteAppOnPreloadViewFinishEvent liteAppOnPreloadViewFinishEvent = new com.tencent.mm.autogen.events.LiteAppOnPreloadViewFinishEvent();
        liteAppOnPreloadViewFinishEvent.f54469g.getClass();
        liteAppOnPreloadViewFinishEvent.e();
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onSetCurrentHandOff(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.lite.l0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onShowStatusChange(java.lang.String str, java.lang.String str2, long j17, long j18, boolean z17) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.z(this, str, str2, z17, j17, j18));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.x(this, str, i17, str2, obj));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onStoreSetData(java.lang.String str, java.util.Map map) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.y(this, str, map));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onUnsetUICallback(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback) {
        java.util.HashMap hashMap = f144516s;
        synchronized (hashMap) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void onUpdateCurrentHandOff(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.lite.m0(this, str), "MMWxaLiteAppCenter_Handoff");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openPage(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.MMWxaLiteAppCenter"
            java.lang.String r1 = "transparent"
            initLib()
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L18
            r3.<init>(r15)     // Catch: org.json.JSONException -> L18
            boolean r4 = r3.has(r1)     // Catch: org.json.JSONException -> L18
            if (r4 == 0) goto L26
            boolean r3 = r3.getBoolean(r1)     // Catch: org.json.JSONException -> L18
            goto L27
        L18:
            r3 = move-exception
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "openPage fail. %s"
            com.tencent.mars.xlog.Log.e(r0, r4, r3)
        L26:
            r3 = r2
        L27:
            com.tencent.mm.plugin.lite.logic.g1 r4 = com.tencent.mm.plugin.lite.logic.g1.s()
            r5 = 0
            com.tencent.liteapp.storage.WxaLiteAppInfo r4 = r4.y(r12, r5)
            if (r4 != 0) goto L3c
            java.lang.String r1 = "openPage fail. appId:%s, path:%s query:%s, config:%s"
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14, r15}
            com.tencent.mars.xlog.Log.e(r0, r1, r12)
            return
        L3c:
            com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo r12 = new com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo
            r12.<init>()
            java.lang.String r15 = r4.appId
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.g(r15, r0)
            r12.f143874d = r15
            java.lang.String r15 = r4.path
            r12.f143875e = r15
            java.lang.String r15 = r4.signatureKey
            r12.f143876f = r15
            long r4 = java.lang.System.currentTimeMillis()
            r12.f143880m = r4
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r0 = "path"
            r15.putString(r0, r13)
            java.lang.String r13 = "query"
            r15.putString(r13, r14)
            if (r3 == 0) goto L6d
            r14 = 1
            r15.putBoolean(r1, r14)
        L6d:
            java.lang.String r14 = r15.getString(r0)
            r12.f143877g = r14
            java.lang.String r13 = r15.getString(r13)
            r12.f143878h = r13
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            r14 = 268435456(0x10000000, float:2.524355E-29)
            r13.addFlags(r14)
            android.content.Context r14 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI> r0 = com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI.class
            r13.setClass(r14, r0)
            java.lang.String r14 = "WxaLiteAppLaunchInfo"
            r13.putExtra(r14, r12)
            java.lang.String r12 = "bundle"
            r13.putExtra(r12, r15)
            android.content.Context r12 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r13)
            java.util.Collections.reverse(r14)
            java.lang.Object[] r4 = r14.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r6 = "openPage"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r3 = r12
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r14.get(r2)
            android.content.Intent r13 = (android.content.Intent) r13
            r12.startActivity(r13)
            java.lang.String r4 = "com/tencent/mm/plugin/lite/MMWxaLiteAppCenter"
            java.lang.String r5 = "openPage"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r3 = r12
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.w.openPage(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void prepareTask(final java.lang.String str, final long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[prepareTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[prepareTask] context get null");
            return;
        }
        final com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) d17;
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        ((ku5.t0) ku5.t0.f312615d).C(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.lite.w$$i
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.tencent.mm.plugin.lite.w.j(com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this, str, j17, str2, str3, sVar);
            }
        });
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void reloadDebug(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.lite.debug.b.a(str, str2);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void removeForwardUser(java.lang.String str) {
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
        if (Ui.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < Ui.size(); i17++) {
            java.lang.String str2 = ((o25.m2) Ui.get(i17)).f342560a;
            if (str.equals(com.tencent.mm.sdk.platformtools.w2.a(str2))) {
                ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).fj(str2);
                return;
            }
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void removeTask(final java.lang.String str, long j17, final java.lang.String str2, final java.lang.String str3, java.lang.String str4) {
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] context get null");
            return;
        }
        final com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[removeTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f353000a)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI2 = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this;
                    pa3.p pVar = wxaLiteAppLiteUI2.O1;
                    if (pVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] liteAppMultiTaskHelper get null");
                        return;
                    }
                    java.lang.String str5 = str;
                    kotlin.jvm.internal.o.g(str5, "<set-?>");
                    pVar.f352995x = str5;
                    java.lang.String str6 = str2;
                    kotlin.jvm.internal.o.g(str6, "<set-?>");
                    pVar.f352996y = str6;
                    java.lang.String str7 = str3;
                    kotlin.jvm.internal.o.g(str7, "<set-?>");
                    pVar.f352997z = str7;
                    java.lang.String a17 = pa3.p.I.a(pVar.G, pVar.f352995x, pVar.f352996y, str7, sVar.f353006g);
                    pVar.F = a17;
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = pVar.f300077a;
                    if (multiTaskInfo != null) {
                        multiTaskInfo.field_id = a17;
                    }
                    pVar.B(false);
                    wxaLiteAppLiteUI2.d7(0);
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$h
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI2 = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this;
                    pa3.i iVar = wxaLiteAppLiteUI2.P1;
                    if (iVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[removeTask] liteAppFloatBallHelper get null");
                        return;
                    }
                    java.lang.String str5 = str;
                    kotlin.jvm.internal.o.g(str5, "<set-?>");
                    iVar.f352984w = str5;
                    java.lang.String str6 = str2;
                    kotlin.jvm.internal.o.g(str6, "<set-?>");
                    iVar.f352985x = str6;
                    java.lang.String str7 = str3;
                    kotlin.jvm.internal.o.g(str7, "<set-?>");
                    iVar.f352986y = str7;
                    iVar.f93132d.f93049g = pa3.i.C.a(iVar.B, iVar.f352984w, iVar.f352985x, str7, sVar.f353006g);
                    iVar.A(false, 2);
                    wxaLiteAppLiteUI2.d7(0);
                }
            });
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void reportIdKey(long j17, long j18, long j19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, j18, j19);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void reportKv(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void setOpenOption(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[setOpenOption] appId: %s | params: %s", str, str2);
        com.tencent.liteapp.storage.WxaLiteAppInfo z17 = com.tencent.mm.plugin.lite.logic.g1.s().z(str);
        if (z17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "can't get liteapp iteminfo");
            return;
        }
        org.json.JSONObject jSONObject = z17.openOption;
        if (jSONObject != null && str2.equals(jSONObject.toString())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "openOption is same");
            return;
        }
        try {
            z17.openOption = new org.json.JSONObject(str2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "json parse error: ", e17.toString());
        }
        com.tencent.mm.plugin.lite.logic.g1.s().V(z17);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void setScheduleWakeUp(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, boolean z17, int i19) {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.e0(this, str, i17, i18, str2, str3, z17, i19));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void updateTask(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[updateTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        android.content.Context d17 = d(j17);
        if (d17 == null || !(d17 instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] context get null");
            return;
        }
        final com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "[updateTask] appId: %s | appUuid: %d | page: %s | params: %s", str, java.lang.Long.valueOf(j17), str2, str4);
        final pa3.s sVar = new pa3.s();
        sVar.a(str4);
        if ("star".equals(sVar.f353000a)) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$c
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.p pVar = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this.O1;
                    if (pVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] liteAppMultiTaskHelper get null");
                        return;
                    }
                    pa3.s tasksParams = sVar;
                    kotlin.jvm.internal.o.g(tasksParams, "tasksParams");
                    java.lang.String str5 = tasksParams.f353001b;
                    if (str5 != null) {
                        if (str5.length() > 0) {
                            pVar.C = str5;
                        }
                    }
                    java.lang.String str6 = tasksParams.f353002c;
                    if (str6 != null) {
                        if (str6.length() > 0) {
                            pVar.D = str6;
                        }
                    }
                    java.lang.String str7 = tasksParams.f353003d;
                    if (str7 != null) {
                        if (str7.length() > 0) {
                            pVar.E = str7;
                        }
                    }
                    java.lang.String str8 = tasksParams.f353005f;
                    if (str8 != null) {
                        pVar.A = str8;
                    }
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = pVar.f300077a;
                    if (multiTaskInfo != null) {
                        pVar.j();
                        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                        java.lang.String str9 = pVar.F;
                        java.lang.String bizName = pVar.G;
                        kotlin.jvm.internal.o.g(bizName, "bizName");
                        int i17 = kotlin.jvm.internal.o.b(bizName, "ask") ? 29 : 28;
                        r45.lr4 v07 = multiTaskInfo.v0();
                        kotlin.jvm.internal.o.f(v07, "getShowData(...)");
                        ((com.tencent.mm.plugin.multitask.p1) l0Var).aj(str9, i17, v07, multiTaskInfo.field_data);
                    }
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.w$$d
                @Override // java.lang.Runnable
                public final void run() {
                    pa3.i iVar = com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.this.P1;
                    if (iVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "[updateTask] liteAppFloatBallHelper get null");
                        return;
                    }
                    java.lang.String str5 = sVar.f353005f;
                    if (str5 != null) {
                        iVar.f352987z = str5;
                    }
                    iVar.t0();
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().V(iVar.f93132d);
                }
            });
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public java.lang.String getMulitExpt(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback
    public void checkLiteAppAndGetPath(java.lang.String str, boolean z17, boolean z18, yz5.l lVar) {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(str, null);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = new com.tencent.liteapp.report.WxaLiteAppStartReport();
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(str);
        wxaLiteAppStartReport.I = liteAppReporter;
        f144517t.put(str, wxaLiteAppStartReport);
        if (y17 != null && !z18) {
            if (z17) {
                com.tencent.mm.plugin.lite.logic.g1.s().l(str, false, 1, 0L, liteAppReporter, null);
            }
            lVar.invoke(y17.path);
            return;
        }
        com.tencent.mm.plugin.lite.logic.g1.s().l(str, z18, 1, 0L, liteAppReporter, new com.tencent.mm.plugin.lite.t0(this, lVar));
    }
}
