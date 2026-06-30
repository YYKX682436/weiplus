package qw3;

/* loaded from: classes9.dex */
public class n1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI f367182d;

    public n1(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI) {
        this.f367182d = bankRemitSelectPayeeUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI bankRemitSelectPayeeUI = this.f367182d;
        bankRemitSelectPayeeUI.f156540f.b(view, i17, j17, bankRemitSelectPayeeUI, bankRemitSelectPayeeUI);
        return true;
    }
}
