package dc1;

/* loaded from: classes8.dex */
public final class c implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f228687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc1.d f228688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f228689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228690d;

    public c(dc1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, u65.a aVar) {
        this.f228688b = dVar;
        this.f228689c = lVar;
        this.f228690d = i17;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        int i17;
        if (bundle != null && (i17 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i18 = bundle.getInt("result_key_err_code", -1);
            java.lang.String string = bundle.getString("result_key_err_msg");
            if (string == null) {
                string = "";
            }
            java.lang.String str = string;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat onReceiveResult action: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
            dc1.d dVar = this.f228688b;
            if (i17 == 2) {
                dVar.E(this.f228689c, this.f228690d, i18, str);
                return;
            }
            if (i17 == 3) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                dc1.b bVar = new dc1.b(this.f228688b, this.f228689c, this.f228690d, i18, str);
                long j17 = this.f228687a ? 0L : 1000L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(bVar, j17, false);
                return;
            }
            if (i17 == 4) {
                dVar.E(this.f228689c, this.f228690d, i18, str);
                return;
            }
            if (i17 == 5) {
                this.f228687a = true;
            } else if (i17 == 6) {
                dVar.E(this.f228689c, this.f228690d, i18, str);
            } else {
                if (i17 != 8) {
                    return;
                }
                dVar.E(this.f228689c, this.f228690d, i18, str);
            }
        }
    }
}
