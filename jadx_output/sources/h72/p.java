package h72;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f279455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.s f279456e;

    public p(h72.s sVar, byte[] bArr) {
        this.f279456e = sVar;
        this.f279455d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.sight.api.ISightJNIService iSightJNIService = (com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class);
        h72.s sVar = this.f279456e;
        int i17 = sVar.f279476j;
        int i18 = sVar.f279477k;
        byte[] bArr = this.f279455d;
        iSightJNIService.mirrorCameraData(bArr, i17, i18, false);
        if (sVar.f279467a.getFrameDataCallback() != null) {
            sVar.f279467a.getFrameDataCallback().a(bArr);
        }
    }
}
