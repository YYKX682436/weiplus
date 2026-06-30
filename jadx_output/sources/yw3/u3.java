package yw3;

/* loaded from: classes.dex */
public final class u3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466902d;

    public u3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        this.f466902d = repairerMvvmDBDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466902d.finish();
        return true;
    }
}
