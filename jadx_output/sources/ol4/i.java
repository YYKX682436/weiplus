package ol4;

/* loaded from: classes14.dex */
public final class i implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346157d;

    public i(ol4.q qVar) {
        this.f346157d = qVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public final void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        java.lang.String str = "errorType:" + i17 + "|errorCode:" + i18 + "|arg1:" + j17 + "|arg2:" + j18;
        ol4.q qVar = this.f346157d;
        com.tencent.mars.xlog.Log.e(qVar.f346197s, "tp OnError:" + str);
        if (1220 == i17) {
            return;
        }
        qVar.r(true);
        ll4.a aVar = qVar.f346182d;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, str);
        }
    }
}
