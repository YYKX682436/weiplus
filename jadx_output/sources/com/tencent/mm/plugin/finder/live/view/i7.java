package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i7 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116381a;

    public i7(com.tencent.mm.plugin.finder.live.view.k7 k7Var) {
        this.f116381a = k7Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        java.lang.String str;
        java.util.LinkedList linkedList;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.live.view.k7 k7Var = this.f116381a;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = k7Var.f116441J;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        bm2.x5 x5Var = this.f116381a.Q;
        com.tencent.mm.plugin.finder.live.view.k7.e0(k7Var, false, null, str, (x5Var == null || (linkedList = x5Var.f22432f) == null || (h32Var = (r45.h32) kz5.n0.k0(linkedList)) == null) ? 0 : h32Var.getInteger(0), 2, null);
        return true;
    }
}
