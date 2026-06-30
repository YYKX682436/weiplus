package vw3;

/* loaded from: classes.dex */
public final class f6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f440954d;

    public f6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f440954d = repairerUDRUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440954d.finish();
        return false;
    }
}
