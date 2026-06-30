package ed4;

/* loaded from: classes4.dex */
public class w implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f251329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.o0 f251330b;

    public w(com.tencent.mm.plugin.sns.ui.item.o0 o0Var) {
        this.f251330b = o0Var;
        this.f251329a = o0Var.f169398c;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloadError thumb");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb, path=" + str);
        com.tencent.mm.plugin.sns.ui.item.o0 o0Var = this.f251330b;
        com.tencent.mm.plugin.sns.storage.p pVar = o0Var.f169399d.f169407r;
        java.lang.String str2 = pVar != null ? pVar.f166096h : "";
        java.lang.String str3 = this.f251329a;
        if (str3 == null || !str3.equals(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded, url != nowUrl");
        } else if (o0Var.f169397b.M0.getVisibility() == 0) {
            try {
                o0Var.f169397b.M0.setImageBitmap(com.tencent.mm.graphics.e.c(str));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb exp:" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }
}
