package k72;

/* loaded from: classes14.dex */
public class h implements com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult {
    public h(k72.k kVar) {
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
    public void onFailed(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "onFailed s:" + str + " s1:" + str2);
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "onSuccess");
    }
}
