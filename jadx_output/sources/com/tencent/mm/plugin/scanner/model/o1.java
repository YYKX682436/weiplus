package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes12.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.o1 f158972a = new com.tencent.mm.plugin.scanner.model.o1();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x000b, B:5:0x001f, B:7:0x0028, B:9:0x0042, B:11:0x004f, B:14:0x00a0, B:18:0x00a9, B:21:0x00ae, B:23:0x009a, B:31:0x003a), top: B:2:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo a(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r18
            java.lang.String r2 = "MicroMsg.ScanImagePHashUtil"
            java.lang.String r0 = "imagePath"
            kotlin.jvm.internal.o.g(r1, r0)
            r4 = 1
            r5 = 0
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r0.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            com.tencent.mm.sdk.platformtools.x.J(r1, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r6 = r0.outWidth     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r0 = r0.outHeight     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r6 = r6 * r0
            r0 = 1166400(0x11cc40, float:1.634475E-39)
            if (r6 <= r0) goto L41
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L41
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            double r6 = java.lang.Math.sqrt(r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            double r6 = java.lang.Math.ceil(r6)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            float r0 = (float) r6
            int r0 = (int) r0
            goto L42
        L36:
            r0 = move-exception
            goto Lbd
        L39:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = "computeSampleSize exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r7, r6)     // Catch: java.lang.Throwable -> L36
        L41:
            r0 = r4
        L42:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            r6.inSampleSize = r0     // Catch: java.lang.Throwable -> L36
            android.graphics.Bitmap r1 = com.tencent.mm.sdk.platformtools.x.J(r1, r6)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto Lc4
            int r6 = r1.getWidth()     // Catch: java.lang.Throwable -> L36
            int r15 = r1.getHeight()     // Catch: java.lang.Throwable -> L36
            java.lang.String r7 = "computeImagePHash width: %d, height: %d, sampleSize: %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L36
            r8[r5] = r9     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L36
            r8[r4] = r9     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            r9 = 2
            r8[r9] = r0     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.i(r2, r7, r8)     // Catch: java.lang.Throwable -> L36
            int r0 = r6 * r15
            int[] r14 = new int[r0]     // Catch: java.lang.Throwable -> L36
            r9 = 0
            int r10 = r1.getWidth()     // Catch: java.lang.Throwable -> L36
            r11 = 0
            r12 = 0
            int r13 = r1.getWidth()     // Catch: java.lang.Throwable -> L36
            int r16 = r1.getHeight()     // Catch: java.lang.Throwable -> L36
            r7 = r1
            r8 = r14
            r3 = r14
            r14 = r16
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L36
            r1.recycle()     // Catch: java.lang.Throwable -> L36
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch: java.lang.Throwable -> L36
            boolean r1 = et5.h.f256676a     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L9a
            r1 = -1
            goto La0
        L9a:
            com.tencent.wechat.aff.iam_scan.c r1 = com.tencent.wechat.aff.iam_scan.c.f216974b     // Catch: java.lang.Throwable -> L36
            int r1 = r1.h(r3, r6, r15, r0)     // Catch: java.lang.Throwable -> L36
        La0:
            byte[] r0 = et5.h.f(r0)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto Lae
            if (r0 != 0) goto La9
            goto Lae
        La9:
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r0 = com.tencent.mm.plugin.scanner.model.d1.d(r0, r6, r15, r5)     // Catch: java.lang.Throwable -> L36
            return r0
        Lae:
            java.lang.String r0 = "computeImagePHash transBytes failed result: %d"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L36
            r3[r5] = r1     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.e(r2, r0, r3)     // Catch: java.lang.Throwable -> L36
            r1 = 0
            return r1
        Lbd:
            java.lang.String r1 = "computeImagePHash exception"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r1, r3)
        Lc4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.model.o1.a(java.lang.String):com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo");
    }
}
