package vw3;

/* loaded from: classes.dex */
public final class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI f440993d;

    public j(com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI cDNGroupKeyConfigUI) {
        this.f440993d = cDNGroupKeyConfigUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440993d.finish();
        return false;
    }
}
