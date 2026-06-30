package l31;

/* loaded from: classes9.dex */
public final class h implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i f315358d;

    public h(l31.i iVar) {
        this.f315358d = iVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetGlobalNotifySwitchInfoTask", "GetGlobalNotifySwitchInfoTask end errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + errMsg);
        if (i17 == 0 && i18 == 0 && subscribeMsgRequestResult != null) {
            boolean z17 = subscribeMsgRequestResult.A;
            k31.a aVar = this.f315358d.f315360e;
            if (aVar != null) {
                ((k31.h) aVar).h(z17);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l31.g(this.f315358d, i17, i18, errMsg, subscribeMsgRequestResult));
    }
}
