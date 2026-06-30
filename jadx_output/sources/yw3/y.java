package yw3;

/* loaded from: classes.dex */
public final class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI f466931d;

    public y(com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
        this.f466931d = repairerAccessibilityDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466931d.finish();
        return true;
    }
}
