package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.f6 f178159d;

    public e6(com.tencent.mm.plugin.wallet.balance.ui.lqt.f6 f6Var) {
        this.f178159d = f6Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.f6 f6Var = this.f178159d;
        if (itemId < f6Var.f178174a.size()) {
            com.tencent.mm.wallet_core.ui.r1.V(f6Var.f178175b, ((java.lang.String) f6Var.f178174a.get(itemId)).split("\\|\\|")[1], false);
        }
    }
}
