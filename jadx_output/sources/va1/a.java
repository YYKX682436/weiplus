package va1;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lva1/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString("audits_instanceid") : null;
        if (bundle != null) {
            bundle.getString("audits_appid");
        }
        long j17 = bundle != null ? bundle.getLong("audits_app_start_time") : 0L;
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.List<com.tencent.mm.plugin.appbrand.performance.l> list = (java.util.List) va1.b.f434230b.get(string);
        if (list != null) {
            for (com.tencent.mm.plugin.appbrand.performance.l lVar : list) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuditsUtil", "event is : " + lVar);
                java.lang.String str = lVar.f87359d + "," + lVar.f87357b + "," + lVar.f87358c + "," + (lVar.f87360e - j17) + "," + (lVar.f87361f - j17) + "," + lVar.f87362g;
                kotlin.jvm.internal.o.f(str, "toString(...)");
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandAuditsUtil", "get empty event from audits extra data");
        } else {
            bundle2.putStringArrayList("audits_trace_event_list", arrayList);
            va1.b.f434230b.remove(string);
        }
        return bundle2;
    }
}
