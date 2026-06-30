package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class k0 implements dn.k {
    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback, mediaId=");
        sb6.append(str);
        sb6.append(", startRet=");
        sb6.append(i17);
        sb6.append(", retCode=");
        sb6.append(hVar == null ? -1 : hVar.field_retCode);
        sb6.append(", onlyCheckExist=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("AdLandingPagePagFileHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        byte[] bArr2 = new byte[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPagePagFileHelper$1");
        return bArr2;
    }
}
