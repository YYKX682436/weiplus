package s34;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f402730a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402731b;

    @za4.k1(resType = 3)
    public java.lang.String transitionAnimationUrl;

    public static s34.p a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
        try {
            str2 = (java.lang.String) map.get(str + ".transitionAnimationUrl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            str3 = (java.lang.String) map.get(str + ".transitionAnimationMD5");
            if (str3 == null) {
                str3 = "";
            }
            arrayList = new java.util.ArrayList();
            i17 = 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdEggAnimationInfo", "ShakeCardInfo parseFromXml, exp=" + th6.toString());
        }
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".transitionImgInfos.transitionImgInfo");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                break;
            }
            java.lang.String str5 = (java.lang.String) map.get(sb7 + ".transitionImg");
            if (str5 == null) {
                str5 = "";
            }
            try {
                java.lang.String str6 = (java.lang.String) map.get(sb7 + ".transitionColor");
                if (str6 == null) {
                    str6 = "";
                }
                java.lang.String str7 = (java.lang.String) map.get(sb7 + ".transitionColorAlpha");
                if (str7 == null) {
                    str7 = "";
                }
                str4 = ca4.m0.q0(str6, str7);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdEggAnimationInfo", "parseFromXml ShakeCardInfo parse color exp=" + e17.toString());
                str4 = "";
            }
            if (!android.text.TextUtils.isEmpty(str5) || !android.text.TextUtils.isEmpty(str4)) {
                s34.o oVar = new s34.o();
                oVar.f402720a = str5;
                oVar.f402721b = str4;
                arrayList.add(oVar);
            }
            i17++;
            com.tencent.mars.xlog.Log.e("AdEggAnimationInfo", "ShakeCardInfo parseFromXml, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            return null;
        }
        if (arrayList.size() > 0) {
            s34.p pVar = new s34.p();
            pVar.f402730a = arrayList;
            pVar.transitionAnimationUrl = str2;
            pVar.f402731b = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            return pVar;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
        return null;
    }
}
