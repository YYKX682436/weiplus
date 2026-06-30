package yr5;

/* loaded from: classes13.dex */
public final class b extends bs5.c {

    /* renamed from: d, reason: collision with root package name */
    public final bs5.d f465112d;

    public b(int i17) {
        super(i17);
        this.f465112d = null;
        this.f465112d = new yr5.c();
    }

    @Override // bs5.c
    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        return yr5.a.a(str, str2);
    }

    @Override // bs5.c
    public java.lang.String f() {
        return "AesHttp";
    }

    @Override // bs5.c
    public java.lang.String g() {
        return "AesHttpDns(" + this.f24014b + ")";
    }

    @Override // bs5.c
    public java.net.SocketAddress h(java.lang.String str, int i17) {
        return this.f465112d.b(str, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @Override // bs5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String i(java.lang.String r8, java.lang.String r9, bs5.q r10) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 10
            long r2 = (long) r2
            r4 = 60
            long r2 = r2 * r4
            long r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r9 = 59
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            java.lang.String r0 = r10.f24057c
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L6c
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L33
            goto L6c
        L33:
            r1 = 16
            byte[] r4 = new byte[r1]     // Catch: java.lang.Exception -> L6c
            java.security.SecureRandom r5 = new java.security.SecureRandom     // Catch: java.lang.Exception -> L6c
            r5.<init>()     // Catch: java.lang.Exception -> L6c
            r5.nextBytes(r4)     // Catch: java.lang.Exception -> L6c
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L6c
            r5.<init>(r4)     // Catch: java.lang.Exception -> L6c
            java.lang.String r6 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.lang.Exception -> L6c
            javax.crypto.spec.SecretKeySpec r0 = yr5.a.b(r0)     // Catch: java.lang.Exception -> L6c
            r6.init(r2, r0, r5)     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = "utf-8"
            byte[] r9 = r9.getBytes(r0)     // Catch: java.lang.Exception -> L6c
            byte[] r9 = r6.doFinal(r9)     // Catch: java.lang.Exception -> L6c
            int r0 = r9.length     // Catch: java.lang.Exception -> L6c
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L6c
            java.lang.System.arraycopy(r4, r3, r0, r3, r1)     // Catch: java.lang.Exception -> L6c
            int r4 = r9.length     // Catch: java.lang.Exception -> L6c
            java.lang.System.arraycopy(r9, r3, r0, r1, r4)     // Catch: java.lang.Exception -> L6c
            java.lang.String r9 = bs5.p.a(r0)     // Catch: java.lang.Exception -> L6c
            goto L6e
        L6c:
            java.lang.String r9 = ""
        L6e:
            int r0 = r7.f24014b
            java.lang.String r10 = r10.f24056b
            if (r0 == r2) goto L9c
            r1 = 2
            if (r0 == r1) goto L95
            r1 = 3
            if (r0 != r1) goto L81
            java.lang.String r0 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=addrs"
            java.lang.String r9 = bs5.r.b(r9, r10, r0, r3)
            goto La2
        L81:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unexpected value: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            java.lang.String r0 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s&type=aaaa"
            java.lang.String r9 = bs5.r.b(r9, r10, r0, r3)
            goto La2
        L9c:
            java.lang.String r0 = "dn=%s&ip=%s&clientip=1&ttl=1&id=%s"
            java.lang.String r9 = bs5.r.b(r9, r10, r0, r3)
        La2:
            bs5.d r10 = r7.f465112d
            java.lang.String r8 = r10.c(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yr5.b.i(java.lang.String, java.lang.String, bs5.q):java.lang.String");
    }
}
