package h72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f279431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.g f279432e;

    public f(h72.g gVar, long j17) {
        this.f279432e = gVar;
        this.f279431d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f279432e.f279433d.f279442o.f279468b) {
            h72.s sVar = this.f279432e.f279433d.f279442o;
            long j17 = this.f279431d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sVar.j("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            h72.s sVar2 = this.f279432e.f279433d.f279442o;
            sVar2.f279467a = sVar2.f279481o.a();
            h72.s sVar3 = this.f279432e.f279433d.f279442o;
            sVar3.f279467a.f(sVar3.f279478l);
            h72.s sVar4 = this.f279432e.f279433d.f279442o;
            sVar4.f279467a.w(sVar4.f279479m);
            this.f279432e.f279433d.f279442o.f279467a.v(true);
            h72.h hVar = this.f279432e.f279433d;
            h72.s sVar5 = hVar.f279442o;
            sVar5.f279467a.r(sVar5.f279476j, sVar5.f279477k, hVar.f279439i, hVar.f279440m);
            this.f279432e.f279433d.f279442o.f279467a.setMute(true);
            h72.s sVar6 = this.f279432e.f279433d.f279442o;
            sVar6.f279467a.k(sVar6.f279471e);
            h72.s sVar7 = this.f279432e.f279433d.f279442o;
            sVar7.f279467a.u(sVar7.f279483q);
            h72.s sVar8 = this.f279432e.f279433d.f279442o;
            sVar8.f279470d = h72.q.INITIALIZED;
            sVar8.j("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            java.lang.Runnable runnable = this.f279432e.f279433d.f279441n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
