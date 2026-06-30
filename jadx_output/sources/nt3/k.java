package nt3;

/* loaded from: classes10.dex */
public final class k extends fs0.g {
    public final boolean A;
    public final yz5.p B;
    public final nt3.f0 C;
    public final nt3.f D;
    public long E;
    public final long F;
    public boolean G;
    public yz5.l H;
    public yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public java.nio.ByteBuffer f339792J;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f339793x;

    /* renamed from: y, reason: collision with root package name */
    public final int f339794y;

    /* renamed from: z, reason: collision with root package name */
    public final int f339795z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList imageList, long j17, long j18, hs0.a aVar, android.view.Surface surface, int i17, int i18, boolean z17, int i19, yz5.p pVar) {
        super(j17, j18, aVar, surface, i19, false);
        kotlin.jvm.internal.o.g(imageList, "imageList");
        this.f339793x = imageList;
        this.f339794y = i17;
        this.f339795z = i18;
        this.A = z17;
        this.B = pVar;
        nt3.f0 f0Var = new nt3.f0();
        this.C = f0Var;
        long j19 = 1000 / 15;
        this.F = j19;
        f0Var.f339784d = j19;
        if (this.f266234d == null && z17) {
            android.media.ImageReader newInstance = android.media.ImageReader.newInstance(i17, i18, 1, 3);
            kotlin.jvm.internal.o.d(newInstance);
            newInstance.setOnImageAvailableListener(new nt3.g(this), null);
            this.f266234d = newInstance.getSurface();
        }
        nt3.f fVar = new nt3.f(this.f266234d, f0Var);
        this.D = fVar;
        f0Var.f339781a = i17;
        f0Var.f339782b = i18;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecFakeDecoder", "init useX264Encoder width:%s, height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 > 0 && i18 > 0 && this.f339792J == null) {
                this.f339792J = java.nio.ByteBuffer.allocateDirect(i17 * i18 * 4);
            }
        }
        fVar.b();
        fVar.a(new nt3.h(this));
    }

    @Override // fs0.g
    public void c() {
        super.c();
        nt3.f fVar = this.D;
        com.tencent.mm.sdk.platformtools.n3 n3Var = fVar.f339780f;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.GLThread", "stop but handler is null");
        } else {
            n3Var.removeCallbacksAndMessages(null);
            fVar.f339780f.post(new nt3.e(fVar));
        }
    }

    @Override // fs0.g
    public void d(boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
        if (this.G) {
            return;
        }
        this.D.a(new nt3.i(this));
    }

    @Override // fs0.g
    public void e() {
        nt3.j jVar = new nt3.j(this);
        nt3.f fVar = this.D;
        fVar.a(jVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecFakeDecoder", "requestRender");
        if (this.G) {
            return;
        }
        fVar.a(new nt3.i(this));
    }
}
