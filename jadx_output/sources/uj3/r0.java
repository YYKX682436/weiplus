package uj3;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f428341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f428342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428343f;

    public r0(yj3.g gVar, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        this.f428341d = byteBuffer;
        this.f428342e = i17;
        this.f428343f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer byteBuffer = this.f428341d;
        int i17 = this.f428342e;
        int i18 = this.f428343f;
        boolean z17 = false;
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.get(bArr);
        ((com.tencent.mm.plugin.multitalk.model.r3) com.tencent.mm.plugin.multitalk.model.e3.Ri().r()).a(false);
        com.tencent.mm.plugin.multitalk.model.r3 r3Var = (com.tencent.mm.plugin.multitalk.model.r3) com.tencent.mm.plugin.multitalk.model.e3.Ri().r();
        synchronized (r3Var) {
            if (r3Var.f150109b) {
                com.tencent.mars.xlog.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.D(bArr, i17, i18, 132);
            } else {
                com.tencent.mm.plugin.multitalk.model.g0 g0Var = r3Var.f150108a;
                if (g0Var != null) {
                    g0Var.c();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anlingao[multi_hw] cRsvd1: ");
                    com.tencent.mm.plugin.multitalk.model.f0 f0Var = g0Var.f149982w;
                    sb6.append((int) f0Var.f149948c);
                    com.tencent.mars.xlog.Log.i("MultiAvcEncoder[HWEnc]", sb6.toString());
                    if (!((f0Var.f149948c & 1) == 1)) {
                        g0Var = null;
                    }
                    if (g0Var != null) {
                        boolean z18 = g0Var.b(bArr, i17, i18, 4) >= 0;
                        com.tencent.mars.xlog.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video hw, success: " + z18);
                        if (!z18) {
                            g0Var.a(8, true, false, true);
                            r3Var.f150108a = null;
                        }
                        if (z18) {
                            z17 = true;
                        }
                    }
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.D(bArr, i17, i18, 132);
                }
            }
            if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().B() && com.tencent.mm.plugin.multitalk.model.e3.Ri().f150168m) {
                com.tencent.mm.plugin.multitalk.model.e3.Ri().Z(3, true);
            }
        }
    }
}
