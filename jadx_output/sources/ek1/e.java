package ek1;

/* loaded from: classes.dex */
public final class e implements l81.p0 {
    public e(int i17, int[] iArr) {
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("showOrderEntrance", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.WeAppNativeExtraDataWeUse", th6, "toJsonString", new java.lang.Object[0]);
            return "{}";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek1.e)) {
            return false;
        }
        ((ek1.e) obj).getClass();
        return kotlin.jvm.internal.o.b(null, null);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(1) * 31) + 0;
    }

    public java.lang.String toString() {
        return a();
    }
}
