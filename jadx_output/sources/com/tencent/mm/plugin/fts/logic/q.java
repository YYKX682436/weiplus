package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f137650d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137651e;

    public q(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137651e = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.d0 d0Var = (com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class);
        if (!(d0Var.f137386n || !d0Var.f137387o)) {
            int i17 = this.f137650d + 1;
            this.f137650d = i17;
            if (i17 < 6) {
                return true;
            }
        }
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137651e;
        ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(131093, new com.tencent.mm.plugin.fts.logic.b1(lVar, null));
        this.f137650d = 0;
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|delayIndexTimer";
    }
}
