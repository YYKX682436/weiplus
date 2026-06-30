package wd4;

/* loaded from: classes8.dex */
public final class e1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f444895d;

    public e1(db5.t4 t4Var) {
        this.f444895d = t4Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnFooterMenuSelectedListener$1");
        this.f444895d.onMMMenuItemSelected(menuItem, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnFooterMenuSelectedListener$1");
    }
}
