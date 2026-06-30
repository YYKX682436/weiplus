package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x3 f202518e;

    public w3(com.tencent.mm.ui.chatting.presenter.x3 x3Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202518e = x3Var;
        this.f202517d = f0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.presenter.x3 x3Var = this.f202518e;
        x3Var.f202537a.m(menuItem.getItemId(), pt0.f0.Li(x3Var.f202537a.f202542e, this.f202517d.f198411d), 3);
    }
}
