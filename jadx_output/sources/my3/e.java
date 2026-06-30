package my3;

/* loaded from: classes13.dex */
public final class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332798d;

    public e(my3.q qVar) {
        this.f332798d = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        my3.q qVar = this.f332798d;
        if (!qVar.f332830p) {
            int i17 = qVar.f332825h;
            if (i17 >= 10) {
                qVar.f332825h = 0;
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "try bind service more than 10 times, abandon and clear bind info");
                my3.q.wi(qVar, 17);
                qVar.Zi(2);
            } else {
                qVar.f332825h = i17 + 1;
                com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bind service expire, try start service again, retry times = " + qVar.f332825h);
                my3.q.wi(qVar, 16);
                my3.q.Di(qVar, null);
            }
        }
        return false;
    }
}
