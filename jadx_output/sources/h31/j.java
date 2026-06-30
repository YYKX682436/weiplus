package h31;

/* loaded from: classes9.dex */
public final class j implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f278416a;

    public j(h31.r rVar) {
        this.f278416a = rVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        h31.r rVar = this.f278416a;
        h31.a aVar = rVar.f278434h;
        if (aVar != null) {
            int i19 = rVar.f278428b;
            if (!(errMsg.length() > 0)) {
                errMsg = "subscribe failed";
            }
            ((m31.y1) aVar).a(i19, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, errMsg);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg success bizUsername: %s, template size: %d", bizUsername, java.lang.Integer.valueOf(result.f71785h.size()));
        h31.r rVar = this.f278416a;
        java.lang.ref.WeakReference weakReference = rVar.f278427a;
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        rVar.a(context, rVar.f278428b, result);
    }
}
