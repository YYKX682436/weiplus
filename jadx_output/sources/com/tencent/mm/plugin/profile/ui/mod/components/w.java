package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f153996e;

    public w(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f153995d = j0Var;
        this.f153996e = wxRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153995d;
        j0Var.e7();
        this.f153996e.post(new com.tencent.mm.plugin.profile.ui.mod.components.v(j0Var));
    }
}
