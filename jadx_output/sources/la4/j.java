package la4;

/* loaded from: classes4.dex */
public class j extends la4.f {
    @Override // la4.f
    public java.lang.String h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return str;
    }

    @Override // la4.f
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return 2;
    }

    @Override // la4.f
    public boolean q(dn.h hVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        la4.a aVar = this.f317589f;
        com.tencent.mm.vfs.w6.P(aVar.d(), aVar.h(), (aVar == null || android.text.TextUtils.isEmpty(aVar.f317552k)) ? ca4.z0.R(this.f317590g) : aVar.f317552k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadSight");
        return true;
    }
}
