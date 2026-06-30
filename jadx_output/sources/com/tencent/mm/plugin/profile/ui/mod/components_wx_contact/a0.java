package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class a0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154024a;

    public a0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var) {
        this.f154024a = i0Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154024a;
        if (((java.util.ArrayList) i0Var.f154072s).isEmpty()) {
            ((mr3.d) ((jz5.n) i0Var.f154076w).getValue()).a(i0Var.getActivity(), ((java.util.ArrayList) i0Var.f154072s).size());
        }
    }

    @Override // lr3.a
    public void b() {
        this.f154024a.f154074u = true;
    }
}
