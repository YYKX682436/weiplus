package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l2 f202226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202227e;

    public g2(com.tencent.mm.ui.chatting.presenter.l2 l2Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202226d = l2Var;
        this.f202227e = f0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202226d;
        l2Var.m(menuItem.getItemId(), e0Var.n(l2Var.f202542e, this.f202227e.f198411d), 9);
    }
}
