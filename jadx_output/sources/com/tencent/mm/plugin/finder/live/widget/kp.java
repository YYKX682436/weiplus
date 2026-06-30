package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class kp implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pp f118850d;

    public kp(com.tencent.mm.plugin.finder.live.widget.pp ppVar) {
        this.f118850d = ppVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f118850d;
        int u07 = ppVar.f119398d.u0(view);
        if (u07 < 0 || u07 >= ppVar.f119400f.size()) {
            return;
        }
        r45.xn1 xn1Var = ((vi2.d) ppVar.f119400f.get(u07)).f437544d;
        java.lang.String username = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        if (username == null || username.length() == 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveMicRecommAnchorsCardPanelWidget", "username is null or empty");
        } else {
            ppVar.f119404j.put(username, new hi2.a(((vi2.d) ppVar.f119400f.get(u07)).f437544d));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
