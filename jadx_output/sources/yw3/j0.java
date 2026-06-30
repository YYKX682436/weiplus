package yw3;

/* loaded from: classes.dex */
public final class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI f466774d;

    public j0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBDemoUI repairerDBDemoUI) {
        this.f466774d = repairerDBDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466774d.finish();
        return true;
    }
}
