package k72;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f304726a;

    /* renamed from: b, reason: collision with root package name */
    public int f304727b;

    /* renamed from: c, reason: collision with root package name */
    public int f304728c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304729d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f304730e;

    /* renamed from: f, reason: collision with root package name */
    public int f304731f;

    /* renamed from: g, reason: collision with root package name */
    public int f304732g;

    /* renamed from: h, reason: collision with root package name */
    public int f304733h;

    /* renamed from: i, reason: collision with root package name */
    public int f304734i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame f304735j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f304736k = false;

    public k(k72.h hVar) {
    }

    public void a(byte[] bArr, android.hardware.Camera camera) {
        if (this.f304736k && com.tencent.youtu.ytfacetrack.YTFaceTrack.IsInstanceExist()) {
            int rotate = com.tencent.youtu.ytcommon.tools.YTCameraSetting.getRotate(this.f304726a, this.f304727b, 1);
            com.tencent.mm.plugin.facedetect.e.wi();
            com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus[] DoDetectionProcessYUV = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance().DoDetectionProcessYUV(bArr, this.f304733h, this.f304734i, rotate, null);
            if (DoDetectionProcessYUV == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "No face");
                return;
            }
            vz2.c.l("faceRecognized");
            com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus = DoDetectionProcessYUV[0];
            if (com.tencent.youtu.ytposedetect.YTPoseDetectInterface.isDetecting()) {
                if (faceStatus == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "Detecting result：out of rect");
                    this.f304730e.setText(com.tencent.mm.R.string.c7l);
                    return;
                }
                com.tencent.youtu.ytcommon.tools.YTFaceUtils.shelterJudge(faceStatus.pointsVis);
                com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame poseDetectOnFrame = this.f304735j;
                if (poseDetectOnFrame != null) {
                    com.tencent.youtu.ytposedetect.YTPoseDetectInterface.poseDetect(faceStatus.xys, faceStatus.pointsVis, this.f304728c, bArr, camera, faceStatus.pitch, faceStatus.yaw, faceStatus.roll, poseDetectOnFrame, 0);
                }
            }
        }
    }
}
