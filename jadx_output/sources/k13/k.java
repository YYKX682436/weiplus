package k13;

/* loaded from: classes5.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld f303229d;

    public k(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
        this.f303229d = forceNotifyAcceptUIOld;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f303229d.onBackPressed();
        return true;
    }
}
