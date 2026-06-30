package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class r1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.s1 f137661d;

    public r1(com.tencent.mm.plugin.fts.logic.s1 s1Var) {
        this.f137661d = s1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.logic.s1 s1Var = this.f137661d;
        o13.y yVar = s1Var.f137664e;
        if (yVar == null) {
            return false;
        }
        ((com.tencent.mm.plugin.fts.t) yVar).b(s1Var.f137666g + 1, new com.tencent.mm.plugin.fts.logic.n1(s1Var));
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|updateKefuContactTimer";
    }
}
