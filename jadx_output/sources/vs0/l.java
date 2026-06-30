package vs0;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final rj.u f439859a;

    /* renamed from: b, reason: collision with root package name */
    public android.renderscript.RenderScript f439860b;

    public l(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        com.tencent.mars.xlog.Log.i("MicroMsg.RenderScriptImageHelper", "rs create: " + this);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f439860b = android.renderscript.RenderScript.create(mContext);
        this.f439859a = new rj.u(this.f439860b);
    }

    public final void a() {
        if (this.f439860b != null) {
            return;
        }
        throw new java.lang.NullPointerException("RenderScript has been destroyed!!! " + this);
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RenderScriptImageHelper", "release rs script " + this);
        rj.u uVar = this.f439859a;
        if (uVar != null) {
            uVar.destroy();
        }
        android.renderscript.RenderScript renderScript = this.f439860b;
        jz5.f0 f0Var = null;
        if (renderScript != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RenderScriptImageHelper", "rs destroy");
            renderScript.destroy();
            this.f439860b = null;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RenderScriptImageHelper", "rs has already been destroyed!!! " + this);
        }
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap, int i17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        a();
        if (i17 == 0) {
            return bitmap;
        }
        rj.u uVar = this.f439859a;
        if (uVar != null) {
            int width = bitmap.getWidth();
            synchronized (uVar) {
                uVar.setVar(1, width);
            }
        }
        if (uVar != null) {
            int height = bitmap.getHeight();
            synchronized (uVar) {
                uVar.setVar(2, height);
            }
        }
        android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(this.f439860b, bitmap, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        bitmap.recycle();
        if (uVar != null) {
            synchronized (uVar) {
                uVar.setVar(0, createFromBitmap);
            }
        }
        int width2 = (i17 == 90 || i17 == 270) ? bitmap.getWidth() : bitmap.getHeight();
        int height2 = (i17 == 90 || i17 == 270) ? bitmap.getHeight() : bitmap.getWidth();
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        kotlin.jvm.internal.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(width2));
        arrayList.add(java.lang.Integer.valueOf(height2));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "rotateBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.renderscript.Allocation createFromBitmap2 = android.renderscript.Allocation.createFromBitmap(this.f439860b, createBitmap, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        if (i17 != 90) {
            if (i17 != 180) {
                if (i17 == 270 && uVar != null) {
                    uVar.d(createFromBitmap2, createFromBitmap2);
                }
            } else if (uVar != null) {
                uVar.c(createFromBitmap2, createFromBitmap2);
            }
        } else if (uVar != null) {
            uVar.e(createFromBitmap2, createFromBitmap2);
        }
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        return createBitmap;
    }

    public final void finalize() {
        if (this.f439860b != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RenderScriptImageHelper", "RS leak warning: maybe you forget to call destroy!!! " + this);
        }
    }
}
