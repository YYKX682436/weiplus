package py5;

/* loaded from: classes7.dex */
public final class a implements javax.net.ssl.X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f359094a;

    /* renamed from: b, reason: collision with root package name */
    public final android.net.http.X509TrustManagerExtensions f359095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f359096c;

    public a(java.lang.String str) {
        this.f359095b = null;
        this.f359096c = str;
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new java.security.NoSuchAlgorithmException("no trust manager found");
        }
        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManagers[0];
        this.f359094a = x509TrustManager;
        this.f359095b = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        javax.net.ssl.X509TrustManager x509TrustManager = this.f359094a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        boolean z17;
        java.lang.String str2 = this.f359096c;
        android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions = this.f359095b;
        if (x509TrustManagerExtensions != null) {
            x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, "");
        } else {
            javax.net.ssl.X509TrustManager x509TrustManager = this.f359094a;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
        boolean z18 = false;
        try {
            javax.security.auth.x500.X500Principal issuerX500Principal = x509CertificateArr[0].getIssuerX500Principal();
            java.util.ArrayList arrayList = new java.util.ArrayList(0);
            arrayList.add(".*(GeoTrust|VeriSign|Symantec|GlobalSign|CFCA|Entrust|Thawte|DigiCert).*");
            if (!android.text.TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList.size()) {
                    z17 = false;
                    break;
                } else {
                    if (java.util.regex.Pattern.compile((java.lang.String) arrayList.get(i17), 2).matcher(issuerX500Principal.getName()).matches()) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (!z17) {
                throw new java.security.cert.CertificateException();
            }
            javax.security.auth.x500.X500Principal subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(0);
            arrayList2.add(".*CN=.*(\\.cup\\.com\\.cn|\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)");
            int i18 = 0;
            while (true) {
                if (i18 >= arrayList2.size()) {
                    break;
                }
                if (java.util.regex.Pattern.compile((java.lang.String) arrayList2.get(i18), 2).matcher(subjectX500Principal.getName()).matches()) {
                    z18 = true;
                    break;
                }
                i18++;
            }
            if (!z18) {
                throw new java.security.cert.CertificateException();
            }
        } catch (java.lang.Exception unused) {
            throw new java.security.cert.CertificateException();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return this.f359094a.getAcceptedIssuers();
    }
}
