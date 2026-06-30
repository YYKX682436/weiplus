package uc4;

/* loaded from: classes4.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.g f426384d;

    public c(uc4.g gVar) {
        this.f426384d = gVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        uc4.g gVar = this.f426384d;
        if (!gVar.i(menuItem, i17)) {
            gVar.e().onMMMenuItemSelected(menuItem, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$2");
    }
}
