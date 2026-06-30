package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f166017a;

    /* renamed from: b, reason: collision with root package name */
    public int f166018b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166019c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166020d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f166021e;

    public i0(int i17, int i18, java.lang.String adChainTextColor, java.lang.String adChainTextColorDark, java.lang.String adChainReportDataStr, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        adChainTextColor = (i19 & 4) != 0 ? "" : adChainTextColor;
        adChainTextColorDark = (i19 & 8) != 0 ? "" : adChainTextColorDark;
        adChainReportDataStr = (i19 & 16) != 0 ? "" : adChainReportDataStr;
        kotlin.jvm.internal.o.g(adChainTextColor, "adChainTextColor");
        kotlin.jvm.internal.o.g(adChainTextColorDark, "adChainTextColorDark");
        kotlin.jvm.internal.o.g(adChainReportDataStr, "adChainReportDataStr");
        this.f166017a = i17;
        this.f166018b = i18;
        this.f166019c = adChainTextColor;
        this.f166020d = adChainTextColorDark;
        this.f166021e = adChainReportDataStr;
    }
}
