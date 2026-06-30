package zi4;

/* loaded from: classes4.dex */
public abstract class h0 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f473223g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host, yz5.a requestFactory) {
        super(cmdId, weakReference, host);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(requestFactory, "requestFactory");
        this.f473223g = requestFactory;
    }

    @Override // zi4.a
    public final void a(byte[] bArr, yz5.l callback) {
        com.tencent.mm.protobuf.f fVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = this.f473180d;
        if (bArr != null) {
            try {
                java.lang.Object invoke = this.f473223g.invoke();
                ((com.tencent.mm.protobuf.f) invoke).parseFrom(bArr);
                fVar = (com.tencent.mm.protobuf.f) invoke;
                if (fVar == null) {
                }
                b(fVar, new zi4.r1(callback, this));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusAsyncActionHandler", "handleRequest cmd=" + str + ", err=" + th6.getMessage());
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusAsyncActionHandler", "handleRequest: cmd=" + str + ", request is null");
        fVar = null;
        b(fVar, new zi4.r1(callback, this));
    }

    public abstract void b(com.tencent.mm.protobuf.f fVar, zi4.r1 r1Var);
}
