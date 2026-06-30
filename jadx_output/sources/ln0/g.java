package ln0;

/* loaded from: classes16.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319650e;

    public g(ln0.p pVar, java.lang.String str) {
        this.f319649d = pVar;
        this.f319650e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln0.p pVar = this.f319649d;
        java.lang.String str = this.f319650e;
        ln0.q d17 = pVar.d(str);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper resetP2pStat: params not found for streamId=" + str);
        } else {
            d17.f319699p = 0L;
            d17.f319700q = 0L;
            d17.f319701r = 0L;
            d17.f319702s = 0L;
            d17.f319703t = 0L;
            d17.f319704u = 0L;
            d17.f319705v = 0L;
            d17.f319706w = 0L;
            d17.f319707x = 0L;
            d17.f319708y = 0L;
            d17.f319709z = 0L;
            d17.A = 0L;
            d17.B = 0L;
            d17.C = 0L;
            d17.D = 0L;
            d17.E = 0L;
            d17.F = 0L;
            d17.G = 0L;
            d17.H = 0L;
            d17.I = 0L;
            d17.f319683J = 0L;
            d17.K = 0L;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper resetP2pStat streamId=" + str);
        }
        pVar.f319680i.d();
        pVar.f319680i.c(0L, 20000L);
    }
}
