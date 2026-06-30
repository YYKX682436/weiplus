package x64;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c {
    public a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        super(i17, str);
        this.f162774h = 1;
        if (snsInfo != null) {
            java.lang.String uxinfo = snsInfo.getUxinfo();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f162768b = uxinfo == null ? "" : uxinfo;
            this.f162767a = ca4.z0.T(snsInfo);
            if (snsInfo.getAdXml() != null) {
                java.lang.String str2 = snsInfo.getAdXml().adExtInfo;
                this.f162769c = str2 == null ? "" : str2;
                if (adClickActionInfo != null) {
                    java.lang.String str3 = adClickActionInfo.R;
                    this.f162770d = str3 == null ? "" : str3;
                    java.lang.String str4 = adClickActionInfo.S;
                    this.f162771e = str4 != null ? str4 : "";
                }
            }
        }
    }
}
