package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.s f164988a = new com.tencent.mm.plugin.sns.statistics.s(null);

    public w(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
    }

    public final void a(java.lang.String eventId, java.lang.String viewId, java.util.Map params) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(params, "params");
        f164988a.a();
        java.util.Objects.toString(ri.l0.a(params));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.v(viewId, eventId, params));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportViewEvent", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
    }
}
