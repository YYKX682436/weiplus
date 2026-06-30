package k13;

/* loaded from: classes8.dex */
public final class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303285d;

    public y(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI) {
        this.f303285d = forceNotifyListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f303285d.onBackPressed();
        return true;
    }
}
