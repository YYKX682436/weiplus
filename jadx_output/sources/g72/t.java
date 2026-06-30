package g72;

/* loaded from: classes14.dex */
public class t implements i72.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269245a;

    public t(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
        this.f269245a = faceDetectUI;
    }

    @Override // i72.z
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onPreviewInitDone: %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = this.f269245a;
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.f100069z;
            faceDetectUI.getClass();
            if (h72.s.e().f279474h) {
                h72.s.e().g(faceDetectUI.f100080q.getCameraRotation(), faceDetectUI.f100080q.getCameraPreivewWidth(), faceDetectUI.f100080q.getCameraPreviewHeight(), false, 0, faceDetectUI.f100080q.getCameraBestWidth(), faceDetectUI.f100080q.getCameraPreviewHeight(), true, false);
            }
            faceDetectUI.f100080q.d(false, faceDetectUI.f100071e);
            com.tencent.mm.sdk.platformtools.u3.i(new g72.u(faceDetectUI), 500L);
            return;
        }
        if (i17 == 1) {
            int i19 = com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.f100069z;
            faceDetectUI.U6(4, 90016, "preview error", faceDetectUI.getString(com.tencent.mm.R.string.jio));
        } else if (i17 == 2) {
            java.lang.String string = faceDetectUI.getString(com.tencent.mm.R.string.hh8);
            int i27 = com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.f100069z;
            faceDetectUI.U6(4, 90008, "camera permission not granted", string);
        }
    }
}
