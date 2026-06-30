package pe;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f353591a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f353592b;

    public e(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String str = this.f353592b;
        if (str == null || str.length() == 0) {
            try {
                java.util.HashMap hashMap = this.f353591a;
                java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    arrayList.add(value instanceof org.json.JSONObject ? str2 + '=' + fp.s0.a(value.toString()) : str2 + '=' + value);
                }
                this.f353592b = kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Luggage.ExptMapping", "reportValue::get exception:" + e17);
            }
        }
        java.lang.String str3 = this.f353592b;
        return str3 == null ? "" : str3;
    }
}
