package kf3;

/* loaded from: classes.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307402d;

    public n0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307402d = massSendHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "masssendapp");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f307402d);
        return true;
    }
}
