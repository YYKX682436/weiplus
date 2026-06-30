package d61;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public long f226711a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f226712b = -1;

    /* renamed from: c, reason: collision with root package name */
    public d61.a f226713c = null;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.b.a(java.lang.String):long");
    }

    public final d61.a b(java.io.InputStream inputStream, long j17) {
        d61.b bVar;
        long j18;
        long j19;
        d61.a aVar = null;
        if (inputStream == null || j17 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AtomParsers", "find Moov Atom, but parameter is error.");
            return null;
        }
        int i17 = 0;
        try {
            if (inputStream.skip(j17) < j17) {
                return null;
            }
            int i18 = 8;
            byte[] bArr = new byte[8];
            int read = inputStream.read(bArr, 0, 8);
            long j27 = j17;
            while (read >= i18) {
                int e17 = d61.c.e(bArr, i17);
                int e18 = d61.c.e(bArr, 4);
                if (e17 != 1) {
                    bVar = this;
                    j18 = 0;
                } else {
                    if (inputStream.read(bArr, i17, i18) < i18) {
                        return aVar;
                    }
                    bVar = this;
                    j18 = d61.c.f(bArr, i17);
                }
                bVar.f226713c = aVar;
                d61.a aVar2 = new d61.a(e17, j27, e18, j18);
                try {
                    if (!(e18 == d61.a.f226690f)) {
                        if (!(e17 == 0)) {
                            if (e17 > 1) {
                                j19 = e17 - 8;
                                j27 += e17;
                            } else if (j18 > 0) {
                                j19 = (j18 - 8) - 8;
                                j27 += j18;
                            }
                            if (inputStream.skip(j19) >= j19) {
                                read = inputStream.read(bArr, 0, 8);
                                i18 = 8;
                                aVar = aVar2;
                                i17 = 0;
                            }
                        }
                    }
                    return aVar2;
                } catch (java.lang.Exception e19) {
                    e = e19;
                    aVar = aVar2;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AtomParsers", e, "", new java.lang.Object[0]);
                    return aVar;
                }
            }
            return aVar;
        } catch (java.lang.Exception e27) {
            e = e27;
        }
    }
}
