package d23;

/* loaded from: classes.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f225885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d23.g f225886f;

    public c(java.lang.String str, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, d23.g gVar) {
        this.f225884d = str;
        this.f225885e = lifecycleScope;
        this.f225886f = gVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFTSHotData SceneEnd: ");
            int i17 = aVar.f359285b;
            sb6.append(i17);
            sb6.append(' ');
            int i18 = aVar.f359286c;
            sb6.append(i18);
            sb6.append(' ');
            java.lang.String str2 = aVar.f359287d;
            sb6.append(str2);
            sb6.append(' ');
            r45.ya1 ya1Var = (r45.ya1) aVar.f359289f;
            sb6.append(ya1Var != null ? ya1Var.getString(1) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", sb6.toString());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", i18);
            jSONObject.put("errMsg", str2);
            jSONObject.put("requestId", this.f225884d);
            if (i17 == 0 && i18 == 0) {
                if (ya1Var == null || (str = ya1Var.getString(1)) == null) {
                    str = "{}";
                }
                jSONObject.put("json", str);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f225885e;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new d23.b(this.f225886f, jSONObject, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
