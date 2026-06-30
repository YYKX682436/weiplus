package ee4;

/* loaded from: classes4.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.e f251696d;

    public d(ee4.e eVar) {
        this.f251696d = eVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc$showAddPicDialog$2");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ee4.e eVar = this.f251696d;
        if (itemId == 0) {
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCapturePc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
            ee4.v vVar = (ee4.v) ((jz5.n) eVar.f251745e).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCapturePc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
            vVar.p();
        } else if (itemId == 1) {
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
            ee4.m0 m0Var = (ee4.m0) ((jz5.n) eVar.f251748h).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGoAlbumPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
            m0Var.p();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicAddItemClickPc$showAddPicDialog$2");
    }
}
