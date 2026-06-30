package yw3;

/* loaded from: classes.dex */
public final class w5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI f466921d;

    public w5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
        this.f466921d = repairerPullDownWidgetDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466921d.finish();
        return true;
    }
}
