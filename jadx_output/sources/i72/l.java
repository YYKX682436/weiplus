package i72;

/* loaded from: classes14.dex */
public class l implements com.tencent.mm.plugin.facedetect.model.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i72.m f289423a;

    public l(i72.m mVar) {
        this.f289423a = mVar;
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public void a(byte[] bArr) {
        i72.m mVar = this.f289423a;
        com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = mVar.f289427d;
        if (!faceDetectCameraView.B) {
            if (faceDetectCameraView.A == null) {
                faceDetectCameraView.A = com.tencent.mm.plugin.facedetect.model.s.f100033d.m(java.lang.Integer.valueOf(bArr.length));
            }
            byte[] bArr2 = mVar.f289427d.A;
            if (bArr2 == null || bArr2.length < bArr.length) {
                return;
            }
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            mVar.f289427d.A = bArr;
        }
        com.tencent.mm.plugin.facedetect.model.s sVar = com.tencent.mm.plugin.facedetect.model.s.f100033d;
        synchronized (sVar) {
            sVar.k(bArr);
        }
        com.tencent.mm.plugin.facedetect.model.y.f100041f.post(new i72.k(this));
    }

    @Override // com.tencent.mm.plugin.facedetect.model.u
    public com.tencent.mm.memory.a b() {
        return com.tencent.mm.plugin.facedetect.model.s.f100033d;
    }
}
