package is3;

/* loaded from: classes8.dex */
public class c extends is3.b {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f294476c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294477d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f294478e = null;

    /* renamed from: f, reason: collision with root package name */
    public final is3.a f294479f;

    /* renamed from: g, reason: collision with root package name */
    public int f294480g;

    public c(java.lang.String str, java.lang.String str2, is3.a aVar) {
        this.f294476c = str;
        this.f294477d = str2;
        this.f294479f = aVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        android.os.Bundle[] bundleArr = (android.os.Bundle[]) objArr;
        if (bundleArr.length > 0) {
            this.f294478e = bundleArr[0];
        }
        return g();
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void c(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        is3.a aVar = this.f294479f;
        if (aVar != null) {
            com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = ((os3.a) aVar).f348024a;
            if (bundle != null) {
                int i17 = bundle.getInt("result_http_code", -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.AttachDownloadPage", "result http code %d", java.lang.Integer.valueOf(i17));
                if (i17 == 200) {
                    com.tencent.mm.vfs.w6.P(attachDownloadPage.f154821r, attachDownloadPage.X6() + ".temp", attachDownloadPage.X6());
                    attachDownloadPage.A = 3;
                    dp.a.makeText(attachDownloadPage, attachDownloadPage.getString(com.tencent.mm.R.string.f491071bs5) + " : " + attachDownloadPage.Z6(false), 5000).show();
                    attachDownloadPage.b7();
                    return;
                }
            }
            attachDownloadPage.A = 4;
            int i18 = attachDownloadPage.C;
            if (i18 < 5) {
                attachDownloadPage.C = i18 + 1;
                attachDownloadPage.W6();
            } else {
                dp.a.makeText(attachDownloadPage, com.tencent.mm.R.string.gpi, 0).show();
                attachDownloadPage.b7();
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void e(java.lang.Object[] objArr) {
        java.lang.Integer[] numArr = (java.lang.Integer[]) objArr;
        is3.a aVar = this.f294479f;
        if (aVar != null) {
            numArr[0].intValue();
            com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = ((os3.a) aVar).f348024a;
            com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.U6(attachDownloadPage);
            attachDownloadPage.A = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStream] */
    public final android.os.Bundle g() {
        ?? r66;
        java.io.BufferedOutputStream bufferedOutputStream;
        com.tencent.mm.network.h2 d17;
        int D1;
        ?? gZIPInputStream;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.network.h2 h2Var = null;
        try {
            try {
                d17 = com.tencent.mm.network.n.d(this.f294476c, null);
                try {
                    d17.h("User-Agent", is3.d.f294481a);
                    d17.h("Accept-Charset", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    d17.h("Accept-Encoding", "gzip, deflate");
                    android.os.Bundle bundle2 = this.f294478e;
                    if (bundle2 != null) {
                        java.lang.String string = bundle2.getString("param_cookie");
                        com.tencent.mars.xlog.Log.i("MicroMsg.MailHttpDownloadFileTask", "cookie %s", string);
                        d17.h("Cookie", string);
                    }
                    d17.a();
                    int f17 = d17.f();
                    bundle.putInt("result_http_code", f17);
                    if (f17 != 200) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MailHttpDownloadFileTask", "https get response code = %d", java.lang.Integer.valueOf(f17));
                        if (f17 == 302) {
                            int i17 = this.f294480g;
                            if (i17 >= 2) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.MailHttpDownloadFileTask", "redirect exceed max count");
                                d17.disconnect();
                                return bundle;
                            }
                            this.f294480g = i17 + 1;
                            java.lang.String i18 = d17.i(ya.b.LOCATION);
                            this.f294476c = i18;
                            com.tencent.mars.xlog.Log.i("MicroMsg.MailHttpDownloadFileTask", "redirect to url: %s", i18);
                            android.os.Bundle g17 = g();
                            d17.disconnect();
                            return g17;
                        }
                    }
                    D1 = com.tencent.mm.sdk.platformtools.t8.D1(d17.i("Content-Length"), 0);
                    gZIPInputStream = "gzip".equalsIgnoreCase(d17.f72017a.getContentEncoding()) ? new java.util.zip.GZIPInputStream(d17.getInputStream()) : "deflate".equalsIgnoreCase(d17.f72017a.getContentEncoding()) ? new java.util.zip.InflaterInputStream(d17.getInputStream(), new java.util.zip.Inflater(true), 512) : new java.io.BufferedInputStream(d17.getInputStream());
                    try {
                        bufferedOutputStream = new java.io.BufferedOutputStream(com.tencent.mm.vfs.w6.K(this.f294477d, false));
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedOutputStream = null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedOutputStream = null;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                r66 = 0;
                bufferedOutputStream = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MailHttpDownloadFileTask", "http download file, exception: %s", e17.getMessage());
            bundle.putInt("result_http_code", -1);
        }
        try {
            byte[] bArr = new byte[4096];
            int read = gZIPInputStream.read(bArr);
            int i19 = read + 0;
            while (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
                if (this.f294479f != null && D1 > 0) {
                    this.f189349b.post(new com.tencent.mm.pluginsdk.model.i3(this, new java.lang.Integer[]{java.lang.Integer.valueOf((int) ((i19 * 100.0f) / D1))}));
                }
                read = gZIPInputStream.read(bArr);
                i19 += read;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MailHttpDownloadFileTask", "fileLength %d, totalRead %d", java.lang.Integer.valueOf(D1), java.lang.Integer.valueOf(i19));
            d17.disconnect();
            gZIPInputStream.close();
            bufferedOutputStream.close();
            return bundle;
        } catch (java.lang.Throwable th9) {
            th = th9;
            h2Var = gZIPInputStream;
            r66 = h2Var;
            h2Var = d17;
            if (h2Var != null) {
                h2Var.disconnect();
            }
            if (r66 != 0) {
                r66.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }
}
