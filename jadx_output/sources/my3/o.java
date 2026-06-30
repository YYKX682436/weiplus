package my3;

/* loaded from: classes13.dex */
public final class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332817d;

    public o(my3.q qVar) {
        this.f332817d = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        my3.q qVar = this.f332817d;
        if (qVar.f332831q > 50) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "start service so much frequently, clear bind info");
            my3.q.wi(qVar, 18);
            qVar.Zi(1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "reset start service count");
        qVar.f332831q = 0;
        return false;
    }
}
