package kr5;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311569d;

    public o(java.lang.String str) {
        this.f311569d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String b17 = kr5.c.c().b();
        tr5.e0 e0Var = new tr5.e0();
        e0Var.c(kr5.p.f311570a);
        e0Var.e(this.f311569d);
        e0Var.g(kr5.p.f311571b.f311549d);
        e0Var.d(b17);
        e0Var.f(kr5.p.f311571b.f311548c);
        e0Var.b(kr5.p.f311571b.f311554i);
        e0Var.f421465g = false;
        e0Var.f421466h = kr5.p.f311571b.f311556k;
        e0Var.f421468j = true;
        e0Var.f421470l = true;
        tr5.g0 f17 = tr5.l.f(e0Var.a());
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(16);
        fs5.c cVar = (fs5.c) f17.f421493e;
        if (cVar.f266358m.f24029i == 2) {
            gs5.f.a("HDNSPreLookupRetry", f17);
        } else {
            gs5.f.a("HDNSPreLookup", f17);
        }
        arrayMap.put("channel", gs5.f.f275168a.f311554i);
        arrayMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, cVar.f266352d);
        arrayMap.put("domain", cVar.f266353e);
        arrayMap.put("net_stack", java.lang.String.valueOf(cVar.f266356h));
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
        gs5.f.c("HDNSPreLookup", arrayMap);
    }
}
