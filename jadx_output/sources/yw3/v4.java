package yw3;

/* loaded from: classes.dex */
public final class v4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI f466911d;

    public v4(com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI repairerNewLifeDebugUI) {
        this.f466911d = repairerNewLifeDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466911d.finish();
        return false;
    }
}
