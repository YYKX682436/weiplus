package vw3;

/* loaded from: classes.dex */
public final class k5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSearchUI f441016d;

    public k5(com.tencent.mm.plugin.repairer.ui.RepairerSearchUI repairerSearchUI) {
        this.f441016d = repairerSearchUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441016d.finish();
        return true;
    }
}
