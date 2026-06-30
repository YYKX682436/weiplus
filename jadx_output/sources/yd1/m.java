package yd1;

/* loaded from: classes7.dex */
public class m implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd1.j f461008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f461011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd1.o f461013f;

    public m(yd1.o oVar, yd1.j jVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f461013f = oVar;
        this.f461008a = jVar;
        this.f461009b = c0Var;
        this.f461010c = str;
        this.f461011d = i17;
        this.f461012e = str2;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f461013f.k() + ":" + str);
            if (i18 == 0) {
                ik1.b0 b0Var = new ik1.b0();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f461008a.f461003a);
                if (this.f461009b.getFileSystem().createTempFileFrom(r6Var, this.f461010c, true, b0Var) != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                    this.f461009b.a(this.f461011d, this.f461013f.o(java.lang.String.format("fail: createTempFileFrom fail %s", this.f461012e)));
                    return;
                } else {
                    jSONObject.put("tempFilePath", b0Var.f291824a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer, fileName: %s, tempFile: [%s %s %s]", this.f461012e, b0Var.f291824a, r6Var.u(), r6Var.o());
                }
            } else {
                com.tencent.mm.vfs.w6.h(this.f461008a.f461003a);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "exportMediaContainer result: %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f461009b.a(this.f461011d, jSONObject.toString());
    }
}
