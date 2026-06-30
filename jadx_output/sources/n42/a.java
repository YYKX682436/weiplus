package n42;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f334902a = new java.util.HashMap();

    public a() {
        java.lang.String[] split;
        java.lang.String[] split2;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_name_edge_computing_run_record_" + j62.e.g().n());
        if (M == null) {
            return;
        }
        java.lang.String string = M.getString("mmkv_key_run_record", "");
        if (u46.l.e(string) || (split = string.split(";")) == null || split.length <= 0) {
            return;
        }
        for (java.lang.String str : split) {
            try {
                if (!u46.l.e(str) && (split2 = str.split(",")) != null && split2.length > 0) {
                    ((java.util.HashMap) this.f334902a).put(split2[0], java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.V(split2[1], 0L)));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingRunRecord", "[EdgeComputingConfigRecord] initRecord throw Exception : " + e17.getMessage() + ", rr : " + str);
            }
        }
    }

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_name_edge_computing_run_record_" + j62.e.g().n());
        if (M == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap hashMap = (java.util.HashMap) this.f334902a;
        for (java.lang.String str : hashMap.keySet()) {
            sb6.append(str);
            sb6.append(",");
            sb6.append(hashMap.get(str));
            sb6.append(";");
        }
        M.putString("mmkv_key_run_record", sb6.toString());
    }
}
