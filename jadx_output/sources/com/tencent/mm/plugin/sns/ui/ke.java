package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ke implements com.tencent.mm.plugin.scanner.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169625b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.le f169626c;

    public ke(com.tencent.mm.plugin.sns.ui.le leVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        this.f169626c = leVar;
        this.f169624a = snsInfo;
        this.f169625b = str;
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void a(java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectQBarCode", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
        com.tencent.mm.plugin.sns.ui.le leVar = this.f169626c;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = leVar.f169739a.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.g(imageQBarDataBean, this.f169624a, this.f169625b);
        }
        int i17 = z17 ? 1 : 2;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = leVar.f169739a.f166810o;
        if (snsInfoFlip2 != null) {
            com.tencent.mm.plugin.scanner.d0.f158718a.b(snsInfoFlip2.H.longValue(), i17, arrayList, imageQBarDataBean, leVar.f169739a.f166810o.I.longValue(), 1, 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectQBarCode", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void b(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancelSelect", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
        com.tencent.mm.plugin.sns.ui.le leVar = this.f169626c;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = leVar.f169739a.f166810o;
        if (snsInfoFlip != null) {
            com.tencent.mm.plugin.scanner.d0.f158718a.b(snsInfoFlip.H.longValue(), 3, arrayList, null, leVar.f169739a.f166810o.I.longValue(), 1, 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancelSelect", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
    }
}
