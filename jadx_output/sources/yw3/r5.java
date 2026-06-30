package yw3;

/* loaded from: classes.dex */
public final class r5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPickerDemoUI f466868d;

    public r5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPickerDemoUI repairerPickerDemoUI) {
        this.f466868d = repairerPickerDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466868d.finish();
        return true;
    }
}
