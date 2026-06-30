package qs2;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs2.q f366315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qs2.q qVar) {
        super(0);
        this.f366315d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final qs2.q qVar = this.f366315d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsPostInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1
            {
                this.__eventId = 1901115748;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsPostInfoEvent snsPostInfoEvent) {
                com.tencent.mm.autogen.events.SnsPostInfoEvent event = snsPostInfoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new qs2.n(qs2.q.this, event));
                return true;
            }
        };
    }
}
