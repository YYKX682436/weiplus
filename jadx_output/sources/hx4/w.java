package hx4;

/* loaded from: classes8.dex */
public final class w extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f285697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285698b;

    /* renamed from: c, reason: collision with root package name */
    public final hx4.v f285699c;

    public w(android.content.Context context, java.lang.String str, hx4.v vVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f285697a = context;
        this.f285698b = str;
        this.f285699c = vVar;
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        android.graphics.Rect bounds = drawable.getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        int width = !bounds.isEmpty() ? bounds.width() : drawable.getIntrinsicWidth();
        int height = !bounds.isEmpty() ? bounds.height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        if (height <= 0) {
            height = 1;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserIconLoadTask", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/webview/ui/tools/browser/BrowserIconLoadTask", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    public final android.graphics.drawable.BitmapDrawable b(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return null;
        }
        return new android.graphics.drawable.BitmapDrawable(this.f285697a.getResources(), com.tencent.mm.sdk.platformtools.x.s0(bitmap, z17, java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.16666667f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r6 != null) goto L14;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r6) {
        /*
            r5 = this;
            android.content.pm.ResolveInfo[] r6 = (android.content.pm.ResolveInfo[]) r6
            java.lang.String r0 = "MicroMsg.BrowserIconLoadTask"
            java.lang.String r1 = "BrowserIconLoadTask doInBackground name: "
            java.lang.String r2 = "params"
            kotlin.jvm.internal.o.g(r6, r2)
            r2 = 0
            r6 = r6[r2]
            r3 = 0
            android.content.Context r4 = r5.f285697a     // Catch: java.lang.Throwable -> L57
            android.graphics.drawable.Drawable r3 = hx4.r.d(r4, r6)     // Catch: java.lang.Throwable -> L57
            boolean r6 = r3 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L27
            r6 = r3
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch: java.lang.Throwable -> L57
            android.graphics.Bitmap r6 = r6.getBitmap()     // Catch: java.lang.Throwable -> L57
            android.graphics.drawable.BitmapDrawable r6 = r5.b(r6, r2)     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L3d
            goto L3c
        L27:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L57
            r4 = 26
            if (r6 < r4) goto L3d
            boolean r6 = r3 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L3d
            android.graphics.Bitmap r6 = r5.a(r3)     // Catch: java.lang.Throwable -> L57
            r4 = 1
            android.graphics.drawable.BitmapDrawable r6 = r5.b(r6, r4)     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L3d
        L3c:
            r3 = r6
        L3d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r5.f285698b     // Catch: java.lang.Throwable -> L57
            r6.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = ", iconDrawable "
            r6.append(r1)     // Catch: java.lang.Throwable -> L57
            r6.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L57
            com.tencent.mars.xlog.Log.i(r0, r6)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r6 = move-exception
            java.lang.String r1 = "loadBrowserIcon exception"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r6, r1, r2)
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hx4.w.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        if (drawable == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserIconLoadTask", "loadBrowserIcon failed: %s", this.f285698b);
        }
        hx4.v vVar = this.f285699c;
        if (vVar != null) {
            vVar.a(drawable);
        }
    }
}
