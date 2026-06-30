package k72;

/* loaded from: classes14.dex */
public class l implements com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k72.n f304737a;

    public l(k72.n nVar) {
        this.f304737a = nVar;
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
    public void onCanReflect() {
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
    public void onFailed(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionEngine", "detect action failed, %s %s %s", java.lang.Integer.valueOf(i17), str, str2);
        k72.n nVar = this.f304737a;
        nVar.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 43L, 1L, false);
        k72.m mVar = nVar.f304739b;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
    public void onRecordingDone(byte[][] bArr, int i17, int i18) {
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionEngine", "notify start record, frameDatas.length: %s, width: %s, height: %s", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceCheckActionEngine", "onRecordingDone, frameData is null!!");
        }
        k72.n nVar = this.f304737a;
        nVar.getClass();
        k72.j.f304725a.f304736k = false;
        k72.m mVar = nVar.f304739b;
        if (mVar != null) {
            k72.q qVar = (k72.q) mVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "onStartRecord, frameDatas: %s, width: %s, height: %s", bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (bArr != null) {
                k72.u uVar = qVar.f304743a;
                uVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionMgr", "processRecordFrameData, frames: %s, width: %s, height: %s", bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                k72.t tVar = uVar.f304760r;
                if (tVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "onStartUpload");
                    com.tencent.mm.sdk.platformtools.u3.h(new l72.e((l72.j) tVar));
                }
                k72.s sVar = new k72.s(uVar, bArr, i17, i18);
                com.tencent.mm.sdk.platformtools.n3 n3Var = uVar.f304762t;
                if (n3Var != null) {
                    n3Var.post(sVar);
                }
            }
        }
    }

    @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame
    public void onSuccess(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckActionEngine", "detect action success: %s", java.lang.Integer.valueOf(i17));
        k72.n nVar = this.f304737a;
        nVar.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 42L, 1L, false);
        k72.m mVar = nVar.f304739b;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
