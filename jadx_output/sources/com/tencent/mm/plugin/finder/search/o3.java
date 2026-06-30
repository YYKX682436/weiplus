package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class o3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.search.o3 f125801a = new com.tencent.mm.plugin.finder.search.o3();

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
        ml2.v1 v1Var = ml2.v1.f328140e;
        lVarArr[3] = new jz5.l("live_enter_status", 1L);
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
