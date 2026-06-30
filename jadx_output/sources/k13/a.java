package k13;

/* loaded from: classes10.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI f303190d;

    public a(com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI baseForceNotifyShowUI) {
        this.f303190d = baseForceNotifyShowUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f303190d.onBackPressed();
        return true;
    }
}
