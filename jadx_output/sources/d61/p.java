package d61;

/* loaded from: classes14.dex */
public class p extends d61.a {

    /* renamed from: w, reason: collision with root package name */
    public d61.g f226763w;

    /* renamed from: x, reason: collision with root package name */
    public d61.d f226764x;

    public void b(java.io.RandomAccessFile randomAccessFile, byte[] bArr) {
        long a17 = a() - 8;
        while (a17 > 0) {
            try {
                int read = randomAccessFile.read(bArr);
                int e17 = d61.c.e(bArr, 0);
                int e18 = d61.c.e(bArr, 4);
                a17 -= e17;
                if (e18 == d61.a.f226696l) {
                    d61.d dVar = (d61.d) d61.h.a(e17, e18, randomAccessFile.getFilePointer() - read, 0L);
                    this.f226764x = dVar;
                    dVar.b(randomAccessFile, bArr);
                } else if (e18 == d61.a.f226693i) {
                    d61.g gVar = (d61.g) d61.h.a(e17, e18, randomAccessFile.getFilePointer() - read, 0L);
                    this.f226763w = gVar;
                    gVar.b(randomAccessFile, bArr);
                } else if (!d61.c.h(randomAccessFile, e17 - 8)) {
                    return;
                }
            } catch (java.lang.Exception unused) {
                return;
            }
        }
    }
}
