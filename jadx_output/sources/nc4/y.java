package nc4;

/* loaded from: classes4.dex */
public final class y implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f336186a;

    public y(boolean z17) {
        this.f336186a = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ToolBarUIC", "BottomSheet click cancel");
        xa4.b.f452821a.a(this.f336186a, 0, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$4");
    }
}
