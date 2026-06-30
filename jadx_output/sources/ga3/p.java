package ga3;

/* loaded from: classes15.dex */
public class p implements j35.b0 {
    public p(ga3.v vVar) {
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 80) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission requestCode is not for microphone");
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission system permission denied");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "LiteApp requestAudioPermission permission is granted");
        }
    }
}
