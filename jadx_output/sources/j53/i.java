package j53;

/* loaded from: classes8.dex */
public class i implements lt3.f {
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    @Override // lt3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r10, boolean r11, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.i.a(java.lang.String, boolean, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel):void");
    }

    @Override // lt3.f
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.VideoMixCallback", "onInit, taskId:%s", str);
    }

    @Override // lt3.f
    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.VideoMixCallback", "onWait, taskId:%s", str);
    }

    @Override // lt3.f
    public void d(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.VideoMixCallback", "onRun, taskId:%s, runNum:%d", str, java.lang.Integer.valueOf(i17));
    }
}
