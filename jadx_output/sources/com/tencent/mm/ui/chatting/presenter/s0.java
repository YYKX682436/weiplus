package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.t0 f202448e;

    public s0(com.tencent.mm.ui.chatting.presenter.t0 t0Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202448e = t0Var;
        this.f202447d = f0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.presenter.t0 t0Var = this.f202448e;
        t0Var.f202472a.m(menuItem.getItemId(), pt0.f0.Li(t0Var.f202472a.f202542e, this.f202447d.f198411d), 1);
    }
}
