package yc1;

/* loaded from: classes7.dex */
public abstract class b extends com.tencent.mm.plugin.appbrand.jsapi.a1 implements gb1.m {

    /* renamed from: g, reason: collision with root package name */
    public final gb1.a f460761g = new gb1.a();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String A(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        final java.lang.String taskId = getTaskId();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(a(), taskId);
        this.f460761g.f269975a.put(taskId, c0Var);
        B(lVar, taskId);
        qu5.a asyncHandler = lVar.getAsyncHandler();
        if (asyncHandler != null) {
            asyncHandler.post(new java.lang.Runnable() { // from class: yc1.b$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yc1.b.this.d(lVar, jSONObject, taskId);
                }
            });
        } else {
            d(lVar, jSONObject, taskId);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        return t("ok", hashMap);
    }

    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return A(lVar, jSONObject, lVar.getJsRuntime());
    }
}
