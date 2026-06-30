package o45;

/* loaded from: classes12.dex */
public class jh extends o45.ah implements o45.yg {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342971c = "";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f342969a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f342970b = new byte[0];

    public final byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "parse all failed, empty buf");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 2];
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
            dataInputStream.readByte();
            dataInputStream.readByte();
            dataInputStream.readFully(bArr2);
            byteArrayInputStream.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e17.getMessage());
        }
        return bArr2;
    }

    @Override // o45.yg
    public int fromProtoBuf(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        java.lang.System.arraycopy(this.f342971c.getBytes(), 0, bArr2, 0, 15);
        bArr2[15] = 0;
        byte[] h17 = kk.k.h(bArr2);
        com.tencent.mm.sdk.platformtools.t8.j(h17);
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        if (kk.d.a(pByteArray, a(bArr), h17) != 0) {
            byte[] bArr3 = new byte[16];
            for (int i17 = 0; i17 < 16; i17++) {
                bArr3[i17] = 0;
            }
            if (kk.d.a(pByteArray, a(bArr), bArr3) != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "decrypting from buffer using key=%s error", com.tencent.mm.sdk.platformtools.t8.j(h17));
                return -1;
            }
        }
        byte[] bArr4 = pByteArray.value;
        if (bArr4 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "parse tail failed, empty buf");
        } else {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr4));
                dataInputStream.readInt();
                int readShort = dataInputStream.readShort();
                if (readShort < 0) {
                    throw new java.io.IOException("sender empty");
                }
                byte[] bArr5 = new byte[readShort];
                dataInputStream.readFully(bArr5);
                this.f342969a = new java.lang.String(bArr5);
                int readShort2 = dataInputStream.readShort();
                if (readShort2 < 0) {
                    throw new java.io.IOException("content empty");
                }
                byte[] bArr6 = new byte[readShort2];
                this.f342970b = bArr6;
                dataInputStream.readFully(bArr6);
                int length = this.f342970b.length;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "direct parse all failed, err=" + e17.getMessage());
            }
        }
        return 0;
    }

    @Override // o45.ah
    public int getCmdId() {
        return 8;
    }

    @Override // o45.ah, o45.yg
    public boolean isRawData() {
        return true;
    }
}
