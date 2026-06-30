package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class z1 implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.b2 f126268a;

    public z1(com.tencent.mm.plugin.finder.service.b2 b2Var) {
        this.f126268a = b2Var;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        zy2.t9 t9Var = this.f126268a.f126009b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f222089f2);
        }
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f126268a.f126009b != null) {
            long j18 = task.f222089f2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "preloadVideo onSuccessfully, feedId is " + j18 + ", isAllCompleted is " + z17 + ", percent is " + i17 + ", receivedSize is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSuccessfully", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(task, "task");
        zy2.t9 t9Var = this.f126268a.f126009b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f222089f2);
        }
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f126268a.f126009b != null) {
            long j17 = task.f222089f2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "preloadVideo onStart, feedId is " + j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        zy2.t9 t9Var = this.f126268a.f126009b;
        if (t9Var != null) {
            ((l44.z4) t9Var).a(task.f222089f2);
        }
    }
}
