package tb;

/* loaded from: classes13.dex */
public class d extends sb.e {
    public d(com.tencent.midas.api.request.APMidasDirectRequest aPMidasDirectRequest) {
        java.lang.String str;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(aPMidasDirectRequest.reportDomain) || android.text.TextUtils.isEmpty(aPMidasDirectRequest.reportSuffix)) {
            str = "wechat-channels.logdata.qq.com";
            str2 = "/v1/r/report/log_data";
        } else {
            str = aPMidasDirectRequest.reportDomain;
            str2 = aPMidasDirectRequest.reportSuffix;
        }
        sb.b bVar = this.f405389d;
        bVar.f405388j = 1;
        bVar.f405381c = str;
        bVar.f405383e = str2;
        bVar.f405386h = bVar.f405379a + sb.h.a(str, "") + bVar.f405383e;
    }
}
