package uk;

/* loaded from: classes13.dex */
public final class o implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final long f428509d;

    public o(byte[] bArr) {
        long j17 = (bArr[3] << 24) & 4278190080L;
        this.f428509d = j17;
        long j18 = j17 + ((bArr[2] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) & 16711680);
        this.f428509d = j18;
        long j19 = j18 + ((bArr[1] << 8) & 65280);
        this.f428509d = j19;
        this.f428509d = j19 + (bArr[0] & 255);
    }

    public byte[] a() {
        long j17 = this.f428509d;
        return new byte[]{(byte) (255 & j17), (byte) ((65280 & j17) >> 8), (byte) ((16711680 & j17) >> 16), (byte) ((4278190080L & j17) >> 24)};
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof uk.o) && this.f428509d == ((uk.o) obj).f428509d;
    }

    public int hashCode() {
        return (int) this.f428509d;
    }

    public o(long j17) {
        this.f428509d = j17;
    }
}
