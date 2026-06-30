package o36;

/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f342754a;

    /* renamed from: b, reason: collision with root package name */
    public int f342755b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f342756c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f342757d;

    public b(java.util.List list) {
        this.f342754a = list;
    }

    public l36.v a(javax.net.ssl.SSLSocket sSLSocket) {
        l36.v vVar;
        boolean z17;
        int i17 = this.f342755b;
        java.util.List list = this.f342754a;
        int size = list.size();
        while (true) {
            if (i17 >= size) {
                vVar = null;
                break;
            }
            vVar = (l36.v) list.get(i17);
            if (vVar.a(sSLSocket)) {
                this.f342755b = i17 + 1;
                break;
            }
            i17++;
        }
        if (vVar == null) {
            throw new java.net.UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f342757d + ", modes=" + list + ", supported protocols=" + java.util.Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i18 = this.f342755b;
        while (true) {
            if (i18 >= list.size()) {
                z17 = false;
                break;
            }
            if (((l36.v) list.get(i18)).a(sSLSocket)) {
                z17 = true;
                break;
            }
            i18++;
        }
        this.f342756c = z17;
        m36.a aVar = m36.a.f323382a;
        boolean z18 = this.f342757d;
        ((l36.o0) aVar).getClass();
        java.lang.String[] strArr = vVar.f315662c;
        java.lang.String[] n17 = strArr != null ? m36.e.n(l36.r.f315607b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        java.lang.String[] strArr2 = vVar.f315663d;
        java.lang.String[] n18 = strArr2 != null ? m36.e.n(m36.e.f323391f, sSLSocket.getEnabledProtocols(), strArr2) : sSLSocket.getEnabledProtocols();
        java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        java.util.Comparator comparator = l36.r.f315607b;
        byte[] bArr = m36.e.f323386a;
        int length = supportedCipherSuites.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                i19 = -1;
                break;
            }
            if (((l36.q) comparator).compare(supportedCipherSuites[i19], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i19++;
        }
        if (z18 && i19 != -1) {
            java.lang.String str = supportedCipherSuites[i19];
            int length2 = n17.length + 1;
            java.lang.String[] strArr3 = new java.lang.String[length2];
            java.lang.System.arraycopy(n17, 0, strArr3, 0, n17.length);
            strArr3[length2 - 1] = str;
            n17 = strArr3;
        }
        l36.u uVar = new l36.u(vVar);
        uVar.a(n17);
        uVar.c(n18);
        l36.v vVar2 = new l36.v(uVar);
        java.lang.String[] strArr4 = vVar2.f315663d;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        java.lang.String[] strArr5 = vVar2.f315662c;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return vVar;
    }
}
