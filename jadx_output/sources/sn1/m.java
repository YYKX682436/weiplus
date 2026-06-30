package sn1;

/* loaded from: classes12.dex */
public final class m implements o45.wg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o45.zg f410054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f410055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f410056c;

    public m(o45.zg zgVar, byte[] bArr, boolean z17) {
        this.f410054a = zgVar;
        this.f410055b = bArr;
        this.f410056c = z17;
    }

    @Override // o45.wg
    public boolean a(com.tencent.mm.pointers.PByteArray pByteArray, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, boolean z17, int i19, int i27) {
        byte[] bArr4;
        int i28 = 0;
        if (i17 != 1000) {
            return false;
        }
        o45.zg zgVar = this.f410054a;
        o45.pi rsaInfo = zgVar.getRsaInfo();
        byte[] bArr5 = this.f410055b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSingleSession=");
        boolean z18 = this.f410056c;
        sb6.append(z18);
        sb6.append(", authKey=");
        sb6.append(android.util.Base64.encodeToString(bArr5, 2));
        com.tencent.mars.xlog.Log.i("MM.Backup.BackupCgiHelper", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr5)) {
            com.tencent.mars.xlog.Log.e("MM.Backup.BackupCgiHelper", "dksession jType %d session should not null", java.lang.Integer.valueOf(i17));
            return false;
        }
        kotlin.jvm.internal.o.e(zgVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp.Req");
        byte[] protoBuf = ((com.tencent.mm.modelbase.m) zgVar).toProtoBuf();
        kotlin.jvm.internal.o.f(protoBuf, "toProtoBuf(...)");
        int genSignature = (com.tencent.mm.sdk.platformtools.t8.M0(bArr3) || com.tencent.mm.sdk.platformtools.t8.M0(protoBuf)) ? 0 : com.tencent.mm.protocal.MMProtocalJni.genSignature(((com.tencent.mm.modelbase.m) zgVar).getUin(), bArr3, protoBuf);
        if (z18) {
            bArr4 = protoBuf;
        } else {
            byte[] AesGcmEncryptWithCompress = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncryptWithCompress(bArr5, protoBuf);
            kotlin.jvm.internal.o.f(AesGcmEncryptWithCompress, "AesGcmEncryptWithCompress(...)");
            bArr4 = AesGcmEncryptWithCompress;
            i28 = 13;
        }
        com.tencent.mars.xlog.Log.i("MM.Backup.BackupCgiHelper", "start to encode, aesType=" + i28 + ", signature=" + genSignature);
        java.lang.String deviceID = ((com.tencent.mm.modelbase.m) zgVar).getDeviceID();
        int uin = ((com.tencent.mm.modelbase.m) zgVar).getUin();
        int i29 = ((com.tencent.mm.modelbase.m) zgVar).f70685b;
        int i37 = rsaInfo.f342999c;
        java.lang.String str = rsaInfo.f342997a;
        kotlin.jvm.internal.o.f(str, "getKeye(...)");
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String str2 = rsaInfo.f342998b;
        kotlin.jvm.internal.o.f(str2, "getKeyn(...)");
        byte[] bytes2 = str2.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        return com.tencent.mm.protocal.MMProtocalJni.pack(bArr4, pByteArray, bArr5, i28, bArr2, deviceID, uin, i29, i37, bytes, bytes2, genSignature, i19, ((com.tencent.mm.modelbase.m) zgVar).getRouteInfo(), 0, 0, 0, 0);
    }
}
