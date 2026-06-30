package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 f209385d;

    public y(com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var) {
        this.f209385d = e0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e0 e0Var = this.f209385d;
        if (itemId == 1) {
            j75.f Q6 = e0Var.Q6();
            if (Q6 != null) {
                Q6.B3(new xi5.e(1));
                return;
            }
            return;
        }
        if (itemId != 2) {
            com.tencent.mars.xlog.Log.w(pf5.o.TAG, "showForwardToWeWorkBottomSheet: menuItem.itemId:" + menuItem.getItemId());
        } else {
            j75.f Q62 = e0Var.Q6();
            if (Q62 != null) {
                Q62.B3(new xi5.e(2));
            }
        }
    }
}
