package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189280a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f189281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f189282c;

    /* renamed from: d, reason: collision with root package name */
    public int f189283d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189284e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f189285f;

    public e0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f189280a = "";
        this.f189281b = "";
        this.f189282c = -1;
        this.f189284e = "";
        this.f189285f = new java.util.HashMap();
        this.f189280a = url;
        this.f189284e = com.tencent.mm.pluginsdk.model.i0.f189340a.b(url);
    }

    public java.lang.String toString() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.String b17 = com.tencent.mm.pluginsdk.model.i0.f189340a.b(this.f189280a);
        java.lang.String str = this.f189281b;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f189282c);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f189283d);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String format = java.lang.String.format("BizImageBlankReportInfo %s {id: %s, timeTotal: %d, timeTaskRun: %d, timeFile: %d, timeNet: %d, timeScroll: %d, timeHevc: %d, timeThread: %d, \nnetType: %s, position: %d, imageSize: %d, retryCount: %d, downloadSuccess: %b, local: %b, \nurl: %s}", java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, b17, 0L, 0L, 0L, 0L, 0L, 0L, 0L, str, valueOf2, 0L, valueOf3, bool, bool, this.f189280a}, 16));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
