package t00;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.h f414281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ef0 f414282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t00.h hVar, bw5.ef0 ef0Var, c00.n3 n3Var) {
        super(1);
        this.f414281d = hVar;
        this.f414282e = ef0Var;
        this.f414283f = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.ff0 it = (bw5.ff0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f414281d.getClass();
        bw5.ef0 model = this.f414282e;
        kotlin.jvm.internal.o.g(model, "model");
        c00.n3 callback = this.f414283f;
        kotlin.jvm.internal.o.g(callback, "callback");
        z20.e eVar = z20.e.f469543e;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "commonCgi";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.c("Native_reqDone");
        bVar.f(model.b());
        bVar.a();
        if (it.getBaseResponse().f376959d == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("respData", (it.f27256f[2] ? it.f27254d : com.tencent.mm.protobuf.g.f192155b).i());
            callback.b(jSONObject);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, it.getBaseResponse().f376959d);
            java.lang.Object obj2 = it.getBaseResponse().f376960e;
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject2.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, obj2);
            callback.d(jSONObject2);
        }
        return jz5.f0.f302826a;
    }
}
