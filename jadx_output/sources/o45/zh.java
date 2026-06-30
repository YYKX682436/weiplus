package o45;

/* loaded from: classes12.dex */
public class zh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f343046a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f343047b = -1;

    @Override // o45.zg
    public int getCmdId() {
        return 1000000190;
    }

    @Override // o45.xg
    public int getFuncId() {
        return 268369922;
    }

    @Override // o45.zg
    public boolean getShortSupport() {
        return false;
    }

    @Override // o45.xg
    public byte[] toProtoBuf() {
        byte[] bArr = new byte[this.f343046a.length + 8];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f343047b);
        bArr[0] = (byte) ((currentTimeMillis >> 24) & 255);
        bArr[1] = (byte) ((currentTimeMillis >> 16) & 255);
        bArr[2] = (byte) ((currentTimeMillis >> 8) & 255);
        bArr[3] = (byte) (currentTimeMillis & 255);
        byte[] bArr2 = this.f343046a;
        bArr[4] = (byte) ((bArr2.length >> 24) & 255);
        bArr[5] = (byte) ((bArr2.length >> 16) & 255);
        bArr[6] = (byte) ((bArr2.length >> 8) & 255);
        bArr[7] = (byte) (bArr2.length & 255);
        java.lang.System.arraycopy(bArr2, 0, bArr, 8, bArr2.length);
        com.tencent.mm.sdk.platformtools.t8.j(bArr);
        return bArr;
    }
}
