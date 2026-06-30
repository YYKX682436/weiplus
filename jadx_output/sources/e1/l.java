package e1;

/* loaded from: classes14.dex */
public abstract class l {
    public static final f1.d a(android.graphics.Bitmap bitmap) {
        f1.d b17;
        kotlin.jvm.internal.o.g(bitmap, "<this>");
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (b17 = b(colorSpace)) != null) {
            return b17;
        }
        f1.h hVar = f1.h.f258476a;
        return f1.h.f258479d;
    }

    public static final f1.d b(android.graphics.ColorSpace colorSpace) {
        kotlin.jvm.internal.o.g(colorSpace, "<this>");
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB))) {
            f1.h hVar = f1.h.f258476a;
            return f1.h.f258479d;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES))) {
            f1.h hVar2 = f1.h.f258476a;
            return f1.h.f258491p;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG))) {
            f1.h hVar3 = f1.h.f258476a;
            return f1.h.f258492q;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB))) {
            f1.h hVar4 = f1.h.f258476a;
            return f1.h.f258489n;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020))) {
            f1.h hVar5 = f1.h.f258476a;
            return f1.h.f258484i;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709))) {
            f1.h hVar6 = f1.h.f258476a;
            return f1.h.f258483h;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB))) {
            f1.h hVar7 = f1.h.f258476a;
            return f1.h.f258494s;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ))) {
            f1.h hVar8 = f1.h.f258476a;
            return f1.h.f258493r;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3))) {
            f1.h hVar9 = f1.h.f258476a;
            return f1.h.f258485j;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
            f1.h hVar10 = f1.h.f258476a;
            return f1.h.f258486k;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB))) {
            f1.h hVar11 = f1.h.f258476a;
            return f1.h.f258481f;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            f1.h hVar12 = f1.h.f258476a;
            return f1.h.f258482g;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB))) {
            f1.h hVar13 = f1.h.f258476a;
            return f1.h.f258480e;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953))) {
            f1.h hVar14 = f1.h.f258476a;
            return f1.h.f258487l;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB))) {
            f1.h hVar15 = f1.h.f258476a;
            return f1.h.f258490o;
        }
        if (kotlin.jvm.internal.o.b(colorSpace, android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C))) {
            f1.h hVar16 = f1.h.f258476a;
            return f1.h.f258488m;
        }
        f1.h hVar17 = f1.h.f258476a;
        return f1.h.f258479d;
    }

    public static final android.graphics.Bitmap c(int i17, int i18, int i19, boolean z17, f1.d colorSpace) {
        kotlin.jvm.internal.o.g(colorSpace, "colorSpace");
        android.graphics.Bitmap.Config c17 = e1.e.c(i19);
        android.graphics.ColorSpace d17 = d(colorSpace);
        zj0.a aVar = new zj0.a();
        aVar.c(d17);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.valueOf(z17));
        aVar.c(c17);
        aVar.c(java.lang.Integer.valueOf(i18));
        aVar.c(java.lang.Integer.valueOf(i17));
        aVar.c(null);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "androidx/compose/ui/graphics/Api26Bitmap", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), (android.graphics.Bitmap.Config) aVar.a(3), ((java.lang.Boolean) aVar.a(4)).booleanValue(), (android.graphics.ColorSpace) aVar.a(5));
        yj0.a.e(obj, createBitmap, "androidx/compose/ui/graphics/Api26Bitmap", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    public static final android.graphics.ColorSpace d(f1.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        f1.h hVar = f1.h.f258476a;
        android.graphics.ColorSpace colorSpace = android.graphics.ColorSpace.get(kotlin.jvm.internal.o.b(dVar, f1.h.f258479d) ? android.graphics.ColorSpace.Named.SRGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258491p) ? android.graphics.ColorSpace.Named.ACES : kotlin.jvm.internal.o.b(dVar, f1.h.f258492q) ? android.graphics.ColorSpace.Named.ACESCG : kotlin.jvm.internal.o.b(dVar, f1.h.f258489n) ? android.graphics.ColorSpace.Named.ADOBE_RGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258484i) ? android.graphics.ColorSpace.Named.BT2020 : kotlin.jvm.internal.o.b(dVar, f1.h.f258483h) ? android.graphics.ColorSpace.Named.BT709 : kotlin.jvm.internal.o.b(dVar, f1.h.f258494s) ? android.graphics.ColorSpace.Named.CIE_LAB : kotlin.jvm.internal.o.b(dVar, f1.h.f258493r) ? android.graphics.ColorSpace.Named.CIE_XYZ : kotlin.jvm.internal.o.b(dVar, f1.h.f258485j) ? android.graphics.ColorSpace.Named.DCI_P3 : kotlin.jvm.internal.o.b(dVar, f1.h.f258486k) ? android.graphics.ColorSpace.Named.DISPLAY_P3 : kotlin.jvm.internal.o.b(dVar, f1.h.f258481f) ? android.graphics.ColorSpace.Named.EXTENDED_SRGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258482g) ? android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258480e) ? android.graphics.ColorSpace.Named.LINEAR_SRGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258487l) ? android.graphics.ColorSpace.Named.NTSC_1953 : kotlin.jvm.internal.o.b(dVar, f1.h.f258490o) ? android.graphics.ColorSpace.Named.PRO_PHOTO_RGB : kotlin.jvm.internal.o.b(dVar, f1.h.f258488m) ? android.graphics.ColorSpace.Named.SMPTE_C : android.graphics.ColorSpace.Named.SRGB);
        kotlin.jvm.internal.o.f(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
