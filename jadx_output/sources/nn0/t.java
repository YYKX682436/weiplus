package nn0;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.u f338628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338629e;

    public t(nn0.u uVar, yz5.a aVar) {
        this.f338628d = uVar;
        this.f338629e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.u uVar = this.f338628d;
        try {
            nn0.b bVar = uVar.A;
            if (bVar != null) {
                bVar.k();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(uVar.f338563d, e17, "CustomGLRenderImp initGLComponentWithoutSurface failed!", new java.lang.Object[0]);
        }
        try {
            nn0.b bVar2 = uVar.A;
            if (bVar2 != null && !uVar.G) {
                int i17 = uVar.N;
                if (i17 == 2) {
                    bVar2.e();
                } else if (i17 == 1) {
                    bVar2.f();
                } else {
                    bVar2.e();
                }
                uVar.G = true;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(uVar.f338563d, e18, "CustomGLRenderImp initProgram failed!", new java.lang.Object[0]);
        }
        if (uVar.f338564e && uVar.N == 2 && uVar.f338579w == null) {
            try {
                uVar.f338579w = new q05.c();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e(uVar.f338563d, "create sharpen surface failed!");
                uVar.f338564e = false;
            }
        }
        this.f338629e.invoke();
    }
}
