package r9;

/* loaded from: classes7.dex */
public final class j0 implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final r9.k f393374a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.i f393375b;

    public j0(r9.k kVar, r9.i iVar) {
        kVar.getClass();
        this.f393374a = kVar;
        iVar.getClass();
        this.f393375b = iVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        int a17 = this.f393374a.a(bArr, i17, i18);
        if (a17 > 0) {
            s9.e eVar = (s9.e) this.f393375b;
            if (eVar.f404919d != null) {
                int i19 = 0;
                while (i19 < a17) {
                    try {
                        long j17 = eVar.f404923h;
                        long j18 = eVar.f404917b;
                        if (j17 == j18) {
                            eVar.a();
                            eVar.b();
                        }
                        int min = (int) java.lang.Math.min(a17 - i19, j18 - eVar.f404923h);
                        eVar.f404921f.write(bArr, i17 + i19, min);
                        i19 += min;
                        long j19 = min;
                        eVar.f404923h += j19;
                        eVar.f404924i += j19;
                    } catch (java.io.IOException e17) {
                        throw new s9.d(e17);
                    }
                }
            }
        }
        return a17;
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        r9.n nVar2 = nVar;
        long b17 = this.f393374a.b(nVar2);
        if (nVar2.f393387e == -1 && b17 != -1) {
            nVar2 = new r9.n(nVar2.f393383a, nVar2.f393385c, nVar2.f393386d, b17, nVar2.f393388f, nVar2.f393389g);
        }
        s9.e eVar = (s9.e) this.f393375b;
        eVar.getClass();
        try {
            if (nVar2.f393387e == -1) {
                if (!((nVar2.f393389g & 2) == 2)) {
                    eVar.f404919d = null;
                    return b17;
                }
            }
            eVar.b();
            return b17;
        } catch (java.io.IOException e17) {
            throw new s9.d(e17);
        }
        eVar.f404919d = nVar2;
        eVar.f404924i = 0L;
    }

    @Override // r9.k
    public void close() {
        r9.i iVar = this.f393375b;
        try {
            this.f393374a.close();
            s9.e eVar = (s9.e) iVar;
            if (eVar.f404919d == null) {
                return;
            }
            try {
                eVar.a();
            } catch (java.io.IOException e17) {
                throw new s9.d(e17);
            }
        } catch (java.lang.Throwable th6) {
            s9.e eVar2 = (s9.e) iVar;
            if (eVar2.f404919d != null) {
                try {
                    eVar2.a();
                } catch (java.io.IOException e18) {
                    throw new s9.d(e18);
                }
            }
            throw th6;
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f393374a.getUri();
    }
}
