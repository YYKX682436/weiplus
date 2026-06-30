package s9;

/* loaded from: classes7.dex */
public abstract class m {
    public static void a(r9.n nVar, s9.c cVar, s9.h hVar, byte[] bArr, t9.s sVar, int i17, s9.l lVar, boolean z17) {
        s9.l lVar2 = lVar;
        hVar.getClass();
        bArr.getClass();
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        long j18 = -1;
        if (lVar2 != null) {
            java.lang.String str = nVar.f393388f;
            if (str == null) {
                str = nVar.f393383a.toString();
            }
            java.lang.String str2 = str;
            long j19 = nVar.f393385c;
            long j27 = nVar.f393387e;
            if (j27 == -1) {
                j27 = cVar.b(str2);
            }
            lVar2.f404957a = j27;
            long j28 = j19;
            long j29 = j27;
            while (j29 != 0) {
                java.lang.String str3 = str2;
                long q07 = cVar.q0(str2, j28, j29 != -1 ? j29 : Long.MAX_VALUE);
                if (q07 <= 0) {
                    q07 = -q07;
                    if (q07 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                        break;
                    }
                }
                j28 += q07;
                if (j29 == -1) {
                    q07 = 0;
                }
                j29 -= q07;
                str2 = str3;
            }
        } else {
            lVar2 = new s9.l();
        }
        java.lang.String str4 = nVar.f393388f;
        if (str4 == null) {
            str4 = nVar.f393383a.toString();
        }
        java.lang.String str5 = str4;
        long j37 = nVar.f393385c;
        long j38 = nVar.f393387e;
        if (j38 == -1) {
            j38 = cVar.b(str5);
        }
        long j39 = j37;
        long j47 = j38;
        while (j47 != 0) {
            java.lang.String str6 = str5;
            long q08 = cVar.q0(str5, j39, j47 != j18 ? j47 : j17);
            if (q08 <= 0) {
                q08 = -q08;
                try {
                    if (java.lang.Thread.interrupted()) {
                        throw new java.lang.InterruptedException();
                    }
                    r9.n nVar2 = new r9.n(nVar.f393383a, nVar.f393384b, j39, (nVar.f393386d + j39) - nVar.f393385c, -1L, nVar.f393388f, nVar.f393389g | 2);
                    long b17 = hVar.b(nVar2);
                    if (lVar2.f404957a == -1 && b17 != -1) {
                        lVar2.f404957a = nVar2.f393385c + b17;
                    }
                    long j48 = 0;
                    while (true) {
                        if (j48 == q08) {
                            j18 = -1;
                            break;
                        }
                        if (java.lang.Thread.interrupted()) {
                            throw new java.lang.InterruptedException();
                        }
                        int a17 = hVar.a(bArr, 0, q08 != -1 ? (int) java.lang.Math.min(bArr.length, q08 - j48) : bArr.length);
                        if (a17 == -1) {
                            j18 = -1;
                            if (lVar2.f404957a == -1) {
                                lVar2.f404957a = nVar2.f393385c + j48;
                            }
                        } else {
                            j48 += a17;
                        }
                    }
                    if (j48 < q08) {
                        if (z17 && j47 != j18) {
                            throw new java.io.EOFException();
                        }
                        return;
                    }
                } finally {
                    t9.d0.e(hVar);
                }
            }
            j39 += q08;
            if (j47 == j18) {
                q08 = 0;
            }
            j47 -= q08;
            str5 = str6;
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
    }
}
