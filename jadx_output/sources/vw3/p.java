package vw3;

/* loaded from: classes8.dex */
public final class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI f441061d;

    public p(com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI repairerActivityStackDebugUI) {
        this.f441061d = repairerActivityStackDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI repairerActivityStackDebugUI = this.f441061d;
        if (repairerActivityStackDebugUI.U6().m0(2)) {
            return true;
        }
        repairerActivityStackDebugUI.finish();
        return true;
    }
}
