package m51;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Comparator f323527a = new m51.b();

    public static java.util.List a(h51.h hVar) {
        int min = (int) java.lang.Math.min(32768, hVar.f279032h);
        byte[] bArr = new byte[min];
        long j17 = min;
        long j18 = hVar.f279032h - j17;
        hVar.a(j18, j17);
        int i17 = 0;
        m51.d.d(hVar, bArr, 0, min);
        int i18 = min - 1;
        int i19 = 0;
        while (true) {
            if (i18 < 0) {
                i18 = -1;
                break;
            }
            i19 = (i19 << 8) | bArr[i18];
            if (i19 == 101010256) {
                break;
            }
            i18--;
        }
        long j19 = i18 == -1 ? -1L : j18 + i18;
        if (j19 == -1) {
            throw new java.util.zip.ZipException("EOCD record not found in last 32k of archive, giving up");
        }
        hVar.a(j19, hVar.f279032h - j19);
        if (((int) m51.d.b(hVar)) != 101010256) {
            throw new java.util.zip.ZipException("Bad eocd header");
        }
        m51.d.e(hVar, 6L);
        int a17 = m51.d.a(hVar);
        if (a17 == 65535) {
            throw new java.util.zip.ZipException("No support for zip64");
        }
        long b17 = m51.d.b(hVar);
        long b18 = m51.d.b(hVar);
        hVar.a(b18, b17);
        java.util.ArrayList arrayList = new java.util.ArrayList(a17);
        int i27 = 0;
        while (i27 < a17) {
            if (((int) m51.d.b(hVar)) != 33639248) {
                throw new java.util.zip.ZipException("Bad central directory header");
            }
            m51.d.e(hVar, 4L);
            int a18 = m51.d.a(hVar);
            int a19 = m51.d.a(hVar);
            m51.d.e(hVar, 4L);
            long b19 = m51.d.b(hVar);
            long b27 = m51.d.b(hVar);
            long b28 = m51.d.b(hVar);
            int a27 = m51.d.a(hVar);
            int a28 = m51.d.a(hVar);
            int a29 = m51.d.a(hVar);
            long j27 = b18;
            m51.d.e(hVar, 8L);
            long b29 = m51.d.b(hVar);
            byte[] bArr2 = new byte[a27];
            m51.d.d(hVar, bArr2, 0, a27);
            m51.d.e(hVar, a28 + a29);
            boolean z17 = (a18 & 1024) != 0;
            arrayList.add(new i51.a(a19, b19, b27, b28, i51.a.a(bArr2, z17), z17, b29));
            i27++;
            b18 = j27;
        }
        long j28 = b18;
        java.util.Collections.sort(arrayList, f323527a);
        while (i17 < arrayList.size()) {
            i51.a aVar = (i51.a) arrayList.get(i17);
            long j29 = i17 < arrayList.size() - 1 ? ((i51.a) arrayList.get(i17 + 1)).f288466g : j28;
            long j37 = aVar.f288466g;
            hVar.a(j37, j29 - j37);
            if (((int) m51.d.b(hVar)) != 67324752) {
                throw new java.util.zip.ZipException("Bad local entry header");
            }
            m51.d.e(hVar, 22);
            aVar.f288467h = aVar.f288466g + m51.d.a(hVar) + 30 + m51.d.a(hVar);
            i17++;
        }
        return arrayList;
    }
}
