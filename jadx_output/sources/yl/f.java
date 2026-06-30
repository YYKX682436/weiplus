package yl;

/* loaded from: classes12.dex */
public final class f implements wu5.h, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f462935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl.g f462936e;

    public f(yl.g gVar, yl.e eVar) {
        this.f462936e = gVar;
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f462935d = future;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SilkWriter_run";
    }

    @Override // java.lang.Runnable
    public void run() {
        yl.g gVar;
        boolean z17;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "Silk Thread start run");
        while (true) {
            synchronized (this.f462936e) {
                gVar = this.f462936e;
                z17 = gVar.f462939b;
            }
            ((java.util.concurrent.ArrayBlockingQueue) gVar.f462938a).size();
            if (z17 && this.f462936e.f462938a.isEmpty()) {
                return;
            }
            try {
                tl.h0 h0Var = (tl.h0) ((java.util.concurrent.ArrayBlockingQueue) this.f462936e.f462938a).poll(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
                if (h0Var == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "poll byte null file:" + this.f462936e.f462940c);
                } else {
                    int size = ((java.util.concurrent.ArrayBlockingQueue) this.f462936e.f462938a).size();
                    if (size > 10 || z17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SilkWriter", "speed up silkcodec queue:" + size + " stop:" + z17);
                        i17 = 0;
                    } else {
                        i17 = 1;
                    }
                    yl.a aVar = yl.g.f462937o;
                    this.f462936e.a(h0Var, (aVar.f462919a < 10 || aVar.f462920b <= 240) ? i17 : 0);
                }
            } catch (java.lang.InterruptedException unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "ThreadAmr poll null");
            }
        }
    }
}
