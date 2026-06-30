package qp5;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.WalletFormView f365834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365835e;

    public d(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f365834d = walletFormView;
        this.f365835e = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f365834d;
        walletFormView.getContext();
        int i17 = c01.z1.I() ? com.tencent.mm.R.layout.d7v : com.tencent.mm.R.layout.d68;
        walletFormView.getContext();
        qp5.y.b(this.f365835e, i17, c01.z1.I() ? com.tencent.mm.R.string.khy : com.tencent.mm.R.string.khv);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
