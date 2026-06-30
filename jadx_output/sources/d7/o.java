package d7;

/* loaded from: classes13.dex */
public final class o implements d7.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f226829a;

    public o(java.io.InputStream inputStream) {
        this.f226829a = inputStream;
    }

    @Override // d7.n
    public int a() {
        java.io.InputStream inputStream = this.f226829a;
        return (inputStream.read() & 255) | ((inputStream.read() << 8) & 65280);
    }

    @Override // d7.n
    public int b() {
        return this.f226829a.read();
    }

    @Override // d7.n
    public int c(byte[] bArr, int i17) {
        int i18 = i17;
        while (i18 > 0) {
            int read = this.f226829a.read(bArr, i17 - i18, i18);
            if (read == -1) {
                break;
            }
            i18 -= read;
        }
        return i17 - i18;
    }

    @Override // d7.n
    public long skip(long j17) {
        if (j17 < 0) {
            return 0L;
        }
        long j18 = j17;
        while (j18 > 0) {
            java.io.InputStream inputStream = this.f226829a;
            long skip = inputStream.skip(j18);
            if (skip > 0) {
                j18 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j18--;
            }
        }
        return j17 - j18;
    }
}
