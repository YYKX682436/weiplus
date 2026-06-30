package dc4;

/* loaded from: classes4.dex */
public class p0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.q0 f228808a;

    public p0(dc4.q0 q0Var) {
        this.f228808a = q0Var;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloadError thumb");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb, path=" + str);
        dc4.q0 q0Var = this.f228808a;
        if (dc4.v0.l(q0Var.f228811c).getVisibility() == 0) {
            try {
                dc4.v0.l(q0Var.f228811c).setImageBitmap(com.tencent.mm.graphics.e.c(str));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb exp:" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }
}
