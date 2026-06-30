package s34;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public int f402706a;

    /* renamed from: b, reason: collision with root package name */
    public int f402707b;

    public static s34.m a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
            return null;
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".type"), 0);
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".expireTime"), 0) * 1000;
        if (D1 == 0 || D12 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
            return null;
        }
        s34.m mVar = new s34.m();
        mVar.f402706a = D1;
        mVar.f402707b = D12;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
        return mVar;
    }
}
