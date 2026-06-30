package ds0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242814d;

    public e(ds0.d0 d0Var) {
        this.f242814d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ds0.d0 d0Var = this.f242814d;
        d0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "mixMusic onDecodeEnd delay check, isPostEncodeEnd:" + d0Var.f242812v + ", mixCount:" + d0Var.f242813w + ", decodeMusicFrameCount:" + d0Var.f242807q);
        if (d0Var.f242812v) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        d0Var.h(new byte[0], android.os.SystemClock.elapsedRealtime(), true);
    }
}
