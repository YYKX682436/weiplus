package tb;

/* loaded from: classes13.dex */
public class b extends sb.e {
    public b() {
        java.lang.String offerId = com.tencent.midas.data.APPluginDataInterface.singleton().getOfferId();
        if (android.text.TextUtils.isEmpty(offerId)) {
            return;
        }
        java.lang.String format = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", offerId);
        java.lang.String format2 = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", offerId);
        java.lang.String format3 = java.lang.String.format("/cgi-bin/log_data.fcg?offer_id=%s", offerId);
        sb.b bVar = this.f405389d;
        bVar.getClass();
        java.lang.String str = com.tencent.midas.api.APMidasPayAPI.env;
        if (com.tencent.midas.control.APMidasPayHelper.isPayCenterSDK) {
            bVar.f405382d = com.tencent.midas.comm.APIPConfig.getDomain(str);
            bVar.f405383e = format3;
        } else if (str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_DEV)) {
            bVar.f405382d = "dev.api.unipay.qq.com";
            bVar.f405383e = format;
        } else if (str.equals("test")) {
            bVar.f405382d = "sandbox.api.unipay.qq.com";
            bVar.f405383e = format2;
        } else if (str.equals("release")) {
            bVar.f405382d = "szmg.qq.com";
            bVar.f405383e = format3;
        } else if (str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_TESTING)) {
            bVar.f405382d = "szmg.qq.com";
            bVar.f405383e = format3;
        }
        bVar.f405388j = 1;
        bVar.f405381c = bVar.f405382d;
        if (str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_DEV)) {
            bVar.f405386h = bVar.f405379a + sb.h.a(bVar.f405382d, "") + bVar.f405383e;
            return;
        }
        if (str.equals("test")) {
            bVar.f405386h = bVar.f405379a + sb.h.a(bVar.f405382d, "") + bVar.f405383e;
            return;
        }
        if (str.equals("release")) {
            bVar.f405386h = bVar.f405379a + sb.h.a(bVar.f405382d, "") + bVar.f405383e;
            return;
        }
        if (str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_TESTING)) {
            bVar.f405386h = bVar.f405379a + sb.h.a(bVar.f405382d, "") + bVar.f405383e;
        }
    }
}
