package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class g4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m4 f202229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202230e;

    public g4(com.tencent.mm.ui.chatting.presenter.m4 m4Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202229d = m4Var;
        this.f202230e = f0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.ui.chatting.presenter.m4 m4Var = this.f202229d;
        m4Var.m(menuItem.getItemId(), e0Var.n(m4Var.f202542e, this.f202230e.f198411d), 10);
    }
}
