package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.i f202234e;

    public h(com.tencent.mm.ui.chatting.presenter.i iVar, com.tencent.mm.ui.chatting.adapter.f0 f0Var) {
        this.f202234e = iVar;
        this.f202233d = f0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.presenter.i iVar = this.f202234e;
        iVar.f202255a.m(menuItem.getItemId(), pt0.f0.Li(iVar.f202255a.f202542e, this.f202233d.f198411d), 5);
    }
}
