package jz3;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        uy3.z.a(((com.tencent.mm.autogen.events.DestroyPreloadedWebViewEvent) iEvent).f54089g.f6217a);
        return false;
    }
}
