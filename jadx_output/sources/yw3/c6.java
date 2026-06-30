package yw3;

/* loaded from: classes.dex */
public final class c6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSeparationControllerUI f466712d;

    public c6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSeparationControllerUI repairerSeparationControllerUI) {
        this.f466712d = repairerSeparationControllerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466712d.finish();
        return true;
    }
}
