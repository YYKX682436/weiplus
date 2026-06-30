package yw3;

/* loaded from: classes.dex */
public final class d1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI f466714d;

    public d1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterEmojiBridgeUI repairerFlutterEmojiBridgeUI) {
        this.f466714d = repairerFlutterEmojiBridgeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466714d.finish();
        return true;
    }
}
