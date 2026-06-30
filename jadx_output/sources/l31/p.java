package l31;

/* loaded from: classes9.dex */
public final class p implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.q f315381d;

    public p(l31.q qVar) {
        this.f315381d = qVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSubscribeMsgListForDialogTask", "getSubscribeMsgListForDialogTask end errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        ((ku5.t0) ku5.t0.f312615d).B(new l31.o(i17, i18, this.f315381d, subscribeMsgRequestResult, errMsg));
    }
}
