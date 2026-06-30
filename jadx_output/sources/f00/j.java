package f00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf00/j;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class j implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("EcsProductWxaCoverWidget", "createWidget data:" + iPCString.f68406d);
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new f00.i(com.tencent.mm.sdk.platformtools.t8.E1(jSONObject.optString("productId")), jSONObject.optString("finderUsername"), jSONObject.optInt("reqType"), callback, null), 3, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsProductWxaCoverWidget", th6, "FetchDataTask parse data failed", new java.lang.Object[0]);
            callback.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
        }
    }
}
