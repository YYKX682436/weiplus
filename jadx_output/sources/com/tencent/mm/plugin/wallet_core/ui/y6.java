package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f180812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180813e;

    public y6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI, java.util.List list) {
        int i17;
        this.f180813e = walletOrderInfoOldUI;
        this.f180812d = null;
        this.f180812d = new java.util.ArrayList();
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = (com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) list.get(i18);
            if (promotions != null && (!com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179776i) || (i17 = promotions.f179780p) == 2 || i17 == 1)) {
                this.f180812d.add((com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) list.get(i18));
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f180812d;
        if (list != null) {
            return ((java.util.ArrayList) list).size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) ((java.util.ArrayList) this.f180812d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0339  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.y6.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
