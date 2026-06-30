package fn3;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final fn3.a f264463a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback f264464b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f264465c;

    public d(fn3.a handler, com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback callback) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f264463a = handler;
        this.f264464b = callback;
    }

    public static /* synthetic */ void b(fn3.d dVar, com.tencent.mm.protobuf.f fVar, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callback");
        }
        if ((i18 & 1) != 0) {
            fVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            str = "";
        }
        dVar.a(fVar, i17, str);
    }

    public void a(com.tencent.mm.protobuf.f fVar, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (this.f264465c) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        com.tencent.wechat.aff.newlife.NewLifeActionResponse newBuilder = com.tencent.wechat.aff.newlife.NewLifeActionResponse.newBuilder();
        fn3.a aVar = this.f264463a;
        newBuilder.cmdId = aVar.f264456a;
        newBuilder.errCode = i17;
        newBuilder.errMsg = errMsg;
        if (fVar != null) {
            newBuilder.proto = com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto.newBuilder().setByteArray(com.tencent.mm.protobuf.g.b(fVar.toByteArray())).build();
        }
        com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback callback = this.f264464b;
        if (callback != null) {
            callback.onDoActionComplete(aVar.f264457b, newBuilder.build());
        }
        aVar.getClass();
        this.f264465c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeAffAsyncCallback", "taskId:" + aVar.f264457b + " cmdId:" + aVar.f264456a + " cost:" + (c01.id.c() - aVar.f264458c));
    }
}
