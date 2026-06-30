package mq;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final mq.e f330510a = new mq.e();

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #4 {Exception -> 0x009a, blocks: (B:43:0x0092, B:38:0x0097), top: B:42:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.h(r8, r0)
            java.lang.String r0 = "srcFileName"
            kotlin.jvm.internal.o.h(r9, r0)
            java.lang.String r0 = "dstFileName"
            kotlin.jvm.internal.o.h(r10, r0)
            java.lang.String r0 = "alvinluo copyFileFromAssets src: %s, dst: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r10}
            java.lang.String r2 = "DynamicBgAssetsManager"
            mq.h.b(r2, r0, r1)
            r0 = 0
            r1 = 0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            boolean r10 = r3.exists()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            if (r10 != 0) goto L2b
            r3.createNewFile()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
        L2b:
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            java.io.InputStream r8 = r8.open(r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L75
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
        L3c:
            if (r8 == 0) goto L68
            int r5 = r8.read(r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r6 = -1
            if (r5 != r6) goto L64
            r10.flush()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r1 = "alvinluo copyFileFromAssets %s successfully, file len: %d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4[r0] = r9     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            long r5 = r3.length()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r3 = 1
            r4[r3] = r9     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            mq.h.b(r2, r1, r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r8.close()     // Catch: java.lang.Exception -> L8e
        L60:
            r10.close()     // Catch: java.lang.Exception -> L8e
            goto L8e
        L64:
            r10.write(r4, r0, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            goto L3c
        L68:
            kotlin.jvm.internal.o.n()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            throw r1     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
        L6c:
            r9 = move-exception
            goto L72
        L6e:
            r9 = move-exception
            goto L77
        L70:
            r9 = move-exception
            r10 = r1
        L72:
            r1 = r8
            r8 = r9
            goto L90
        L75:
            r9 = move-exception
            r10 = r1
        L77:
            r1 = r8
            r8 = r9
            goto L7f
        L7a:
            r8 = move-exception
            r10 = r1
            goto L90
        L7d:
            r8 = move-exception
            r10 = r1
        L7f:
            java.lang.String r9 = "alvinluo copyFileFromAssets exception"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8f
            mq.h.c(r2, r8, r9, r0)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.lang.Exception -> L8e
        L8b:
            if (r10 == 0) goto L8e
            goto L60
        L8e:
            return
        L8f:
            r8 = move-exception
        L90:
            if (r1 == 0) goto L95
            r1.close()     // Catch: java.lang.Exception -> L9a
        L95:
            if (r10 == 0) goto L9a
            r10.close()     // Catch: java.lang.Exception -> L9a
        L9a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.e.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.h(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.File filesDir = context.getFilesDir();
        kotlin.jvm.internal.o.c(filesDir, "context.filesDir");
        sb6.append(filesDir.getParent());
        sb6.append(java.io.File.separator);
        sb6.append("appbrand/glsl/");
        return sb6.toString();
    }
}
