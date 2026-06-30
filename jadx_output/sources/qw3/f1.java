package qw3;

/* loaded from: classes9.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI f367156d;

    public f1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI bankRemitSelectArriveTimeUI) {
        this.f367156d = bankRemitSelectArriveTimeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f367156d.finish();
        return false;
    }
}
