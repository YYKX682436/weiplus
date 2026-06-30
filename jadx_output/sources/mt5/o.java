package mt5;

/* loaded from: classes8.dex */
public class o implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f331323a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f331324b = "";

    /* renamed from: c, reason: collision with root package name */
    public lt5.f f331325c;

    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        lt5.f fVar = this.f331325c;
        if (fVar != null && fVar.f321304b == 0) {
            return fVar;
        }
        try {
            java.lang.Object invoke = java.lang.Class.forName("android.tencent.sdid.TencentIdentifierManager").getMethod(com.tencent.mm.plugin.appbrand.jsapi.c6.NAME, android.content.Context.class).invoke(context.getSystemService("tencent_identifier"), context);
            if (invoke != null) {
                this.f331324b = (java.lang.String) invoke;
            }
            if (android.text.TextUtils.isEmpty(this.f331324b)) {
                this.f331323a = -305;
            } else {
                this.f331323a = 0;
            }
        } catch (java.lang.Throwable unused) {
            this.f331323a = -306;
        }
        lt5.f fVar2 = new lt5.f(this.f331324b, this.f331323a);
        this.f331325c = fVar2;
        return fVar2;
    }
}
