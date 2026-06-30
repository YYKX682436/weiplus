package vw3;

/* loaded from: classes.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f440902d;

    public c(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f440902d = baseRepairerPrefUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        hx3.b bVar;
        r45.dp5 dp5Var;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI = this.f440902d;
        j75.f stateCenter = baseRepairerPrefUI.getStateCenter();
        if (stateCenter == null || (bVar = (hx3.b) stateCenter.getState()) == null || (dp5Var = bVar.f285659f) == null) {
            return false;
        }
        baseRepairerPrefUI.startActivityForResult(new android.content.Intent((android.content.Context) baseRepairerPrefUI, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerSearchUI.class).putExtra("key_config_item_list", dp5Var.toByteArray()), 1);
        return false;
    }
}
