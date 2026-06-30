package hr3;

/* loaded from: classes11.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283642d;

    public i(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283642d = addDescriptionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.profile.ui.AddDescriptionUI.B;
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f283642d;
        addDescriptionUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", addDescriptionUI.f153646y);
        addDescriptionUI.setResult(-1, intent);
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI.U6(addDescriptionUI, true);
        addDescriptionUI.hideVKB();
        return false;
    }
}
