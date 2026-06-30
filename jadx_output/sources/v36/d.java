package v36;

/* loaded from: classes7.dex */
public final class d implements javax.net.ssl.HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final v36.d f433175a = new v36.d();

    public static java.util.List a(java.security.cert.X509Certificate x509Certificate) {
        java.util.List b17 = b(x509Certificate, 7);
        java.util.List b18 = b(x509Certificate, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(b17.size() + b18.size());
        arrayList.addAll(b17);
        arrayList.addAll(b18);
        return arrayList;
    }

    public static java.util.List b(java.security.cert.X509Certificate x509Certificate, int i17) {
        java.lang.Integer num;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return java.util.Collections.emptyList();
            }
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (java.lang.Integer) list.get(0)) != null && num.intValue() == i17 && (str = (java.lang.String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return java.util.Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:15:0x003a->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            r8 = this;
            java.util.regex.Pattern r0 = m36.e.f323393h
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            r0 = 7
            java.util.List r10 = b(r10, r0)
            int r0 = r10.size()
            r3 = r2
        L18:
            if (r3 >= r0) goto Lea
            java.lang.Object r4 = r10.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L28
            goto Leb
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
            r0 = 2
            java.util.List r10 = b(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L3a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lea
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto Le6
            int r3 = r9.length()
            if (r3 == 0) goto Le6
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto Le6
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L60
            goto Le6
        L60:
            if (r0 == 0) goto Le6
            int r5 = r0.length()
            if (r5 == 0) goto Le6
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Le6
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L76
            goto Le6
        L76:
            boolean r4 = r9.endsWith(r3)
            if (r4 != 0) goto L81
            java.lang.String r4 = r9.concat(r3)
            goto L82
        L81:
            r4 = r9
        L82:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L8c
            java.lang.String r0 = r0.concat(r3)
        L8c:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L9f
            boolean r0 = r4.equals(r0)
            goto Le7
        L9f:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto Le6
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto Lb1
            goto Le6
        Lb1:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto Lbc
            goto Le6
        Lbc:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lc3
            goto Le6
        Lc3:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto Lce
            goto Le6
        Lce:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Le4
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto Le4
            goto Le6
        Le4:
            r0 = r1
            goto Le7
        Le6:
            r0 = r2
        Le7:
            if (r0 == 0) goto L3a
            goto Leb
        Lea:
            r1 = r2
        Leb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v36.d.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        try {
            return c(str, (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }
}
