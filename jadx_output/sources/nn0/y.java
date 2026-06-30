package nn0;

/* loaded from: classes14.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.z f338634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338635e;

    public y(nn0.z zVar, yz5.a aVar) {
        this.f338634d = zVar;
        this.f338635e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.z zVar = this.f338634d;
        try {
            nn0.b bVar = zVar.f338620s;
            if (bVar != null) {
                bVar.k();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(zVar.f338608d, e17, "CustomGLRenderImp initGLComponentWithoutSurface failed!", new java.lang.Object[0]);
        }
        try {
            nn0.b bVar2 = zVar.f338620s;
            if (bVar2 != null && !zVar.f338624w) {
                int i17 = zVar.B;
                if (i17 == 2) {
                    bVar2.e();
                } else if (i17 == 1) {
                    bVar2.f();
                } else {
                    bVar2.e();
                }
                zVar.f338624w = true;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(zVar.f338608d, e18, "CustomGLRenderImp initProgram failed!", new java.lang.Object[0]);
        }
        if (zVar.f338609e && zVar.B == 2 && zVar.f338618q == null) {
            try {
                zVar.f338618q = new q05.c();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e(zVar.f338608d, "create sharpen surface failed!");
                zVar.f338609e = false;
            }
        }
        this.f338635e.invoke();
    }
}
