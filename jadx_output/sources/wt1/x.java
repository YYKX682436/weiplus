package wt1;

/* loaded from: classes13.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f449362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f449363b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f449364c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f449365d;

    public x(java.lang.String str, int i17, java.lang.String str2, byte[] bArr) {
        this.f449362a = str;
        this.f449363b = i17;
        this.f449364c = str2;
        this.f449365d = bArr;
    }

    public java.lang.String toString() {
        return "SrvDeviceInfo{deviceId='" + this.f449362a + "', rssi=" + this.f449363b + ", name='" + this.f449364c + "', manuData=" + java.util.Arrays.toString(this.f449365d) + '}';
    }
}
