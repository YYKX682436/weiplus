package ls0;

/* loaded from: classes10.dex */
public final class j implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320845d;

    public j(ls0.k kVar) {
        this.f320845d = kVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.String str = this.f320845d.f320848b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFrameAvailable, thread:");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", surface timestamp:");
        android.graphics.SurfaceTexture surfaceTexture2 = this.f320845d.f320854h;
        sb6.append(surfaceTexture2 != null ? java.lang.Long.valueOf(surfaceTexture2.getTimestamp()) : null);
        sb6.append(", drawInOnFrameAvailable:");
        sb6.append(this.f320845d.f320861o);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ls0.k kVar = this.f320845d;
        android.graphics.SurfaceTexture surfaceTexture3 = kVar.f320854h;
        if (surfaceTexture3 != null) {
            if (surfaceTexture3.getTimestamp() <= 0) {
                kVar.f320865s++;
            } else {
                kVar.f320865s = 0;
            }
            if (!kVar.f320855i || surfaceTexture3.getTimestamp() > 0) {
                kVar.f320870x = surfaceTexture3.getTimestamp();
            } else {
                com.tencent.mars.xlog.Log.i(kVar.f320848b, "first frame available and new timestamp still zero!!");
                if (kVar.f320865s >= 3) {
                    com.tencent.mars.xlog.Log.i(kVar.f320848b, "continue 3 frames pts is zero!!!");
                    kVar.f320861o = false;
                    yz5.a aVar = kVar.f320863q;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
            }
            if (!kVar.f320855i) {
                kVar.f320855i = true;
            }
            if (kVar.f320861o) {
                android.graphics.Bitmap bitmap = kVar.f320859m;
                if (bitmap != null) {
                    ls0.k.a(kVar, kVar.f320870x, bitmap, null);
                    return;
                }
                long j17 = kVar.f320870x;
                yz5.l lVar = kVar.f320858l;
                android.graphics.Bitmap bitmap2 = lVar != null ? (android.graphics.Bitmap) lVar.invoke(java.lang.Long.valueOf(surfaceTexture3.getTimestamp() / 1000)) : null;
                yz5.l lVar2 = kVar.f320860n;
                ls0.k.a(kVar, j17, bitmap2, lVar2 != null ? (android.graphics.Bitmap) lVar2.invoke(java.lang.Long.valueOf(surfaceTexture3.getTimestamp() / 1000)) : null);
            }
        }
    }
}
