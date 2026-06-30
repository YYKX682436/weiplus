package zw1;

/* loaded from: classes8.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f476638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f476641g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.mu5 f476642h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.nu5 f476643i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f476644m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476645n;

    public g4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, android.widget.LinearLayout linearLayout, ww1.a3 a3Var, r45.o90 o90Var, int i17, r45.mu5 mu5Var, r45.nu5 nu5Var, int i18) {
        this.f476645n = walletCollectQrCodeUI;
        this.f476638d = linearLayout;
        this.f476639e = a3Var;
        this.f476640f = o90Var;
        this.f476641g = i17;
        this.f476642h = mu5Var;
        this.f476643i = nu5Var;
        this.f476644m = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f476638d.postDelayed(new zw1.f4(this), 50L);
    }
}
