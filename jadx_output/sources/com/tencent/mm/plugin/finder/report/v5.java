package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.v5 f125408d = new com.tencent.mm.plugin.finder.report.v5();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.report.t5 t5Var = com.tencent.mm.plugin.finder.report.x5.f125439d;
        if (t5Var != null) {
            if (!(t5Var.f125371f == 0)) {
                t5Var = null;
            }
            if (t5Var != null) {
                t5Var.f125371f = c01.id.c();
                pm0.v.O("Finder.OtherUIEnterReporter", new com.tencent.mm.plugin.finder.report.u5(t5Var));
            }
        }
        com.tencent.mm.plugin.finder.report.x5.f125439d = null;
    }
}
