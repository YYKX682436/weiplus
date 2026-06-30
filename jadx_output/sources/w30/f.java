package w30;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent event = (com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new w30.e(event));
        return false;
    }
}
