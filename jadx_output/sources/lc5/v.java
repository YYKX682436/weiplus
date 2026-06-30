package lc5;

/* loaded from: classes9.dex */
public final class v extends com.tencent.mm.sdk.event.n {
    public v() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DeleteMsgEvent event = (com.tencent.mm.autogen.events.DeleteMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.y3 y3Var = event.f54086g;
        long j17 = y3Var.f8425a;
        java.lang.String str = y3Var.f8427c;
        lc5.t tVar = lc5.t.f318032d;
        kotlin.jvm.internal.o.d(str);
        tVar.b(j17, str);
        return true;
    }
}
