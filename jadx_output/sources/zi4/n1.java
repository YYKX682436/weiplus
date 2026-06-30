package zi4;

/* loaded from: classes4.dex */
public final class n1 extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f473242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.l1.f473235d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f473242h = "MicroMsg.FLTStatusSimpleTestHandler";
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        com.tencent.mars.xlog.Log.i(this.f473242h, "handleAsyncRequest: " + java.lang.Thread.currentThread().getName());
        bw5.yb ybVar = new bw5.yb();
        ybVar.f35423d = "This is Native Status Data";
        ybVar.f35424e[1] = true;
        pm0.v.X(new zi4.m1(this, (bw5.zb) fVar));
        asyncResult.a(ybVar, 0L, "");
    }
}
