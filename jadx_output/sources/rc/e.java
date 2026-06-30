package rc;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rc.e f393910a = new rc.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f393911b = new java.util.LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f393912c = new java.lang.Object();

    public final void a(byte[] cert) {
        kotlin.jvm.internal.o.g(cert, "cert");
        byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(cert);
        kotlin.jvm.internal.o.d(digest);
        java.lang.String a07 = kz5.z.a0(digest, "", null, null, 0, null, rc.d.f393909d, 30, null);
        synchronized (f393912c) {
            java.util.Set set = f393911b;
            if (set.contains(a07)) {
                return;
            }
            set.add(a07);
            try {
                org.chromium.net.X509Util.addTestRootCertificate(cert);
            } catch (java.security.KeyStoreException e17) {
                com.tencent.mars.xlog.Log.e("CronetUserCertInjector", "KeyStoreException while adding certificate: " + e17.getMessage());
            } catch (java.security.NoSuchAlgorithmException e18) {
                com.tencent.mars.xlog.Log.e("CronetUserCertInjector", "NoSuchAlgorithmException while adding certificate: " + e18.getMessage());
            } catch (java.security.cert.CertificateException e19) {
                com.tencent.mars.xlog.Log.e("CronetUserCertInjector", "Failed to add certificate: " + e19.getMessage());
            }
        }
    }

    public final void b() {
        byte[][] userAddedRoots = org.chromium.net.X509Util.getUserAddedRoots();
        kotlin.jvm.internal.o.f(userAddedRoots, "getUserAddedRoots(...)");
        for (byte[] bArr : userAddedRoots) {
            a(bArr);
        }
    }
}
