package cv4;

/* loaded from: classes7.dex */
public final class w implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f222596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cv4.x f222598c;

    public w(android.app.Activity activity, java.lang.String str, cv4.x xVar) {
        this.f222596a = activity;
        this.f222597b = str;
        this.f222598c = xVar;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : cv4.v.f222595a[h0Var.ordinal()];
        cv4.x xVar = this.f222598c;
        int i18 = 2;
        if (i17 != 1) {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiRequestSystemCapabilityAuthorization", "requestPermission error: " + h0Var.f227201d);
                xVar.f143442e.b("requestPermission error");
                return;
            }
            i18 = 1;
        } else if (!z2.h.b(this.f222596a, this.f222597b)) {
            i18 = 6;
        }
        xVar.f143442e.e(kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED))));
    }
}
