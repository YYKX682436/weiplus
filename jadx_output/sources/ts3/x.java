package ts3;

/* loaded from: classes.dex */
public class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421703d;

    public x(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421703d = readerAppUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421703d;
        y7Var.l(intent.putExtra("Contact_User", readerAppUI.f155063n).putExtra("reportSessionId", readerAppUI.f155062m), readerAppUI);
        return true;
    }
}
