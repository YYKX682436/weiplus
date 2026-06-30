package ov1;

/* loaded from: classes13.dex */
public class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov1.c f349161d;

    public a(ov1.c cVar) {
        this.f349161d = cVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            gVar.toString();
        }
        if (hVar != null) {
            hVar.toString();
        }
        if (i17 == -21006) {
            com.tencent.mars.xlog.Log.i("FileDownloaderWAGameProxy", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("FileDownloaderWAGameProxy", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            ov1.c.b(this.f349161d, str, 4, i17, null, false);
            return 0;
        }
        if (gVar == null) {
            if (hVar != null) {
                int i18 = hVar.field_retCode;
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("FileDownloaderWAGameProxy", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                    ov1.c.b(this.f349161d, str, 4, hVar.field_retCode, null, hVar.field_isResume);
                } else {
                    com.tencent.mars.xlog.Log.i("FileDownloaderWAGameProxy", "cdn trans suceess, media id : %s", str);
                    ov1.c.b(this.f349161d, str, 3, 0, null, hVar.field_isResume);
                }
            }
            return 0;
        }
        long j17 = gVar.field_finishedLength;
        long j18 = gVar.field_toltalLength;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f349161d.f349165a;
        concurrentHashMap.containsKey(str);
        if (concurrentHashMap.containsKey(str)) {
            kq.p pVar = ((ov1.b) concurrentHashMap.get(str)).f349162a;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("FileDownloaderWAGameProxy", "error proxy_callback null");
            } else {
                pVar.c(str, j17, j18);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
