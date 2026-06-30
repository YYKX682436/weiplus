package ts0;

/* loaded from: classes10.dex */
public final class k implements android.hardware.Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ts0.l f421555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f421556b;

    public k(ts0.l lVar, yz5.l lVar2) {
        this.f421555a = lVar;
        this.f421556b = lVar2;
    }

    @Override // android.hardware.Camera.PictureCallback
    public void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
        try {
            kotlin.jvm.internal.o.d(camera);
            yj0.a.j(camera, "com/tencent/mm/media/widget/camera/CommonCamera1$takePhotoRawData$3", "onPictureTaken", "([BLandroid/hardware/Camera;)V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f421555a.f421558w, "takePicture: resume preview fail, exception %s", e17.getMessage());
        }
        this.f421556b.invoke(bArr);
    }
}
