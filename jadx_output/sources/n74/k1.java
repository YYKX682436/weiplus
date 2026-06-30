package n74;

/* loaded from: classes4.dex */
public class k1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f335384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n74.n1 f335386c;

    public k1(n74.n1 n1Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f335386c = n1Var;
        this.f335384a = weakReference;
        this.f335385b = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) this.f335384a.get();
        if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.w("SnsAdRollHelper", "realBar released");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
            return;
        }
        livingDescBarLayout.setTag(com.tencent.mm.R.id.n1z, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        android.widget.ImageView imageView = livingDescBarLayout.f163663d;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.ad_living_description_icon);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "onDownloadError, hash = " + livingDescBarLayout.hashCode() + ", url = " + this.f335385b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        try {
            livingDescBarLayout = (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) this.f335384a.get();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "onDownloaded, exp = " + th6.toString());
        }
        if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.w("SnsAdRollHelper", "realBar released");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
            return;
        }
        java.lang.String str2 = (java.lang.String) livingDescBarLayout.getTag(com.tencent.mm.R.id.n1z);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "" : za4.t0.l("adId_mm", str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(l17)) {
            n74.n1 n1Var = this.f335386c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            n1Var.c(str, livingDescBarLayout);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }
}
