package sg0;

/* loaded from: classes.dex */
public final class s1 implements q80.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407804c;

    public s1(int i17, kotlin.jvm.internal.h0 h0Var, yz5.l lVar) {
        this.f407802a = i17;
        this.f407803b = h0Var;
        this.f407804c = lVar;
    }

    @Override // q80.a0
    public void onStoreSendResult(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        if (i17 == this.f407802a) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this);
            kotlin.jvm.internal.h0 h0Var = this.f407803b;
            org.json.JSONObject jSONObject = (org.json.JSONObject) h0Var.f310123d;
            if (str2 == null) {
                str2 = "type";
            }
            jSONObject.put("type", str2);
            ((org.json.JSONObject) h0Var.f310123d).put("result", obj);
            ((org.json.JSONObject) h0Var.f310123d).put("err_code", 0);
            ((org.json.JSONObject) h0Var.f310123d).put("err_msg", "dispatchLiteAppAction:ok");
            this.f407804c.invoke(h0Var.f310123d);
        }
    }

    @Override // q80.a0
    public void onStoreSetData(java.lang.String str, java.util.Map map) {
    }
}
