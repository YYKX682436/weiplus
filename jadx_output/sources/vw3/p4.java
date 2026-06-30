package vw3;

/* loaded from: classes.dex */
public final class p4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441068d;

    public p4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441068d = repairerResetConfigUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441068d.finish();
        return false;
    }
}
