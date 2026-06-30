package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class m0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f158289d;

    public m0(com.tencent.mm.plugin.report.service.g0 g0Var, java.lang.Runnable runnable) {
        this.f158289d = runnable;
    }

    @Override // hm0.t
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "Delay report");
        this.f158289d.run();
    }
}
