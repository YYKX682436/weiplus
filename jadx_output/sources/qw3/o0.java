package qw3;

/* loaded from: classes9.dex */
public class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI f367185d;

    public o0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI bankRemitDetailUI) {
        this.f367185d = bankRemitDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitDetailUI", "back press");
        this.f367185d.finish();
        return false;
    }
}
