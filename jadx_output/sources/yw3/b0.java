package yw3;

/* loaded from: classes.dex */
public final class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI f466696d;

    public b0(com.tencent.mm.plugin.repairer.ui.demo.RepairerAnimationDemoUI repairerAnimationDemoUI) {
        this.f466696d = repairerAnimationDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466696d.finish();
        return true;
    }
}
