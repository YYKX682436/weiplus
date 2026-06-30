package o45;

/* loaded from: classes12.dex */
public class ih extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public int f342956a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f342957b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f342958c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342959d = "";

    /* renamed from: e, reason: collision with root package name */
    public byte[] f342960e = new byte[0];

    @Override // o45.zg
    public int getCmdId() {
        return 8;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 10;
    }

    @Override // o45.zg
    public boolean getShortSupport() {
        return false;
    }

    @Override // o45.zg, o45.xg
    public boolean isRawData() {
        return true;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.f342958c);
            dataOutputStream.writeShort(this.f342959d.getBytes().length);
            dataOutputStream.write(this.f342959d.getBytes());
            dataOutputStream.writeShort(this.f342960e.length);
            dataOutputStream.write(this.f342960e);
            dataOutputStream.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "direct merge tail failed, err=" + e17.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        byte[] bArr = new byte[16];
        java.lang.System.arraycopy(super.getDeviceID().getBytes(), 0, bArr, 0, 15);
        bArr[15] = 0;
        byte[] h17 = kk.k.h(bArr);
        com.tencent.mm.sdk.platformtools.t8.j(h17);
        kk.d.b(pByteArray, byteArray, h17);
        byte[] bArr2 = pByteArray.value;
        if (bArr2 == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(byteArrayOutputStream2);
            dataOutputStream2.writeByte(this.f342956a);
            dataOutputStream2.writeByte(this.f342957b);
            dataOutputStream2.write(bArr2);
            dataOutputStream2.close();
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDirectSend", "direct merge all failed, err=" + e18.getMessage());
        }
        return byteArrayOutputStream2.toByteArray();
    }
}
