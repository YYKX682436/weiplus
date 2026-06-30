package wd4;

/* loaded from: classes.dex */
public final class k1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444944d;

    public k1(yz5.a aVar) {
        this.f444944d = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$3");
        yz5.a aVar = this.f444944d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$updateSheetMenus$3");
    }
}
