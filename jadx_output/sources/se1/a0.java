package se1;

/* loaded from: classes13.dex */
public class a0 extends se1.n {
    public static int A = 3;
    public static boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final te1.s f406737x;

    /* renamed from: y, reason: collision with root package name */
    public int f406738y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f406739z;

    public a0(java.lang.String str, ve1.h hVar, se1.j0 j0Var, te1.c cVar, ve1.d dVar, te1.s sVar) {
        super(str, hVar, j0Var, 30000, 12000, true, dVar);
        this.f406738y = 0;
        this.f406737x = sVar;
        if (B) {
            return;
        }
        A = qe1.a.a().f362027l;
        B = true;
    }

    @Override // se1.n, se1.g
    public int a(byte[] bArr, int i17, int i18) {
        try {
            return super.a(bArr, i17, i18);
        } catch (se1.q e17) {
            ve1.g.p(4, i(), "read source error occurred " + e17.toString(), null);
            int i19 = this.f406738y + 1;
            this.f406738y = i19;
            long j17 = this.f406808j.f406774c + this.f406815q;
            int i27 = i19 * 2000;
            ve1.g.p(4, i(), "retrying after " + i27 + " ms, read start at offset " + j17 + " retry " + this.f406738y + "/" + A, null);
            try {
                java.lang.Thread.sleep(i27);
                java.net.HttpURLConnection httpURLConnection = this.f406809k;
                se1.i iVar = new se1.i(android.net.Uri.parse(httpURLConnection == null ? null : httpURLConnection.getURL().toString()), 0L, j17, -1L, null, 0, this.f406739z, this.f406808j.f406779h);
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    throw e17;
                }
                if (this.f406738y >= A) {
                    throw e17;
                }
                te1.s sVar = this.f406737x;
                if (!sVar.a(1)) {
                    c(iVar);
                    return a(bArr, i17, i18);
                }
                ve1.g.p(4, i(), "abort retry videoRequest is cancelling " + sVar, null);
                throw new se1.s("readRetry interrupted " + sVar, this.f406808j);
            } catch (java.lang.InterruptedException unused) {
                ve1.g.p(5, i(), "readRetry interrupted", null);
                throw e17;
            }
        }
    }

    @Override // se1.n, se1.g
    public long c(se1.i iVar) {
        this.f406739z = iVar.f406778g;
        try {
            return k(iVar, null);
        } catch (se1.q e17) {
            int i17 = e17 instanceof se1.v ? ((se1.v) e17).f406828d : 0;
            java.lang.String uri = iVar.f406772a.toString();
            ve1.g.p(4, i(), "retryOpen url=" + uri + " with responseCode=" + i17, null);
            if (!java.lang.Thread.currentThread().isInterrupted() && A > 0) {
                ve1.g.p(4, i(), "httpRetryLogic is null", null);
            }
            throw e17;
        }
    }
}
