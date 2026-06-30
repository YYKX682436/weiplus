package za3;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f471046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f471047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f471048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.RedirectUI f471049g;

    public x(com.tencent.mm.plugin.location.ui.RedirectUI redirectUI, android.content.Intent intent, double d17, double d18) {
        this.f471049g = redirectUI;
        this.f471046d = intent;
        this.f471047e = d17;
        this.f471048f = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.location.ui.RedirectUI redirectUI = this.f471049g;
        android.content.Intent intent = this.f471046d;
        double d17 = this.f471047e;
        double d18 = this.f471048f;
        int i17 = com.tencent.mm.plugin.location.ui.RedirectUI.f144649o;
        redirectUI.K6(intent, d17, d18);
    }
}
