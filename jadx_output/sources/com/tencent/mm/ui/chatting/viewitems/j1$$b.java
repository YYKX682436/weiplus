package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final /* synthetic */ class j1$$b implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.g0 f204221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204222b;

    public /* synthetic */ j1$$b(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar) {
        this.f204221a = g0Var;
        this.f204222b = dVar;
    }

    @Override // r.a
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = this.f204221a;
        boolean z17 = g0Var instanceof com.tencent.mm.ui.chatting.viewitems.v1;
        yb5.d dVar = this.f204222b;
        if (z17) {
            com.tencent.mm.ui.chatting.viewitems.j1.t(booleanValue, (com.tencent.mm.ui.chatting.viewitems.v1) g0Var, dVar);
            return null;
        }
        if (!(g0Var instanceof com.tencent.mm.ui.chatting.viewitems.ao)) {
            return null;
        }
        com.tencent.mm.ui.chatting.viewitems.bo.h(booleanValue, (com.tencent.mm.ui.chatting.viewitems.ao) g0Var, dVar);
        return null;
    }
}
