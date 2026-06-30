package yv1;

/* loaded from: classes5.dex */
public final class w extends com.tencent.mm.sdk.event.n {
    public w() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CleanWxFileIndexEvent event = (com.tencent.mm.autogen.events.CleanWxFileIndexEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        yv1.a0.a(yv1.v.f466175d);
        return true;
    }
}
