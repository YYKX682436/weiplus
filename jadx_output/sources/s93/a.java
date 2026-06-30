package s93;

/* loaded from: classes.dex */
public final class a implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s93.b f405007a;

    public a(s93.b bVar) {
        this.f405007a = bVar;
    }

    @Override // c00.n3
    public void a() {
        this.f405007a.f143443f.a("onFail");
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiHandleEcsAction", "onFail");
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        s93.b bVar = this.f405007a;
        if (jSONObject != null) {
            bVar.f143443f.c(jSONObject, false);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            bVar.f143443f.d(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiHandleEcsAction", "onSuc: " + jSONObject);
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        s93.b bVar = this.f405007a;
        if (jSONObject != null) {
            bVar.f143443f.a(jSONObject.toString());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            bVar.f143443f.a("onFail");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiHandleEcsAction", "onFail: " + jSONObject);
    }

    @Override // c00.n3
    public void onCancel() {
        this.f405007a.f143443f.a("onCancel");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiHandleEcsAction", "onCancel");
    }
}
