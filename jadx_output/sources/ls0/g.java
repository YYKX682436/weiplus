package ls0;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f320833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f320834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f320835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f320836i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ls0.k kVar, int i17, boolean z17, long j17, boolean z18, long j18) {
        super(0);
        this.f320831d = kVar;
        this.f320832e = i17;
        this.f320833f = z17;
        this.f320834g = j17;
        this.f320835h = z18;
        this.f320836i = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f320831d.f320868v) {
            com.tencent.mars.xlog.Log.i(this.f320831d.f320848b, "requestDraw textureId:" + this.f320832e);
            try {
                if (this.f320833f) {
                    long j17 = this.f320834g;
                    if (j17 != 0) {
                        android.opengl.GLES30.glWaitSync(j17, 0, -1L);
                        android.opengl.GLES30.glDeleteSync(this.f320834g);
                    }
                }
                if (this.f320835h) {
                    com.tencent.mm.sdk.platformtools.b3 b3Var = qs0.a.f366207a;
                    synchronized (b3Var) {
                        synchronized (b3Var) {
                            while (!b3Var.f192472a) {
                                try {
                                    b3Var.wait();
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                    }
                }
                ms0.c cVar = this.f320831d.f320847a;
                int i17 = this.f320832e;
                cVar.f330957m = i17;
                os0.a aVar = cVar.f330951g;
                if (aVar != null) {
                    aVar.r(i17);
                }
                this.f320831d.f320847a.p();
                ls0.k kVar = this.f320831d;
                if (kVar.f320853g != null) {
                    kVar.i(this.f320836i);
                    rs0.h hVar = this.f320831d.f320851e;
                    if (hVar != null) {
                        rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
                    }
                }
                yz5.l lVar = this.f320831d.f320852f;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f320831d.f320848b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f320831d.f320852f;
                if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e(this.f320831d.f320848b, "requestDraw not init now");
        }
        return jz5.f0.f302826a;
    }
}
