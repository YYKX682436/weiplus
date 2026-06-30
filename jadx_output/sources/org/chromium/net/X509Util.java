package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
@org.chromium.build.annotations.MainDex
/* loaded from: classes7.dex */
public class X509Util {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String OID_ANY_EKU = "2.5.29.37.0";
    private static final java.lang.String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
    private static final java.lang.String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
    private static final java.lang.String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
    private static final java.lang.String TAG = "X509Util";
    private static java.security.cert.CertificateFactory sCertificateFactory;
    private static android.net.http.X509TrustManagerExtensions sDefaultTrustManager;
    private static boolean sLoadedSystemKeyStore;
    private static java.io.File sSystemCertificateDirectory;
    private static java.security.KeyStore sSystemKeyStore;
    private static java.util.Set<android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey>> sSystemTrustAnchorCache;
    private static java.security.KeyStore sTestKeyStore;
    private static java.security.cert.X509Certificate sTestRoot;
    private static android.net.http.X509TrustManagerExtensions sTestTrustManager;
    private static org.chromium.net.X509Util.TrustStorageListener sTrustStorageListener;
    private static final java.lang.Object sLock = new java.lang.Object();
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* loaded from: classes7.dex */
    public interface Natives {
        void notifyClientCertStoreChanged();

        void notifyTrustStoreChanged();
    }

    /* loaded from: classes7.dex */
    public static final class TrustStorageListener extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            boolean z17 = true;
            if (android.os.Build.VERSION.SDK_INT < 26) {
                if ("android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                    org.chromium.net.X509UtilJni.get().notifyClientCertStoreChanged();
                }
                z17 = false;
            } else if (!"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction())) {
                if ("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction())) {
                    org.chromium.net.X509UtilJni.get().notifyClientCertStoreChanged();
                } else if ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)) {
                    org.chromium.net.X509UtilJni.get().notifyClientCertStoreChanged();
                }
                z17 = false;
            }
            if (z17) {
                try {
                    org.chromium.net.X509Util.reloadDefaultTrustManager();
                } catch (java.security.KeyStoreException e17) {
                    org.chromium.base.Log.e(org.chromium.net.X509Util.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e17);
                } catch (java.security.NoSuchAlgorithmException e18) {
                    org.chromium.base.Log.e(org.chromium.net.X509Util.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e18);
                } catch (java.security.cert.CertificateException e19) {
                    org.chromium.base.Log.e(org.chromium.net.X509Util.TAG, "Unable to reload the default TrustManager", (java.lang.Throwable) e19);
                }
            }
        }

        private TrustStorageListener() {
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        java.security.cert.X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            ensureTestInitializedLocked();
            java.security.KeyStore keyStore = sTestKeyStore;
            keyStore.setCertificateEntry("root_cert_" + java.lang.Integer.toString(keyStore.size()), createCertificateFromBytes);
            reloadTestTrustManager();
        }
    }

    private static java.util.List<java.security.cert.X509Certificate> checkServerTrustedIgnoringRuntimeException(android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions, java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str, java.lang.String str2) {
        try {
            return x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        } catch (java.lang.RuntimeException e17) {
            org.chromium.base.Log.e(TAG, "checkServerTrusted() unexpectedly threw: %s", (java.lang.Throwable) e17);
            throw new java.security.cert.CertificateException(e17);
        }
    }

    public static void clearTestRootCertificates() {
        synchronized (sLock) {
            ensureTestInitializedLocked();
            try {
                sTestKeyStore.load(null);
                reloadTestTrustManager();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.security.cert.X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (java.security.cert.X509Certificate) sCertificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArr));
    }

    private static android.net.http.X509TrustManagerExtensions createTrustManager(java.security.KeyStore keyStore) {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                    try {
                        return new android.net.http.X509TrustManagerExtensions((javax.net.ssl.X509TrustManager) trustManager);
                    } catch (java.lang.IllegalArgumentException e17) {
                        org.chromium.base.Log.e(TAG, "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e17);
                    }
                }
            }
            org.chromium.base.Log.e(TAG, "Could not find suitable trust manager");
            return null;
        } catch (java.lang.RuntimeException e18) {
            org.chromium.base.Log.e(TAG, "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", (java.lang.Throwable) e18);
            throw new java.security.KeyStoreException(e18);
        }
    }

    private static void ensureInitialized() {
        synchronized (sLock) {
            ensureInitializedLocked();
        }
    }

    private static void ensureInitializedLocked() {
        if (sCertificateFactory == null) {
            sCertificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (java.io.IOException unused) {
                }
                sSystemCertificateDirectory = new java.io.File(java.lang.System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (java.security.KeyStoreException unused2) {
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new java.util.HashSet();
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new org.chromium.net.X509Util.TrustStorageListener();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), sTrustStorageListener, intentFilter);
        }
    }

    private static void ensureTestInitializedLocked() {
        if (sTestKeyStore == null) {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            sTestKeyStore = keyStore;
            try {
                keyStore.load(null);
            } catch (java.io.IOException unused) {
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
    }

    public static byte[][] getUserAddedRoots() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (sLock) {
            try {
                try {
                    ensureInitialized();
                    java.security.KeyStore keyStore = sSystemKeyStore;
                    if (keyStore == null) {
                        return new byte[0];
                    }
                    try {
                        java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
                        while (aliases.hasMoreElements()) {
                            java.lang.String nextElement = aliases.nextElement();
                            if (nextElement.startsWith("user:")) {
                                try {
                                    java.security.cert.Certificate certificate = sSystemKeyStore.getCertificate(nextElement);
                                    if (certificate instanceof java.security.cert.X509Certificate) {
                                        arrayList.add(((java.security.cert.X509Certificate) certificate).getEncoded());
                                    } else {
                                        org.chromium.base.Log.w(TAG, "alias: " + nextElement + " is not a X509 Cert, skipping");
                                    }
                                } catch (java.security.KeyStoreException e17) {
                                    org.chromium.base.Log.e(TAG, "Error reading cert with alias %s, error: %s", nextElement, e17);
                                } catch (java.security.cert.CertificateEncodingException e18) {
                                    org.chromium.base.Log.e(TAG, "Error encoding cert with alias %s, error: %s", nextElement, e18);
                                }
                            }
                        }
                        java.security.cert.X509Certificate x509Certificate = sTestRoot;
                        if (x509Certificate != null) {
                            try {
                                arrayList.add(x509Certificate.getEncoded());
                            } catch (java.security.cert.CertificateEncodingException e19) {
                                org.chromium.base.Log.e(TAG, "Error encoding test root cert, error %s", (java.lang.Throwable) e19);
                            }
                        }
                        return (byte[][]) arrayList.toArray(new byte[0]);
                    } catch (java.security.KeyStoreException e27) {
                        org.chromium.base.Log.e(TAG, "Error reading cert aliases: %s", (java.lang.Throwable) e27);
                        return new byte[0];
                    }
                } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
                    return new byte[0];
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    private static java.lang.String hashPrincipal(javax.security.auth.x500.X500Principal x500Principal) {
        byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i17 * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b17 = digest[3 - i17];
            cArr[i18] = cArr2[(b17 >> 4) & 15];
            cArr[i18 + 1] = cArr2[b17 & 15];
        }
        return new java.lang.String(cArr);
    }

    private static boolean isKnownRoot(java.security.cert.X509Certificate x509Certificate) {
        if (sSystemKeyStore == null) {
            return false;
        }
        android.util.Pair<javax.security.auth.x500.X500Principal, java.security.PublicKey> pair = new android.util.Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        java.lang.String hashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i17 = 0;
        while (true) {
            java.lang.String str = hashPrincipal + "." + i17;
            if (!new java.io.File(sSystemCertificateDirectory, str).exists()) {
                return false;
            }
            java.security.cert.Certificate certificate = sSystemKeyStore.getCertificate("system:" + str);
            if (certificate != null) {
                if (certificate instanceof java.security.cert.X509Certificate) {
                    java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        sSystemTrustAnchorCache.add(pair);
                        return true;
                    }
                } else {
                    org.chromium.base.Log.e(TAG, "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
                }
            }
            i17++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            sDefaultTrustManager = null;
            sSystemTrustAnchorCache = null;
            ensureInitializedLocked();
        }
        org.chromium.net.X509UtilJni.get().notifyTrustStoreChanged();
    }

    private static void reloadTestTrustManager() {
        ensureTestInitializedLocked();
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void setTestRootCertificateForBuiltin(byte[] bArr) {
        java.security.cert.X509Certificate createCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            sTestRoot = createCertificateFromBytes;
        }
    }

    public static boolean verifyKeyUsage(java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (java.lang.NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (java.lang.String str : extendedKeyUsage) {
            if (str.equals(OID_TLS_SERVER_AUTH) || str.equals(OID_ANY_EKU) || str.equals(OID_SERVER_GATED_NETSCAPE) || str.equals(OID_SERVER_GATED_MICROSOFT)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6 A[Catch: all -> 0x00fe, TryCatch #9 {, blocks: (B:61:0x009f, B:63:0x00a3, B:64:0x00a8, B:67:0x00aa, B:68:0x00e0, B:70:0x00e6, B:71:0x00f7, B:72:0x00fc, B:77:0x00b0, B:81:0x00b6, B:83:0x00be, B:84:0x00de), top: B:60:0x009f, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be A[Catch: all -> 0x00fe, TRY_ENTER, TryCatch #9 {, blocks: (B:61:0x009f, B:63:0x00a3, B:64:0x00a8, B:67:0x00aa, B:68:0x00e0, B:70:0x00e6, B:71:0x00f7, B:72:0x00fc, B:77:0x00b0, B:81:0x00b6, B:83:0x00be, B:84:0x00de), top: B:60:0x009f, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.X509Util.verifyServerCertificates(byte[][], java.lang.String, java.lang.String, boolean):org.chromium.net.AndroidCertVerifyResult");
    }
}
