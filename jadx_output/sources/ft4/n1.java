package ft4;

/* loaded from: classes12.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI f266662d;

    public n1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI) {
        this.f266662d = walletLedgerPersonUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI = this.f266662d;
        androidx.appcompat.app.AppCompatActivity context = walletLedgerPersonUI.getContext();
        android.widget.TextView textView = walletLedgerPersonUI.f180480s;
        if (textView == null) {
            kotlin.jvm.internal.o.o("allTradeBtn");
            throw null;
        }
        int c17 = i65.a.c(context, textView.getTop());
        androidx.appcompat.app.AppCompatActivity context2 = walletLedgerPersonUI.getContext();
        androidx.recyclerview.widget.RecyclerView recyclerView = walletLedgerPersonUI.f180478q;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
        int c18 = i65.a.c(context2, recyclerView.getBottom());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonUI", "detailListView.post textTop:" + c17 + " listBottom:" + c18);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = walletLedgerPersonUI.f180478q;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView2.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonAdapter");
        ft4.r0 r0Var = (ft4.r0) adapter;
        if ((c18 - 30) + 16 <= c17) {
            android.widget.TextView textView2 = walletLedgerPersonUI.f180480s;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("allTradeBtn");
                throw null;
            }
            textView2.setVisibility(0);
            android.view.View view = r0Var.f266688p;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView3 = walletLedgerPersonUI.f180480s;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("allTradeBtn");
            throw null;
        }
        textView3.setVisibility(8);
        android.view.View view2 = r0Var.f266688p;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ft4.m1 m1Var = new ft4.m1(walletLedgerPersonUI);
        r0Var.f266690r = m1Var;
        android.view.View view3 = r0Var.f266688p;
        if (view3 != null) {
            view3.setOnClickListener(m1Var);
        }
    }
}
