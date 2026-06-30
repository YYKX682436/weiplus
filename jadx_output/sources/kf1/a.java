package kf1;

/* loaded from: classes15.dex */
public abstract class a implements kf1.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f307166d = new java.util.concurrent.ConcurrentHashMap();

    public void a() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f307166d).values().iterator();
        while (it.hasNext()) {
            ((gf0.g) ((kf1.f) it.next())).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onPause");
        }
    }

    public void b() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f307166d).values().iterator();
        while (it.hasNext()) {
            gf0.g gVar = (gf0.g) ((kf1.f) it.next());
            gVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onStart");
            gf0.e eVar = gVar.f271202a.f271208e;
            if (eVar != null) {
                gf0.r rVar = ((gf0.l) eVar).f271221a;
                gf0.u uVar = rVar.f271232e;
                gf0.u uVar2 = gf0.u.f271245e;
                if (uVar != uVar2) {
                    rVar.f271232e = uVar2;
                }
            }
        }
    }

    public void c(java.lang.String tempFilePath, int i17, int i18) {
        int i19;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f307166d).values().iterator();
        while (it.hasNext()) {
            gf0.g gVar = (gf0.g) ((kf1.f) it.next());
            gVar.getClass();
            kotlin.jvm.internal.o.g(tempFilePath, "tempFilePath");
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "onRecorderStateChange onStop, tempFilePath: " + tempFilePath + ",duration: " + i17 + ",fileSize: " + i18);
            gf0.i iVar = gVar.f271202a;
            double b17 = iVar.b();
            double d17 = iVar.f271204a;
            if (b17 < d17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingAudioRecorder", "onRecorderStateChange record too short! audioTimeInSecond: " + iVar.b() + ", recordMinTimeInSecond: " + d17 + ',');
                i19 = 99993;
            } else {
                i19 = 0;
            }
            double b18 = iVar.b();
            double d18 = iVar.f271205b;
            if (b18 > d18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingAudioRecorder", "onRecorderStateChange record too long! audioTimeInSecond: " + iVar.b() + ", recordMaxTimeInSecond: " + d18 + ',');
                i19 = 99994;
            }
            gf0.e eVar = iVar.f271208e;
            if (eVar != null) {
                ((gf0.l) eVar).a(i19, tempFilePath);
            }
        }
    }
}
