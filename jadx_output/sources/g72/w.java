package g72;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f269248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g72.z f269249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269250f;

    public w(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI, android.graphics.Bitmap bitmap, g72.z zVar) {
        this.f269250f = faceDetectUI;
        this.f269248d = bitmap;
        this.f269249e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetect.model.s0.m(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f269250f.f100071e, this.f269248d);
        com.tencent.mm.sdk.platformtools.u3.h(new g72.v(this));
    }
}
