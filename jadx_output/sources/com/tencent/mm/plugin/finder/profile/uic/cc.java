package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class cc implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ic f123592d;

    public cc(com.tencent.mm.plugin.finder.profile.uic.ic icVar) {
        this.f123592d = icVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof nr2.m) {
            com.tencent.mm.plugin.finder.profile.uic.ic icVar = this.f123592d;
            nr2.m mVar = (nr2.m) j5Var;
            if (kotlin.jvm.internal.o.b(xy2.c.e(icVar.getContext()), mVar.o())) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Sk(icVar.getContext(), mVar, icVar.isSelfFlag(), icVar.getUsername());
            } else if (mVar.g()) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).cj(icVar.getContext(), mVar, icVar.isSelfFlag(), icVar.getUsername());
            } else {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Sk(icVar.getContext(), mVar, icVar.isSelfFlag(), icVar.getUsername());
            }
        }
    }
}
