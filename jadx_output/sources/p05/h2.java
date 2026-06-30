package p05;

/* loaded from: classes.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350536d;

    public h2(int i17) {
        this.f350536d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(188);
        p05.k2 k2Var = p05.k2.f350567a;
        yy.a aVar = (yy.a) ((zy.r) i95.n0.c(zy.r.class));
        int i17 = this.f350536d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WaveVideoModelResMgr", "force update subtype " + i17 + " result " + k2Var.d(aVar.Bi(188, i17), i17));
    }
}
