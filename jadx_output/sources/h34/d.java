package h34;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f278494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f278495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h34.f f278496f;

    public d(h34.f fVar, boolean z17, boolean z18) {
        this.f278496f = fVar;
        this.f278494d = z17;
        this.f278495e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f278494d;
        boolean z18 = this.f278495e;
        h34.f fVar = this.f278496f;
        if (z17) {
            h34.f.a(fVar, null, -1L, z18);
            return;
        }
        if (!fVar.f278510i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack netscen not return.");
            return;
        }
        if (fVar.f278514p != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicFingerPrintRecorder", "tryCallBack device not ready!");
            return;
        }
        h34.j jVar = fVar.f278511m;
        if (jVar == null) {
            h34.f.a(fVar, null, -1L, z18);
            return;
        }
        r45.js5 H = jVar.H();
        h34.j jVar2 = fVar.f278511m;
        jVar2.getClass();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = jVar2.f278545e;
        if (j17 > 0 && j17 < currentTimeMillis) {
            currentTimeMillis = j17;
        }
        h34.f.a(fVar, H, currentTimeMillis, z18);
    }
}
