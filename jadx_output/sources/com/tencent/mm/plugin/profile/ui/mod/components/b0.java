package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class b0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153882a;

    public b0(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var) {
        this.f153882a = j0Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153882a;
        if (((java.util.ArrayList) j0Var.f153931s).isEmpty()) {
            ((mr3.d) ((jz5.n) j0Var.f153935w).getValue()).a(j0Var.getActivity(), ((java.util.ArrayList) j0Var.f153931s).size());
        }
    }

    @Override // lr3.a
    public void b() {
        this.f153882a.f153933u = true;
    }
}
