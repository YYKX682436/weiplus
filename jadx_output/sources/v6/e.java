package v6;

/* loaded from: classes13.dex */
public class e implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f433380d;

    /* renamed from: e, reason: collision with root package name */
    public final v6.g f433381e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.InputStream f433382f;

    public e(android.net.Uri uri, v6.g gVar) {
        this.f433380d = uri;
        this.f433381e = gVar;
    }

    public static v6.e c(android.content.Context context, android.net.Uri uri, v6.f fVar) {
        return new v6.e(uri, new v6.g(com.bumptech.glide.c.b(context).f43925g.d(), fVar, com.bumptech.glide.c.b(context).f43926h, context.getContentResolver()));
    }

    @Override // u6.e
    public java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    @Override // u6.e
    public void cancel() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0034, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0032, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream d() {
        /*
            r13 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r13.f433380d
            v6.g r2 = r13.f433381e
            r2.getClass()
            r3 = 3
            r4 = 0
            r5 = 0
            v6.f r6 = r2.f433383a     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            android.database.Cursor r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L28
            if (r6 == 0) goto L22
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbc
            if (r7 == 0) goto L22
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.SecurityException -> L29 java.lang.Throwable -> Lbc
            r6.close()
            goto L38
        L22:
            if (r6 == 0) goto L37
            goto L34
        L25:
            r0 = move-exception
            goto Lbe
        L28:
            r6 = r4
        L29:
            boolean r7 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L32
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> Lbc
        L32:
            if (r6 == 0) goto L37
        L34:
            r6.close()
        L37:
            r7 = r4
        L38:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            android.content.ContentResolver r8 = r2.f433385c
            if (r6 == 0) goto L41
            goto L59
        L41:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L57
            long r9 = r6.length()
            r11 = 0
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 >= 0) goto L57
            r5 = 1
        L57:
            if (r5 != 0) goto L5b
        L59:
            r5 = r4
            goto L63
        L5b:
            android.net.Uri r5 = android.net.Uri.fromFile(r6)
            java.io.InputStream r5 = r8.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L99
        L63:
            r6 = -1
            if (r5 == 0) goto L8f
            java.io.InputStream r4 = r8.openInputStream(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            java.util.List r7 = r2.f433386d     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            x6.b r2 = r2.f433384b     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            int r0 = t6.g.a(r7, r4, r2)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> L7a
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L90
            goto L90
        L78:
            r0 = move-exception
            goto L89
        L7a:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L83
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L78
        L83:
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.io.IOException -> L8f
            goto L8f
        L89:
            if (r4 == 0) goto L8e
            r4.close()     // Catch: java.io.IOException -> L8e
        L8e:
            throw r0
        L8f:
            r0 = r6
        L90:
            if (r0 == r6) goto L98
            u6.k r1 = new u6.k
            r1.<init>(r5, r0)
            r5 = r1
        L98:
            return r5
        L99:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        Lbc:
            r0 = move-exception
            r4 = r6
        Lbe:
            if (r4 == 0) goto Lc3
            r4.close()
        Lc3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.e.d():java.io.InputStream");
    }

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        try {
            java.io.InputStream d17 = d();
            this.f433382f = d17;
            dVar.c(d17);
        } catch (java.io.FileNotFoundException e17) {
            android.util.Log.isLoggable("MediaStoreThumbFetcher", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.io.InputStream inputStream = this.f433382f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
