package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes16.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164915a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f164916b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164917c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f164918d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f164919e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f164920f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f164921g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f164922h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f164923i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f164924j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f164925k = -1;

    public p(com.tencent.mm.plugin.sns.statistics.o oVar) {
    }

    public static java.lang.String a(com.tencent.mm.plugin.sns.statistics.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append(pVar.f164915a);
        sb6.append(',');
        sb6.append(pVar.f164916b);
        sb6.append(',');
        sb6.append(pVar.f164917c);
        sb6.append(',');
        sb6.append(pVar.f164918d);
        sb6.append(',');
        sb6.append(pVar.f164919e);
        sb6.append(',');
        sb6.append(pVar.f164920f);
        sb6.append(',');
        sb6.append(pVar.f164921g);
        sb6.append(',');
        sb6.append(pVar.f164922h);
        sb6.append(',');
        sb6.append(pVar.f164923i);
        sb6.append(',');
        sb6.append(pVar.f164924j);
        sb6.append(',');
        sb6.append(pVar.f164925k);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        return sb7;
    }
}
