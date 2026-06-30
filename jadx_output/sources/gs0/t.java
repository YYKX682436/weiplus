package gs0;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f275022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f275023e;

    public t(gs0.w wVar, long j17) {
        this.f275022d = wVar;
        this.f275023e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f275022d.f275042l) {
            com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, already stop");
            return;
        }
        if (this.f275022d.f275039i == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, rgb2yuvEGLEnvironment already relase");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, timestamp:" + this.f275023e);
        os0.g gVar = this.f275022d.f275038h;
        if (gVar != null) {
            gVar.o();
        }
        rs0.h hVar = this.f275022d.f275039i;
        android.opengl.EGLExt.eglPresentationTimeANDROID(hVar != null ? hVar.f399292a : null, hVar != null ? hVar.f399293b : null, this.f275023e);
        rs0.g gVar2 = rs0.i.f399296a;
        rs0.h hVar2 = this.f275022d.f275039i;
        gVar2.x(hVar2 != null ? hVar2.f399292a : null, hVar2 != null ? hVar2.f399293b : null);
        this.f275022d.f275044n++;
    }
}
