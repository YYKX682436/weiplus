package s93;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls93/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiHandleEcsAction", "invoke: " + jSONObject);
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        if (r3Var != null) {
            android.content.Context c17 = c();
            if (c17 == null) {
                c17 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context = c17;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            ((b00.m2) r3Var).Bi(4, context, jSONObject, new s93.a(this), null);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
