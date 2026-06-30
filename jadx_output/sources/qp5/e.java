package qp5;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.WalletFormView f365839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365840e;

    public e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f365839d = walletFormView;
        this.f365840e = mMActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f365839d.getContext();
        qp5.y.b(this.f365840e, c01.z1.I() ? com.tencent.mm.R.layout.a3i : com.tencent.mm.R.layout.a3h, com.tencent.mm.R.string.f491032bn0);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
