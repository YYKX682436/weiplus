package ec;

/* loaded from: classes13.dex */
public class b implements ec.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer[] f250926b;

    /* renamed from: c, reason: collision with root package name */
    public final long f250927c;

    /* renamed from: d, reason: collision with root package name */
    public long f250928d;

    public b(java.io.File file) {
        long length = file.length();
        this.f250927c = length;
        long j17 = 1073741824;
        int i17 = ((int) (length / j17)) + 1;
        this.f250926b = new java.nio.ByteBuffer[i17];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        long j18 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            try {
                this.f250926b[i18] = fileInputStream.getChannel().map(java.nio.channels.FileChannel.MapMode.READ_ONLY, j18, java.lang.Math.min(this.f250927c - j18, 1073742848));
                this.f250926b[i18].order(ec.a.f250925a);
                j18 += j17;
            } finally {
                fileInputStream.close();
            }
        }
        this.f250928d = 0L;
    }

    public final int a() {
        return (int) (this.f250928d / 1073741824);
    }

    public final int b() {
        return (int) (this.f250928d % 1073741824);
    }

    public byte c() {
        byte b17 = this.f250926b[a()].get(b());
        this.f250928d++;
        return b17;
    }

    public int d() {
        int i17 = this.f250926b[a()].getInt(b());
        this.f250928d += 4;
        return i17;
    }

    public long e() {
        long j17 = this.f250926b[a()].getLong(b());
        this.f250928d += 8;
        return j17;
    }

    public short f() {
        short s17 = this.f250926b[a()].getShort(b());
        this.f250928d += 2;
        return s17;
    }
}
