package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
class FTS5SearchServiceNotifyLogic$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShouldRescanMessagesEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTS5SearchServiceNotifyLogic$1(com.tencent.mm.plugin.fts.logic.e3 e3Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f137444d = e3Var;
        this.__eventId = -224286085;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ShouldRescanMessagesEvent shouldRescanMessagesEvent) {
        ((com.tencent.mm.plugin.fts.t) this.f137444d.f137514e).b(65574, new com.tencent.mm.plugin.fts.logic.r2(this));
        return false;
    }
}
