package yw3;

/* loaded from: classes.dex */
public final class e3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI f466731d;

    public e3(com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardChangeDemoUI repairerKeyboardChangeDemoUI) {
        this.f466731d = repairerKeyboardChangeDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466731d.finish();
        return true;
    }
}
