package f93;

/* loaded from: classes3.dex */
public class s3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260463d;

    public s3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260463d = contactLabelSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260463d;
        contactLabelSelectUI.getClass();
        contactLabelSelectUI.finish();
        return false;
    }
}
