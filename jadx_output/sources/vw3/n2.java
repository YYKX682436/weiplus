package vw3;

/* loaded from: classes.dex */
public final class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMMKVSetUI f441039d;

    public n2(com.tencent.mm.plugin.repairer.ui.RepairerMMKVSetUI repairerMMKVSetUI) {
        this.f441039d = repairerMMKVSetUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441039d.finish();
        return false;
    }
}
