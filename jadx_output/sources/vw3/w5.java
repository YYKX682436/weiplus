package vw3;

/* loaded from: classes.dex */
public final class w5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSportUI f441170d;

    public w5(com.tencent.mm.plugin.repairer.ui.RepairerSportUI repairerSportUI) {
        this.f441170d = repairerSportUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441170d.finish();
        return false;
    }
}
