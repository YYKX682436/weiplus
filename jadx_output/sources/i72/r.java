package i72;

/* loaded from: classes14.dex */
public class r implements i72.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i72.z f289434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceDetectView f289435b;

    public r(com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView, i72.z zVar) {
        this.f289435b = faceDetectView;
        this.f289434a = zVar;
    }

    @Override // i72.z
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "hy: camera preview init done : %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.facedetect.views.FaceDetectView.f100118w;
            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = this.f289435b;
            faceDetectView.getClass();
            faceDetectView.c();
        }
        i72.z zVar = this.f289434a;
        if (zVar != null) {
            zVar.a(i17);
        }
    }
}
