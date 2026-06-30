package v7;

/* loaded from: classes13.dex */
public class b implements u7.a {

    /* renamed from: a, reason: collision with root package name */
    public final v7.a f433590a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.File f433591b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.RandomAccessFile f433592c;

    public b(java.io.File file, v7.a aVar) {
        java.io.File file2;
        try {
            if (aVar == null) {
                throw new java.lang.NullPointerException();
            }
            this.f433590a = aVar;
            v7.f.a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                file2 = new java.io.File(file.getParentFile(), file.getName() + ".download");
            }
            this.f433591b = file2;
            this.f433592c = new java.io.RandomAccessFile(this.f433591b, exists ? "r" : "rw");
        } catch (java.io.IOException e17) {
            throw new u7.r("Error using file " + file + " as disc cache", e17);
        }
    }

    public synchronized void a(byte[] bArr, int i17) {
        try {
            if (e()) {
                throw new u7.r("Error append cache: cache file " + this.f433591b + " is completed!");
            }
            this.f433592c.seek(b());
            this.f433592c.write(bArr, 0, i17);
        } catch (java.io.IOException e17) {
            throw new u7.r(java.lang.String.format("Error writing %d bytes to %s from buffer with size %d", java.lang.Integer.valueOf(i17), this.f433592c, java.lang.Integer.valueOf(bArr.length)), e17);
        }
    }

    public synchronized long b() {
        try {
        } catch (java.io.IOException e17) {
            throw new u7.r("Error reading length of file " + this.f433591b, e17);
        }
        return (int) this.f433592c.length();
    }

    public synchronized void c() {
        try {
            this.f433592c.close();
            v7.a aVar = this.f433590a;
            java.io.File file = this.f433591b;
            v7.h hVar = (v7.h) aVar;
            hVar.getClass();
            hVar.f433595a.submit(new v7.g(hVar, file));
        } catch (java.io.IOException e17) {
            throw new u7.r("Error closing file " + this.f433591b, e17);
        }
    }

    public synchronized void d() {
        if (e()) {
            return;
        }
        c();
        java.io.File file = new java.io.File(this.f433591b.getParentFile(), this.f433591b.getName().substring(0, this.f433591b.getName().length() - 9));
        if (!this.f433591b.renameTo(file)) {
            throw new u7.r("Error renaming file " + this.f433591b + " to " + file + " for completion!");
        }
        this.f433591b = file;
        try {
            this.f433592c = new java.io.RandomAccessFile(this.f433591b, "r");
            v7.a aVar = this.f433590a;
            java.io.File file2 = this.f433591b;
            v7.h hVar = (v7.h) aVar;
            hVar.getClass();
            hVar.f433595a.submit(new v7.g(hVar, file2));
        } catch (java.io.IOException e17) {
            throw new u7.r("Error opening " + this.f433591b + " as disc cache", e17);
        }
    }

    public synchronized boolean e() {
        return !this.f433591b.getName().endsWith(".download");
    }
}
