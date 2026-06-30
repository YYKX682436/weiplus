package vw3;

/* loaded from: classes.dex */
public final class i0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI f440984d;

    public i0(com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI repairerFavDebugUI) {
        this.f440984d = repairerFavDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440984d.finish();
        return true;
    }
}
