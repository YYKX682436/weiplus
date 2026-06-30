package u7;

/* loaded from: classes13.dex */
public class l implements u7.t {

    /* renamed from: a, reason: collision with root package name */
    public final x7.b f425062a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.b f425063b;

    /* renamed from: c, reason: collision with root package name */
    public u7.u f425064c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.HttpURLConnection f425065d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.InputStream f425066e;

    public l(java.lang.String str, x7.b bVar, w7.b bVar2) {
        bVar.getClass();
        this.f425062a = bVar;
        bVar2.getClass();
        this.f425063b = bVar2;
        u7.u a17 = ((x7.a) bVar).a(str);
        if (a17 == null) {
            android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
            java.lang.String fileExtensionFromUrl = android.webkit.MimeTypeMap.getFileExtensionFromUrl(str);
            a17 = new u7.u(str, -2147483648L, android.text.TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl));
        }
        this.f425064c = a17;
    }

    public void a() {
        java.net.HttpURLConnection httpURLConnection = this.f425065d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            } catch (java.lang.IllegalArgumentException e17) {
                e = e17;
                throw new java.lang.RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (java.lang.NullPointerException e18) {
                e = e18;
                throw new java.lang.RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            u7.u r0 = r8.f425064c
            java.lang.String r0 = r0.f425080a
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            java.net.HttpURLConnection r0 = r8.e(r0, r2)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            java.lang.String r1 = "Content-Length"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            if (r1 != 0) goto L18
            r1 = -1
            goto L1c
        L18:
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
        L1c:
            java.lang.String r4 = r0.getContentType()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            u7.u r5 = new u7.u     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            u7.u r6 = r8.f425064c     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.String r6 = r6.f425080a     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r5.<init>(r6, r1, r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r8.f425064c = r5     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            x7.b r1 = r8.f425062a     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            x7.a r1 = (x7.a) r1     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r1.b(r6, r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            u7.u r1 = r8.f425064c     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            if (r3 == 0) goto L55
            r3.close()     // Catch: java.io.IOException -> L55
            goto L55
        L41:
            r1 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L59
        L46:
            r0 = move-exception
            r1 = r3
            goto L5d
        L49:
            r0 = r3
        L4a:
            u7.u r1 = r8.f425064c     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.f425080a     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L53
        L53:
            if (r0 == 0) goto L58
        L55:
            r0.disconnect()
        L58:
            return
        L59:
            r7 = r3
            r3 = r0
            r0 = r1
            r1 = r7
        L5d:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L62
        L62:
            if (r1 == 0) goto L67
            r1.disconnect()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.b():void");
    }

    public synchronized long c() {
        if (this.f425064c.f425081b == -2147483648L) {
            b();
        }
        return this.f425064c.f425081b;
    }

    public void d(long j17) {
        try {
            java.net.HttpURLConnection e17 = e(j17, -1);
            this.f425065d = e17;
            java.lang.String contentType = e17.getContentType();
            this.f425066e = new java.io.BufferedInputStream(this.f425065d.getInputStream(), 8192);
            java.net.HttpURLConnection httpURLConnection = this.f425065d;
            int responseCode = httpURLConnection.getResponseCode();
            java.lang.String headerField = httpURLConnection.getHeaderField("Content-Length");
            long parseLong = headerField == null ? -1L : java.lang.Long.parseLong(headerField);
            if (responseCode != 200) {
                parseLong = responseCode == 206 ? parseLong + j17 : this.f425064c.f425081b;
            }
            java.lang.String str = this.f425064c.f425080a;
            u7.u uVar = new u7.u(str, parseLong, contentType);
            this.f425064c = uVar;
            ((x7.a) this.f425062a).b(str, uVar);
        } catch (java.io.IOException e18) {
            throw new u7.r("Error opening connection for " + this.f425064c.f425080a + " with offset " + j17, e18);
        }
    }

    public final java.net.HttpURLConnection e(long j17, int i17) {
        java.net.HttpURLConnection httpURLConnection;
        boolean z17;
        java.lang.String str = this.f425064c.f425080a;
        int i18 = 0;
        do {
            if (j17 > 0) {
                new java.lang.StringBuilder(" with offset ").append(j17);
            }
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            ((w7.a) this.f425063b).getClass();
            for (java.util.Map.Entry entry : new java.util.HashMap().entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            if (j17 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j17 + "-");
            }
            if (i17 > 0) {
                httpURLConnection.setConnectTimeout(i17);
                httpURLConnection.setReadTimeout(i17);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z17 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z17) {
                str = httpURLConnection.getHeaderField("Location");
                i18++;
                httpURLConnection.disconnect();
            }
            if (i18 > 5) {
                throw new u7.r("Too many redirects: " + i18);
            }
        } while (z17);
        return httpURLConnection;
    }

    public int f(byte[] bArr) {
        java.io.InputStream inputStream = this.f425066e;
        if (inputStream == null) {
            throw new u7.r("Error reading data from " + this.f425064c.f425080a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (java.io.InterruptedIOException e17) {
            throw new u7.n("Reading source " + this.f425064c.f425080a + " is interrupted", e17);
        } catch (java.io.IOException e18) {
            throw new u7.r("Error reading data from " + this.f425064c.f425080a, e18);
        }
    }

    public java.lang.String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f425064c + "}";
    }

    public l(u7.l lVar) {
        this.f425064c = lVar.f425064c;
        this.f425062a = lVar.f425062a;
        this.f425063b = lVar.f425063b;
    }
}
