package pm1;

/* loaded from: classes14.dex */
public final class i extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f356823d;

    public i(pm1.o oVar) {
        this.f356823d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        an1.d dVar = an1.d.f8838a;
        pm1.o oVar = this.f356823d;
        oVar.f356834f = java.lang.Boolean.valueOf(dVar.a(oVar.f356835g));
        com.tencent.mars.xlog.Log.i(oVar.f356829a, "isHeadsetPlugged = " + oVar.f356834f);
    }
}
