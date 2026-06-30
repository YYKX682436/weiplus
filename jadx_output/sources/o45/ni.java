package o45;

/* loaded from: classes8.dex */
public class ni extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f342986a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f342987b = "MicroMsg.MMTypingSend";

    @Override // o45.zg
    public int getCmdId() {
        return 636;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 100017;
    }

    @Override // o45.zg, o45.xg
    public boolean isRawData() {
        return true;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            long uin = getUin() & io.flutter.embedding.android.KeyboardMap.kValueMask;
            gm0.j1.i();
            byte[] AesGcmEncrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncrypt(com.tencent.mm.jni.utils.UtilsJni.HKDF(java.lang.String.valueOf(uin).getBytes(), gm0.j1.n().c(1), "TYPING_MSG", 32), this.f342986a);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(100017);
            dataOutputStream.writeShort(AesGcmEncrypt.length);
            dataOutputStream.write(AesGcmEncrypt);
            dataOutputStream.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e(this.f342987b, "direct merge tail failed, err=" + e17.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        return byteArray;
    }
}
