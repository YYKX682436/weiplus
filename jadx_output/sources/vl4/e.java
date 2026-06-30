package vl4;

/* loaded from: classes11.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        jm4.g3 f17;
        jm4.d1 p17;
        com.tencent.mm.autogen.events.TingChatRoomStateActionEvent event = (com.tencent.mm.autogen.events.TingChatRoomStateActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        vl4.u uVar = vl4.u.f437904a;
        jm4.n2 a17 = uVar.a();
        boolean z17 = ((a17 == null || (f17 = ((jm4.p2) a17).f()) == null || (p17 = ((jm4.h3) f17).p()) == null) ? null : ((jm4.e1) p17).a()) != null;
        am.zy zyVar = event.f54894g;
        zyVar.f8615a = z17;
        if (uVar.c(a17) && z17) {
            zyVar.f8616b = true;
        }
        return true;
    }
}
