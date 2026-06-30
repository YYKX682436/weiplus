package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137659d;

    public r(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137659d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137659d;
        ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(131093, new com.tencent.mm.plugin.fts.logic.b1(lVar, null));
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|atOnceIndexTimer";
    }
}
