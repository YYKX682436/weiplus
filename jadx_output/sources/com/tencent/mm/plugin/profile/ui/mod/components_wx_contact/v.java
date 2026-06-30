package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f154137e;

    public v(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f154136d = i0Var;
        this.f154137e = wxRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154136d;
        i0Var.d7();
        this.f154137e.post(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.u(i0Var));
    }
}
