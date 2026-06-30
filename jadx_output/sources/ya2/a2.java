package ya2;

/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.ContentValues f460427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.content.ContentValues contentValues) {
        super(0);
        this.f460427d = contentValues;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = "";
        int i17 = 0;
        int i18 = 0;
        for (java.util.Map.Entry entry : ya2.b2.L3.entrySet()) {
            byte[] asByteArray = this.f460427d.getAsByteArray((java.lang.String) entry.getKey());
            if (asByteArray != null) {
                if (!(asByteArray.length == 0)) {
                    java.lang.Object newInstance = ((java.lang.Class) entry.getValue()).newInstance();
                    i17++;
                    try {
                        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        ((com.tencent.mm.protobuf.f) newInstance).parseFrom(asByteArray);
                    } catch (java.lang.Exception unused) {
                        i18++;
                        str = str + newInstance.getClass().getSimpleName() + '#';
                    }
                }
            }
        }
        if (i17 > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("parse_count", i17);
                jSONObject.put("error_count", i18);
                jSONObject.put("error", str);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.tencent.mars.xlog.Log.i("LocalFinderContact", t17);
                gz2.e.a(gz2.e.f277732a, 0, "KeyContactParseError", t17, 1, null);
            } catch (org.json.JSONException unused2) {
            }
        }
        return jz5.f0.f302826a;
    }
}
