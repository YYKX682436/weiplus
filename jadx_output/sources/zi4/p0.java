package zi4;

/* loaded from: classes4.dex */
public final class p0 extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f473247h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.o0.f473244d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f473247h = "MicroMsg.FLTStatusGetCachePathDirHandler";
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        com.tencent.mars.xlog.Log.i(this.f473247h, "handleAsyncRequest: " + java.lang.Thread.currentThread().getName());
        bw5.db dbVar = new bw5.db();
        dbVar.f26416d = gm0.j1.u().d() + "textstatus/";
        dbVar.f26417e[1] = true;
        asyncResult.a(dbVar, 0L, "");
    }
}
