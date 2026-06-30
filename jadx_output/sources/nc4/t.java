package nc4;

/* loaded from: classes4.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336175d;

    public t(nc4.d0 d0Var) {
        this.f336175d = d0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
        g4Var.clear();
        for (java.util.Map.Entry entry : nc4.d0.P6(this.f336175d).entrySet()) {
            if (((nc4.c) entry.getValue()).show()) {
                g4Var.v(((nc4.c) entry.getValue()).a());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
    }
}
