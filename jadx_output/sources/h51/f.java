package h51;

/* loaded from: classes12.dex */
public class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final h51.b f279024d;

    /* renamed from: e, reason: collision with root package name */
    public h51.a f279025e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f279026f;

    public f(java.io.OutputStream outputStream, int i17) {
        new java.util.ArrayList();
        this.f279025e = new h51.a(outputStream);
        h51.b bVar = new h51.b();
        this.f279024d = bVar;
        bVar.f279017c = true;
        this.f279026f = new byte[i17];
    }

    public long a(java.io.InputStream inputStream, h51.e eVar) {
        java.util.zip.Inflater inflater;
        long j17 = this.f279025e.f279014d;
        if (eVar == h51.e.COPY) {
            while (true) {
                int read = inputStream.read(this.f279026f);
                if (read < 0) {
                    break;
                }
                this.f279025e.write(this.f279026f, 0, read);
            }
        } else if (eVar != h51.e.UNCOPY) {
            boolean z17 = eVar == h51.e.UNCOMPRESS_NOWRAP;
            h51.b bVar = this.f279024d;
            if (z17 != bVar.f279015a) {
                java.util.zip.Inflater inflater2 = bVar.f279016b;
                if (inflater2 != null) {
                    inflater2.end();
                    bVar.f279016b = null;
                }
                bVar.f279015a = z17;
            }
            h51.a aVar = this.f279025e;
            java.util.zip.Inflater inflater3 = bVar.f279016b;
            if (inflater3 == null) {
                inflater3 = new java.util.zip.Inflater(bVar.f279015a);
                if (bVar.f279017c) {
                    bVar.f279016b = inflater3;
                }
            } else {
                inflater3.reset();
            }
            java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(inputStream, inflater3, 32768);
            byte[] bArr = new byte[32768];
            while (true) {
                int read2 = inflaterInputStream.read(bArr);
                if (read2 < 0) {
                    break;
                }
                aVar.write(bArr, 0, read2);
            }
            if (!bVar.f279017c && (inflater = bVar.f279016b) != null) {
                inflater.end();
                bVar.f279016b = null;
            }
        }
        this.f279025e.flush();
        return this.f279025e.f279014d - j17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h51.b bVar = this.f279024d;
        java.util.zip.Inflater inflater = bVar.f279016b;
        if (inflater != null) {
            inflater.end();
            bVar.f279016b = null;
        }
        this.f279025e.close();
        this.f279026f = null;
        this.f279025e = null;
    }
}
