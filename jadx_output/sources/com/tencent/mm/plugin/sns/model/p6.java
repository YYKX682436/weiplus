package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.p6 f164581a = new com.tencent.mm.plugin.sns.model.p6();

    public final void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealTimeLineFeedDelete", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "dealTimeLineDelete >> snsLocalIdd: " + i17 + ", createTime: " + i18);
        wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
        xVar.getClass();
        com.tencent.mars.xlog.Log.i(xVar.f448453d, "deleteTimeLineFeedFakeVideo >> snsLocalId: " + i17 + ", createTime: " + i18);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.j(i17, i18, xVar, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealTimeLineFeedDelete", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
    }
}
