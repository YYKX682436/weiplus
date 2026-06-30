package gq1;

/* loaded from: classes13.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public int f274541a = -1;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f274542b = null;

    public boolean a(a42.a aVar) {
        if (aVar != null) {
            aVar.f1195b.position();
            if (aVar.f1195b.position() != 0) {
                byte[] bArr = new byte[1];
                aVar.a(bArr, 0, 1);
                byte b17 = bArr[0];
                int i17 = b17 + 1;
                aVar.f1195b.position();
                if (i17 > aVar.f1195b.position()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
                    aVar.f1195b.position();
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.TLVBase", "lengthInt(%d) + 1 > autoBuffer.getSize()(%d)", valueOf, java.lang.Integer.valueOf(aVar.f1195b.position()));
                    return false;
                }
                if (b17 <= 1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.TLVBase", "length(%d) <= 1", java.lang.Integer.valueOf(b17));
                    return false;
                }
                this.f274541a = b17;
                aVar.a(bArr, 0, 1);
                int i18 = this.f274541a - 1;
                byte[] bArr2 = new byte[i18];
                this.f274542b = bArr2;
                aVar.a(bArr2, 0, i18);
                return b(this.f274542b);
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.TLVBase", "autoBuffer is null or nil");
        return false;
    }

    public abstract boolean b(byte[] bArr);
}
