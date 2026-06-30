package j81;

@j95.b
/* loaded from: classes7.dex */
public final class a extends i95.w implements x71.m {

    /* renamed from: d, reason: collision with root package name */
    public int f298138d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298139e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f298140f = new java.util.concurrent.ConcurrentHashMap();

    public void wi(java.lang.String appid) {
        kotlin.jvm.internal.o.g(appid, "appid");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetSessionMgr", "release appid:".concat(appid));
        java.util.Iterator it = this.f298140f.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (kotlin.jvm.internal.o.b(entry.getValue(), appid)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXNetSessionMgr", "key is " + ((java.lang.Number) entry.getKey()).intValue() + ", value is " + ((java.lang.String) entry.getValue()));
                x71.o oVar = (x71.o) this.f298139e.get(entry.getKey());
                if (oVar != null) {
                    oVar.close();
                }
                it.remove();
            }
        }
    }
}
