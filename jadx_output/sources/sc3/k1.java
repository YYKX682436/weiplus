package sc3;

/* loaded from: classes7.dex */
public class k1 extends lc3.h0 implements qc3.f, bf3.m, yg.b0 {
    public static final jz5.g Y;
    public final com.tencent.magicbrush.handler.JsTouchEventHandler A;
    public java.util.List B;
    public yz5.l C;
    public final java.lang.String D;
    public final jz5.g E;
    public final jz5.g F;
    public int G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f406474J;
    public final jz5.g K;
    public final jz5.g L;
    public final java.util.Map M;
    public final jz5.g N;
    public sc3.k1 P;
    public final java.lang.String Q;
    public final jz5.g R;
    public volatile boolean S;
    public long T;
    public volatile long U;
    public final sc3.w V;
    public tc3.m0 W;
    public final sc3.d X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f406475d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406476e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.magicbrush.biz.MBBizManager f406477f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f406478g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f406479h;

    /* renamed from: i, reason: collision with root package name */
    public qc3.c f406480i;

    /* renamed from: m, reason: collision with root package name */
    public final oc3.c f406481m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.magicbrush.MBBuildConfig f406482n;

    /* renamed from: o, reason: collision with root package name */
    public jc3.n f406483o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f406484p;

    /* renamed from: q, reason: collision with root package name */
    public vc3.a f406485q;

    /* renamed from: r, reason: collision with root package name */
    public jc3.x f406486r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding f406487s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.magicbrush.MagicBrush f406488t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f406489u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f406490v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f406491w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f406492x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.libwxaudio.WxAudioNative f406493y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.wemedia.WeMediaBinding f406494z;

    static {
        new sc3.b(null);
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        com.tencent.mm.plugin.appbrand.jsruntime.n0.b();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        bf3.g0.f19627a.a();
        je3.i.M2(je3.k.f299298e, "", "magicbrush", com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.LOAD_SO, android.os.SystemClock.elapsedRealtime() - elapsedRealtime, null, 1.0E-5f, 16, null);
        bf3.a0 a0Var = new bf3.a0();
        ah.i.f4715a = a0Var;
        g8.g.f269409a = new ah.h(a0Var);
        Y = jz5.h.b(sc3.a.f406426d);
    }

    public k1(android.content.Context context, java.lang.String instanceName, com.tencent.magicbrush.biz.MBBizManager bizManager, yz5.p pVar, yz5.l lVar) {
        java.util.List t07;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(bizManager, "bizManager");
        this.f406475d = context;
        this.f406476e = instanceName;
        this.f406477f = bizManager;
        this.f406478g = pVar;
        this.f406479h = lVar;
        this.f406481m = new oc3.c(instanceName, null, 2, null);
        this.f406484p = jz5.h.b(new sc3.e0(this));
        this.f406489u = new java.util.concurrent.ConcurrentHashMap();
        this.f406490v = new java.util.concurrent.ConcurrentHashMap();
        this.f406491w = new com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni(this);
        this.f406492x = jz5.h.b(sc3.f.f406442d);
        this.A = new com.tencent.magicbrush.handler.JsTouchEventHandler();
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        this.D = s07;
        this.E = jz5.h.b(sc3.c0.f406433d);
        this.F = jz5.h.b(sc3.d0.f406436d);
        boolean z17 = true;
        this.G = 1;
        this.H = jz5.h.b(new sc3.p(this));
        this.I = jz5.h.b(new sc3.q(this));
        this.K = jz5.h.b(sc3.j1.f406467d);
        this.L = jz5.h.b(new sc3.e(this));
        com.tencent.mm.plugin.magicbrush.f6 f6Var = (com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class));
        f6Var.getClass();
        int hashCode = s07.hashCode();
        if (hashCode == -1270166210 ? s07.equals("MagicAdPlayable") : hashCode == -251354526 ? s07.equals("MagicEmojiCocos") : hashCode == 1454730499 && s07.equals("MagicEcsGiftEasterEgg")) {
            t07 = f6Var.wi();
        } else if (kotlin.jvm.internal.o.b(s07, "MagicAdBrandService") || kotlin.jvm.internal.o.b(s07, "MagicAdLandPage")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Bi()), f6Var.Ri()), kz5.b0.c(new fd3.b(id3.a.class)));
        } else if (kotlin.jvm.internal.o.b(s07, "MagicBrandService") || kotlin.jvm.internal.o.b(s07, "MagicReward")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Ri()), f6Var.Di()), f6Var.Ai());
        } else if (kotlin.jvm.internal.o.b(s07, "MagicAdMiniProgram")) {
            t07 = kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Ri()), f6Var.Di()), f6Var.Ai());
            try {
                xj.p Di = ((wj.g1) ((wj.m) i95.n0.c(wj.m.class))).Di();
                if (Di != xj.p.f454767g && Di != xj.p.f454768h) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MBJsApiExtFeature", "[MBAd] strategy=" + Di + ": register navigateToMiniProgram serverJsApi");
                    t07 = kz5.n0.t0(t07, kz5.b0.c(new md3.p()));
                } else {
                    com.tencent.mars.xlog.Log.i("MBJsApiExtFeature", "[MBAd] strategy=" + Di + ", skip serverJsApi registration");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MBJsApiExtFeature", "[MBAd] provideAdMiniProgramServerJsApi failed: " + e17.getMessage());
            }
        } else {
            t07 = kotlin.jvm.internal.o.b(s07, "MagicWeAppMagicBrushFrame") ? kz5.n0.t0(f6Var.wi(), f6Var.Ai()) : kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(kz5.n0.t0(f6Var.wi(), f6Var.Bi()), f6Var.Ri()), f6Var.Di()), f6Var.Ai()), kz5.b0.c(new fd3.b(id3.a.class))), kz5.b0.c(new jd3.g()));
        }
        int d17 = kz5.b1.d(kz5.d0.q(t07, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : t07) {
            linkedHashMap.put(((lc3.c0) obj).f(), obj);
        }
        this.M = linkedHashMap;
        this.N = jz5.h.b(new sc3.c(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MBBizServer_");
        java.lang.String instanceName2 = this.f406476e;
        kotlin.jvm.internal.o.g(instanceName2, "instanceName");
        sb6.append(r26.n0.s0(instanceName2, "-", instanceName2).concat(r26.p0.F0(r26.n0.p0(instanceName2, "-", ""), 5)));
        this.Q = sb6.toString();
        this.R = jz5.h.b(sc3.u.f406536d);
        this.V = new sc3.w(this);
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.lang.String instanceName3 = this.f406476e;
        kotlin.jvm.internal.o.g(instanceName3, "instanceName");
        java.util.Set set = com.tencent.mm.plugin.magicbrush.a5.f147840e;
        synchronized (set) {
            set.add(instanceName3);
            com.tencent.mm.plugin.magicbrush.a5.f147839d = a5Var.a(set);
        }
        this.X = new sc3.d(this);
    }

    @Override // bl.a
    public com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse A(java.lang.String[] strArr, java.util.Map map) {
        boolean z17 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            jc3.x xVar = this.f406486r;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            lc3.k0 c17 = xVar.c(str, map);
            if (c17 != null) {
                arrayList.add(c17);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse batchRequestWxaFileDescriptorsResponse = new com.tencent.mm.appbrand.commonjni.BatchRequestWxaFileDescriptorsResponse();
        batchRequestWxaFileDescriptorsResponse.keyPath = (java.lang.String) ((jz5.n) this.K).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lc3.k0 k0Var = (lc3.k0) it.next();
            com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor();
            v8ScriptWxaFileDescriptor.wxaFileName = k0Var.f317906b;
            v8ScriptWxaFileDescriptor.wxaPkgPath = k0Var.f317905a;
            arrayList2.add(v8ScriptWxaFileDescriptor);
        }
        batchRequestWxaFileDescriptorsResponse.fds = (com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor[]) arrayList2.toArray(new com.tencent.mm.appbrand.commonjni.V8ScriptWxaFileDescriptor[0]);
        return batchRequestWxaFileDescriptorsResponse;
    }

    @Override // lc3.h0
    public void C0(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        kotlin.jvm.internal.o.g(event, "event");
        s2(event.f147881d, event.f147882e);
    }

    @Override // qc3.f
    public void D1() {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i(this.Q, "start");
        sc3.i1 i1Var = new sc3.i1(this);
        if (!O0()) {
            jc3.x xVar = this.f406486r;
            if (xVar != null) {
                xVar.f(i1Var);
                return;
            } else {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
        }
        synchronized (this) {
            java.util.List list = this.B;
            if (list != null) {
                i1Var.invoke(list);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i(this.Q, "hy: parallel reading not ready. pending wait");
                this.C = i1Var;
            }
            this.B = null;
        }
    }

    @Override // lc3.h0
    public void E0(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(script, "script");
        if (this.G >= 2) {
            M0().evaluateJavascript(script, valueCallback);
        } else {
            com.tencent.mars.xlog.Log.e(this.Q, "evaluate discard, script is ".concat(r26.p0.E0(script, 100)));
        }
    }

    @Override // lc3.h0
    public void F0(java.lang.String api, java.lang.String data, int i17) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.Q, "forwardJsApiToClient api:" + api + ", callbackId:" + i17);
        H0().j6(api, data, "", i17);
    }

    public final com.tencent.magicbrush.a G0(java.lang.String str, vc3.a aVar, yz5.a aVar2, yg.b0 b0Var) {
        android.util.DisplayMetrics d17 = j65.f.d();
        com.tencent.magicbrush.a aVar3 = new com.tencent.magicbrush.a();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        f06.v[] vVarArr = com.tencent.magicbrush.c0.I;
        aVar3.f48618t.b(aVar3, vVarArr[11], str);
        aVar3.e(gh.b.NativeLocker);
        f06.v vVar = vVarArr[9];
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        aVar3.f48616r.b(aVar3, vVar, bool);
        aVar3.f(this.f406491w.getNativeHandle());
        aVar3.f48602d.b(aVar3, vVarArr[0], java.lang.Float.valueOf(d17.density));
        aVar3.f48603e.b(aVar3, vVarArr[1], java.lang.Integer.valueOf((int) (d17.widthPixels / d17.density)));
        aVar3.f48604f.b(aVar3, vVarArr[2], java.lang.Integer.valueOf((int) (d17.heightPixels / d17.density)));
        aVar3.f48612n.b(aVar3, vVarArr[7], bool);
        aVar3.f48610l.b(aVar3, vVarArr[5], bool);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f406482n;
        if (mBBuildConfig == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        aVar3.D.b(aVar3, vVarArr[21], java.lang.Boolean.valueOf(mBBuildConfig.f147825o));
        aVar3.f48622x.b(aVar3, vVarArr[15], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minigame_enable_program_binary, 0) == 1));
        aVar3.G.b(aVar3, vVarArr[24], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_unified_cmdbuffer, 0) == 1));
        aVar3.F.b(aVar3, vVarArr[23], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_cmdbuffer_canvas, 0) == 1));
        aVar3.E.b(aVar3, vVarArr[22], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mb_v2_enable_cmdbuffer_canvas2d, 0) == 1));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.l1.a();
        kotlin.jvm.internal.o.f(a17, "retrieveMBShaderCachePath(...)");
        aVar3.g(a17);
        f06.v vVar2 = vVarArr[16];
        com.tencent.magicbrush.c cVar = aVar3.f48623y;
        java.lang.Object a18 = cVar.a(aVar3, vVar2);
        kotlin.jvm.internal.o.f(a18, "<get-programBinaryPath>(...)");
        if (!android.text.TextUtils.isEmpty((java.lang.String) a18)) {
            java.lang.Object a19 = cVar.a(aVar3, vVarArr[16]);
            kotlin.jvm.internal.o.f(a19, "<get-programBinaryPath>(...)");
            aVar3.g(java.lang.String.valueOf(com.tencent.mm.vfs.w6.i((java.lang.String) a19, true)));
        }
        aVar3.f48621w.b(aVar3, vVarArr[14], java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) Y).getValue()).intValue()));
        aVar3.f48599a = this.f406475d;
        aVar3.f48601c = aVar2;
        java.lang.String D = lp0.b.D();
        kotlin.jvm.internal.o.f(D, "DATAROOT_SDCARD_PATH(...)");
        aVar3.f48615q.b(aVar3, vVarArr[8], D);
        aVar3.f48600b = aVar;
        aVar3.f48607i = b0Var;
        aVar3.f48605g = new sc3.l(this);
        aVar3.f48624z.b(aVar3, vVarArr[17], bool);
        aVar3.A.b(aVar3, vVarArr[18], bool);
        aVar3.B.b(aVar3, vVarArr[19], new sc3.n());
        return aVar3;
    }

    public final qc3.c H0() {
        qc3.c cVar = this.f406480i;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.o.o("client");
        throw null;
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f406487s;
        if (appBrandJsBridgeBinding != null) {
            appBrandJsBridgeBinding.invokeCallbackHandler(i17, result, com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
        } else {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
    }

    public final boolean K0() {
        return ((java.lang.Boolean) ((jz5.n) this.I).getValue()).booleanValue();
    }

    @Override // yg.b0
    public void M(com.tencent.magicbrush.ui.MagicBrushView view, float[] left, float[] top, float[] width, float[] height) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(top, "top");
        kotlin.jvm.internal.o.g(width, "width");
        kotlin.jvm.internal.o.g(height, "height");
        com.tencent.mars.xlog.Log.i(this.Q, "onSetTouchableRectList: count = " + left.length);
        H0().Bi(view.getVirtualElementId(), left, top, width, height);
    }

    public final vc3.a M0() {
        vc3.a aVar = this.f406485q;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("jsRuntime");
        throw null;
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        kotlin.jvm.internal.o.g(pointerIds, "pointerIds");
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.M1(i17, i18, i19, j17, pointerIds, x17, y17);
            return;
        }
        int min = java.lang.Math.min(x17.length, y17.length);
        java.util.ArrayList arrayList = new java.util.ArrayList(min);
        int i27 = 0;
        for (int i28 = 0; i28 < min; i28++) {
            arrayList.add(new jz5.l(java.lang.Float.valueOf(x17[i28]), java.lang.Float.valueOf(y17[i28])));
        }
        int length = pointerIds.length;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(kz5.d0.q(arrayList, 10), length));
        for (java.lang.Object obj : arrayList) {
            if (i27 >= length) {
                break;
            }
            jz5.l lVar = (jz5.l) obj;
            arrayList2.add(new ch.c(pointerIds[i27], ((java.lang.Number) lVar.f302833d).floatValue(), ((java.lang.Number) lVar.f302834e).floatValue()));
            i27++;
        }
        M0().post(new sc3.p0(this, i17, i18, i19, j17, arrayList2));
    }

    public final oc3.a N0() {
        return (oc3.a) ((jz5.n) this.f406484p).getValue();
    }

    public final boolean O0() {
        return ((java.lang.Boolean) ((jz5.n) this.E).getValue()).booleanValue();
    }

    @Override // qc3.f
    public void Oc(int i17) {
        bf3.g0.f19627a.b(this.f406476e, new sc3.t(this, i17));
    }

    public final java.lang.String S0() {
        jz5.l[] lVarArr = new jz5.l[17];
        lVarArr[0] = new jz5.l("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        bf3.p0 p0Var = bf3.p0.f19645a;
        java.lang.Object value = ((jz5.n) bf3.p0.f19649e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        lVarArr[1] = new jz5.l("brand", (java.lang.String) value);
        java.lang.Object value2 = ((jz5.n) bf3.p0.f19650f).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        lVarArr[2] = new jz5.l("model", (java.lang.String) value2);
        lVarArr[3] = new jz5.l("system", android.os.Build.VERSION.RELEASE);
        lVarArr[4] = new jz5.l("pixelRatio", java.lang.Float.valueOf(p0Var.a()));
        java.lang.Object value3 = ((jz5.n) bf3.p0.f19651g).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        lVarArr[5] = new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, (java.lang.String) value3);
        java.lang.Object value4 = ((jz5.n) bf3.p0.f19652h).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        lVarArr[6] = new jz5.l("version", (java.lang.String) value4);
        lVarArr[7] = new jz5.l("fontSizeSetting", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f19646b).getValue()).intValue()));
        lVarArr[8] = new jz5.l("fontSizeScaleFactor", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) bf3.p0.f19647c).getValue()).floatValue()));
        lVarArr[9] = new jz5.l("clientVersion", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.z.f193112h));
        lVarArr[10] = new jz5.l("isDarkMode", java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()));
        lVarArr[11] = new jz5.l("isDebugEnv", java.lang.Boolean.valueOf(z65.c.a()));
        lVarArr[12] = new jz5.l("bizName", this.D);
        lVarArr[13] = new jz5.l("maxFps", java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) Y).getValue()).intValue()));
        lVarArr[14] = new jz5.l("USER_DATA_PATH", "wxfile://usr");
        lVarArr[15] = new jz5.l("experimental", kz5.c1.i(new jz5.l("supportCreateCanvasAheadOfTime", java.lang.Boolean.TRUE)));
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f406482n;
        if (mBBuildConfig == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        lVarArr[16] = new jz5.l("customEnv", mBBuildConfig.f147826p);
        return ";mb.env = " + new org.json.JSONObject(kz5.c1.k(lVarArr)) + ';';
    }

    @Override // bl.a
    public java.lang.String[] T() {
        return (java.lang.String[]) ((jz5.n) this.N).getValue();
    }

    public final com.eclipsesource.mmv8.V8ScriptEvaluateRequest V0(lc3.g0 g0Var) {
        java.lang.String str;
        if (g0Var instanceof lc3.j0) {
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest.scriptType = 3;
            v8ScriptEvaluateRequest.scriptText = ((lc3.j0) g0Var).f317903a;
            return v8ScriptEvaluateRequest;
        }
        if (g0Var instanceof lc3.d) {
            com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest2 = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
            v8ScriptEvaluateRequest2.scriptType = 1;
            com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor = new com.eclipsesource.mmv8.V8ScriptFileDescriptor();
            v8ScriptEvaluateRequest2.scriptFd = v8ScriptFileDescriptor;
            lc3.d dVar = (lc3.d) g0Var;
            v8ScriptFileDescriptor.f43995fd = dVar.f317893a.getParcelFileDescriptor().detachFd();
            v8ScriptEvaluateRequest2.scriptFd.startOffset = dVar.f317893a.getStartOffset();
            v8ScriptEvaluateRequest2.scriptFd.length = dVar.f317893a.getLength();
            return v8ScriptEvaluateRequest2;
        }
        if (!(g0Var instanceof lc3.k0)) {
            throw new jz5.j();
        }
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest3 = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest3.scriptType = 2;
        com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor v8ScriptWxaFileDescriptor = new com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor();
        v8ScriptEvaluateRequest3.scriptWxaFd = v8ScriptWxaFileDescriptor;
        lc3.k0 k0Var = (lc3.k0) g0Var;
        v8ScriptWxaFileDescriptor.wxaPkgPath = k0Var.f317905a;
        java.lang.String str2 = k0Var.f317906b;
        v8ScriptWxaFileDescriptor.wxaFileName = str2;
        bf3.g0.f19627a.getClass();
        kotlin.jvm.internal.o.g(str2, "str");
        if (r26.i0.y(str2, "/", false)) {
            str2 = str2.substring(1);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        v8ScriptEvaluateRequest3.scriptName = "https://mm.tencent.com/".concat(str2);
        jc3.x xVar = this.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        java.lang.String d17 = xVar.d();
        if (d17.length() > 0) {
            str = d17 + '_' + str2;
        } else {
            str = "";
        }
        v8ScriptEvaluateRequest3.cacheKey = str;
        v8ScriptEvaluateRequest3.cacheCategory = this.D;
        v8ScriptEvaluateRequest3.cacheType = 0;
        return v8ScriptEvaluateRequest3;
    }

    @Override // bl.a
    public void W(int i17) {
        com.tencent.mars.xlog.Log.i(this.Q, "onWorkerDestroyed, workerId: " + i17);
        this.f406490v.remove(java.lang.Integer.valueOf(i17));
    }

    public final void X0(java.lang.String msg, java.lang.String stack, java.lang.String source) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(stack, "stack");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.e(this.Q, source + ": " + msg + '\n' + stack);
        java.lang.String str = stack.length() == 0 ? msg : stack;
        if (r26.n0.B(str, "illegal access", false)) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, source);
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, msg);
        jSONObject.put("stack", stack);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        s2("onJsError", jSONObject2);
        H0().h("", str);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(ya.b.SOURCE, source);
        he3.e eVar = (he3.e) ((ie3.i) i95.n0.c(ie3.i.class));
        java.lang.String str2 = this.D;
        jSONObject3.put(str2, eVar.bj(str2));
        java.util.Iterator it = N0().f344328b.values().iterator();
        while (it.hasNext()) {
            java.lang.String appid = ((oc3.b) it.next()).f344330b;
            kotlin.jvm.internal.o.g(appid, "appid");
            if (kotlin.jvm.internal.o.b(appid, "wxe208ce76dfa39515")) {
                appid = "MagicLiveCard";
            } else if (kotlin.jvm.internal.o.b(appid, "wx2f3fb5db9f226462")) {
                appid = "MagicSclPublicService";
            }
            jSONObject3.put(appid, ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(appid));
        }
        je3.k kVar = je3.k.f299298e;
        java.lang.String str3 = this.D;
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        kVar.T5(str3, "js-exception", str, jSONObject4, 1.0f);
    }

    public void Y0() {
        com.tencent.mars.xlog.Log.i(this.Q, "onStarted");
        this.G = 4;
        this.f406491w.notifyResume();
        com.tencent.magicbrush.MagicBrush magicBrush = this.f406488t;
        if (magicBrush != null) {
            magicBrush.f();
        }
        H0().n();
        if (K0()) {
            ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Ai((qk.u6) ((jz5.n) this.H).getValue());
        }
    }

    @Override // yg.b0
    public com.tencent.magicbrush.ui.MagicBrushView Z() {
        com.tencent.magicbrush.MagicBrush magicBrush = this.f406488t;
        kotlin.jvm.internal.o.d(magicBrush);
        pc3.c cVar = new pc3.c(this.f406475d, magicBrush);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f406489u;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = cVar.f353372f;
        concurrentHashMap.put(java.lang.Integer.valueOf(magicBrushView.getVirtualElementId()), cVar);
        return magicBrushView;
    }

    @Override // yg.b0
    public void a0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        H0().C3(view.getVirtualElementId(), i17, i18, i19, i27, i28);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.W;
    }

    @Override // bl.a
    public java.lang.String c0(java.lang.String api, java.lang.String data, java.lang.String privateData, int i17, boolean z17, int i18, int i19) {
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(privateData, "privateData");
        if (i18 > 0) {
            appBrandJsBridgeBinding = (uc3.e) this.f406490v.get(java.lang.Integer.valueOf(i18));
            if (appBrandJsBridgeBinding == null) {
                com.tencent.mars.xlog.Log.e(this.Q, "worker bridge not found for workerId: " + i18);
                return "";
            }
        } else {
            appBrandJsBridgeBinding = this.f406487s;
            if (appBrandJsBridgeBinding == null) {
                kotlin.jvm.internal.o.o("jsBridge");
                throw null;
            }
        }
        if (i18 > 0 && !kotlin.jvm.internal.o.b(api, com.tencent.mm.plugin.appbrand.jsapi.oe.NAME)) {
            com.tencent.mars.xlog.Log.e(this.Q, "jsapi is not supported in worker " + i18);
            return "";
        }
        if (this.G == 1) {
            com.tencent.mars.xlog.Log.e(this.Q, "invoke jsapi " + api + " after destroy with data: " + data);
            appBrandJsBridgeBinding.invokeCallbackHandler(i17, "{\"errMsg\":\"Not handled\", \"errCode\": -1}", com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
            return "";
        }
        java.util.Map map = (java.util.Map) ((jz5.n) this.L).getValue();
        if (map != null && ((java.lang.String) map.get(api)) != null) {
            com.tencent.mars.xlog.Log.e(this.Q, "invoke jsapi " + api + " have not permission");
            appBrandJsBridgeBinding.invokeCallbackHandler(i17, "{\"errMsg\":\"no permission\", \"errCode\": -5}", com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
            return "";
        }
        try {
            lc3.c0 c0Var = (lc3.c0) ((java.util.LinkedHashMap) this.M).get(api);
            if (c0Var != null) {
                if (c0Var instanceof lc3.b0) {
                    lc3.b0 r17 = ((lc3.b0) c0Var).r();
                    r17.f317890a = this;
                    r17.o(this.f406481m);
                    r17.f317886d = new sc3.f0(appBrandJsBridgeBinding, i17);
                    r17.t(new lc3.a0(data));
                    return "";
                }
                if (!(c0Var instanceof lc3.d0)) {
                    throw new java.lang.IllegalAccessError("Illegal jsapi");
                }
                c0Var.f317890a = this;
                c0Var.o(this.f406481m);
                java.lang.String a17 = ((lc3.d0) c0Var).r(new lc3.a0(data)).a();
                c0Var.f317890a = null;
                appBrandJsBridgeBinding.invokeCallbackHandler(i17, a17, com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
                return "";
            }
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f406482n;
            if (mBBuildConfig == null) {
                kotlin.jvm.internal.o.o("config");
                throw null;
            }
            java.util.Iterator it = mBBuildConfig.f147817d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((jz5.l) obj).f302833d, api)) {
                    break;
                }
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                if (((java.lang.Boolean) lVar.f302834e).booleanValue()) {
                    appBrandJsBridgeBinding.invokeCallbackHandler(i17, H0().ih(api, data, privateData), com.tencent.mm.plugin.appbrand.jsapi.jf.b(null));
                    return "";
                }
                H0().j6(api, data, privateData, i17);
                return "";
            }
            jc3.n nVar = this.f406483o;
            if (nVar != null) {
                return nVar.B(api, data, privateData, i17);
            }
            kotlin.jvm.internal.o.o("mbAdaptor");
            throw null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.Q, e17, "Catch jsapi exception " + api + ", data = " + data, new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f312615d).B(new sc3.g0(e17));
            return "{\"errMsg\":\"jsapi exception\", \"errCode\": -4}";
        }
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.cj(i17, i18, i19);
        } else {
            M0().post(new sc3.w0(this, i17, i18, i19));
        }
    }

    @Override // bl.a
    public void e() {
        M0().e();
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ue3.b.f426891a;
        com.tencent.mars.xlog.Log.i("MagicBrushJsApiMMKVUtil", "fetch data by key:".concat(result));
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = ue3.b.f426891a;
        java.lang.String t17 = o4Var2.t(result);
        o4Var2.W(result);
        kotlin.jvm.internal.o.d(t17);
        J5(i17, t17);
    }

    public final void g1(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        M0().post(new java.lang.Runnable(r17) { // from class: sc3.z0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f406554d;

            {
                kotlin.jvm.internal.o.g(r17, "function");
                this.f406554d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f406554d.invoke();
            }
        });
    }

    @Override // bl.a
    public boolean h0(int i17, java.lang.String moduleName, java.lang.String paramsJson) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        com.tencent.mars.xlog.Log.i(this.Q, "lazy load module ".concat(moduleName));
        if (i17 > 0) {
            return false;
        }
        int hashCode = moduleName.hashCode();
        if (hashCode != -1809564299) {
            if (hashCode != -1425794666) {
                if (hashCode != -937619447 || !moduleName.equals("Profiler")) {
                    return false;
                }
                if (this.f406488t == null) {
                    g1(new sc3.i(this));
                    kotlin.jvm.internal.o.d(this.f406488t);
                }
            } else {
                if (!moduleName.equals("WeMedia")) {
                    return false;
                }
                synchronized (bf3.g0.f19627a) {
                    if (!bf3.g0.f19631e) {
                        com.tencent.mars.xlog.Log.i("MBServerUtil", "start load wemedia so");
                        ah.d.b("c++_shared");
                        ah.d.b("wxVcodec2");
                        ah.d.b("xffmpeg");
                        ah.d.b("mmmedia");
                        ah.d.b("wemedia");
                        com.tencent.mars.xlog.Log.i("MBServerUtil", "load wemedia so done");
                        bf3.g0.f19631e = true;
                    }
                }
                java.lang.String str = this.Q;
                com.tencent.mars.xlog.Log.i(str, "initWeMedia");
                if (this.f406494z == null) {
                    kq5.c.f311287b = new sc3.x();
                    kq5.g.f311288a = new sc3.y();
                    java.lang.String str2 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicPath"), true) + "/wemedia/";
                    com.tencent.mm.wemedia.WeMediaBinding weMediaBinding = new com.tencent.mm.wemedia.WeMediaBinding(this.f406475d);
                    weMediaBinding.init(M0().L(), M0().G(), M0().z(), str2, new sc3.z(this));
                    this.f406494z = weMediaBinding;
                    com.tencent.mars.xlog.Log.i(str, "initWeMedia done");
                }
            }
        } else {
            if (!moduleName.equals("WXAUDIO")) {
                return false;
            }
            synchronized (bf3.g0.f19627a) {
                if (!bf3.g0.f19630d) {
                    com.tencent.mars.xlog.Log.i("MBServerUtil", "start load web audio so");
                    ah.d.b("c++_shared");
                    ah.d.b("xffmpeg");
                    ah.d.b("wxaudio");
                    com.tencent.mars.xlog.Log.i("MBServerUtil", "load web audio so done");
                    com.tencent.mm.libwxaudio.WxAudioNative.initAndroidAssetMgr(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets());
                    bf3.g0.f19630d = true;
                }
            }
            com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = new com.tencent.mm.libwxaudio.WxAudioNative(M0().L(), M0().G(), M0().z());
            wxAudioNative.InitCallBack(new sc3.b0(this));
            this.f406493y = wxAudioNative;
        }
        return true;
    }

    @Override // bl.a
    public boolean j() {
        return M0().j();
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        java.lang.String str = this.Q;
        com.tencent.mars.xlog.Log.i(str, "onWorkerCreated, workerId: " + i17 + ", isolatePtr: " + j17 + ", contextPtr: " + j18 + ", uvPtr: " + j19);
        java.lang.String str2 = ik1.f.e("magic_emoji/magic_brush_common_lib.js") + S0();
        vc3.k kVar = new vc3.k(this.f406491w, i17, j17, j18, j19);
        this.f406490v.put(java.lang.Integer.valueOf(i17), new uc3.e(this.f406491w, i17));
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f406482n;
        if (mBBuildConfig == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        if (mBBuildConfig.f147822i) {
            try {
                java.lang.String bizName = this.D;
                kotlin.jvm.internal.o.g(bizName, "bizName");
                com.tencent.magicbrush.MagicBrush h17 = G0("MB.Worker.".concat(r26.p0.E0(r26.n0.W(bizName, "Magic"), 5)), kVar, new sc3.m0(j17, j18, j19), null).h();
                kotlin.jvm.internal.o.d(h17);
                h17.f();
                h17.f48579c = this.f406488t;
                s1(h17, "MagicBrush-Worker");
                kVar.O(new sc3.k0(h17));
                com.tencent.mars.xlog.Log.i(str, "Worker MagicBrush created for workerId: " + i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, "Failed to create worker MagicBrush, workerId: " + i17, e17);
                d75.b.g(new sc3.l0(e17));
            }
        }
        return str2;
    }

    @Override // bl.a
    public java.nio.ByteBuffer l0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        bf3.g0 g0Var = bf3.g0.f19627a;
        jc3.x xVar = this.f406486r;
        if (xVar != null) {
            return g0Var.c(xVar, path);
        }
        kotlin.jvm.internal.o.o("pkgManagement");
        throw null;
    }

    public final void m1(qc3.c client) {
        long j17;
        kotlin.jvm.internal.o.g(client, "client");
        com.tencent.mars.xlog.Log.i(this.Q, "setRemoteMBClient instance:" + this.f406476e);
        this.f406480i = new tc3.u(this.f406476e, client, new sc3.b1(this));
        this.W = new tc3.m0(this);
        try {
            android.os.IBinder asBinder = H0().asBinder();
            if (asBinder != null) {
                asBinder.linkToDeath(this.X, 0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(this.Q, "link client binder death failed: " + e17);
        }
        try {
            j17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_mb_auto_ping_interval_ms, 0L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(this.Q, "heartbeat expt read failed, fallback disabled: " + th6);
            j17 = 0L;
        }
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.i(this.Q, "heartbeat not enabled (intervalMs=" + j17 + "), skip instance:" + this.f406476e);
            return;
        }
        if (this.S) {
            com.tencent.mars.xlog.Log.i(this.Q, "heartbeat already started, skip instance:" + this.f406476e);
            return;
        }
        this.U = j17;
        this.S = true;
        this.T = 0L;
        com.tencent.mars.xlog.Log.i(this.Q, "heartbeat start instance:" + this.f406476e + ", intervalMs=" + j17);
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.R).getValue()).postDelayed(this.V, this.U);
    }

    @Override // bl.a
    public java.lang.String o0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        jc3.x xVar = this.f406486r;
        if (xVar != null) {
            return xVar.a(str);
        }
        kotlin.jvm.internal.o.o("pkgManagement");
        throw null;
    }

    public void onCreated() {
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar;
        com.tencent.mars.xlog.Log.i(this.Q, "onCreated");
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f406487s;
        if (appBrandJsBridgeBinding == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        appBrandJsBridgeBinding.createRuntime(M0().L(), M0().G(), "JSBridge", true);
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding2 = this.f406487s;
        if (appBrandJsBridgeBinding2 == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        appBrandJsBridgeBinding2.setJsExceptionCallback(new sc3.h0(this));
        this.G = 2;
        M0().evaluateJavascript("\n        JSBridge.on(\"onJsError\", function(res) {\n            if (res.stack == '') {\n                console.error(res.message);\n            } else {\n                console.error(res.stack);\n            }\n        });\n        JSBridge.on('devtools:receive', function(msg) {\n            const devtools = global.DevtoolsMessage;\n            if (devtools && devtools.onreceive) {\n                devtools.onreceive.call(devtools, msg);\n            }\n        });\n    ", null);
        if (K0() && (wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) M0().h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class)) != null) {
            cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f42724b).h(new cl.q0$$a(n07, "_console"), false);
        }
        M0().pause();
        H0().onCreated();
    }

    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i(this.Q, "onDestroy, reason " + i17);
        v1();
        this.G = 1;
        this.P = null;
        if (t1(i17)) {
            H0().onDestroy();
        }
        jc3.x xVar = this.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        xVar.release();
        this.f406477f.c();
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f406487s;
        if (appBrandJsBridgeBinding == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        appBrandJsBridgeBinding.destroyRuntime();
        ((com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager) ((jz5.n) this.f406492x).getValue()).b();
        synchronized (this) {
            com.tencent.magicbrush.MagicBrush magicBrush = this.f406488t;
            if (magicBrush != null) {
                magicBrush.r();
            }
        }
        this.f406491w.notifyDestroy();
        com.tencent.mm.libwxaudio.WxAudioNative wxAudioNative = this.f406493y;
        if (wxAudioNative != null) {
            wxAudioNative.destroyWebAudioContext();
        }
        com.tencent.mm.wemedia.WeMediaBinding weMediaBinding = this.f406494z;
        if (weMediaBinding != null) {
            weMediaBinding.uint();
        }
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.lang.String instanceName = this.f406476e;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.util.Set set = com.tencent.mm.plugin.magicbrush.a5.f147840e;
        synchronized (set) {
            set.remove(instanceName);
            com.tencent.mm.plugin.magicbrush.a5.f147839d = a5Var.a(set);
        }
    }

    @Override // bl.a
    public java.nio.ByteBuffer p(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (path.length() == 0) {
            return null;
        }
        jc3.x xVar = this.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        byte[] bytes = xVar.a(path).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return java.nio.ByteBuffer.allocateDirect(bytes.length).put(bytes);
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        kotlin.jvm.internal.o.g(surface, "surface");
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.pg(i17, surface, i18, i19);
        } else {
            M0().post(new sc3.u0(this, i17, surface, i18, i19));
        }
    }

    @Override // yg.b0
    public void q0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        H0().B8(view.getVirtualElementId(), i17, i18, i19, i27, i28);
    }

    @Override // bl.a
    public void r0(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (K0()) {
            ((xz1.k) ((qk.v6) i95.n0.c(qk.v6.class))).Di((qk.u6) ((jz5.n) this.H).getValue(), msg);
        }
    }

    public final void s1(com.tencent.magicbrush.MagicBrush magicBrush, java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            magicBrush.getClass();
        }
        magicBrush.f48588l.a(new sc3.d1(this, str));
        magicBrush.f48581e.setMaxDecodeDimension(8192, 8192);
        magicBrush.f48581e.addImageStreamFetcher(new sc3.e1(this), true);
        magicBrush.f48589m.a(new sc3.f1(this));
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        if (this.G < 2) {
            com.tencent.mars.xlog.Log.e(this.Q, "event " + event + " discard, data = " + r26.p0.E0(data, 100));
            return;
        }
        com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding appBrandJsBridgeBinding = this.f406487s;
        if (appBrandJsBridgeBinding == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        bf3.g0.f19627a.getClass();
        appBrandJsBridgeBinding.subscribeHandler(event, data, 0, "{\"nativeTime\": " + java.lang.System.currentTimeMillis() + '}');
    }

    @Override // qc3.f
    public void setMute(boolean z17) {
        M0().Z(new sc3.a1(this, z17));
    }

    public boolean t1(int i17) {
        return i17 == 1;
    }

    @Override // qc3.f
    public void uc() {
        yz5.p pVar = this.f406478g;
        if (pVar != null) {
            pVar.invoke(this.f406476e, java.lang.Boolean.FALSE);
        }
        if (bf3.h0.a(this.G, 8)) {
            return;
        }
        M0().Z(new sc3.x0(this));
        M0().C(-8);
        M0().resume();
        M0().post(new sc3.y0(this));
        this.G = 4;
    }

    public final void v1() {
        if (this.S) {
            this.S = false;
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.R).getValue()).removeCallbacks(this.V);
            com.tencent.mars.xlog.Log.i(this.Q, "heartbeat stop instance:" + this.f406476e + ", totalTick=" + this.T);
        }
    }

    @Override // yg.b0
    public void w0(com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        pc3.c cVar = (pc3.c) this.f406489u.remove(java.lang.Integer.valueOf(view.getVirtualElementId()));
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBRendererView", "destroy");
            android.view.Surface surface = cVar.f353371e;
            if (surface == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
            } else {
                cVar.f353371e = null;
                gh.t tVar = cVar.f353370d;
                if (tVar != null) {
                    tVar.a(surface, false);
                }
            }
            cVar.f353370d = null;
        }
        H0().K3(view.getVirtualElementId());
    }

    @Override // qc3.f
    public void w3(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        java.lang.String str = this.Q;
        com.tencent.mars.xlog.Log.i(str, "setupConfig");
        this.f406482n = config;
        java.lang.String str2 = config.f147820g;
        if (str2 == null) {
            str2 = "";
        }
        oc3.c cVar = this.f406481m;
        cVar.getClass();
        cVar.f344332b = str2;
        com.tencent.mars.xlog.Log.i(str, "postConfig callerProcessName: " + cVar.f344332b);
        bf3.g0.f19627a.b(this.f406476e, new sc3.t0(this, config));
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        kotlin.jvm.internal.o.g(script, "script");
        if (this.G < 2) {
            com.tencent.mars.xlog.Log.e(this.Q, "evaluate discard, script is ".concat(r26.p0.E0(script, 100)));
        } else if (i17 > 0) {
            M0().evaluateJavascript(script, new sc3.r(this, i17));
        } else {
            M0().evaluateJavascript(script, null);
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        sc3.k1 k1Var = this.P;
        if (k1Var != null) {
            k1Var.yd(i17);
        } else {
            M0().post(new sc3.v0(this, i17));
        }
    }

    @Override // qc3.f
    public void z3() {
        yz5.p pVar = this.f406478g;
        if (pVar != null) {
            pVar.invoke(this.f406476e, java.lang.Boolean.TRUE);
        }
        if (bf3.h0.a(this.G, 4)) {
            return;
        }
        M0().post(new sc3.o0(this));
        M0().C(10);
        M0().pause();
        M0().Z(new sc3.n0(this));
        this.G = 8;
    }
}
