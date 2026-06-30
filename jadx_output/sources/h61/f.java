package h61;

/* loaded from: classes9.dex */
public class f implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h61.h f279144d;

    public f(h61.h hVar) {
        this.f279144d = hVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            return 0;
        }
        h61.h hVar2 = this.f279144d;
        if (hVar == null || hVar.field_retCode != 0) {
            if (hVar != null && hVar.field_retCode != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                hVar2.f279145a.d(3, -1, "doScene failed");
                return 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                hVar2.f279145a.d(3, -1, "doScene failed");
            }
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.AAImagUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        hVar2.f279145a.a(hVar.field_fileUrl, 1, hVar.field_thumbUrl, 1, "upload_" + str, hVar.field_filemd5);
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.AAImagUpload", "uploadsns cdndone pass: " + (java.lang.System.currentTimeMillis() - hVar2.f279148d) + " " + hVar.field_filemd5);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
