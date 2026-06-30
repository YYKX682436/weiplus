package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class s2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137675d;

    public s2(com.tencent.mm.plugin.fts.logic.e3 e3Var) {
        this.f137675d = e3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.logic.e3 e3Var = this.f137675d;
        if (!e3Var.f137518i) {
            e3Var.f137518i = true;
            o13.y yVar = e3Var.f137514e;
            if (yVar != null) {
                ((com.tencent.mm.plugin.fts.t) yVar).b(131112, new com.tencent.mm.plugin.fts.logic.u2(e3Var, null));
            }
        }
        e3Var.f137520n.dead();
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|mBackgroundTimer";
    }
}
