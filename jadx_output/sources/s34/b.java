package s34;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402570a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402571b;

    public static s34.b a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderEncryptedTopicId");
            java.lang.String str3 = (java.lang.String) map.get(str + ".finderTopicName");
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                s34.b bVar = new s34.b();
                bVar.f402570a = str2;
                bVar.f402571b = str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
                return bVar;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
    }
}
