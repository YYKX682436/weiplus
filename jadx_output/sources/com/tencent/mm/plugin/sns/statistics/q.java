package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes16.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164927a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164928b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f164929c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f164930d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f164931e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f164932f = -1;

    public q(com.tencent.mm.plugin.sns.statistics.o oVar) {
    }

    public static java.lang.String a(com.tencent.mm.plugin.sns.statistics.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
        qVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append(qVar.f164927a);
        sb6.append(',');
        sb6.append(qVar.f164928b);
        sb6.append(',');
        sb6.append(qVar.f164929c);
        sb6.append(',');
        sb6.append(qVar.f164930d);
        sb6.append(',');
        sb6.append(qVar.f164931e);
        sb6.append(',');
        sb6.append(qVar.f164932f);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toKvStatString", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
        return sb7;
    }
}
