package ft4;

/* loaded from: classes2.dex */
public final class k1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI f266644d;

    public k1(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI) {
        this.f266644d = walletLedgerPersonUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initData$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initData$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initData$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI = this.f266644d;
            if (w17 > 0) {
                android.widget.TextView textView = walletLedgerPersonUI.f180479r;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("headerBkDescView");
                    throw null;
                }
                textView.setVisibility(0);
            } else {
                android.widget.TextView textView2 = walletLedgerPersonUI.f180479r;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("headerBkDescView");
                    throw null;
                }
                textView2.setVisibility(8);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI$initData$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
