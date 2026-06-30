package nc4;

/* loaded from: classes4.dex */
public final class a0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336119d;

    public a0(nc4.d0 d0Var) {
        this.f336119d = d0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupOptionMenu$1");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", "click appbar camera img");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "ClickNewPostTime");
        nc4.d0 d0Var = this.f336119d;
        nc4.z zVar = new nc4.z(d0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleWelcomePage", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleWelcomePage", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68385, null), 0);
        int j18 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68386, null), 0);
        if (d0Var.f336135h || j17 >= 3 || j18 != 0) {
            zVar.invoke();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleWelcomePage", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        } else {
            d0Var.f336135h = true;
            com.tencent.mm.plugin.sns.ui.rv.a(d0Var.getContext(), new nc4.k(zVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleWelcomePage", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleWelcomePage", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupOptionMenu$1");
        return true;
    }
}
