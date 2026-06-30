package v36;

/* loaded from: classes13.dex */
public final class b implements v36.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f433174a = new java.util.LinkedHashMap();

    public b(java.security.cert.X509Certificate... x509CertificateArr) {
        for (java.security.cert.X509Certificate x509Certificate : x509CertificateArr) {
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            java.util.Set set = (java.util.Set) this.f433174a.get(subjectX500Principal);
            if (set == null) {
                set = new java.util.LinkedHashSet(1);
                this.f433174a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // v36.e
    public java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        java.util.Set<java.security.cert.X509Certificate> set = (java.util.Set) ((java.util.LinkedHashMap) this.f433174a).get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (java.security.cert.X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v36.b) && ((v36.b) obj).f433174a.equals(this.f433174a);
    }

    public int hashCode() {
        return this.f433174a.hashCode();
    }
}
