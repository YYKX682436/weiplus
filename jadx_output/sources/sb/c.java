package sb;

/* loaded from: classes13.dex */
public abstract class c extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final sb.b f405389d;

    /* renamed from: e, reason: collision with root package name */
    public sb.i f405390e;

    /* renamed from: f, reason: collision with root package name */
    public java.net.HttpURLConnection f405391f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f405392g;

    public c() {
        sb.b bVar = new sb.b();
        this.f405389d = bVar;
        bVar.f405385g = new java.util.HashMap();
        bVar.f405382d = ub.b.b();
    }

    public final void a(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (outputStream != null) {
            outputStream.flush();
            outputStream.close();
        }
        this.f405391f.disconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0344  */
    /* JADX WARN: Type inference failed for: r8v10, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARN: Type inference failed for: r8v11, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARN: Type inference failed for: r8v13, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v25, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v8, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v9, types: [javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.c.b():void");
    }

    public final void c(int i17, int i18, java.lang.Exception exc, java.lang.String str) {
        sb.b bVar = this.f405389d;
        bVar.f405383e.endsWith("log_data");
        com.tencent.midas.comm.APLog.i("APBaseHttpReq", getClass().getName() + " tryAgain reqTimes = " + bVar.f405387i + " tryTimes = " + bVar.f405388j);
        try {
            if (bVar.f405387i < bVar.f405388j) {
                bVar.a();
                b();
                return;
            }
            if (bVar.f405379a.equals("https://")) {
                for (java.lang.Throwable th6 = exc; th6 != null; th6 = th6.getCause()) {
                    if (!(th6 instanceof java.security.cert.CertificateExpiredException) && !(th6 instanceof java.security.cert.CertificateNotYetValidException)) {
                    }
                    com.tencent.midas.comm.APLog.e("APBaseHttpReq", "您的设备系统时间不正确，请更改");
                    sb.a aVar = (sb.a) this.f405390e;
                    aVar.f405378c.remove(aVar.f405376a);
                    aVar.a(this);
                    android.os.Message message = new android.os.Message();
                    message.what = 4;
                    message.obj = aVar;
                    aVar.f405377b.sendMessage(message);
                    return;
                }
            }
            sb.a aVar2 = (sb.a) this.f405390e;
            aVar2.f405378c.remove(aVar2.f405376a);
            aVar2.a(this);
            android.os.Message message2 = new android.os.Message();
            message2.what = 4;
            message2.obj = aVar2;
            aVar2.f405377b.sendMessage(message2);
            com.tencent.midas.comm.APLog.i("APBaseHttpReq", str);
            exc.getClass();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        b();
        super.run();
    }
}
