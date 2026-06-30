package f93;

/* loaded from: classes11.dex */
public final class i0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260353d;

    public i0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260353d = contactEditLabel;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260353d;
        contactEditLabel.hideVKB();
        contactEditLabel.onBackPressed();
        return false;
    }
}
