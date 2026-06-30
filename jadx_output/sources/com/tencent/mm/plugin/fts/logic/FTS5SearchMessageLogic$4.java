package com.tencent.mm.plugin.fts.logic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class FTS5SearchMessageLogic$4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShouldRescanMessagesEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTS5SearchMessageLogic$4(com.tencent.mm.plugin.fts.logic.l2 l2Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f137442d = l2Var;
        this.__eventId = -224286085;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ShouldRescanMessagesEvent shouldRescanMessagesEvent) {
        ((com.tencent.mm.plugin.fts.t) this.f137442d.f137606e).b(65574, new com.tencent.mm.plugin.fts.logic.t1(this));
        return false;
    }
}
