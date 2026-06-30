package dk2;

/* loaded from: classes3.dex */
public final class gb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f233522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233523e;

    public gb(dk2.tb tbVar, gk2.e eVar) {
        this.f233522d = tbVar;
        this.f233523e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.tb tbVar = this.f233522d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "init ".concat(tbVar.c()));
        tbVar.f234126g = this.f233523e;
    }
}
