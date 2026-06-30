package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class k extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137575e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137576f;

    /* renamed from: g, reason: collision with root package name */
    public w13.a f137577g;

    /* renamed from: h, reason: collision with root package name */
    public final int f137578h = 131093;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f137579i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final l75.q0 f137580m = new com.tencent.mm.plugin.fts.logic.j(this);

    public static final void j(com.tencent.mm.plugin.fts.logic.k kVar, com.tencent.mm.storage.a3 a3Var) {
        long j17;
        o13.v fj6;
        kVar.getClass();
        java.util.List A0 = a3Var.A0();
        kotlin.jvm.internal.o.f(A0, "getMemberList(...)");
        java.lang.String g07 = kz5.n0.g0(A0, "\u200b", null, null, 0, null, null, 62, null);
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        if (zVar == null || (fj6 = ((com.tencent.mm.plugin.fts.d0) zVar).fj()) == null) {
            j17 = 0;
        } else {
            java.lang.String str = a3Var.field_chatroomname;
            if (str == null) {
                str = "";
            }
            j17 = ((com.tencent.mm.plugin.fts.p) fj6).b(str);
        }
        long j18 = j17;
        w13.a aVar = kVar.f137577g;
        if (aVar != null) {
            long size = a3Var.A0().size();
            java.lang.String str2 = a3Var.field_chatroomname;
            aVar.u(2097168, 54, size, str2 == null ? "" : str2, j18, g07);
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        o13.y yVar = this.f137576f;
        if (uVar == null || yVar == null) {
            kotlin.jvm.internal.o.f(null, "search(...)");
            throw null;
        }
        int i17 = uVar.f351140b;
        if (i17 == 8) {
            com.tencent.mm.plugin.fts.logic.g gVar = new com.tencent.mm.plugin.fts.logic.g(this, uVar);
            ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, gVar);
            return gVar;
        }
        if (i17 == 13) {
            com.tencent.mm.plugin.fts.logic.h hVar = new com.tencent.mm.plugin.fts.logic.h(this, uVar);
            ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, hVar);
            return hVar;
        }
        if (i17 != 15) {
            kotlin.jvm.internal.o.d(null);
            throw null;
        }
        com.tencent.mm.plugin.fts.logic.i iVar = new com.tencent.mm.plugin.fts.logic.i(this, uVar);
        ((com.tencent.mm.plugin.fts.t) yVar).b(-65536, iVar);
        return iVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchChatroomMemberLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Success!");
        this.f137575e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137576f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        o13.u cj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(5);
        this.f137577g = cj6 instanceof w13.a ? (w13.a) cj6 : null;
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this.f137580m);
        o13.y yVar = this.f137575e;
        if (yVar == null) {
            return true;
        }
        ((com.tencent.mm.plugin.fts.t) yVar).b(this.f137578h, new com.tencent.mm.plugin.fts.logic.e(this));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().remove(this.f137580m);
        this.f137577g = null;
        this.f137575e = null;
        this.f137576f = null;
        return true;
    }

    public final boolean k(com.tencent.mm.storage.a3 chatroomMember) {
        boolean z17;
        kotlin.jvm.internal.o.g(chatroomMember, "chatroomMember");
        java.lang.String r17 = c01.z1.r();
        int i17 = chatroomMember.field_chatroomStatus;
        l75.e0 e0Var = com.tencent.mm.storage.a3.f193742e2;
        if ((((long) i17) & 2) == 2) {
            return true;
        }
        java.lang.String str = chatroomMember.field_memberlist;
        if (str != null) {
            kotlin.jvm.internal.o.d(r17);
            if (r26.n0.B(str, r17, false)) {
                z17 = true;
                return !z17 || chatroomMember.A0().size() < 3;
            }
        }
        z17 = false;
        if (z17) {
            return true;
        }
    }
}
