package xr0;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public volatile xr0.j f456175a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xr0.j f456176b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xr0.j f456177c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f456178d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f456179e;

    public k(xr0.j surfaceSize, xr0.j cameraSize, xr0.j outputSize, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        surfaceSize = (i18 & 1) != 0 ? new xr0.j(0, 0) : surfaceSize;
        cameraSize = (i18 & 2) != 0 ? new xr0.j(0, 0) : cameraSize;
        outputSize = (i18 & 4) != 0 ? new xr0.j(0, 0) : outputSize;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        z17 = (i18 & 16) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(surfaceSize, "surfaceSize");
        kotlin.jvm.internal.o.g(cameraSize, "cameraSize");
        kotlin.jvm.internal.o.g(outputSize, "outputSize");
        this.f456175a = surfaceSize;
        this.f456176b = cameraSize;
        this.f456177c = outputSize;
        this.f456178d = i17;
        this.f456179e = z17;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitModel", "updateOutputSize before >> origin >> " + this);
        xr0.j jVar = this.f456175a;
        boolean z17 = false;
        if (jVar.f456173a > 0 && jVar.f456174b > 0) {
            xr0.j jVar2 = this.f456176b;
            if (jVar2.f456173a > 0 && jVar2.f456174b > 0) {
                z17 = true;
            }
            if (z17) {
                if (this.f456178d == 90 || this.f456178d == 270) {
                    if (1 / this.f456176b.a() > this.f456175a.a()) {
                        this.f456177c.f456173a = this.f456176b.f456174b;
                        this.f456177c.f456174b = (int) (this.f456177c.f456173a * this.f456175a.a());
                    } else {
                        this.f456177c.f456174b = this.f456176b.f456173a;
                        this.f456177c.f456173a = (int) (this.f456177c.f456174b / this.f456175a.a());
                    }
                } else if (this.f456176b.a() > this.f456175a.a()) {
                    this.f456177c.f456173a = this.f456176b.f456173a;
                    this.f456177c.f456174b = (int) (this.f456177c.f456173a * this.f456175a.a());
                } else {
                    this.f456177c.f456174b = this.f456176b.f456174b;
                    this.f456177c.f456173a = (int) (this.f456177c.f456174b / this.f456175a.a());
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitModel", "updateOutputSize after >>  " + this);
    }

    public final boolean b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitModel", "updateSurfaceSize >> param: " + i17 + ' ' + i18 + " origin >> " + this);
        if (this.f456175a.f456173a == i17 && this.f456175a.f456174b == i18) {
            return false;
        }
        this.f456175a.f456173a = i17;
        this.f456175a.f456174b = i18;
        a();
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.k)) {
            return false;
        }
        xr0.k kVar = (xr0.k) obj;
        return kotlin.jvm.internal.o.b(this.f456175a, kVar.f456175a) && kotlin.jvm.internal.o.b(this.f456176b, kVar.f456176b) && kotlin.jvm.internal.o.b(this.f456177c, kVar.f456177c) && this.f456178d == kVar.f456178d && this.f456179e == kVar.f456179e;
    }

    public int hashCode() {
        return (((((((this.f456175a.hashCode() * 31) + this.f456176b.hashCode()) * 31) + this.f456177c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f456178d)) * 31) + java.lang.Boolean.hashCode(this.f456179e);
    }

    public java.lang.String toString() {
        return "surfaceSize: " + this.f456175a + " cameraSize: " + this.f456176b + " outputSize: " + this.f456177c + " preview: " + this.f456178d + " mirror: " + this.f456179e;
    }
}
