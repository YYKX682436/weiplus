package vi3;

/* loaded from: classes12.dex */
public class i implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f437596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.y8 f437597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vi3.k f437598f;

    public i(vi3.k kVar, vi3.f fVar, c01.y8 y8Var) {
        this.f437598f = kVar;
        this.f437596d = fVar;
        this.f437597e = y8Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            return 0;
        }
        vi3.f fVar = this.f437596d;
        vi3.k kVar = this.f437598f;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback startRet failed. clientid:%s, startRet:%d", str, java.lang.Integer.valueOf(i17));
            kVar.a();
            kVar.b(fVar.f437573a);
            vi3.b.b(0L, 0L, 0L, 0L, 1, kVar.f437603b, fVar.f437573a);
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback failed. sceneResult.retCode[%d], arg[%s], info[%s], clientid[%s], filemd5[%s]", java.lang.Integer.valueOf(i18), hVar.field_arg, hVar.field_transInfo, str, hVar.field_filemd5);
                kVar.b(fVar.f437573a);
                kVar.a();
                vi3.b.b(0L, 0L, 0L, 0L, 1, kVar.f437603b, fVar.f437573a);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback success. clientid[%s], filemd5[%s], isHitCacheUpload[%d]", str, hVar.field_filemd5, java.lang.Integer.valueOf(hVar.field_UploadHitCacheType));
                com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
                if (!com.tencent.mm.protocal.MMProtocalJni.rsaPublicEncryptPemkey(hVar.field_aesKey.getBytes(), pByteArray, fVar.f437574b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize MMProtocalJni rsaPublicEncryptPemkey failed!");
                    return -1;
                }
                java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(pByteArray.value);
                java.lang.String str2 = hVar.field_fileId;
                int i19 = (int) hVar.field_fileLength;
                fVar.getClass();
                fVar.f437580h = new java.lang.String(str2);
                fVar.f437581i = new java.lang.String(l17);
                fVar.f437582j = i19;
                if (gm0.j1.b().t()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "sendAppMsg immediately.");
                    kVar.c(fVar, false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "wait getOnlineInfoExtDeviceOnlineListener to sendAppMsg.");
                    c01.d9.b().a(this.f437597e);
                    kVar.f437605d = true;
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
