package rw2;

/* loaded from: classes10.dex */
public final class n implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400618d;

    public n(rw2.t tVar) {
        this.f400618d = tVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        rw2.t tVar = this.f400618d;
        android.os.HandlerThread handlerThread = tVar.f400628e;
        if (!kotlin.jvm.internal.o.b(myLooper, handlerThread != null ? handlerThread.getLooper() : null)) {
            tVar.b(new rw2.m(surfaceTexture, tVar));
        } else {
            surfaceTexture.updateTexImage();
            rw2.t.a(tVar, surfaceTexture.getTimestamp());
        }
    }
}
