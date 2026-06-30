package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class n0 {
    public n0(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ void d(com.tencent.mm.pluginsdk.ui.otherway.n0 n0Var, java.lang.String str, android.widget.ImageView imageView, float f17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.5f;
        }
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        n0Var.c(str, imageView, f17, z17);
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
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenWayItemConvert$Companion", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/pluginsdk/ui/otherway/OpenWayItemConvert$Companion", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    public final android.graphics.drawable.Drawable b(android.content.Context context, android.content.pm.ResolveInfo ri6) {
        android.graphics.drawable.Drawable drawable;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ri6, "ri");
        try {
            android.graphics.drawable.Drawable drawable2 = null;
            if (ri6.resolvePackageName != null && ri6.icon != 0) {
                android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(ri6.resolvePackageName);
                kotlin.jvm.internal.o.f(resourcesForApplication, "getResourcesForApplication(...)");
                try {
                    drawable = j65.j.h(resourcesForApplication, ri6.icon);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    drawable = null;
                }
                if (drawable != null) {
                    return drawable;
                }
            }
            int iconResource = ri6.getIconResource();
            if (iconResource != 0) {
                android.content.res.Resources resourcesForApplication2 = context.getPackageManager().getResourcesForApplication(ri6.activityInfo.packageName);
                kotlin.jvm.internal.o.f(resourcesForApplication2, "getResourcesForApplication(...)");
                try {
                    drawable2 = j65.j.h(resourcesForApplication2, iconResource);
                } catch (android.content.res.Resources.NotFoundException unused2) {
                }
                if (drawable2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SimpleAppInfoItemConvert", "loadIconForResolveInfo iconRes %d done", java.lang.Integer.valueOf(iconResource));
                    return drawable2;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleAppInfoItemConvert", "Couldn't find resources for package", e17);
        }
        return ri6.loadIcon(context.getPackageManager());
    }

    public final void c(java.lang.String str, android.widget.ImageView imageView, float f17, boolean z17) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gk0.k kVar = new gk0.k(imageView.getWidth(), imageView.getHeight());
            if (!z17) {
                f17 = 0.0f;
            }
            kVar.f272433d = f17;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (str == null) {
                str = "";
            }
            ((h83.g) n0Var).wi(imageView, str, kVar);
            return;
        }
        yo0.f fVar = new yo0.f();
        fVar.f464087k = z17;
        fVar.f464077a = true;
        yo0.i a17 = fVar.a();
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        if (str == null) {
            str = "";
        }
        aVar.c(str, imageView, a17);
    }
}
