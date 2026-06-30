package tz2;

/* loaded from: classes14.dex */
public final /* synthetic */ class j$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz2.j f423298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423299e;

    public /* synthetic */ j$$b(tz2.j jVar, java.lang.String str) {
        this.f423298d = jVar;
        this.f423299e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tz2.j jVar = this.f423298d;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", this.f423299e);
        jVar.d();
    }
}
