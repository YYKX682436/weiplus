package md3;

/* loaded from: classes.dex */
public final class k implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.l f325856a;

    public k(md3.l lVar) {
        this.f325856a = lVar;
    }

    @Override // c00.n3
    public void a() {
        md3.l lVar = this.f325856a;
        yz5.l s17 = lVar.s();
        lc3.a0 a0Var = new lc3.a0(new java.util.HashMap());
        lVar.m(a0Var);
        a0Var.put("errMsg", "onFail");
        s17.invoke(a0Var);
        com.tencent.mars.xlog.Log.e("MBJsApiHandleEcsAction", "onFail");
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        md3.l lVar = this.f325856a;
        if (jSONObject != null) {
            yz5.l s17 = lVar.s();
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            lc3.a0 a0Var = new lc3.a0(jSONObject2);
            lVar.m(a0Var);
            s17.invoke(a0Var);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.s().invoke(lVar.k());
        }
        com.tencent.mars.xlog.Log.i("MBJsApiHandleEcsAction", "onSuc: " + jSONObject);
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        iq0.c cVar;
        kotlin.jvm.internal.o.g(event, "event");
        lc3.e eVar = this.f325856a.f317890a;
        jz5.f0 f0Var = null;
        android.content.ComponentCallbacks2 B0 = eVar != null ? eVar.B0() : null;
        c00.h4 h4Var = B0 instanceof c00.h4 ? (c00.h4) B0 : null;
        if (h4Var != null && (cVar = ((com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI) h4Var).f65839h) != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("onEcsEvent", ((v00.a) event).a()));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((v00.a) event).f432193a.getClass();
            com.tencent.mars.xlog.Log.e("MBJsApiHandleEcsAction", "sendEvent: EcsEventActionShareDialogHandle with out biz handler");
        }
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            md3.l lVar = this.f325856a;
            yz5.l s17 = lVar.s();
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            lc3.a0 a0Var = new lc3.a0(jSONObject2);
            lVar.m(a0Var);
            a0Var.put("errMsg", "onFail");
            s17.invoke(a0Var);
        }
        com.tencent.mars.xlog.Log.e("MBJsApiHandleEcsAction", "onFail: " + jSONObject);
    }

    @Override // c00.n3
    public void onCancel() {
        md3.l lVar = this.f325856a;
        yz5.l s17 = lVar.s();
        lc3.a0 a0Var = new lc3.a0(new java.util.HashMap());
        lVar.m(a0Var);
        a0Var.put("errMsg", "onCancel");
        s17.invoke(a0Var);
        com.tencent.mars.xlog.Log.i("MBJsApiHandleEcsAction", "onCancel");
    }
}
