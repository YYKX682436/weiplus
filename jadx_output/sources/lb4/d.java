package lb4;

/* loaded from: classes11.dex */
public final class d implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lb4.h f317779a;

    public d(lb4.h hVar) {
        this.f317779a = hVar;
    }

    @Override // q51.b
    public final void onItemSelected(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$get_selectedItem$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        lb4.h hVar = this.f317779a;
        androidx.lifecycle.j0 j0Var = hVar.f317788c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$get_selectedItem$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        j0Var.setValue(lb4.h.a(hVar, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$1");
    }
}
