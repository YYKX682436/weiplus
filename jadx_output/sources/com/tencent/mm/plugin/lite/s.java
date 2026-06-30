package com.tencent.mm.plugin.lite;

/* loaded from: classes11.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f144164a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f144165b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public long f144166c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.r f144167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f144169f;

    public s() {
        com.tencent.mm.plugin.lite.LiteAppCenter.initLib();
    }

    public static java.lang.Object a(java.lang.String str) {
        if (str.startsWith("{")) {
            return new org.json.JSONObject(str);
        }
        if (str.startsWith("[")) {
            return new org.json.JSONArray(str);
        }
        if (str.equals("true")) {
            return java.lang.Boolean.TRUE;
        }
        if (str.equals("false")) {
            return java.lang.Boolean.FALSE;
        }
        if (!str.equals("null") && !str.equals("undefined")) {
            return (!str.startsWith("\"") || str.length() < 2) ? str.indexOf(".") >= 0 ? java.lang.Double.valueOf(java.lang.Double.parseDouble(str)) : java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)) : str.substring(1, str.length() - 1);
        }
        return null;
    }

    public static java.lang.String b(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return str;
        }
        if (obj instanceof java.util.Map) {
            return new org.json.JSONObject((java.util.Map) obj).toString();
        }
        if (obj instanceof java.util.List) {
            return new org.json.JSONArray((java.util.Collection) obj).toString();
        }
        if (!(obj instanceof java.lang.String)) {
            return obj.toString();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put((java.lang.String) obj);
        java.lang.String jSONArray2 = jSONArray.toString();
        return jSONArray2.substring(1, jSONArray2.length() - 1);
    }

    public void c(long j17, int i17, java.lang.String str) {
        ((java.util.HashSet) this.f144164a).remove(java.lang.String.format("%d_%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.tencent.mm.plugin.lite.LiteAppCenter.storeSendResult(this.f144166c, j17, i17, "json", str);
    }

    public void d(java.util.Map map) {
        int size = map.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        int i17 = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            strArr[i17] = (java.lang.String) entry.getKey();
            java.lang.String b17 = b(entry.getValue(), "");
            strArr2[i17] = b17;
            this.f144165b.put(strArr[i17], b17);
            i17++;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.storeSetData(this.f144166c, this.f144168e, strArr, strArr2);
    }
}
