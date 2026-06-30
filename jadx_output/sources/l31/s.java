package l31;

/* loaded from: classes9.dex */
public final class s implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.t f315393d;

    public s(l31.t tVar) {
        this.f315393d = tVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSubscribeMsgUIStatusTask", "getSubscribeStatus end errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        com.tencent.mm.sdk.platformtools.u3.h(new l31.r(i17, i18, this.f315393d, subscribeMsgRequestResult, errMsg));
    }
}
