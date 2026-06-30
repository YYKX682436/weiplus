package t00;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(c00.n3 n3Var) {
        super(1);
        this.f414280d = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", booleanValue);
        this.f414280d.b(jSONObject);
        return jz5.f0.f302826a;
    }
}
