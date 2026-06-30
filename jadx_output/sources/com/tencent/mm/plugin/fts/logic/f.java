package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class f extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f137523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.k f137524o;

    public f(com.tencent.mm.plugin.fts.logic.k kVar, com.tencent.mm.storage.a3 chatroomMember) {
        kotlin.jvm.internal.o.g(chatroomMember, "chatroomMember");
        this.f137524o = kVar;
        this.f137523n = chatroomMember;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildSingleChatroomMemberTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildChatroomMember ");
        com.tencent.mm.storage.a3 a3Var = this.f137523n;
        sb6.append(a3Var.field_chatroomname);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", sb6.toString());
        com.tencent.mm.plugin.fts.logic.k kVar = this.f137524o;
        w13.a aVar = kVar.f137577g;
        if (aVar != null) {
            aVar.m0(new int[]{2097168}, a3Var.field_chatroomname);
        }
        if (kVar.k(a3Var)) {
            return true;
        }
        com.tencent.mm.plugin.fts.logic.k.j(kVar, a3Var);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "username: " + this.f137523n.field_chatroomname;
    }
}
