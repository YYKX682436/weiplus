package yc1;

/* loaded from: classes7.dex */
public abstract class c extends com.tencent.mm.plugin.appbrand.jsapi.f implements gb1.m {

    /* renamed from: g, reason: collision with root package name */
    public final gb1.a f460776g = new gb1.a();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        java.lang.String taskId = getTaskId();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), taskId);
        this.f460776g.f269975a.put(taskId, c0Var);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
        d(lVar, jSONObject, taskId);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
