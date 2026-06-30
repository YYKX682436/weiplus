package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public class v0 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f191948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f191949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f191951d;

    public v0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f191948a = str;
        this.f191949b = str2;
        this.f191950c = i17;
        this.f191951d = i18;
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f191948a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f191948a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkt));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/DefaultPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/pluginsdk/ui/tools/DefaultPicStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f191949b;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return g83.a.a() + "/" + kk.k.g(this.f191949b.getBytes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r1 == null) goto L26;
     */
    @Override // x51.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap l(android.graphics.Bitmap r5, x51.m0 r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r7 = ""
            java.lang.String r0 = "MicroMsg.DefaultPicStrategy"
            x51.m0 r1 = x51.m0.NET
            if (r1 != r6) goto L4c
            r6 = 0
            int r1 = r4.f191950c     // Catch: java.io.IOException -> L46
            if (r1 <= 0) goto L16
            int r2 = r4.f191951d     // Catch: java.io.IOException -> L46
            if (r2 <= 0) goto L16
            r3 = 1
            android.graphics.Bitmap r5 = com.tencent.mm.sdk.platformtools.x.k0(r5, r1, r2, r3)     // Catch: java.io.IOException -> L46
        L16:
            java.lang.String r1 = r4.k()     // Catch: java.io.IOException -> L46
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6     // Catch: java.io.IOException -> L46
            r2.<init>(r1)     // Catch: java.io.IOException -> L46
            r2.k()     // Catch: java.io.IOException -> L46
            r1 = 0
            java.io.OutputStream r1 = com.tencent.mm.vfs.w6.H(r2)     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            r1.flush()     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
        L31:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L4c
        L35:
            r2 = move-exception
            goto L40
        L37:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L35
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r7, r3)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L4c
            goto L31
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L46
        L45:
            throw r2     // Catch: java.io.IOException -> L46
        L46:
            r1 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r7, r6)
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.v0.l(android.graphics.Bitmap, x51.m0, java.lang.String):android.graphics.Bitmap");
    }
}
