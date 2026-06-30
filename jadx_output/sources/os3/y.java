package os3;

/* loaded from: classes8.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348252d;

    public y(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348252d = composeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348252d;
        if ((com.tencent.mm.plugin.qqmail.ui.ComposeUI.T6(composeUI, false) && composeUI.M == 20) || composeUI.M == 21) {
            db5.e1.A(composeUI.getContext(), composeUI.getString(com.tencent.mm.R.string.f492715hk4), "", composeUI.getString(com.tencent.mm.R.string.hk6), composeUI.getString(com.tencent.mm.R.string.f490347sg), new os3.x(this), null);
            return true;
        }
        composeUI.setResult(0);
        composeUI.finish();
        return true;
    }
}
