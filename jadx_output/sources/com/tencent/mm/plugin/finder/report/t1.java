package com.tencent.mm.plugin.finder.report;

/* loaded from: classes12.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct f125362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct finderFeedLoadingTimeExStruct) {
        super(0);
        this.f125362d = finderFeedLoadingTimeExStruct;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (ph.t.f354283k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f354283k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f354283k;
        kotlin.jvm.internal.o.d(tVar);
        ph.c c17 = tVar.c();
        this.f125362d.I = c17.b();
        this.f125362d.f56798J = c17.c() ? 1L : 0L;
        com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeExStruct finderFeedLoadingTimeExStruct = this.f125362d;
        c17.f();
        finderFeedLoadingTimeExStruct.K = 0L;
        this.f125362d.k();
        java.lang.String n17 = this.f125362d.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "report20713 info:".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        return jz5.f0.f302826a;
    }
}
