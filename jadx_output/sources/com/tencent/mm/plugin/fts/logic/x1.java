package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class x1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137732n;

    public x1(com.tencent.mm.plugin.fts.logic.l2 l2Var, com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$1 fTS5SearchMessageLogic$1) {
        this.f137732n = l2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteKefuMessage";
    }

    @Override // p13.c
    public boolean i() {
        w13.h hVar = this.f137732n.f137609h;
        ((com.tencent.mm.plugin.fts.o) hVar.f342198f).j(java.lang.String.format("UPDATE %s SET status = ? WHERE aux_index LIKE '%%%s';", hVar.r(), "@kefu.openim"), new java.lang.Integer[]{-1});
        return false;
    }
}
