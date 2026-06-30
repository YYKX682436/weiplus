package h72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f279416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.b f279417e;

    public a(h72.b bVar, long j17) {
        this.f279417e = bVar;
        this.f279416d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f279417e.f279418d.f279430o.f279468b) {
            h72.s sVar = this.f279417e.f279418d.f279430o;
            long j17 = this.f279416d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            h72.s sVar2 = this.f279417e.f279418d.f279430o;
            sVar2.f279467a = sVar2.f279481o.a();
            h72.s sVar3 = this.f279417e.f279418d.f279430o;
            sVar3.f279467a.f(sVar3.f279478l);
            h72.s sVar4 = this.f279417e.f279418d.f279430o;
            sVar4.f279467a.w(sVar4.f279479m);
            h72.e eVar = this.f279417e.f279418d;
            eVar.f279430o.f279467a.v(eVar.f279427i);
            h72.e eVar2 = this.f279417e.f279418d;
            h72.s sVar5 = eVar2.f279430o;
            sVar5.f279467a.r(sVar5.f279476j, sVar5.f279477k, eVar2.f279428m, eVar2.f279429n);
            this.f279417e.f279418d.f279430o.f279467a.setMute(true);
            h72.s sVar6 = this.f279417e.f279418d.f279430o;
            sVar6.f279467a.k(sVar6.f279471e);
            h72.s sVar7 = this.f279417e.f279418d.f279430o;
            sVar7.f279467a.u(sVar7.f279483q);
            h72.s sVar8 = this.f279417e.f279418d.f279430o;
            sVar8.f279470d = h72.q.INITIALIZED;
            sVar8.j("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
