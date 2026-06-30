package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes9.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NestedScrollEditText f154030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154031e;

    public b1(com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var) {
        this.f154030d = nestedScrollEditText;
        this.f154031e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText = this.f154030d;
        nestedScrollEditText.requestFocus();
        nestedScrollEditText.postDelayed(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.a1(nestedScrollEditText, this.f154031e), 100L);
    }
}
