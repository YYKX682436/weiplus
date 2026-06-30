package lv1;

/* loaded from: classes8.dex */
public class d implements dn.k {
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
            com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "duplicate request, ignore this request, media id is %s", str);
            return 0;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.b(str, 4, i17, null);
            return 0;
        }
        if (gVar != null) {
            try {
                com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95516e.Ue(str, gVar.field_finishedLength, gVar.field_toltalLength);
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "updateProgressChange: " + e17);
            }
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CDNDownloadServiceSlot", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.b(str, 4, hVar.field_retCode, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadServiceSlot", "cdn trans suceess, media id : %s", str);
                com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.b(str, 3, 0, null);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
