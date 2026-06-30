package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class o1 extends com.tencent.mm.sdk.event.n {
    public o1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MMTrimMemoryEvent event = (com.tencent.mm.autogen.events.MMTrimMemoryEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        gr.q qVar = gr.q.f274676a;
        gr.r rVar = gr.q.f274677b;
        com.tencent.mars.xlog.Log.e("MicroMsg.QQSmileyManager", "received MMTrimMemoryEvent: clear cache size: %s", java.lang.Integer.valueOf(rVar.b(true)));
        rVar.a(true);
        return false;
    }
}
