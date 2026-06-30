package fs5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr5.g0 f266351d;

    public b(fs5.c cVar, tr5.g0 g0Var) {
        this.f266351d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.g0 g0Var = this.f266351d;
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        tr5.q qVar = g0Var.f421493e;
        if (!(qVar instanceof fs5.c)) {
            or5.b.e("lookupResult.stat is not instanceof StatisticsMerge", new java.lang.Object[0]);
            return;
        }
        fs5.c cVar = (fs5.c) qVar;
        bs5.g gVar = cVar.f266358m;
        if (gVar.f24036s) {
            gs5.c.a(g0Var);
        } else if (gs5.f.f275168a.f311560o) {
            if (gVar.f24029i == 2) {
                gs5.f.a("HDNSLookupExpiredAsyncRetry", g0Var);
            } else {
                gs5.f.a("HDNSLookupExpiredAsync", g0Var);
            }
        } else {
            if (gVar.f266349f <= 0 || cVar.f266357i.f266349f <= 0) {
                return;
            }
            if (gVar.f24029i == 2) {
                gs5.f.a("HDNSGetHostByNameRetry", g0Var);
            } else {
                gs5.f.a("HDNSGetHostByName", g0Var);
            }
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(20);
        arrayMap.put("channel", cVar.f266355g);
        arrayMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, cVar.f266352d);
        arrayMap.put("domain", cVar.f266353e);
        if (!cVar.f266354f.equals(cVar.f266353e)) {
            arrayMap.put("request_domain", cVar.f266354f);
        }
        arrayMap.put("net_stack", java.lang.String.valueOf(cVar.f266356h));
        arrayMap.put("ldns_ip", sr5.a.f(cVar.f266357i.f266347d, ","));
        arrayMap.put("ldns_time", java.lang.String.valueOf(cVar.f266357i.f266349f));
        arrayMap.put("isCache", java.lang.String.valueOf(cVar.f266358m.f24036s));
        arrayMap.put("hdns_err_code", java.lang.String.valueOf(cVar.f266358m.f24029i));
        arrayMap.put("hdns_err_msg", cVar.f266358m.f24030m);
        arrayMap.put("hdns_ip", sr5.a.f(cVar.f266358m.f266347d, ","));
        arrayMap.put("ttl", java.lang.String.valueOf(cVar.f266358m.f24032o));
        arrayMap.put("clientIP", cVar.f266358m.f24031n);
        arrayMap.put("hdns_time", java.lang.String.valueOf(cVar.f266358m.f266349f));
        arrayMap.put("hdns_retry", java.lang.String.valueOf(cVar.f266358m.f24035r));
        arrayMap.put("status_code", java.lang.String.valueOf(cVar.f266358m.f24039v));
        arrayMap.put("sdk_Version", "4.11.0a");
        arrayMap.put("appID", gs5.f.f275168a.f311547b);
        arrayMap.put(dm.i4.COL_ID, gs5.f.f275168a.f311548c.f24056b);
        gs5.f.c("HDNSGetHostByName", arrayMap);
    }
}
