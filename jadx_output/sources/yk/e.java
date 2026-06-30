package yk;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk.h f462743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yk.h hVar) {
        super(0);
        this.f462743d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final yk.h hVar = this.f462743d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.app.plugin.worker.DBDataCleanService$exptChangeEventListener$2$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i(yk.h.this.f462747d, "ExptChangeEvent callback");
                qt0.b.f366491a.c(yk.g.f462746d);
                return false;
            }
        };
    }
}
