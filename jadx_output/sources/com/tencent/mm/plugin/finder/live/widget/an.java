package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class an implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f117788d;

    public an(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f117788d = mnVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f117788d;
        int u07 = mnVar.f119093q.u0(view);
        if (u07 < 0 || u07 >= mnVar.f119099w.size()) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) mnVar.f119099w.get(u07)).getCustom(0);
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        if (username == null || username.length() == 0) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveLinkInviteAnchorWidget", "username is null or empty");
            return;
        }
        r45.xn1 xn1Var = new r45.xn1();
        xn1Var.set(0, (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) mnVar.f119099w.get(u07)).getCustom(0));
        mnVar.C.put(username, new hi2.a(xn1Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
