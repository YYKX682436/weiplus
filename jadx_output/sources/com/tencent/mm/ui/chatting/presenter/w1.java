package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x1 f202515e;

    public w1(com.tencent.mm.ui.chatting.presenter.x1 x1Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202515e = x1Var;
        this.f202514d = f0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.presenter.x1 x1Var = this.f202515e;
        x1Var.f202534a.m(menuItem.getItemId(), pt0.f0.Li(x1Var.f202534a.f202542e, this.f202514d.f198411d), 12);
    }
}
