package l44;

/* loaded from: classes4.dex */
public class c4 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f316072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f316075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316076e;

    public c4(android.widget.Button button, java.lang.String str, android.content.Context context, ab4.u uVar, int i17) {
        this.f316072a = button;
        this.f316073b = str;
        this.f316074c = context;
        this.f316075d = uVar;
        this.f316076e = i17;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        android.widget.Button button = this.f316072a;
        button.setTag(com.tencent.mm.R.id.n1z, "");
        com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "onDownloadError, hash = " + button.hashCode() + ", url = " + this.f316073b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        android.widget.Button button = this.f316072a;
        java.lang.String str2 = (java.lang.String) button.getTag(com.tencent.mm.R.id.n1z);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(l17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            l44.f4.d(this.f316074c, this.f316075d, button, str, this.f316076e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            button.hashCode();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }
}
