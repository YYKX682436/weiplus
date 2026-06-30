package t00;

/* loaded from: classes.dex */
public final class e1 implements com.tencent.mm.feature.ecs.share.a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f414276a;

    /* renamed from: b, reason: collision with root package name */
    public c00.n3 f414277b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f414278c;

    public final void a(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (!(str == null || r26.n0.N(str))) {
            jSONObject.putOpt("encryptUserName", str);
        }
        jSONObject.putOpt("relayParams", this.f414276a);
        v00.a aVar = new v00.a(f10.a.f258542d, jSONObject);
        c00.n3 n3Var = this.f414277b;
        if (n3Var != null) {
            n3Var.c(aVar);
        }
    }
}
