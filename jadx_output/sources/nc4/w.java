package nc4;

/* loaded from: classes4.dex */
public final class w implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f336184e;

    public w(nc4.d0 d0Var, boolean z17) {
        this.f336183d = d0Var;
        this.f336184e = z17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        nc4.d0 d0Var = this.f336183d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        pf5.e.launch$default(d0Var, kotlinx.coroutines.internal.b0.f310484a, null, new nc4.v(d0Var, menuItem, this.f336184e, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2");
    }
}
