package yv1;

/* loaded from: classes12.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yv1.j0 f466092d = new yv1.j0();

    public j0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.clean.CleanService$Companion$exptChangeEventListener$2$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "ExptChangeEvent callback");
                yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
                b1Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "tryCreateSecondIndex");
                ((ku5.t0) ku5.t0.f312615d).h(new yv1.z0(b1Var), "MicroMsg.CleanService");
                yv1.b1 b1Var2 = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
                b1Var2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "tryCreateThirdIndex");
                ((ku5.t0) ku5.t0.f312615d).h(new yv1.a1(b1Var2), "MicroMsg.CleanService");
                return false;
            }
        };
    }
}
