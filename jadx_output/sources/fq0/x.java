package fq0;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265477a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f265478b;

    /* renamed from: c, reason: collision with root package name */
    public final hq0.e0 f265479c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265480d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f265481e;

    /* renamed from: f, reason: collision with root package name */
    public int f265482f;

    /* renamed from: g, reason: collision with root package name */
    public int f265483g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f265484h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f265485i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f265486j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene f265487k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f265488l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265489m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f265490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f265491o;

    /* renamed from: p, reason: collision with root package name */
    public int f265492p;

    public x(java.lang.String name, java.lang.String id6, hq0.e0 e0Var, java.lang.String bizName, java.util.concurrent.CopyOnWriteArraySet canvasIds, java.lang.String processName, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        e0Var = (i19 & 4) != 0 ? null : e0Var;
        canvasIds = (i19 & 16) != 0 ? new java.util.concurrent.CopyOnWriteArraySet() : canvasIds;
        if ((i19 & 32) != 0) {
            processName = bm5.f1.a();
            kotlin.jvm.internal.o.f(processName, "getProcessName(...)");
        }
        i17 = (i19 & 64) != 0 ? 0 : i17;
        i18 = (i19 & 128) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(canvasIds, "canvasIds");
        kotlin.jvm.internal.o.g(processName, "processName");
        this.f265477a = name;
        this.f265478b = id6;
        this.f265479c = e0Var;
        this.f265480d = bizName;
        this.f265481e = canvasIds;
        this.f265482f = i17;
        this.f265483g = i18;
        this.f265486j = true;
        this.f265487k = com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.NoPreload;
    }

    public final void a() {
        if (this.f265491o) {
            return;
        }
        this.f265491o = true;
        hq0.e0 e0Var = this.f265479c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f282988i;
            java.lang.String tag = i0Var.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach frameSet#");
            java.lang.String str = this.f265478b;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            hq0.l0 l0Var = i0Var.f282994f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", e0Var.f282980a);
            jSONObject.put("frameSetRootId", e0Var.f282984e);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("frameSetId", str);
            jSONObject2.put("viewId", this.f265492p);
            jSONObject2.put("frameSetName", this.f265477a);
            jSONArray.put(jSONObject2);
            jSONObject.put("frameSets", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            l0Var.a("surface:frameSet:attach", jSONObject3);
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String d17 = e0Var.d();
            je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:attach", jSONObject3, null, 1.0E-5f, 8, null);
        }
    }

    public final void b() {
        hq0.e0 e0Var = this.f265479c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f282988i;
            com.tencent.mars.xlog.Log.i(i0Var.getTag(), "FrameSetRoot#" + e0Var.f282984e + " bind: " + this);
            mq0.a1 a1Var = i0Var.f283006u;
            a1Var.getClass();
            a1Var.a(new mq0.y0(a1Var, this));
            fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this);
            java.util.HashMap hashMap = i0Var.f282999n;
            java.lang.String str = wi6.f265478b;
            hashMap.put(str, wi6);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e0Var.f282985f;
            if (concurrentHashMap.containsKey(str)) {
                com.tencent.mars.xlog.Log.i(i0Var.getTag(), wi6 + " already bound!");
            } else {
                com.tencent.mars.xlog.Log.i(i0Var.getTag(), "onBind " + wi6);
                concurrentHashMap.put(str, wi6);
                i0Var.s1(e0Var, wi6, "");
                wi6.f265489m = true;
            }
            if (wi6.f265482f <= 0 || wi6.f265483g <= 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i(i0Var.getTag(), "frameSet layout, notify size now: " + wi6);
            d75.b.g(new hq0.c0(e0Var, wi6));
        }
    }

    public final void c() {
        if (this.f265491o) {
            this.f265491o = false;
            hq0.e0 e0Var = this.f265479c;
            if (e0Var != null) {
                hq0.i0 i0Var = e0Var.f282988i;
                java.lang.String tag = i0Var.getTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detach frameSet#");
                java.lang.String str = this.f265478b;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                hq0.l0 l0Var = i0Var.f282994f;
                l0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", e0Var.f282980a);
                jSONObject.put("frameSetRootId", e0Var.f282984e);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("frameSetId", str);
                jSONObject2.put("viewId", this.f265492p);
                jSONObject2.put("frameSetName", this.f265477a);
                jSONArray.put(jSONObject2);
                jSONObject.put("frameSets", jSONArray);
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                l0Var.a("surface:frameSet:detach", jSONObject3);
                i95.m c17 = i95.n0.c(je3.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String d17 = e0Var.d();
                je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:detach", jSONObject3, null, 1.0E-5f, 8, null);
            }
        }
    }

    public final void d() {
        hq0.e0 e0Var = this.f265479c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f282988i;
            com.tencent.mars.xlog.Log.i(i0Var.getTag(), "FrameSetRoot#" + e0Var.f282984e + " init: " + this.f265478b);
            fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this);
            if (wi6.f265490n) {
                return;
            }
            i0Var.f282999n.put(wi6.f265478b, wi6);
            wi6.f265490n = true;
            i0Var.x1(e0Var, wi6);
        }
    }

    public final boolean e() {
        hq0.e0 e0Var = this.f265479c;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f282985f.containsKey(((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(this).f265478b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(fq0.x.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.MagicSclFrameSet");
        return kotlin.jvm.internal.o.b(this.f265478b, ((fq0.x) obj).f265478b);
    }

    public final void f() {
        hq0.e0 e0Var;
        if (this.f265489m && (e0Var = this.f265479c) != null) {
            e0Var.h(this);
        }
    }

    public final void g(double d17, double d18) {
        hq0.e0 e0Var = this.f265479c;
        if (e0Var != null) {
            hq0.i0 i0Var = e0Var.f282988i;
            i0Var.getClass();
            hq0.l0 l0Var = i0Var.f282994f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("frameSetRootId", e0Var.f282984e);
            jSONObject.put("frameSetId", this.f265478b);
            jSONObject.put("frameSetName", this.f265477a);
            jSONObject.put("offsetHeight", d17);
            jSONObject.put("offsetTop", d18);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            l0Var.a("surface:frameSet:scroll", jSONObject2);
        }
    }

    public final void h(com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer) {
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer2 = this.f265488l;
        if (kotlin.jvm.internal.o.b(magicSclViewContainer, magicSclViewContainer2)) {
            f();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", "setViewContainer " + magicSclViewContainer + " for " + this + ' ');
        this.f265488l = magicSclViewContainer;
        if (this.f265489m) {
            if (magicSclViewContainer2 != null) {
                magicSclViewContainer2.d();
            }
            pm0.v.X(new fq0.w(this, magicSclViewContainer));
            f();
        }
    }

    public int hashCode() {
        return this.f265478b.hashCode();
    }

    public final void i() {
        if (this.f265489m) {
            hq0.e0 e0Var = this.f265479c;
            if (e0Var != null) {
                hq0.i0 i0Var = e0Var.f282988i;
                java.lang.String tag = i0Var.getTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FrameSetRoot#");
                java.lang.String str = e0Var.f282984e;
                sb6.append(str);
                sb6.append(" unbind: ");
                sb6.append(this);
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                java.util.HashMap hashMap = i0Var.f282999n;
                java.lang.String str2 = this.f265478b;
                hashMap.remove(str2);
                e0Var.f282985f.remove(str2);
                fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
                zVar.getClass();
                zVar.f265495e.remove(str2);
                hq0.l0 l0Var = i0Var.f282994f;
                l0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("frameSetRootId", str);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("frameSetId", str2);
                jSONObject2.put("viewId", this.f265492p);
                jSONObject2.put("frameSetName", this.f265477a);
                jSONArray.put(jSONObject2);
                jSONObject.put("frameSets", jSONArray);
                java.lang.String jSONObject3 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                i95.m c17 = i95.n0.c(je3.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String d17 = e0Var.d();
                je3.i.t8((je3.i) c17, r26.n0.s0(d17, "-", d17), "surface:frameSet:destroyed", jSONObject3, null, 1.0E-5f, 8, null);
                l0Var.a("surface:frameSet:destroyed", jSONObject3);
                int i17 = this.f265492p;
                com.tencent.mars.xlog.Log.i("MBDynamicBizContext", "removeCustomView,viewId:" + i17);
                i0Var.f317919d.b(i17);
            }
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f265488l;
            if (magicSclViewContainer != null) {
                magicSclViewContainer.d();
            }
            this.f265484h = null;
            this.f265485i = null;
            this.f265489m = false;
        }
    }

    public final void j(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclFrameSet.SCL", "updateSize name:" + this.f265477a + ' ' + i17 + " x " + i18);
        pm0.v.X(new fq0.v(this, i17, i18));
    }

    public java.lang.String toString() {
        return "MagicSclFrameSet(" + super.hashCode() + " name='" + this.f265477a + "', bizName='" + this.f265480d + "', id='" + this.f265478b + "', canvasIds=" + fq0.a0.a(this.f265481e) + ", container=" + this.f265488l + ", isClip=" + this.f265486j + ", size=" + this.f265482f + 'x' + this.f265483g + " root=" + this.f265479c + ", pScene=" + this.f265487k + ", init=" + this.f265490n + ", bound=" + this.f265489m + ')';
    }
}
