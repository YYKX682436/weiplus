package so4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static so4.a f410780e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.xeffect.effect.EffectManager f410781f;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f410784i;

    /* renamed from: a, reason: collision with root package name */
    public static final so4.g f410776a = new so4.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f410777b = lp0.b.e() + "image_enhancement_result";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f410778c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f410779d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f410782g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f410783h = new java.util.HashMap();

    static {
        uq5.o[] values = uq5.o.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (uq5.o oVar : values) {
            arrayList.add(java.lang.Integer.valueOf(oVar.ordinal()));
        }
        f410784i = arrayList;
    }

    public final int a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        android.util.Pair pair = (android.util.Pair) f410783h.get(str);
        java.lang.Integer num = pair != null ? (java.lang.Integer) pair.first : null;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final synchronized void b(com.tencent.mm.xeffect.effect.EffectManager effectManager) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        if (f410781f == null && fp.q.b("xlab")) {
            if (effectManager == null) {
                effectManager = new com.tencent.mm.xeffect.effect.EffectManager();
            }
            f410781f = effectManager;
        }
        f410780e = new so4.a(null, 0, 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initVideoEnhancementEffect effectId:");
        so4.a aVar = f410780e;
        sb6.append(aVar != null ? java.lang.Long.valueOf(aVar.a()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
    }

    public final synchronized void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "reset");
        com.tencent.mm.xeffect.effect.EffectManager effectManager = f410781f;
        if (effectManager != null) {
            effectManager.f();
        }
        f410782g.clear();
    }

    public final void d(java.util.List pathList) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(pathList, "pathList");
        f410782g.clear();
        rm5.l lVar = rm5.l.f397520a;
        int i17 = rm5.l.f397521b;
        rm5.l.f397521b = 2000;
        lVar.a();
        java.util.Iterator it = pathList.iterator();
        while (it.hasNext()) {
            java.lang.String path = (java.lang.String) it.next();
            so4.g gVar = f410776a;
            kotlin.jvm.internal.o.g(path, "path");
            java.lang.Object obj = new java.lang.Object();
            com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap path:".concat(path));
            try {
                com.tencent.mm.plugin.vlog.model.i1 i1Var = new com.tencent.mm.plugin.vlog.model.i1(path, 1, 0);
                com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(kz5.b0.c(i1Var));
                gVar.f(h1Var, true);
                int a17 = gVar.a(path);
                if (((java.util.ArrayList) f410784i).contains(java.lang.Integer.valueOf(a17))) {
                    gVar.g(a17);
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h1Var.q(f410781f);
                rm5.h b17 = rm5.h.f397489h.b(h1Var.e());
                rm5.j jVar = i1Var.f175627l;
                b17.setSize(jVar.f397509k, jVar.f397510l);
                b17.a(kz5.b0.c(100L), new so4.c(i1Var, h0Var, obj));
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LocalEffectManager", e17, "", new java.lang.Object[0]);
                    }
                }
                gVar.f(h1Var, false);
                bitmap = (android.graphics.Bitmap) h0Var.f310123d;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LocalEffectManager", "getImageEnhancementBitmap parse track fail path:" + path + ", error:" + e18.getLocalizedMessage());
                bitmap = null;
            }
            if (bitmap != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f410777b);
                sb6.append('/');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(android.os.SystemClock.elapsedRealtime());
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, sb7, false);
                java.util.HashMap hashMap = f410782g;
                hashMap.put(path, sb7);
                com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result in " + sb7 + ", origin:" + path);
                if (hashMap.size() == pathList.size()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result finish");
                }
            }
        }
        rm5.l lVar2 = rm5.l.f397520a;
        rm5.l.f397521b = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "save enhancement image result finish return");
    }

    public final void e(com.tencent.mm.plugin.vlog.model.i1 track, int i17) {
        kotlin.jvm.internal.o.g(track, "track");
        java.util.Iterator it = f410778c.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        android.support.v4.media.f.a(null);
        com.tencent.mm.xeffect.effect.EffectManager effectManager = f410781f;
        rm5.j jVar = track.f175627l;
        if (effectManager != null) {
            uq5.y yVar = jVar.f397515q.f397530b;
            effectManager.n(yVar != null ? yVar.f430267a : 0L);
        }
        rm5.n nVar = jVar.f397515q;
        nVar.f397530b = null;
        track.f175625j = -1;
        nVar.f397529a = "";
        nVar.f397531c = 0L;
    }

    public final void f(com.tencent.mm.plugin.vlog.model.h1 h1Var, boolean z17) {
        uq5.p pVar;
        so4.a aVar = f410780e;
        if (aVar != null) {
            if (z17 && aVar.f410766a == null) {
                com.tencent.mm.xeffect.effect.EffectManager effectManager = f410781f;
                uq5.y g17 = effectManager != null ? effectManager.g(uq5.k.ImageEnhanceEffect) : null;
                com.tencent.mm.xeffect.effect.EffectManager effectManager2 = f410781f;
                if (effectManager2 != null) {
                    effectManager2.c(g17);
                }
                aVar.f410766a = g17 instanceof uq5.p ? (uq5.p) g17 : null;
            } else if (!z17 && (pVar = aVar.f410766a) != null) {
                com.tencent.mm.xeffect.effect.EffectManager effectManager3 = f410781f;
                if (effectManager3 != null) {
                    effectManager3.n(pVar.f430267a);
                }
                aVar.f410766a = null;
            }
            if (h1Var != null) {
                h1Var.f175603i = z17;
            }
            if (z17) {
                dp4.b.f242262a.a();
                if (h1Var != null) {
                    h1Var.f175595a.a(new so4.e(h1Var));
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoEnhancement enable:");
        sb6.append(z17);
        sb6.append(", effectId:");
        so4.a aVar2 = f410780e;
        sb6.append(aVar2 != null ? java.lang.Long.valueOf(aVar2.a()) : null);
        sb6.append(", rangeId:");
        so4.a aVar3 = f410780e;
        sb6.append(aVar3 != null ? aVar3.f410766a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", sb6.toString());
    }

    public final void g(int i17) {
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocalEffectManager", "setVideoEnhancementScene error:" + i17);
            return;
        }
        so4.a aVar = f410780e;
        if (aVar != null) {
            if (aVar.a() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "setVideoEnhancementScene, effectId:" + aVar.a() + ", scene:" + i17);
                uq5.p pVar = aVar.f410766a;
                if (pVar != null) {
                    com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setScene$renderlib_release(pVar.f430269c, i17);
                }
                aVar.f410767b = i17;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", 0) == 1;
            so4.a aVar2 = f410780e;
            if (aVar2 == null || aVar2.a() <= 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "setVideoEnhancementShowFaceLandmarks, show:" + z17);
            uq5.p pVar2 = aVar2.f410766a;
            if (pVar2 != null) {
                com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setShowLandmarks$renderlib_release(pVar2.f430269c, z17);
            }
        }
    }

    public final void h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f350439a;
        sb6.append(p05.a3.f350443e);
        sb6.append('/');
        sb6.append(p05.a3.f350449k);
        if (!com.tencent.mm.vfs.w6.j(sb6.toString())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext model not exist!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "start tryCreateX3DGlobalContext");
            com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext finish");
        }
    }

    public final synchronized void i() {
        f410778c.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "clear");
        f410783h.clear();
        com.tencent.mm.xeffect.effect.EffectManager effectManager = f410781f;
        if (effectManager != null) {
            effectManager.k();
        }
        f410781f = null;
        f410780e = null;
        com.tencent.mm.vfs.w6.f(f410777b);
        f410782g.clear();
    }
}
