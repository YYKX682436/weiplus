package qd1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f361638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.p f361639g;

    public i(qd1.p pVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f361639g = pVar;
        this.f361636d = e9Var;
        this.f361637e = i17;
        this.f361638f = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361636d;
        java.lang.String appId = e9Var.getAppId();
        int i17 = this.f361637e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowModal", "invoke after runtime initialized appId[%s] callbackId[%d]", appId, java.lang.Integer.valueOf(i17));
        this.f361639g.A(e9Var, this.f361638f, i17);
    }
}
