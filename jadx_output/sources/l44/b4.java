package l44;

/* loaded from: classes4.dex */
public class b4 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f316055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f316058d;

    public b4(android.widget.Button button, java.lang.String str, android.content.Context context, ab4.u uVar) {
        this.f316055a = button;
        this.f316056b = str;
        this.f316057c = context;
        this.f316058d = uVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        android.widget.Button button = this.f316055a;
        button.setTag(com.tencent.mm.R.id.n1z, "");
        com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "onDownloadError, hash = " + button.hashCode() + ", url = " + this.f316056b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.Button button = this.f316055a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        try {
            java.lang.String str2 = (java.lang.String) button.getTag(com.tencent.mm.R.id.n1z);
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(l17)) {
                android.content.Context context = this.f316057c;
                ab4.u uVar = this.f316058d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                l44.f4.c(context, uVar, button, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                button.hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("BtnIconUpdateHelper", "onDownloaded, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }
}
