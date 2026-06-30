package nc4;

/* loaded from: classes.dex */
public final class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f336122d;

    public c0(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f336122d = mMActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupOptionMenu$3");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.MMActivity mMActivity = this.f336122d;
        mMActivity.hideVKB();
        mMActivity.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupOptionMenu$3");
        return false;
    }
}
