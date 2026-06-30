package zd4;

/* loaded from: classes11.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI f471631d;

    public g(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        this.f471631d = baseSelectVisibleRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$4");
        this.f471631d.e7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$4");
        return true;
    }
}
