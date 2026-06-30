package yw3;

/* loaded from: classes.dex */
public final class q4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI f466859d;

    public q4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI repairerMvvmMainDBDemoUI) {
        this.f466859d = repairerMvvmMainDBDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466859d.finish();
        return true;
    }
}
