package com.tencent.mm.plugin.fts.logic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class FTS5SearchFeatureLogic$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.f1 f137438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTS5SearchFeatureLogic$2(com.tencent.mm.plugin.fts.logic.f1 f1Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f137438d = f1Var;
        this.__eventId = 905296653;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = checkResUpdateCacheFileEvent;
        am.r2 r2Var = checkResUpdateCacheFileEvent2.f54053g;
        if (r2Var.f7759a == 35 && r2Var.f7760b == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "CheckResUpdateCacheFileEvent: %s", r2Var.f7761c);
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.fts.logic.c1(this, checkResUpdateCacheFileEvent2), "FTS.updateFeatureList");
        }
        return true;
    }
}
