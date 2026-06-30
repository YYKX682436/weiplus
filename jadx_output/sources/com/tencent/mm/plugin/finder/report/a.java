package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.b f124936d;

    public a(com.tencent.mm.plugin.finder.report.b bVar, java.util.Set set) {
        this.f124936d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.report.j5 j5Var = this.f124936d.f124957b;
        if (j5Var != null) {
            int i17 = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.I;
            ((com.tencent.mm.plugin.finder.ui.r2) j5Var).f129763a.M0();
        }
    }
}
