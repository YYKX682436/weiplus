package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class w5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f202522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x5 f202523e;

    public w5(com.tencent.mm.ui.chatting.presenter.x5 x5Var, com.tencent.mm.storage.f9 f9Var) {
        this.f202523e = x5Var;
        this.f202522d = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f202523e.f202540a.m(menuItem.getItemId(), this.f202522d, 11);
    }
}
