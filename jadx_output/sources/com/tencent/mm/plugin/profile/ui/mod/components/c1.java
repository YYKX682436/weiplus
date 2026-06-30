package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes9.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NestedScrollEditText f153888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153889e;

    public c1(com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText, com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var) {
        this.f153888d = nestedScrollEditText;
        this.f153889e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText = this.f153888d;
        nestedScrollEditText.requestFocus();
        nestedScrollEditText.postDelayed(new com.tencent.mm.plugin.profile.ui.mod.components.b1(nestedScrollEditText, this.f153889e), 100L);
    }
}
