package hq0;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282980a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282981b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f282982c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f282983d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f282984e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f282985f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f282986g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f282987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq0.i0 f282988i;

    public e0(hq0.i0 i0Var, java.lang.String appId, java.lang.String appContextId, java.lang.String path, java.lang.String query, java.lang.String id6, java.lang.ref.WeakReference wkContext, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appContextId, "appContextId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(wkContext, "wkContext");
        this.f282988i = i0Var;
        this.f282980a = appId;
        this.f282981b = appContextId;
        this.f282982c = path;
        this.f282983d = query;
        this.f282984e = id6;
        this.f282985f = new java.util.concurrent.ConcurrentHashMap();
        this.f282987h = z17;
    }

    public static void b(hq0.e0 e0Var, java.lang.String data, java.lang.String frameSetName, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        e0Var.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        cl0.g gVar = new cl0.g();
        gVar.h("frameSetName", frameSetName);
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, data);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        e0Var.a(gVar2, str);
    }

    public final void a(java.lang.String data, java.lang.String str) {
        kotlin.jvm.internal.o.g(data, "data");
        hq0.i0 i0Var = this.f282988i;
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", this.f282980a);
        jSONObject.put("frameSetRootId", this.f282984e);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, data);
        if (str == null) {
            str = "";
        }
        jSONObject.put("extInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:frameSetRoot:dataChange", jSONObject2);
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i(this.f282988i.getTag(), "FrameSetRoot#" + this.f282984e + " destroy: " + this.f282980a);
        java.util.LinkedList<fq0.x> linkedList = new java.util.LinkedList(this.f282985f.values());
        hq0.i0 i0Var = this.f282988i;
        for (fq0.x xVar : linkedList) {
            xVar.i();
            com.tencent.mars.xlog.Log.i(i0Var.getTag(), "frameSetWithRoot unBind " + xVar.f265478b);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(this.f282988i.f282999n.values());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList2) {
            if (kotlin.jvm.internal.o.b(((fq0.x) obj).f265479c, this)) {
                arrayList.add(obj);
            }
        }
        hq0.i0 i0Var2 = this.f282988i;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fq0.x xVar2 = (fq0.x) it.next();
            mq0.d1 d1Var = mq0.d1.f330546a;
            java.lang.String frameSetId = xVar2.f265478b;
            synchronized (d1Var) {
                kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
                if (((mq0.b1) mq0.d1.f330547b.remove(frameSetId)) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "removeFrameSetInfo ".concat(frameSetId));
                }
            }
            fq0.z zVar = (fq0.z) ((gq0.r) i95.n0.c(gq0.r.class));
            zVar.getClass();
            zVar.f265495e.remove(xVar2.f265478b);
            i0Var2.f282999n.remove(xVar2.f265478b);
        }
        this.f282988i.w1(this);
        this.f282985f.clear();
    }

    public final java.lang.String d() {
        java.lang.String str;
        jc3.j0 j0Var = this.f282988i.f282995g;
        return (j0Var == null || (str = ((rc3.w0) j0Var).f394087e) == null) ? "" : str;
    }

    public final jz5.l e(java.lang.String frameSetName) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        java.lang.String a17 = vq0.a.a(this.f282984e, frameSetName);
        fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(a17);
        if (Ai != null) {
            return new jz5.l(Ai, java.lang.Boolean.FALSE);
        }
        fq0.x wi6 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).wi(new fq0.x(frameSetName, a17, this, d(), null, null, 0, 0, 240, null));
        com.tencent.mars.xlog.Log.i(this.f282988i.getTag(), "create new frameSet: " + wi6);
        return new jz5.l(wi6, java.lang.Boolean.TRUE);
    }

    public final void f() {
        hq0.i0 i0Var = this.f282988i;
        com.tencent.mars.xlog.Log.i(i0Var.getTag(), "FrameSetRoot#" + this.f282984e + " pause: " + this.f282980a);
        i0Var.y1(this);
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i(this.f282988i.getTag(), "FrameSetRoot#" + this.f282984e + " reDraw: " + this.f282980a);
        java.util.Collection<fq0.x> values = this.f282985f.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (fq0.x xVar : values) {
            kotlin.jvm.internal.o.d(xVar);
            h(xVar);
        }
    }

    public final void h(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        hq0.i0 i0Var = this.f282988i;
        com.tencent.mars.xlog.Log.i(i0Var.getTag(), "redraw " + frameSet);
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameSetRootId", this.f282984e);
        jSONObject.put("frameSetId", frameSet.f265478b);
        jSONObject.put("viewId", frameSet.f265492p);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        l0Var.a("surface:frameSet:redraw", jSONObject2);
    }

    public final void i(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        com.tencent.mars.xlog.Log.i(this.f282988i.getTag(), "resize " + frameSet);
        hq0.i0 i0Var = this.f282988i;
        i0Var.getClass();
        hq0.l0 l0Var = i0Var.f282994f;
        l0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameSetRootId", this.f282984e);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("frameSetId", frameSet.f265478b);
        jSONObject2.put("viewId", frameSet.f265492p);
        jSONObject2.put("frameSetName", frameSet.f265477a);
        jSONObject2.put("width", frameSet.f265482f);
        jSONObject2.put("height", frameSet.f265483g);
        jSONArray.put(jSONObject2);
        jSONObject.put("frameSets", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        l0Var.a("surface:frameSet:resize", jSONObject3);
        hq0.f fVar = this.f282988i.f283002q;
        if (fVar != null) {
            long b17 = vp0.b.b(java.lang.Integer.valueOf(frameSet.f265482f));
            long b18 = vp0.b.b(java.lang.Integer.valueOf(frameSet.f265483g));
            dq0.q qVar = ((dq0.a0) fVar).f242288d;
            qVar.getClass();
            java.lang.String viewGroupId = frameSet.f265478b;
            kotlin.jvm.internal.o.g(viewGroupId, "viewGroupId");
            com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "onViewGroupResize viewGroupId: " + viewGroupId + ", size = (" + b17 + ", " + b18 + ')');
            if (qVar.f242325d) {
                com.tencent.wechat.zidl.MagicBrushResponseCaller magicBrushResponseCaller = (com.tencent.wechat.zidl.MagicBrushResponseCaller) com.tencent.zidl2.ZidlBrushApiManagerCaller.getInstance().getPropMagicBrushResponse();
                if (magicBrushResponseCaller != null) {
                    magicBrushResponseCaller.onViewStyleChanged(viewGroupId, 0, 0, (int) b17, (int) b18);
                }
            } else {
                com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse magicBrushResponse = qVar.f242327f;
                if (magicBrushResponse != null) {
                    magicBrushResponse.onViewStyleChanged(viewGroupId, 0L, 0L, b17, b18, dq0.p.f242324d);
                }
            }
        }
        if (this.f282988i.f283003r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onFrameSetResize frameSet:" + frameSet);
        }
        tq0.e eVar = (tq0.e) i95.n0.c(tq0.e.class);
        java.lang.String bizName = frameSet.f265480d;
        java.lang.String frameSetId = frameSet.f265478b;
        int i17 = frameSet.f265483g;
        ((sq0.f) eVar).getClass();
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        java.lang.String c17 = vq0.b.c(bizName);
        if (kotlin.jvm.internal.o.b(c17, "MagicWxGameDynamicCard") || kotlin.jvm.internal.o.b(c17, "MagicEcsKFDynamicCard")) {
            com.tencent.mars.xlog.Log.i("MagicSclPlaceHolderService.SCL", "updateHeight, bizName: " + bizName + ", frameSetId: " + frameSetId + ", dpHeight: " + i17);
            ((ku5.t0) ku5.t0.f312615d).r(new sq0.e(i17, bizName, frameSetId), "MagicSclPlaceHolderService.SCL");
        }
    }

    public final void j() {
        hq0.i0 i0Var = this.f282988i;
        com.tencent.mars.xlog.Log.i(i0Var.getTag(), "FrameSetRoot#" + this.f282984e + " resume: " + this.f282980a);
        i0Var.A1(this);
    }
}
