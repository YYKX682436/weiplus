package gt4;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView f275567d;

    public v(com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f275567d = walletAwardShakeAnimView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletAwardShakeAnimView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView walletAwardShakeAnimView = this.f275567d;
        if (!walletAwardShakeAnimView.f180707i) {
            walletAwardShakeAnimView.f180707i = true;
            com.tencent.mm.sdk.platformtools.v5.b(walletAwardShakeAnimView.getContext(), com.tencent.mm.R.string.j3j);
            walletAwardShakeAnimView.b();
            gt4.x xVar = walletAwardShakeAnimView.f180713r;
            if (xVar != null) {
                ((gt4.z1) xVar).a(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletAwardShakeAnimView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
