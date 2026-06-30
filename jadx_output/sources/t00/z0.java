package t00;

/* loaded from: classes.dex */
public final class z0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.a1 f414380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f414381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414382f;

    public z0(t00.a1 a1Var, org.json.JSONObject jSONObject, c00.n3 n3Var) {
        this.f414380d = a1Var;
        this.f414381e = jSONObject;
        this.f414382f = n3Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "requestCode: %d, resultCode: %d, intent data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        if (i17 != this.f414380d.f414263a) {
            return;
        }
        java.lang.String optString = this.f414381e.optString("from", "select");
        boolean b17 = kotlin.jvm.internal.o.b(optString, "select");
        c00.n3 n3Var = this.f414382f;
        if (!b17) {
            if (kotlin.jvm.internal.o.b(optString, "manage")) {
                com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "manage address result");
                n3Var.b(null);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("OpenMyAddressEcsActionHandler", "unknown from: " + optString);
                n3Var.a();
                return;
            }
        }
        if (i18 != -1) {
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "select address result fail");
                n3Var.a();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "select address result canceled");
                n3Var.onCancel();
                return;
            }
        }
        if (intent != null) {
            com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "select address result ok");
            n3Var.b(((b30.k) ((c00.w2) i95.n0.c(c00.w2.class))).wi(intent));
        } else {
            com.tencent.mars.xlog.Log.i("OpenMyAddressEcsActionHandler", "select address result ok but data is null");
            n3Var.a();
        }
    }
}
