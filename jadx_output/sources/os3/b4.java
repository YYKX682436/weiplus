package os3;

/* loaded from: classes7.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348043d;

    public b4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348043d = readMailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.net.HttpURLConnection httpURLConnection;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348043d;
        java.net.HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(readMailUI.B).openConnection();
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            httpURLConnection = httpURLConnection2;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            readMailUI.C = httpURLConnection.getHeaderField("Location");
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            int headerFieldInt = httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            if (headerFieldInt <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", "error content-length");
                inputStream.close();
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", e18.getMessage());
                }
                httpURLConnection.disconnect();
                return;
            }
            byte[] bArr = new byte[headerFieldInt];
            int read = inputStream.read(bArr);
            inputStream.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "dz[mQQMailDownloadUrl:%s]", readMailUI.C);
            com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "len %d, readLen %d, md5 %s", java.lang.Integer.valueOf(headerFieldInt), java.lang.Integer.valueOf(read), new java.lang.String(bArr));
            java.security.PublicKey a17 = kk.q.a(readMailUI.getApplicationContext(), "rsa_public_key_forwx.pem");
            byte[] decode = android.util.Base64.decode(bArr, 0);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, a17);
            java.lang.String str = new java.lang.String(cipher.doFinal(decode));
            readMailUI.D = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReadMailUI", "dz[mQQMailMD5:%s]", str);
            com.tencent.mm.sdk.platformtools.u3.h(new os3.a4(this));
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", e19.getMessage());
            }
            httpURLConnection.disconnect();
        } catch (java.lang.Exception e27) {
            e = e27;
            httpURLConnection2 = httpURLConnection;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReadMailUI", e, "", new java.lang.Object[0]);
            if (httpURLConnection2 != null) {
                try {
                    httpURLConnection2.getInputStream().close();
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", e28.getMessage());
                }
                httpURLConnection2.disconnect();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.lang.Exception e29) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailUI", e29.getMessage());
                }
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
