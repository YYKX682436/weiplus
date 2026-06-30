package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class t7 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.u7 f143789d;

    public t7(com.tencent.mm.plugin.lite.jsapi.comms.u7 u7Var) {
        this.f143789d = u7Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String key, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (gVar != null) {
            long j17 = gVar.field_finishedLength;
            java.util.HashMap hashMap = ra3.a.f393486a;
            kotlin.jvm.internal.o.g(key, "key");
            dn.m mVar = (dn.m) ra3.a.f393486a.get(key);
            if (mVar != null) {
                mVar.B1 = j17;
            }
        }
        com.tencent.mm.plugin.lite.jsapi.comms.u7 u7Var = this.f143789d;
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
                if (hVar.field_retCode != -10008 || gVar == null) {
                    u7Var.f143443f.a("fail:cdn com upload error");
                } else {
                    u7Var.f143443f.a("fail:cancel cdn com upload cancel: " + gVar.field_finishedLength);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload success, media id : %s  file url=%s   thumb url=%s", key, hVar.field_fileUrl, hVar.field_thumbUrl);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("fileUrl", hVar.field_fileUrl);
                hashMap2.put("thumbUrl", hVar.field_thumbUrl);
                hashMap2.put("fileId", hVar.field_fileId);
                hashMap2.put("fileSize", java.lang.Long.valueOf(hVar.field_fileLength));
                hashMap2.put("fileKey", hVar.field_aesKey);
                hashMap2.put("md5", hVar.field_filemd5);
                u7Var.f143443f.b(hashMap2);
            }
            java.util.HashMap hashMap3 = ra3.a.f393486a;
            kotlin.jvm.internal.o.g(key, "key");
            ra3.a.f393486a.remove(key);
        }
        if (i17 == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
        u7Var.f143443f.a("fail:cdn com call error");
        java.util.HashMap hashMap4 = ra3.a.f393486a;
        kotlin.jvm.internal.o.g(key, "key");
        ra3.a.f393486a.remove(key);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
