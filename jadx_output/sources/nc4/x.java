package nc4;

/* loaded from: classes4.dex */
public final class x implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336185d;

    public x(nc4.d0 d0Var) {
        this.f336185d = d0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", "BottomSheet Dismiss");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        this.f336185d.S6(0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$3");
    }
}
