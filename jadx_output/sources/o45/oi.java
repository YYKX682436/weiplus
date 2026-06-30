package o45;

/* loaded from: classes8.dex */
public class oi extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f342992a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f342993b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f342994c = new byte[0];

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTypingSend", "parse tail failed, empty buf");
        } else {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTypingSend", "parseTailFields funId:%s", java.lang.Integer.valueOf(dataInputStream.readInt()));
                int readShort = dataInputStream.readShort();
                if (readShort < 0) {
                    throw new java.io.IOException("content empty");
                }
                byte[] bArr2 = new byte[readShort];
                this.f342994c = bArr2;
                dataInputStream.readFully(bArr2);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTypingSend", "content len=" + this.f342994c.length);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTypingSend", "direct parse all failed, err=" + e17.getMessage());
            }
        }
        gm0.j1.i();
        long h17 = gm0.j1.b().h() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        gm0.j1.i();
        byte[] AesGcmDecrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmDecrypt(com.tencent.mm.jni.utils.UtilsJni.HKDF(java.lang.String.valueOf(h17).getBytes(), gm0.j1.n().c(1), "TYPING_MSG", 32), this.f342994c);
        if (AesGcmDecrypt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTypingSend", "parse content failed, empty buf");
            return -1;
        }
        r45.wl5 wl5Var = new r45.wl5();
        wl5Var.parseFrom(AesGcmDecrypt);
        java.lang.String i17 = wl5Var.f389260f.i();
        this.f342992a = i17;
        int i18 = wl5Var.f389259e;
        this.f342993b = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTypingSend", "fromProtoBuf sender:%s, status:%s", i17, java.lang.Integer.valueOf(i18));
        return 0;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 1000000637;
    }

    @Override // o45.ah, o45.yg
    public boolean isRawData() {
        return true;
    }
}
