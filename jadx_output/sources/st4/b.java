package st4;

/* loaded from: classes9.dex */
public class b extends st4.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI f412611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI) {
        super(walletPayUCardElementUI, null);
        this.f412611d = walletPayUCardElementUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI = this.f412611d;
        com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.U6(walletPayUCardElementUI, walletPayUCardElementUI.f181235f, editable);
    }
}
