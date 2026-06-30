package yw3;

/* loaded from: classes.dex */
public final class q3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMMXWebDebugUI f466858d;

    public q3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMMXWebDebugUI repairerMMXWebDebugUI) {
        this.f466858d = repairerMMXWebDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466858d.finish();
        return true;
    }
}
