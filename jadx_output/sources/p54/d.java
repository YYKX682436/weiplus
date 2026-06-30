package p54;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f352086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.l lVar) {
        super(1);
        this.f352086d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialog$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialog$1");
        yz5.l lVar = this.f352086d;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(intValue));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialog$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialog$1");
        return f0Var;
    }
}
