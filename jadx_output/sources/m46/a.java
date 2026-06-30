package m46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f323462e;

    public a(java.io.InputStream inputStream, boolean z17, int i17) {
        r46.g gVar = new r46.g(inputStream);
        if (z17) {
            this.f323462e = new org.tukaani.xz.XZInputStream(gVar, i17);
        } else {
            this.f323462e = new org.tukaani.xz.SingleXZInputStream(gVar, i17);
        }
    }

    public static boolean b(byte[] bArr, int i17) {
        if (i17 < org.tukaani.xz.XZ.HEADER_MAGIC.length) {
            return false;
        }
        for (int i18 = 0; i18 < org.tukaani.xz.XZ.HEADER_MAGIC.length; i18++) {
            if (bArr[i18] != org.tukaani.xz.XZ.HEADER_MAGIC[i18]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f323462e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f323462e.close();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f323462e.read();
            int i17 = -1;
            if (read != -1) {
                i17 = 1;
            }
            a(i17);
            return read;
        } catch (org.tukaani.xz.MemoryLimitException e17) {
            throw new z36.a(e17.getMemoryNeeded(), e17.getMemoryLimit(), e17);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j17) {
        try {
            return r46.h.b(this.f323462e, j17);
        } catch (org.tukaani.xz.MemoryLimitException e17) {
            throw new z36.a(e17.getMemoryNeeded(), e17.getMemoryLimit(), e17);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        try {
            int read = this.f323462e.read(bArr, i17, i18);
            a(read);
            return read;
        } catch (org.tukaani.xz.MemoryLimitException e17) {
            throw new z36.a(e17.getMemoryNeeded(), e17.getMemoryLimit(), e17);
        }
    }
}
