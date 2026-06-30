package qa4;

/* loaded from: classes3.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f361104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361107g;

    public n(kotlinx.coroutines.y0 y0Var, java.lang.String str, int i17, yz5.l lVar) {
        this.f361104d = y0Var;
        this.f361105e = str;
        this.f361106f = i17;
        this.f361107g = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2");
        if (menuItem.getItemId() == 1) {
            kotlinx.coroutines.l.d(this.f361104d, null, null, new qa4.m(this.f361105e, this.f361106f, this.f361107g, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2");
    }
}
