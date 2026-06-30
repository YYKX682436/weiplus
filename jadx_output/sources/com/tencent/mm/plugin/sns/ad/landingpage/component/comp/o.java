package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w f162904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w wVar) {
        super(0);
        this.f162904d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingDoubleLinkComp$pkgName$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingDoubleLinkComp$pkgName$2");
        f54.c i07 = this.f162904d.i0();
        if (i07 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPkg", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPkg", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
            str = i07.f259701z1;
        } else {
            str = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingDoubleLinkComp$pkgName$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingDoubleLinkComp$pkgName$2");
        return str;
    }
}
