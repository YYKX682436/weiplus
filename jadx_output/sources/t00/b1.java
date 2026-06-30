package t00;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t00.b1 f414267d = new t00.b1();

    public b1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = it instanceof org.json.JSONObject ? (org.json.JSONObject) it : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        if (!(it instanceof java.lang.Integer)) {
            return null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(dm.i4.COL_ID, ((java.lang.Number) it).intValue());
        return jSONObject2;
    }
}
