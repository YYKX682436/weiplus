package com.tencent.mm.ui.chatting;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class AutoPlay$3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.v0 f198148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlay$3(com.tencent.mm.ui.chatting.v0 v0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198148d = v0Var;
        this.__eventId = 675629679;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
        if (this.f198148d.f202766i != revokeMsgEvent.f54713g.f6394a) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.y0(this));
        return false;
    }
}
