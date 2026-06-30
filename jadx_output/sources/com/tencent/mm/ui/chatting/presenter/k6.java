package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class k6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.f0 f202300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l6 f202302f;

    public k6(com.tencent.mm.ui.chatting.presenter.l6 l6Var, com.tencent.mm.ui.chatting.adapter.f0 f0Var, int i17) {
        this.f202302f = l6Var;
        this.f202300d = f0Var;
        this.f202301e = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.adapter.f0 f0Var = this.f202300d;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UrlHistoryListPresenter", "item is null! position:%s", java.lang.Integer.valueOf(this.f202301e));
            return;
        }
        com.tencent.mm.ui.chatting.presenter.l6 l6Var = this.f202302f;
        l6Var.f202330a.m(menuItem.getItemId(), pt0.f0.Li(l6Var.f202330a.f202542e, f0Var.f198411d), 2);
    }
}
