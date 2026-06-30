package ux0;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.b f431776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f431777e;

    public a(ux0.b bVar, kotlin.coroutines.Continuation continuation) {
        this.f431776d = bVar;
        this.f431777e = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f431776d.f431781g == null) {
            com.tencent.mars.xlog.Log.e("ByteBufferVideoFrameSender", "captureFrame: imageReader is null");
            this.f431777e.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.coroutines.Continuation continuation = this.f431777e;
            com.tencent.maas.camerafun.MJVideoFrame mJVideoFrame = this.f431776d.f431779e;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(mJVideoFrame != null ? new com.tencent.maas.camerafun.MJVideoFrame(mJVideoFrame.getWidth(), mJVideoFrame.getHeight(), mJVideoFrame.getRowStride(), mJVideoFrame.getPixelStride(), mJVideoFrame.getBuffer().duplicate(), mJVideoFrame.getFrameCWAngle(), mJVideoFrame.getTimestamp()) : null));
        }
    }
}
