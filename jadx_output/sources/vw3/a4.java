package vw3;

/* loaded from: classes.dex */
public final class a4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI f440880d;

    public a4(com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI repairerPayDebugUI) {
        this.f440880d = repairerPayDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440880d.finish();
        return true;
    }
}
