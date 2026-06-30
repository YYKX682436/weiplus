package yw3;

/* loaded from: classes.dex */
public final class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI f466830d;

    public o0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
        this.f466830d = repairerDBSelectDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466830d.finish();
        return true;
    }
}
