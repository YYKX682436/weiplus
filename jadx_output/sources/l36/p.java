package l36;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final l36.p f315557c = new l36.p(new java.util.LinkedHashSet(new java.util.ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f315558a;

    /* renamed from: b, reason: collision with root package name */
    public final v36.c f315559b;

    public p(java.util.Set set, v36.c cVar) {
        this.f315558a = set;
        this.f315559b = cVar;
    }

    public static java.lang.String b(java.security.cert.Certificate certificate) {
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + x36.o.p(((java.security.cert.X509Certificate) certificate).getPublicKey().getEncoded()).k("SHA-256").h();
    }

    public void a(java.lang.String str, java.util.List list) {
        java.util.List emptyList = java.util.Collections.emptyList();
        java.util.Iterator it = this.f315558a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        if (emptyList.isEmpty()) {
            return;
        }
        v36.c cVar = this.f315559b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (emptyList.size() > 0) {
                android.support.v4.media.f.a(emptyList.get(0));
                throw null;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i18 = 0; i18 < size2; i18++) {
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) list.get(i18);
            sb6.append("\n    ");
            sb6.append(b(x509Certificate));
            sb6.append(": ");
            sb6.append(x509Certificate.getSubjectDN().getName());
        }
        sb6.append("\n  Pinned certificates for ");
        sb6.append(str);
        sb6.append(":");
        int size3 = emptyList.size();
        for (int i19 = 0; i19 < size3; i19++) {
            android.support.v4.media.f.a(emptyList.get(i19));
            sb6.append("\n    null");
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException(sb6.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l36.p) {
            l36.p pVar = (l36.p) obj;
            if (m36.e.i(this.f315559b, pVar.f315559b) && this.f315558a.equals(pVar.f315558a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        v36.c cVar = this.f315559b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f315558a.hashCode();
    }
}
