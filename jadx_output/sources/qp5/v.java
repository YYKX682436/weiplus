package qp5;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f365853d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f365854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.WalletFormView f365855f;

    public v(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        this.f365854e = mMActivity;
        this.f365855f = walletFormView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.MMActivity mMActivity = this.f365854e;
        mMActivity.hideVKB();
        if (mMActivity instanceof com.tencent.mm.wallet_core.ui.WalletBaseUI) {
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity).hideTenpayKB();
        }
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(mMActivity);
        oVar.g(true, true, false);
        oVar.f212307n = new qp5.u(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        oVar.d(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
