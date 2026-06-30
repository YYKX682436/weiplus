package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f166158a;

    /* renamed from: b, reason: collision with root package name */
    public int f166159b;

    /* renamed from: c, reason: collision with root package name */
    public int f166160c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166161d;

    /* renamed from: e, reason: collision with root package name */
    public int f166162e;

    /* renamed from: f, reason: collision with root package name */
    public int f166163f;

    /* renamed from: g, reason: collision with root package name */
    public int f166164g;

    /* renamed from: h, reason: collision with root package name */
    public int f166165h;

    public static com.tencent.mm.plugin.sns.storage.x a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
        if (!map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.x xVar = new com.tencent.mm.plugin.sns.storage.x();
        xVar.f166158a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".pressStartTime"), 0);
        xVar.f166159b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".pressEndTime"), 0);
        xVar.f166160c = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".pressDuration"), 0);
        java.lang.String str2 = (java.lang.String) map.get(str + ".spriteImageUrl");
        if (str2 == null) {
            str2 = "";
        }
        xVar.f166161d = str2;
        xVar.f166162e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".spriteType"), 0);
        xVar.f166163f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".spriteSizeType"), 0);
        xVar.f166164g = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".spriteDuration"), 0);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".minimumPressDuration"), 0);
        xVar.f166165h = D1;
        if (xVar.f166164g == 0) {
            xVar.f166164g = 4000;
        }
        if (D1 == 0) {
            xVar.f166165h = 500;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
        return xVar;
    }
}
