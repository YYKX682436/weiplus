package rk4;

/* loaded from: classes11.dex */
public final class f2 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f396640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396643d;

    public f2(boolean z17, rk4.l3 l3Var, java.lang.String str, java.lang.String str2) {
        this.f396640a = z17;
        this.f396641b = l3Var;
        this.f396642c = str;
        this.f396643d = str2;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "launchApplicationWithUrl onLaunchApp launchSuccess: " + z17 + ", launchCancel: " + z18);
        if (z18 || z17) {
            return;
        }
        boolean z19 = this.f396640a;
        rk4.l3 l3Var = this.f396641b;
        if (z19) {
            l3Var.gotoAppInstallPage(this.f396642c);
        } else {
            l3Var.goToWebPage(this.f396643d, -1L);
        }
    }
}
