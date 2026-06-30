package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class h6 {

    /* renamed from: a, reason: collision with root package name */
    public long f164238a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f164239b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f164240c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f164241d = new java.util.LinkedList();

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        java.util.LinkedList linkedList = this.f164241d;
        linkedList.clear();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgPreLoadingTimeLimit");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = d17 == null ? "null" : d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", d17);
                for (java.lang.String str : d17.split(";")) {
                    java.lang.String[] split = str.split("-");
                    java.lang.String[] split2 = split[0].split(":");
                    int D1 = (com.tencent.mm.sdk.platformtools.t8.D1(split2[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split2[1], 0);
                    java.lang.String[] split3 = split[1].split(":");
                    linkedList.add(new android.util.Pair(java.lang.Integer.valueOf(D1), java.lang.Integer.valueOf((com.tencent.mm.sdk.platformtools.t8.D1(split3[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split3[1], 0))));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            return true;
        }
        linkedList.add(new android.util.Pair(0, 1440));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetSettings", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        return false;
    }
}
