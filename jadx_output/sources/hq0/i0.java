package hq0;

/* loaded from: classes7.dex */
public abstract class i0 extends lc3.s implements jc3.h0, jc3.u {

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.List f282993w = kz5.b0.c("surface:frameSet:scroll");

    /* renamed from: f, reason: collision with root package name */
    public final hq0.l0 f282994f;

    /* renamed from: g, reason: collision with root package name */
    public jc3.j0 f282995g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f282996h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f282997i;

    /* renamed from: m, reason: collision with root package name */
    public final hq0.k0 f282998m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f282999n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f283000o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283001p;

    /* renamed from: q, reason: collision with root package name */
    public hq0.f f283002q;

    /* renamed from: r, reason: collision with root package name */
    public hq0.e f283003r;

    /* renamed from: s, reason: collision with root package name */
    public kc3.f f283004s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f283005t;

    /* renamed from: u, reason: collision with root package name */
    public final mq0.a1 f283006u;

    /* renamed from: v, reason: collision with root package name */
    public final hq0.g0 f283007v;

    public i0(hq0.l0 eventHandler, int i17, kotlin.jvm.internal.i iVar) {
        eventHandler = (i17 & 1) != 0 ? new hq0.l0() : eventHandler;
        kotlin.jvm.internal.o.g(eventHandler, "eventHandler");
        this.f282994f = eventHandler;
        this.f282996h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f282998m = new hq0.k0();
        this.f282999n = new java.util.HashMap();
        this.f283000o = new java.util.HashMap();
        this.f283001p = new java.util.concurrent.ConcurrentHashMap();
        this.f283006u = new mq0.a1();
        this.f283007v = new hq0.g0(this);
    }

    public static /* synthetic */ hq0.e0 K0(hq0.i0 i0Var, java.lang.Object obj, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFrameSetRoot");
        }
        if ((i17 & 32) != 0) {
            z17 = false;
        }
        return i0Var.H0(obj, context, str, str2, str3, z17);
    }

    public void A1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("frameSetRootId", root.f282984e);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:resume", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:resume", jSONObject2);
    }

    public final android.app.Activity B1() {
        java.util.Collection values = this.f283001p.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            java.util.Collection<fq0.x> values2 = ((hq0.e0) it.next()).f282985f.values();
            kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
            for (fq0.x xVar : values2) {
                com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = xVar.f265488l;
                if ((magicSclViewContainer != null ? magicSclViewContainer.getContext() : null) instanceof android.app.Activity) {
                    com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer2 = xVar.f265488l;
                    android.content.Context context = magicSclViewContainer2 != null ? magicSclViewContainer2.getContext() : null;
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    return (android.app.Activity) context;
                }
            }
        }
    }

    public final jc3.x E1() {
        jc3.j0 j0Var = this.f282995g;
        if (j0Var == null) {
            return null;
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, ((rc3.w0) j0Var).f394087e, null, 2, null);
    }

    public final void F1(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mars.xlog.Log.i(getTag(), "removeFrameSetRoot id:".concat(id6));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f283001p;
        hq0.e0 e0Var = (hq0.e0) concurrentHashMap.get(id6);
        if (e0Var != null) {
            e0Var.c();
        }
        concurrentHashMap.remove(id6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [jz5.f0] */
    public final void G0(int i17) {
        hq0.j0 a17;
        fq0.x S0 = S0(i17);
        if (S0 != null && (a17 = this.f282998m.a(i17)) != null) {
            android.view.View view = a17.f283018g;
            if (view != null) {
                if (view.getParent() == null) {
                    com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = S0.f265488l;
                    if (magicSclViewContainer != null) {
                        magicSclViewContainer.addView(view);
                    }
                    com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer2 = S0.f265488l;
                    if (magicSclViewContainer2 != null) {
                        magicSclViewContainer2.bringChildToFront(magicSclViewContainer2 != null ? magicSclViewContainer2.getCoverViewRoot() : null);
                    }
                    com.tencent.mars.xlog.Log.i(getTag(), "notifyCanvasAndFrameSet " + S0 + " addView");
                }
                a17.a();
            }
            if (a17.f283021j) {
                com.tencent.mars.xlog.Log.i(getTag(), "found pendingRedraw, do it");
                S0.f();
                a17.f283021j = false;
            }
            r1 = jz5.f0.f302826a;
        }
        if (r1 == null) {
            com.tencent.mars.xlog.Log.e(getTag(), "hy: try insert no " + i17 + " found");
        }
    }

    public void G1(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        m1();
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            synchronized (j0Var) {
                int i17 = 500;
                if (this.f282997i) {
                    ((rc3.w0) j0Var).k(event, data);
                    if (!f282993w.contains(event)) {
                        java.lang.String tag = getTag();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent event:");
                        sb6.append(event);
                        sb6.append(" value:");
                        int length = data.length();
                        if (length <= 500) {
                            i17 = length;
                        }
                        java.lang.String substring = data.substring(0, i17);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        sb6.append(substring);
                        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                    }
                } else {
                    this.f282996h.add(new hq0.f0(event, data));
                    if (!f282993w.contains(event)) {
                        java.lang.String tag2 = getTag();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sendEvent add PendingEvent key:");
                        sb7.append(event);
                        sb7.append(" value:");
                        int length2 = data.length();
                        if (length2 <= 500) {
                            i17 = length2;
                        }
                        java.lang.String substring2 = data.substring(0, i17);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        sb7.append(substring2);
                        com.tencent.mars.xlog.Log.i(tag2, sb7.toString());
                    }
                }
            }
        }
    }

    public final hq0.e0 H0(java.lang.Object target, android.content.Context context, java.lang.String appId, java.lang.String path, java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        return Y0(target, context, appId, path, query, z17, false);
    }

    public final void H1(boolean z17) {
        this.f283005t = z17;
        com.tencent.mars.xlog.Log.i(getTag(), "setActive isActive: " + this.f283005t);
        m1();
    }

    public void I1(com.tencent.mm.plugin.magicbrush.MBBuildConfig buildConfig) {
        kotlin.jvm.internal.o.g(buildConfig, "buildConfig");
        buildConfig.f147828r = this;
        buildConfig.f147829s = this.f283002q;
        buildConfig.f147830t = this.f283003r;
        buildConfig.f147822i = false;
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            rc3.w0 w0Var = (rc3.w0) j0Var;
            w0Var.w(this);
            w0Var.W(buildConfig);
            com.tencent.mars.xlog.Log.i(getTag(), "MagicBrush setup " + O0());
        }
    }

    public void M0(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.f282997i) {
            getTag();
            return;
        }
        java.util.List list = f282993w;
        java.lang.String str = event.f147881d;
        if (!list.contains(str)) {
            com.tencent.mars.xlog.Log.i(getTag(), "dispatch event: " + event);
        }
        G1(str, event.f147882e);
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewCreated canvasId:" + i17);
        this.f282998m.b(i17, null, view, null);
        G0(i17);
    }

    public void N0(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        if (!f282993w.contains(event)) {
            com.tencent.mars.xlog.Log.i(getTag(), "dispatch event: ".concat(event));
        }
        G1(event, data);
    }

    public abstract java.lang.String O0();

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + ",top:" + i19 + ",width:" + i27 + ",height:" + i28);
        hq0.j0 a17 = this.f282998m.a(i17);
        if (a17 != null) {
            a17.f283014c = i18;
            a17.f283015d = i19;
            a17.f283016e = i27;
            a17.f283017f = i28;
            a17.a();
        }
    }

    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(getTag(), "onJSException envId:" + envId + ", msg:" + msg);
    }

    public final fq0.x S0(int i17) {
        java.lang.String str;
        hq0.j0 j0Var = (hq0.j0) this.f282998m.f283028a.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (str = j0Var.f283013b) == null) {
            str = "";
        }
        return V0(str);
    }

    public final fq0.x V0(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        return (fq0.x) this.f282999n.get(id6);
    }

    public void X0() {
        com.tencent.mars.xlog.Log.i(getTag(), com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f282995g = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi(O0());
        i95.m c17 = i95.n0.c(kc3.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f282995g;
        kotlin.jvm.internal.o.d(j0Var);
        this.f283004s = new com.tencent.mm.plugin.magicbrush.s5((com.tencent.mm.plugin.magicbrush.t5) ((kc3.e) c17), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, j0Var);
        this.f282996h.clear();
        this.f282994f.f283030a = new hq0.h0(this);
    }

    public final hq0.e0 Y0(java.lang.Object target, android.content.Context context, java.lang.String appId, java.lang.String path, java.lang.String query, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        java.lang.String b17 = vq0.b.b(target, path);
        com.tencent.mars.xlog.Log.i(getTag(), "invoke createFrameSetRoot,target:" + target + ", path" + path + ", id:" + b17);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        java.util.HashMap hashMap = this.f283000o;
        fq0.r rVar = (fq0.r) hashMap.get(appId);
        if (rVar == null) {
            rVar = new fq0.r(appId);
            com.tencent.mars.xlog.Log.i(getTag(), "create AppContext#" + rVar.f265464b + ": " + appId);
            hashMap.put(appId, rVar);
            t1(rVar);
        }
        hq0.e0 e0Var = new hq0.e0(this, appId, rVar.f265464b, path, query, b17, weakReference, z18);
        e0Var.f282986g = z17;
        com.tencent.mars.xlog.Log.i(getTag(), "create FrameSetRoot#" + b17 + ": " + appId);
        v1(e0Var);
        this.f283001p.put(e0Var.f282984e, e0Var);
        return e0Var;
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        java.lang.String str;
        fq0.x V0;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewDestroy canvasId:" + i17);
        hq0.k0 k0Var = this.f282998m;
        hq0.j0 j0Var = (hq0.j0) k0Var.f283028a.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (str = j0Var.f283013b) == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b(str, "") && (V0 = V0(str)) != null) {
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = V0.f265488l;
            if (magicSclViewContainer != null) {
                magicSclViewContainer.removeView(view);
            }
            com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewDestroy frameSetId:" + str + " remove canvasId:" + i17);
        }
    }

    public void b1() {
        com.tencent.mars.xlog.Log.e(getTag(), "onConnException");
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this.f283007v);
    }

    public void c(int i17, boolean z17) {
        jz5.f0 f0Var;
        fq0.x S0 = S0(i17);
        if (S0 != null) {
            java.lang.String bizName = O0();
            mq0.a1 a1Var = this.f283006u;
            a1Var.getClass();
            kotlin.jvm.internal.o.g(bizName, "bizName");
            a1Var.a(new mq0.x0(a1Var, S0, bizName));
        }
        hq0.j0 a17 = this.f282998m.a(i17);
        if (a17 != null) {
            a17.f283023l = true;
            if (!z17 && a17.f283024m) {
                com.tencent.mars.xlog.Log.i(getTag(), "draw on off screen and surfaceAvailable! redraw now " + i17 + ' ' + S0);
                if (S0 != null) {
                    S0.f();
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    a17.f283021j = true;
                }
            }
        }
        java.lang.String tag = getTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewFirstFrameRendered canvasId:");
        sb6.append(i17);
        sb6.append(" frameSetName:");
        sb6.append(S0 != null ? S0.f265477a : null);
        sb6.append(" surfaceReady:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
    }

    public void destroy() {
        com.tencent.mars.xlog.Log.i(getTag(), "cleanup");
        for (java.util.Map.Entry entry : this.f283001p.entrySet()) {
            kotlin.jvm.internal.o.d(entry);
            ((hq0.e0) entry.getValue()).c();
        }
        this.f282996h.clear();
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).destroy();
        }
        this.f283005t = false;
        jc3.j0 j0Var2 = this.f282995g;
        if (j0Var2 != null) {
            synchronized (j0Var2) {
                this.f282997i = false;
            }
            ((com.tencent.mm.plugin.magicbrush.i6) ((com.tencent.mm.plugin.magicbrush.g4) i95.n0.c(com.tencent.mm.plugin.magicbrush.g4.class))).Di(((rc3.w0) j0Var2).f394087e, com.tencent.mm.plugin.magicbrush.z4.f148219d);
        }
        this.f282995g = null;
        this.f282998m.f283028a.clear();
        this.f282999n.clear();
        this.f283000o.clear();
        this.f283001p.clear();
        mq0.a1 a1Var = this.f283006u;
        a1Var.getClass();
        a1Var.a(new mq0.z0(a1Var));
    }

    public boolean g1() {
        android.app.Activity B0 = B0();
        if (B0 == null) {
            B0 = B1();
        }
        return B0 != null;
    }

    public final java.lang.String getTag() {
        return "MicroMsg.MagicSclBaseBiz." + O0() + ".SCL";
    }

    public final void m1() {
        if (this.f283005t || g1()) {
            kc3.f fVar = this.f283004s;
            if (fVar != null) {
                ym5.a1.f(new com.tencent.mm.plugin.magicbrush.r5((com.tencent.mm.plugin.magicbrush.s5) fVar));
                return;
            } else {
                kotlin.jvm.internal.o.o("autoPauseExt");
                throw null;
            }
        }
        kc3.f fVar2 = this.f283004s;
        if (fVar2 != null) {
            ym5.a1.f(new com.tencent.mm.plugin.magicbrush.o5((com.tencent.mm.plugin.magicbrush.s5) fVar2));
        } else {
            kotlin.jvm.internal.o.o("autoPauseExt");
            throw null;
        }
    }

    public void n() {
        com.tencent.mars.xlog.Log.i(getTag(), "onMainScriptInjected");
        m1();
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            synchronized (j0Var) {
                for (hq0.f0 f0Var : this.f282996h) {
                    ((rc3.w0) j0Var).k(f0Var.f282989a, f0Var.f282990b);
                    int i17 = 200;
                    if (kotlin.jvm.internal.o.b(f0Var.f282989a, "surface:frameSetRoot:dataChange")) {
                        getTag();
                        java.lang.String str = f0Var.f282990b;
                        int length = str.length();
                        if (length <= 200) {
                            i17 = length;
                        }
                        kotlin.jvm.internal.o.f(str.substring(0, i17), "substring(...)");
                    } else if (!f282993w.contains(f0Var.f282989a)) {
                        java.lang.String tag = getTag();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("sendEvent pending:");
                        sb6.append(f0Var.f282989a);
                        sb6.append(" value:");
                        java.lang.String str2 = f0Var.f282990b;
                        int length2 = str2.length();
                        if (length2 <= 200) {
                            i17 = length2;
                        }
                        java.lang.String substring = str2.substring(0, i17);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        sb6.append(substring);
                        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                    }
                }
                this.f282996h.clear();
                this.f282997i = true;
            }
        }
    }

    public void onCreated() {
        com.tencent.mars.xlog.Log.i(getTag(), "onCreated");
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.addLifecycleCallback(this.f283007v);
    }

    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i(getTag(), "onDestroy reason:" + i17);
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(this.f283007v);
    }

    public void onPause() {
        com.tencent.mars.xlog.Log.i(getTag(), "onPause");
    }

    public void onResume() {
        com.tencent.mars.xlog.Log.i(getTag(), "onResume");
    }

    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        qq0.m mVar = (qq0.m) ((qq0.i) i95.n0.c(qq0.i.class));
        java.lang.String str = frameSet.f265480d;
        boolean Bi = mVar.Bi(str);
        java.lang.String str2 = frameSet.f265478b;
        boolean Ai = Bi ? ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, str2) : false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("frameSetRootId", root.f282984e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", str2);
        jSONObject2.put("viewId", frameSet.f265492p);
        jSONObject2.put("frameSetName", frameSet.f265477a);
        jSONObject2.put("width", frameSet.f265482f);
        jSONObject2.put("height", frameSet.f265483g);
        jSONObject2.put("info", info);
        jSONObject2.put("needSnapShotImage", Bi && !Ai);
        if (Bi) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bizName", str);
            jSONObject3.put("frameSetId", str2);
            jSONObject2.put("needSnapShotImageExtInfo", jSONObject3);
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject4 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        l0Var.a("surface:frameSet:available", jSONObject4);
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:available", jSONObject4, null, 1.0E-5f, 8, null);
    }

    public void start() {
        com.tencent.mars.xlog.Log.i(getTag(), "start");
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).start();
        }
    }

    public void t1(fq0.r appContext) {
        kotlin.jvm.internal.o.g(appContext, "appContext");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", appContext.f265463a);
        jSONObject.put("appContextId", appContext.f265464b);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:appContext:available", jSONObject2);
    }

    public void v1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("appContextId", root.f282981b);
        jSONObject.put("frameSetRootId", root.f282984e);
        jSONObject.put("useClientClick", root.f282986g);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, root.f282982c);
        jSONObject2.put("query", root.f282983d);
        jSONObject.put("launchInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:available", jSONObject3, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:available", jSONObject3);
    }

    @Override // jc3.h0
    public void v9(int i17) {
        com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewSurfaceAvailable canvasId:" + i17);
        hq0.j0 a17 = this.f282998m.a(i17);
        jz5.f0 f0Var = null;
        if (a17 != null) {
            a17.f283024m = true;
            boolean z17 = a17.f283023l;
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (z17) {
                fq0.x S0 = S0(i17);
                com.tencent.mars.xlog.Log.i(getTag(), "firstFrame before available, redraw " + i17 + ' ' + S0);
                if (S0 != null) {
                    S0.f();
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    a17.f283021j = true;
                }
            }
            if (a17.f283022k) {
                a17.f283022k = false;
                fq0.x S02 = S0(i17);
                com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewSurfaceAvailable canvas.surfaceDestroyNeedRedraw, redraw " + i17 + ' ' + S02);
                if (S02 != null) {
                    S02.f();
                }
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(getTag(), "onCanvasViewSurfaceAvailable but canvas not found? " + i17);
        }
    }

    public void w1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("frameSetRootId", root.f282984e);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:destroyed", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:destroyed", jSONObject2);
    }

    public void x1(hq0.e0 root, fq0.x frameSet) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        qq0.m mVar = (qq0.m) ((qq0.i) i95.n0.c(qq0.i.class));
        java.lang.String str = frameSet.f265480d;
        boolean Bi = mVar.Bi(str);
        boolean z17 = false;
        java.lang.String str2 = frameSet.f265478b;
        boolean Ai = Bi ? ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(str, str2) : false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("frameSetRootId", root.f282984e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", str2);
        jSONObject2.put("viewId", frameSet.f265492p);
        jSONObject2.put("frameSetName", frameSet.f265477a);
        jSONObject2.put("width", frameSet.f265482f);
        jSONObject2.put("height", frameSet.f265483g);
        if (Bi && !Ai) {
            z17 = true;
        }
        jSONObject2.put("needSnapShotImage", z17);
        if (Bi) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bizName", str);
            jSONObject3.put("frameSetId", str2);
            jSONObject2.put("needSnapShotImageExtInfo", jSONObject3);
        }
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject4 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        l0Var.a("surface:frameSet:init", jSONObject4);
    }

    public void x5() {
        com.tencent.mars.xlog.Log.i(getTag(), "onServiceReady");
    }

    public void y1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        hq0.l0 l0Var = this.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", root.f282980a);
        jSONObject.put("frameSetRootId", root.f282984e);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String d17 = root.d();
        je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSetRoot:pause", jSONObject2, null, 1.0E-5f, 8, null);
        l0Var.a("surface:frameSetRoot:pause", jSONObject2);
    }

    @Override // jc3.h0
    public void zf(int i17) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewSurfaceDestroy canvasId:" + i17);
        hq0.j0 a17 = this.f282998m.a(i17);
        if (a17 != null) {
            a17.f283022k = true;
            com.tencent.mars.xlog.Log.i(getTag(), "onCanvasViewSurfaceDestroy canvasId:" + i17 + " surfaceDestroyNeedRedraw");
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(getTag(), "onCanvasViewSurfaceDestroy but canvas not found? " + i17);
        }
    }
}
