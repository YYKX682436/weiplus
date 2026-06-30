package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f125806a;

    public p(kotlin.jvm.internal.h0 h0Var) {
        this.f125806a = h0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        jz5.l lVar = new jz5.l("behaviour_session_id", Ri);
        boolean z17 = false;
        lVarArr[0] = lVar;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) this.f125806a.f310123d).getCustom(0);
        if (finderContact != null && finderContact.getLiveStatus() == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
