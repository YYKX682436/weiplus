package dq0;

/* loaded from: classes7.dex */
public abstract class a0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, dq0.j, hq0.f, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final dq0.q f242288d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f242289e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.flutter_magic_brush.MagicSclBizFlutterApi f242290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f242291g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242292h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f242293i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f242294m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f242295n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f242296o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f242297p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f242298q;

    public a0(dq0.q mbPlugin) {
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
        this.f242288d = mbPlugin;
        this.f242289e = new java.util.HashMap();
        this.f242291g = new java.lang.ref.WeakReference(null);
        this.f242293i = new java.util.LinkedList();
        this.f242294m = new java.util.HashMap();
        this.f242295n = new java.util.HashSet();
        this.f242296o = new java.util.HashSet();
        this.f242298q = kz5.q0.f314001d;
    }

    public void a(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
    }

    public void attachFrameSet(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(extra, "extra");
        hq0.i0 t17 = t();
        if (t17 == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:39|(5:41|(5:105|106|(1:118)(1:110)|(1:112)(1:117)|(1:114)(2:(1:116)|104))(2:43|(1:45)(2:103|104))|(10:47|48|(1:50)(1:98)|51|52|53|(3:61|(1:63)(1:95)|(8:65|66|67|68|(1:70)(1:91)|(2:72|(2:75|(8:77|78|79|80|81|82|83|57)))|56|57))|55|56|57)|99|100)(5:121|(1:143)(1:129)|(12:131|(1:(2:134|(3:136|(1:138)|100)(11:139|102|48|(0)(0)|51|52|53|(4:58|61|(0)(0)|(0))|55|56|57))(1:140))(1:142)|141|48|(0)(0)|51|52|53|(0)|55|56|57)|99|100)|101|102|48|(0)(0)|51|52|53|(0)|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03c3, code lost:
    
        r21 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c8 A[Catch: Exception -> 0x03c2, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ed A[Catch: Exception -> 0x03c2, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f3 A[Catch: Exception -> 0x03c2, TRY_LEAVE, TryCatch #5 {Exception -> 0x03c2, blocks: (B:53:0x02b1, B:58:0x02c8, B:61:0x02cf, B:63:0x02ed, B:65:0x02f3), top: B:52:0x02b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.a0.b():int");
    }

    @Override // jc3.r
    public void c(int i17, boolean z17) {
        hq0.k0 k0Var;
        hq0.j0 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewFirstFrameRendered id[" + i17 + "] " + z17);
        hq0.i0 t17 = t();
        jz5.f0 f0Var = null;
        fq0.x S0 = t17 != null ? t17.S0(i17) : null;
        hq0.i0 t18 = t();
        if (t18 == null || (k0Var = t18.f282998m) == null || (a17 = k0Var.a(i17)) == null) {
            return;
        }
        a17.f283023l = true;
        if (!z17 && a17.f283024m) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "draw on off screen and surfaceAvailable! redraw now " + i17 + ' ' + S0);
            if (S0 != null) {
                S0.f();
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                a17.f283021j = true;
            }
        }
        if (!(a17.f283013b.length() > 0)) {
            a17.f283020i = true;
            return;
        }
        this.f242288d.a(a17.b());
        if (S0 != null) {
            boolean z18 = a17.f283026o;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("preCreateCanvas", z18);
            w(S0, jSONObject);
        }
    }

    @Override // jc3.r
    public boolean d(int i17, cf3.d view) {
        hq0.k0 k0Var;
        hq0.k0 k0Var2;
        hq0.j0 a17;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewDestroy id[" + i17 + ']');
        hq0.i0 t17 = t();
        if (t17 != null && (k0Var2 = t17.f282998m) != null && (a17 = k0Var2.a(i17)) != null) {
            q(a17);
        }
        hq0.i0 t18 = t();
        if (t18 == null || (k0Var = t18.f282998m) == null) {
            return false;
        }
        return false;
    }

    @Override // jc3.r
    public void e(int i17, cf3.d view) {
        hq0.k0 k0Var;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewCreated id[" + i17 + ']');
        hq0.i0 t17 = t();
        if (t17 == null || (k0Var = t17.f282998m) == null) {
            return;
        }
        hq0.j0 b17 = k0Var.b(i17, null, null, view);
        if (b17.f283013b.length() > 0) {
            r(b17);
        }
    }

    @Override // jc3.r
    public void f(int i17, cf3.d view, int i18, int i19, int i27, int i28) {
        jz5.f0 f0Var;
        hq0.k0 k0Var;
        hq0.j0 a17;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onCanvasViewLayout id[" + i17 + "] " + i18 + ' ' + i19 + ' ' + i27 + ' ' + i28, new java.lang.Object[0]);
        hq0.i0 t17 = t();
        if (t17 == null || (k0Var = t17.f282998m) == null || (a17 = k0Var.a(i17)) == null) {
            f0Var = null;
        } else {
            a17.f283019h = view;
            a17.f283014c = i18;
            a17.f283015d = i19;
            a17.f283016e = i27;
            a17.f283017f = i28;
            a17.a();
            if (a17.f283013b.length() > 0) {
                synchronized (this.f242295n) {
                    if (o(a17)) {
                        this.f242288d.d(a17.b(), i18, i19, g(i27, a17.f283013b), i28);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frame set not created. pending layout " + a17);
                        this.f242296o.add(a17.f283013b);
                    }
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "try layout no " + i17 + " found");
        }
    }

    public final int g(int i17, java.lang.String str) {
        java.lang.String str2;
        hq0.i0 t17 = t();
        fq0.x V0 = t17 != null ? t17.V0(str) : null;
        if (V0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: frameSet not found for id=" + str + ", skip clamp, width=" + i17);
            return i17;
        }
        int b17 = vp0.b.b(java.lang.Integer.valueOf(V0.f265482f));
        int i18 = i17 > b17 ? b17 : i17;
        if (i18 != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: canvas=" + i17 + " frameSet=" + V0.f265482f + " maxPx=" + b17 + " clamped=" + i18 + " frameSetId=" + str);
            try {
                je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
                if (iVar != null) {
                    hq0.i0 t18 = t();
                    if (t18 == null || (str2 = t18.O0()) == null) {
                        str2 = com.eclipsesource.mmv8.Platform.UNKNOWN;
                    }
                    je3.i.t8(iVar, str2, "canvas-width-overflow-frameset", "canvasWidth=" + i17 + " frameSetMaxPx=" + b17 + " clampedWidth=" + i18 + " frameSetId=" + str + " frameSetDp=" + V0.f265482f, null, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneTenth.getValue(), 8, null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "clampCanvasWidth: report error", e17);
            }
        }
        return i18;
    }

    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        hq0.i0 t17 = t();
        if (t17 != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return t17.H0(this, context, t17.O0(), path, query, true);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "request frameSetRoot but biz not start yet");
        return null;
    }

    public void i(java.lang.String rootId) {
        kotlin.jvm.internal.o.g(rootId, "rootId");
        this.f242289e.remove(rootId);
        hq0.i0 t17 = t();
        if (t17 != null) {
            t17.F1(rootId);
        }
    }

    public abstract java.util.Map j();

    public final fq0.x k(java.lang.String str, java.lang.String str2, int i17) {
        hq0.e0 e0Var = (hq0.e0) this.f242289e.get(str);
        if (e0Var == null) {
            return null;
        }
        jz5.l e17 = e0Var.e(str2);
        fq0.x xVar = (fq0.x) e17.f302833d;
        java.lang.Boolean bool = (java.lang.Boolean) e17.f302834e;
        if (bool.booleanValue() && i17 != 0) {
            xVar.f265492p = i17;
        }
        if (xVar.f265492p == 0) {
            com.tencent.mm.flutter.plugin.proto.l builder = com.tencent.mm.flutter.plugin.proto.m.f68004o.toBuilder();
            hq0.i0 t17 = t();
            java.lang.Integer valueOf = t17 != null ? java.lang.Integer.valueOf(t17.C0(new sp0.d(builder, new java.lang.ref.WeakReference(this)))) : null;
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            builder.f67996d |= 1;
            builder.f67997e = intValue;
            builder.onChanged();
            xVar.f265492p = valueOf != null ? valueOf.intValue() : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "this.viewId is changed to " + valueOf + ", name:" + str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "this.viewId is " + xVar.f265492p + ",so no addCustomView, name:" + str2);
        }
        int b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "getOrCreateFrameSet: name=" + str2 + " safeWidth=" + b17);
        xVar.f265482f = b17;
        if (bool.booleanValue()) {
            s(xVar);
        }
        return xVar;
    }

    public void l(java.lang.String rootId, java.lang.String name, java.lang.String data, com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene preloadScene, java.lang.String str, yz5.l callback) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(preloadScene, "preloadScene");
        kotlin.jvm.internal.o.g(callback, "callback");
        hq0.e0 e0Var = (hq0.e0) this.f242289e.get(rootId);
        if (e0Var != null) {
            fq0.x k17 = k(rootId, name, 0);
            if (k17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "initFrameSet " + rootId + ' ' + name + ' ' + preloadScene + ' ' + str + ' ' + k17);
                if (k17.f265490n || k17.f265489m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "preLayout existed " + k17);
                    callback.invoke(java.lang.Double.valueOf((double) vp0.b.b(java.lang.Integer.valueOf(k17.f265483g))));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", "preloadScene from " + k17.f265487k + " to " + preloadScene + ", " + k17);
                k17.f265487k = preloadScene;
                mq0.d1 d1Var = mq0.d1.f330546a;
                java.lang.String frameSetId = k17.f265478b;
                synchronized (d1Var) {
                    kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
                    mq0.b1 a17 = d1Var.a(frameSetId);
                    a17.f330540a = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "markInitTime " + frameSetId + ' ' + a17.f330540a);
                }
                k17.f265484h = new dq0.s(k17, callback, this);
                e0Var.a(data, str);
                k17.d();
                f0Var2 = jz5.f0.f302826a;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                callback.invoke(null);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frameSetRoot for " + rootId + " not found! " + name);
            callback.invoke(null);
        }
    }

    public void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f242290f = null;
        synchronized (this) {
            this.f242292h = false;
        }
        this.f242291g.clear();
    }

    public final void n(java.lang.String apiName, byte[] bArr, yz5.l lVar) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        hq0.i0 t17 = t();
        if (t17 != null) {
            com.tencent.pigeon.flutter_magic_brush.MagicSclBizFlutterApi magicSclBizFlutterApi = this.f242290f;
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (magicSclBizFlutterApi != null) {
                magicSclBizFlutterApi.invoke(t17.O0(), apiName, bArr, new dq0.t(lVar, this));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "invoke " + apiName + " failed because no flutter Api");
                if (lVar != null) {
                    lVar.invoke(new com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse(4097, "no flutter Api", null, 4, null));
                } else {
                    f0Var = null;
                }
            }
            if (f0Var != null) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "invoke " + apiName + " failed because no biz");
        if (lVar != null) {
            lVar.invoke(new com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse(4098, "no biz", null, 4, null));
        }
    }

    public final boolean o(hq0.j0 j0Var) {
        if (j0Var.f283013b.length() > 0) {
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(j0Var.f283013b);
            if (Ai != null && Ai.f265489m) {
                return true;
            }
        }
        return false;
    }

    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachedToActivity: ".concat(binding.getActivity().getClass().getSimpleName()));
        this.f242297p = new java.lang.ref.WeakReference(binding.getActivity());
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public synchronized void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        boolean z17 = this.f242291g.get() != null;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachToEngine, current engine not null, recreate biz");
            u();
        }
        this.f242291g = new java.lang.ref.WeakReference(binding.getFlutterEngine());
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        this.f242290f = new com.tencent.pigeon.flutter_magic_brush.MagicSclBizFlutterApi(binaryMessenger, null, 2, 0 == true ? 1 : 0);
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onAttachedToEngine " + this.f242293i.size() + ", engine: " + this.f242291g + ", isEngineSwitching: " + z17);
            this.f242292h = true;
            java.util.Iterator it = this.f242293i.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            this.f242293i.clear();
        }
    }

    public void onDetachedFromActivity() {
        this.f242297p = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f242297p = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        if (!kotlin.jvm.internal.o.b(this.f242291g.get(), binding.getFlutterEngine())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDetachedFromEngine, engine is the last engine, status not clear");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "onDetachedFromEngine, engine: " + this.f242291g.get());
        m(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f242297p = new java.lang.ref.WeakReference(binding.getActivity());
        x();
    }

    public final com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse p(byte[] bArr) {
        return new com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse(0L, "", bArr);
    }

    public final void q(hq0.j0 j0Var) {
        fq0.x S0;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        synchronized (this.f242295n) {
            if (this.f242295n.contains(j0Var.f283013b)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "canvas destroyed before created!");
                hq0.i0 t17 = t();
                if (t17 != null && (S0 = t17.S0(j0Var.f283012a)) != null && (copyOnWriteArraySet = S0.f265481e) != null) {
                    copyOnWriteArraySet.remove(java.lang.Integer.valueOf(j0Var.f283012a));
                }
                j0Var.f283013b = "";
            } else {
                if ((j0Var.f283013b.length() > 0) && j0Var.f283025n) {
                    this.f242288d.c(j0Var.b());
                    j0Var.f283025n = false;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "canvas not created or not having frameset id: " + j0Var.f283013b + ", created: " + j0Var.f283025n);
                }
            }
        }
    }

    public void r(hq0.j0 sclCanvas) {
        kotlin.jvm.internal.o.g(sclCanvas, "sclCanvas");
        synchronized (this.f242295n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try notifyFlutterCanvasViewCreated ");
            sb6.append(sclCanvas);
            sb6.append(", and is created? ");
            sb6.append(((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(sclCanvas.f283013b) != null);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString(), new java.lang.Object[0]);
            if (!o(sclCanvas)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "frame set not created. pending create " + sclCanvas);
                this.f242295n.add(sclCanvas.f283013b);
                sclCanvas.f283026o = true;
            } else if (sclCanvas.f283019h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "not provide external view when notify! " + sclCanvas);
            } else if (sclCanvas.f283025n) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "scl canvas already created!!");
            } else {
                sclCanvas.f283025n = true;
                dq0.q qVar = this.f242288d;
                java.lang.String str = sclCanvas.f283013b;
                java.lang.String b17 = sclCanvas.b();
                cf3.d dVar = sclCanvas.f283019h;
                kotlin.jvm.internal.o.d(dVar);
                qVar.b(str, b17, dVar);
                this.f242295n.remove(sclCanvas.f283013b);
            }
        }
    }

    public void s(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
    }

    public abstract hq0.i0 t();

    public void u() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "recreateBizForEngineChangeStatus - engine switching detected");
    }

    public void v(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
    }

    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        com.tencent.mm.flutter.plugin.proto.g0 j17 = com.tencent.mm.flutter.plugin.proto.h0.j();
        java.lang.String str = frameSet.f265477a;
        str.getClass();
        j17.f67966d |= 1;
        j17.f67967e = str;
        j17.onChanged();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        j17.f67966d |= 2;
        j17.f67968f = currentTimeMillis;
        j17.onChanged();
        n("onRenderFinish", j17.build().toByteArray(), null);
    }

    public final void x() {
        java.util.HashMap hashMap;
        hq0.i0 t17 = t();
        if (t17 == null || (hashMap = t17.f282999n) == null || hashMap.isEmpty()) {
            return;
        }
        int b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded: checking " + hashMap.size() + " frameSets, currentSafeWidth=" + b17);
        if (b17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded: safeWidth=" + b17 + " invalid, skip resize");
            return;
        }
        java.util.Collection<fq0.x> values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        int i17 = 0;
        for (fq0.x xVar : values) {
            int i18 = xVar.f265482f;
            if (i18 > 0 && i18 != b17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeStaleFrameSet " + xVar.f265477a + " from " + xVar.f265482f + " to " + b17);
                xVar.j(b17, 0);
                i17++;
            }
        }
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeAllFrameSetsIfNeeded resized " + i17 + " frameSets to safeWidth=" + b17);
        }
    }
}
