package s65;

/* loaded from: classes11.dex */
public class f0 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f403447a;

    /* renamed from: b, reason: collision with root package name */
    public int f403448b;

    /* renamed from: c, reason: collision with root package name */
    public final q65.b f403449c;

    /* renamed from: d, reason: collision with root package name */
    public org.apache.http.client.HttpClient f403450d = null;

    /* renamed from: e, reason: collision with root package name */
    public org.apache.http.client.methods.HttpGet f403451e = null;

    /* renamed from: f, reason: collision with root package name */
    public org.apache.http.HttpResponse f403452f = null;

    /* renamed from: g, reason: collision with root package name */
    public org.apache.http.HttpEntity f403453g = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.OutputStream f403454h = new s65.e0(this);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s65.g0 f403455i;

    public f0(s65.g0 g0Var, int i17, int i18, q65.b bVar) {
        this.f403455i = g0Var;
        this.f403447a = i17;
        this.f403448b = i18;
        this.f403449c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01af, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r14.getConnectionManager().shutdown();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        if (r14 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
    
        if (r14 != null) goto L30;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s65.f0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        org.apache.http.client.methods.HttpGet httpGet = this.f403451e;
        if (httpGet != null) {
            httpGet.abort();
        }
        org.apache.http.HttpEntity httpEntity = this.f403453g;
        if (httpEntity != null) {
            try {
                httpEntity.consumeContent();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", e17, "", new java.lang.Object[0]);
            }
        }
        org.apache.http.client.HttpClient httpClient = this.f403450d;
        if (httpClient != null) {
            httpClient.getConnectionManager().shutdown();
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f403449c.d(((java.lang.Integer) obj).intValue(), 0, null);
    }
}
