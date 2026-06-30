package so5;

/* loaded from: classes14.dex */
public final class k0 implements xq4.d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f410858e;

    /* renamed from: f, reason: collision with root package name */
    public zq4.b f410859f;

    /* renamed from: g, reason: collision with root package name */
    public int f410860g;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f410862i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f410863m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.v f410864n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f410865o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f410866p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f410867q;

    /* renamed from: r, reason: collision with root package name */
    public int f410868r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f410871u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f410872v;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f410857d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: h, reason: collision with root package name */
    public int f410861h = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f410869s = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f410870t = kotlinx.coroutines.sync.l.a(false, 1, null);

    public static boolean c(so5.k0 k0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        k0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCamera: callFromResume ");
        sb6.append(z17);
        sb6.append(" bFaceFirst:");
        zq4.b bVar = k0Var.f410859f;
        sb6.append(bVar != null ? java.lang.Boolean.valueOf(bVar.f475041a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", sb6.toString());
        if (z17 || com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.isForeground() || z18) {
            zq4.b bVar2 = k0Var.f410859f;
            kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.g0(k0Var, bVar2 != null ? bVar2.f475041a : true, null), 3, null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "startCamera: not in foreground, delay open cam");
        k0Var.f410867q = true;
        return false;
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        so5.e0 e0Var = new so5.e0(this, i17, i18, null);
        if (this.f410861h >= 0) {
            kotlinx.coroutines.l.d(this.f410857d, null, null, new so5.d0(e0Var, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIPCameraHelper", "onCameraPreviewApply: cur mid id " + this.f410861h);
        this.f410862i = e0Var;
    }

    public final void a(int i17) {
        android.util.Size size;
        android.util.Size size2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "bindMid() called with: mid = " + i17 + ", oldMid = " + this.f410861h);
        int i18 = this.f410861h;
        if (i18 == -1 || i18 == i17) {
            this.f410861h = i17;
            if (this.f410862i != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIPCameraHelper", "bindMid: run block");
                kotlinx.coroutines.l.d(this.f410857d, null, null, new so5.b0(this, null), 3, null);
                return;
            }
            return;
        }
        this.f410861h = i17;
        if (b()) {
            zq4.b bVar = this.f410859f;
            int i19 = 0;
            int width = (bVar == null || (size2 = bVar.f475046f) == null) ? 0 : size2.getWidth();
            zq4.b bVar2 = this.f410859f;
            if (bVar2 != null && (size = bVar2.f475046f) != null) {
                i19 = size.getHeight();
            }
            Y(width, i19);
        }
    }

    public final boolean b() {
        zq4.b bVar = this.f410859f;
        boolean z17 = bVar != null ? bVar.f475050j : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "cameraOn: " + z17 + ", switching " + this.f410865o);
        return z17 || this.f410865o;
    }

    public final void d() {
        zq4.b bVar = this.f410859f;
        boolean z17 = false;
        boolean z18 = bVar != null ? bVar.f475050j : false;
        boolean z19 = bVar != null ? bVar.f475041a : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIPCameraHelper", "updateFlutterCameraState: camOn " + z18 + " faceCam " + z19 + ' ');
        com.tencent.mm.plugin.voipmp.platform.v0 v0Var = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        if (!this.f410858e && z18) {
            z17 = true;
        }
        v0Var.q(z17, z19, so5.j0.f410854a);
    }

    @Override // xq4.d
    public void o() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIPCameraHelper", "onCameraError: onCameraError");
        this.f410867q = true;
    }

    @Override // xq4.d
    public void s() {
        this.f410872v = true;
    }
}
