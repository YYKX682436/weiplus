package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class tc {
    public tc(kotlin.jvm.internal.i iVar) {
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap coverBitmap, int i17, int i18) {
        android.graphics.Bitmap bitmap;
        android.graphics.Canvas canvas;
        float f17;
        float f18;
        ib5.k kVar;
        android.renderscript.RSInvalidStateException rSInvalidStateException;
        java.lang.StringBuilder sb6;
        kotlin.jvm.internal.o.g(coverBitmap, "coverBitmap");
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$Companion", "blurCover", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$Companion", "blurCover", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(coverBitmap, i18 / 20, i17 / 20, true, false);
        if (S == null) {
            android.graphics.Bitmap.Config config2 = coverBitmap.getConfig();
            if (config2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Boolean.TRUE);
                arrayList2.add(config2);
                java.util.Collections.reverse(arrayList2);
                bitmap = createBitmap;
                canvas = canvas2;
                yj0.a.d(coverBitmap, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$Companion", "blurCover", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap copy = coverBitmap.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
                yj0.a.e(coverBitmap, copy, "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI$Companion", "blurCover", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                if (copy != null) {
                    S = copy;
                }
            }
            return coverBitmap;
        }
        bitmap = createBitmap;
        canvas = canvas2;
        int width = S.getWidth();
        int height = S.getHeight();
        float f19 = 0.0f;
        if (width * i18 > i17 * height) {
            f17 = (i18 * 1.0f) / height;
            float f27 = (i17 - (width * f17)) * 0.5f;
            f18 = 0.0f;
            f19 = f27;
        } else {
            f17 = (i17 * 1.0f) / width;
            f18 = (i18 - (height * f17)) * 0.5f;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f17, f17);
        matrix.postTranslate(f19, f18);
        try {
            kVar = new ib5.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            try {
                kVar.b(S, 20.0f);
                try {
                    kVar.destroy();
                } catch (android.renderscript.RSInvalidStateException e17) {
                    rSInvalidStateException = e17;
                    sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                    sb6.append(rSInvalidStateException.getMessage());
                    com.tencent.mars.xlog.Log.w("Finder.FinderPreviewCoverUI", sb6.toString());
                    android.graphics.Canvas canvas3 = canvas;
                    canvas3.drawBitmap(S, matrix, null);
                    canvas3.drawColor(android.graphics.Color.parseColor("#14000000"));
                    canvas3.drawColor(android.graphics.Color.parseColor("#60D2D2D2"));
                    return bitmap;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.tencent.mars.xlog.Log.e("Finder.FinderPreviewCoverUI", "setBlurBitmap error:" + th.getMessage());
                    S = com.tencent.mm.sdk.platformtools.x.X(S, 20);
                    if (kVar != null) {
                        try {
                            kVar.destroy();
                        } catch (android.renderscript.RSInvalidStateException e18) {
                            rSInvalidStateException = e18;
                            sb6 = new java.lang.StringBuilder("RSInvalidStateException ");
                            sb6.append(rSInvalidStateException.getMessage());
                            com.tencent.mars.xlog.Log.w("Finder.FinderPreviewCoverUI", sb6.toString());
                            android.graphics.Canvas canvas32 = canvas;
                            canvas32.drawBitmap(S, matrix, null);
                            canvas32.drawColor(android.graphics.Color.parseColor("#14000000"));
                            canvas32.drawColor(android.graphics.Color.parseColor("#60D2D2D2"));
                            return bitmap;
                        }
                    }
                    android.graphics.Canvas canvas322 = canvas;
                    canvas322.drawBitmap(S, matrix, null);
                    canvas322.drawColor(android.graphics.Color.parseColor("#14000000"));
                    canvas322.drawColor(android.graphics.Color.parseColor("#60D2D2D2"));
                    return bitmap;
                } finally {
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            kVar = null;
        }
        android.graphics.Canvas canvas3222 = canvas;
        canvas3222.drawBitmap(S, matrix, null);
        canvas3222.drawColor(android.graphics.Color.parseColor("#14000000"));
        canvas3222.drawColor(android.graphics.Color.parseColor("#60D2D2D2"));
        return bitmap;
    }

    public final int b(r45.mb4 mb4Var) {
        return (mb4Var == null || mb4Var.getFloat(4) <= 0.0f || mb4Var.getFloat(5) <= 0.0f || mb4Var.getFloat(4) < mb4Var.getFloat(5)) ? 0 : 1;
    }

    public final void c(android.app.Activity context, java.lang.String personalImagePath, java.lang.String str, float f17, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(personalImagePath, "personalImagePath");
        java.util.Map k17 = kz5.c1.k(new jz5.l("personalImagePath", personalImagePath), new jz5.l("shareImagePath", str), new jz5.l("coverSizeRatio", java.lang.Float.valueOf(f17)), new jz5.l("personalImageShowStyle", java.lang.Integer.valueOf(i17)), new jz5.l("isHorizontal", java.lang.Integer.valueOf(i18)));
        java.util.ArrayList arrayList = new java.util.ArrayList(k17.size());
        for (java.util.Map.Entry entry : k17.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + '=' + entry.getValue());
        }
        java.lang.String g07 = kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitedcbe035d13139c50bdf84af72339f7b0");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/coverPreview/entry");
        bundle.putString("query", g07);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new com.tencent.mm.plugin.finder.ui.sc());
    }
}
