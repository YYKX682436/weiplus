package l31;

/* loaded from: classes9.dex */
public final class x implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.y f315401d;

    public x(l31.y yVar) {
        this.f315401d = yVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        l31.y yVar;
        k31.a aVar;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.SetGlobalNotifySwitchInfoTask", "SetGlobalNotifySwitchInfoTask end errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + errMsg);
        if (i17 == 0 && i18 == 0 && subscribeMsgRequestResult != null && (aVar = (yVar = this.f315401d).f315402e) != null) {
            ((k31.h) aVar).h(yVar.f315403f);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l31.w(this.f315401d, i17, i18, errMsg, subscribeMsgRequestResult));
    }
}
