package gq1;

/* loaded from: classes13.dex */
public class q extends gq1.s {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f274536g = {76, 0, 2, 21};

    /* renamed from: c, reason: collision with root package name */
    public byte[] f274537c = null;

    /* renamed from: d, reason: collision with root package name */
    public short f274538d = -1;

    /* renamed from: e, reason: collision with root package name */
    public short f274539e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f274540f = 0;

    @Override // gq1.s
    public boolean b(byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
            return false;
        }
        if (26 != this.f274541a) {
            return false;
        }
        a42.a aVar = new a42.a(bArr.length);
        aVar.b(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[4];
        aVar.a(bArr2, 0, 4);
        if (!java.util.Arrays.equals(bArr2, f274536g)) {
            return false;
        }
        byte[] bArr3 = new byte[16];
        this.f274537c = bArr3;
        aVar.a(bArr3, 0, 16);
        try {
            aVar.f1195b.position();
            if (aVar.f1195b.position() <= 1) {
                throw new java.io.IOException("There is only one byte in array");
            }
            this.f274538d = aVar.f1194a.getShort();
            aVar.f1195b.position();
            if (aVar.f1195b.position() <= 1) {
                throw new java.io.IOException("There is only one byte in array");
            }
            this.f274539e = aVar.f1194a.getShort();
            byte[] bArr4 = new byte[1];
            aVar.a(bArr4, 0, 1);
            this.f274540f = bArr4[0];
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.IBeaconTLVSectionB", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
