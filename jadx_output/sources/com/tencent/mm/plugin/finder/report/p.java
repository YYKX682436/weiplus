package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.p f125222a = new com.tencent.mm.plugin.finder.report.p();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a6 f125223b = new com.tencent.mm.plugin.finder.report.a6();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a6 f125224c = new com.tencent.mm.plugin.finder.report.a6();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.o f125225d = new com.tencent.mm.plugin.finder.report.o();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.l f125226e = new com.tencent.mm.plugin.finder.report.l();

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.n f125227f = new com.tencent.mm.plugin.finder.report.n();

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.k f125228g = new com.tencent.mm.plugin.finder.report.k();

    public static final void a(com.tencent.mm.plugin.finder.report.p pVar, java.lang.String str, jx3.a aVar) {
        pVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report");
        sb6.append(aVar.g());
        sb6.append(' ');
        java.lang.String n17 = aVar.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }
}
