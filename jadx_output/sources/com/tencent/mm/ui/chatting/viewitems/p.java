package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f205222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f205223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205224c;

    public p(r45.g92 g92Var, kotlin.jvm.internal.f0 f0Var, java.lang.String str) {
        this.f205222a = g92Var;
        this.f205223b = f0Var;
        this.f205224c = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[6];
        if (this.f205222a.getInteger(13) == 1) {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[0] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[1] = new jz5.l("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[3] = new jz5.l("finder_tab_context_id", b52.b.c());
        lVarArr[4] = new jz5.l("live_share_type", java.lang.Integer.valueOf(this.f205223b.f310116d));
        lVarArr[5] = new jz5.l("share_username", this.f205224c);
        return kz5.c1.k(lVarArr);
    }
}
