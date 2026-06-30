package v36;

/* loaded from: classes13.dex */
public final class a extends v36.c {

    /* renamed from: a, reason: collision with root package name */
    public final v36.e f433173a;

    public a(v36.e eVar) {
        this.f433173a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:1: B:27:0x005c->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // v36.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(java.util.List r10, java.lang.String r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r11.removeFirst()
            r10.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L14:
            r3 = 9
            if (r1 >= r3) goto La2
            int r3 = r10.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r10.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            v36.e r5 = r9.f433173a
            java.security.cert.X509Certificate r5 = r5.a(r3)
            if (r5 == 0) goto L58
            int r2 = r10.size()
            if (r2 > r4) goto L38
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L3b
        L38:
            r10.add(r5)
        L3b:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
        L49:
            r2 = r0
            goto L53
        L4b:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L49
            r5.verify(r2)     // Catch: java.security.GeneralSecurityException -> L49
            r2 = r4
        L53:
            if (r2 == 0) goto L56
            return r10
        L56:
            r2 = r4
            goto L88
        L58:
            java.util.Iterator r5 = r11.iterator()
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L78
        L76:
            r7 = r0
            goto L80
        L78:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L76
            r3.verify(r7)     // Catch: java.security.GeneralSecurityException -> L76
            r7 = r4
        L80:
            if (r7 == 0) goto L5c
            r5.remove()
            r10.add(r6)
        L88:
            int r1 = r1 + 1
            goto L14
        L8b:
            if (r2 == 0) goto L8e
            return r10
        L8e:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.<init>(r0)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La2:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v36.a.a(java.util.List, java.lang.String):java.util.List");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v36.a) && ((v36.a) obj).f433173a.equals(this.f433173a);
    }

    public int hashCode() {
        return this.f433173a.hashCode();
    }
}
