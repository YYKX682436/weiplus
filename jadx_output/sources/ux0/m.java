package ux0;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.o f431822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.frame.VideoFrame f431823e;

    public m(ux0.o oVar, com.tencent.maas.camstudio.frame.VideoFrame videoFrame) {
        this.f431822d = oVar;
        this.f431823e = videoFrame;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ux0.o oVar = this.f431822d;
        if (oVar.f431828g == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f431839u;
        com.tencent.maas.camstudio.frame.VideoFrame videoFrame = this.f431823e;
        if (arrayList.remove(videoFrame)) {
            ((ux0.c) videoFrame).f431785a.close();
        } else {
            com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "releaseCapturedFrame: frame not found");
        }
    }
}
