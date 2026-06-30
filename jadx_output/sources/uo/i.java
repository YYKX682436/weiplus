package uo;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f429514d;

    public i(long j17) {
        this.f429514d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f429514d / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "openCameraErrOkay: deltaMin=" + j17);
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = java.lang.String.valueOf(j17);
        strArr[1] = uo.n.f429522a.c() ? "1" : "0";
        ap.a.a(1, "openCameraErrOkay", th6, null, strArr);
    }
}
