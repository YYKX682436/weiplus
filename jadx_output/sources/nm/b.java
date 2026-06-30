package nm;

/* loaded from: classes12.dex */
public class b implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f338426a;

    /* renamed from: b, reason: collision with root package name */
    public final lm5.d f338427b;

    public b(java.lang.Runnable runnable, lm5.d dVar) {
        this.f338426a = runnable;
        this.f338427b = dVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        lm5.d dVar = this.f338427b;
        if (!(dVar instanceof lm5.c)) {
            return dVar.d();
        }
        lm5.j jVar = lm5.d.f319600a;
        return lm5.i.a() instanceof lm5.c ? lm5.d.f319600a.f319619f : lm5.i.a().d();
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", this.f338426a, this.f338427b.d());
        try {
            java.lang.Runnable runnable = this.f338426a;
            if (runnable != null) {
                runnable.run();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FirstScreenArrangement", "ERROR: FirstScreenArrangement gonna retry!");
            }
            return null;
        } finally {
            this.f338426a = null;
        }
    }
}
