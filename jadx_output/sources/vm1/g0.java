package vm1;

/* loaded from: classes11.dex */
public final class g0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f438008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438011d;

    public g0(boolean z17, vm1.x0 x0Var, java.lang.String str, java.lang.String str2) {
        this.f438008a = z17;
        this.f438009b = x0Var;
        this.f438010c = str;
        this.f438011d = str2;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "launchApplicationWithUrl onLaunchApp launchSuccess: " + z17 + ", launchCancel: " + z18);
        if (z18 || z17) {
            return;
        }
        boolean z19 = this.f438008a;
        vm1.x0 x0Var = this.f438009b;
        if (z19) {
            x0Var.gotoAppInstallPage(this.f438010c);
        } else {
            x0Var.goToWebPage(this.f438011d, -1L);
        }
    }
}
