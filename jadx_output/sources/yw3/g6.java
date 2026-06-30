package yw3;

/* loaded from: classes.dex */
public final class g6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI f466754d;

    public g6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI repairerSetTextStatusDemoUI) {
        this.f466754d = repairerSetTextStatusDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466754d.finish();
        return true;
    }
}
