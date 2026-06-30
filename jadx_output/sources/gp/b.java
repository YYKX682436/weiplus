package gp;

/* loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static java.lang.String a(android.content.Context context, android.net.Uri uri) {
        java.io.InputStream inputStream;
        java.io.Closeable closeable;
        ?? r07 = 0;
        r07 = 0;
        if (uri == null) {
            return null;
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.lang.String type = contentResolver.getType(uri);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetVideoMetadata", "copyFileFromUri typeStr:" + type);
        if (android.text.TextUtils.isEmpty(type)) {
            return null;
        }
        java.lang.String[] split = type.split("/");
        java.lang.String replaceAll = uri.getHost().replaceAll("\\.", "_");
        java.lang.String replaceAll2 = uri.getPath().replaceAll("/", "_");
        java.lang.String str = "." + split[1];
        java.lang.String str2 = "share_file_" + replaceAll + "_" + split[0] + "_" + replaceAll2;
        if (!str2.endsWith(str)) {
            str2 = str2 + str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetVideoMetadata", "copyFileFromUri path:" + str2);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.G(), str2);
        if (!r6Var.s().m()) {
            r6Var.s().J();
        }
        ?? m17 = r6Var.m();
        if (m17 != 0) {
            r6Var.l();
        }
        try {
            try {
                r6Var.k();
                m17 = com.tencent.mm.vfs.w6.H(r6Var);
            } catch (java.lang.Throwable th6) {
                th = th6;
                r07 = contentResolver;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
            inputStream = null;
            m17 = 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            m17 = 0;
        }
        try {
            inputStream = contentResolver.openInputStream(uri);
            closeable = m17;
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            java.lang.String o17 = r6Var.o();
                            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                            com.tencent.mm.sdk.platformtools.t8.v1(m17);
                            return o17;
                        }
                        m17.write(bArr, 0, read);
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetVideoMetadata", e, "copy fail", new java.lang.Object[0]);
                    closeable = m17;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    return null;
                }
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            com.tencent.mm.sdk.platformtools.t8.v1(r07);
            com.tencent.mm.sdk.platformtools.t8.v1(m17);
            throw th;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        com.tencent.mm.sdk.platformtools.t8.v1(closeable);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00cf, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x037b, code lost:
    
        if (r3 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03fc, code lost:
    
        if ((r0 <= 10) != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01eb, code lost:
    
        if (r11 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fd, code lost:
    
        r11.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fb, code lost:
    
        if (r11 == null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x044c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static gp.a b(android.content.Context r32, android.content.Intent r33, int r34) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp.b.b(android.content.Context, android.content.Intent, int):gp.a");
    }
}
