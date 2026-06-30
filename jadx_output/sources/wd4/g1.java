package wd4;

/* loaded from: classes12.dex */
public final class g1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f444906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444907e;

    public g1(db5.t4 t4Var, wd4.l1 l1Var) {
        this.f444906d = t4Var;
        this.f444907e = l1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$1");
        this.f444906d.onMMMenuItemSelected(menuItem, i17);
        this.f444907e.i(menuItem.getItemId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setSheetSelectedListener$1");
    }
}
