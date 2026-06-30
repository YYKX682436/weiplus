package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class u1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137686d;

    public u1(com.tencent.mm.plugin.fts.logic.l2 l2Var) {
        this.f137686d = l2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.logic.l2 l2Var = this.f137686d;
        l2Var.k(0);
        l2Var.f137616r.dead();
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|mBackgroundTimer";
    }
}
