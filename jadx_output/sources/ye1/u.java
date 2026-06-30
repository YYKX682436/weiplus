package ye1;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.w f461201d;

    public u(ye1.w wVar, ye1.t tVar) {
        this.f461201d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.v vVar = this.f461201d.f461205d;
        if (vVar != null) {
            af1.m mVar = (af1.m) vVar;
            synchronized (mVar.f4492a) {
                if (!mVar.f4492a.K) {
                    if (mVar.f4492a.M()) {
                        af1.x xVar = mVar.f4492a;
                        int i17 = ((m8.k) xVar.f4503r).f324583k;
                        if (i17 != 1) {
                            if (i17 == 2 || i17 == 3) {
                                int g17 = xVar.M() ? ((m8.k) xVar.f4503r).g() : 0;
                                af1.x xVar2 = mVar.f4492a;
                                if (g17 != xVar2.H) {
                                    xVar2.D(g17);
                                    mVar.f4492a.H = g17;
                                }
                            } else if (i17 != 4) {
                            }
                        }
                        xVar.V(false);
                    }
                }
            }
        }
        if (this.f461201d.f461202a) {
            ye1.w wVar = this.f461201d;
            wVar.f461204c.postDelayed(wVar.f461206e, wVar.f461203b);
        }
    }
}
