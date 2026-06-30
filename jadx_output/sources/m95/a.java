package m95;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f325069c = "";

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.lang.Float f325073g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.lang.Float f325074h;

    /* renamed from: a, reason: collision with root package name */
    public android.util.TypedValue f325076a = new android.util.TypedValue();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f325077b = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f325070d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f325071e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f325072f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f325075i = null;

    public static android.graphics.Bitmap a(android.content.res.Resources resources, int i17, float f17) {
        android.graphics.drawable.Drawable e17 = e(com.tencent.mm.sdk.platformtools.x2.f193075e, i17, f17);
        if (e17 == null) {
            return null;
        }
        m95.b bVar = (m95.b) e17;
        int i18 = bVar.f325084g;
        int i19 = bVar.f325085h;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/svg/graphics/SVGCompat", "decodeSVGBitmap", "(Landroid/content/res/Resources;IF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/svg/graphics/SVGCompat", "decodeSVGBitmap", "(Landroid/content/res/Resources;IF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        e17.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public static android.view.View b(android.graphics.drawable.Drawable drawable) {
        java.lang.Object callback = drawable.getCallback();
        if (callback == null) {
            return null;
        }
        if (callback instanceof android.view.View) {
            return (android.view.View) callback;
        }
        if (callback instanceof android.graphics.drawable.Drawable) {
            return b((android.graphics.drawable.Drawable) callback);
        }
        return null;
    }

    public static android.graphics.Picture c(float f17, l95.c cVar, float f18) {
        android.graphics.Picture picture = new android.graphics.Picture();
        if (cVar == null) {
            n95.d.a("MicroMsg.SVGCompat", "fromCodeToPicture code is null!", new java.lang.Object[0]);
            return picture;
        }
        android.graphics.Canvas beginRecording = picture.beginRecording((int) (l95.c.getWidth(cVar) * f18), (int) (l95.c.getHeight(cVar) * f18));
        beginRecording.save();
        beginRecording.scale(f18, f18);
        l95.c.render(cVar, beginRecording, android.os.Looper.myLooper());
        beginRecording.restore();
        picture.endRecording();
        return picture;
    }

    public static l95.c d(android.content.res.Resources resources, int i17, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        try {
            java.util.Map map = f325070d;
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
                return (l95.c) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(i17));
            }
            java.lang.String resourceName = resources.getResourceName(i17);
            if (resourceName == null) {
                n95.d.a("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : resource not found", new java.lang.Object[0]);
                return null;
            }
            int indexOf = resourceName.indexOf("/");
            if (indexOf > 0) {
                str5 = str + "." + resourceName.substring(indexOf + 1);
            } else {
                str5 = str + "." + resourceName;
            }
            try {
                l95.c cVar = (l95.c) java.lang.Class.forName(str5).newInstance();
                ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Integer.valueOf(i17), cVar);
                return cVar;
            } catch (java.lang.ClassNotFoundException e17) {
                str4 = str5;
                e = e17;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new java.lang.Object[0]);
                n95.d.a("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", str4);
                return null;
            } catch (java.lang.IllegalAccessException e18) {
                str3 = str5;
                e = e18;
                n95.d.a("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", str3);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new java.lang.Object[0]);
                return null;
            } catch (java.lang.InstantiationException e19) {
                str2 = str5;
                e = e19;
                n95.d.a("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", str2);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new java.lang.Object[0]);
                return null;
            }
        } catch (java.lang.ClassNotFoundException e27) {
            e = e27;
            str4 = "";
        } catch (java.lang.IllegalAccessException e28) {
            e = e28;
            str3 = "";
        } catch (java.lang.InstantiationException e29) {
            e = e29;
            str2 = "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v7, types: [float] */
    public static android.graphics.drawable.Drawable e(android.content.res.Resources resources, int i17, float f17) {
        float floatValue;
        java.io.InputStream inputStream;
        java.lang.String str = "";
        int i18 = 0;
        if (i17 == 0) {
            n95.d.a("MicroMsg.SVGCompat", "getSVGDrawable a invalid resource!!! %s", java.lang.Integer.valueOf(i17));
            n95.d.a("MicroMsg.SVGCompat", "Why no log??", new java.lang.Object[0]);
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            java.lang.String str2 = str;
            if (stackTrace != null) {
                str2 = str;
                if (stackTrace.length >= 4) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    while (r0 < stackTrace.length) {
                        if (stackTrace[r0].getClassName().contains("com.tencent.mm") && !stackTrace[r0].getClassName().contains("sdk.platformtools.Log")) {
                            sb6.append("[");
                            sb6.append(stackTrace[r0].getClassName().substring(15));
                            sb6.append(":");
                            sb6.append(stackTrace[r0].getMethodName());
                            sb6.append("(" + stackTrace[r0].getLineNumber() + ")]");
                        }
                        r0++;
                    }
                    str2 = sb6.toString();
                }
            }
            objArr[0] = str2;
            n95.d.a("MicroMsg.SVGCompat", "The stack : %s", objArr);
            return new m95.d(new android.graphics.Picture(), i17);
        }
        if (!n95.b.b()) {
            java.lang.String str3 = f325069c + ".svg.code.drawable";
            float f18 = resources.getDisplayMetrics().density;
            float f19 = f17 > 0.0f ? f17 : 1.0f;
            if (f(resources, i17)) {
                if (f325074h == null) {
                    f325074h = java.lang.Float.valueOf(f18 / 1.0f);
                }
                floatValue = f325074h.floatValue();
            } else {
                if (f325073g == null) {
                    f325073g = java.lang.Float.valueOf(f18 / 3.0f);
                }
                floatValue = f325073g.floatValue();
            }
            float f27 = floatValue * f19;
            if (f17 <= 0.0f) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f325071e;
                android.graphics.Picture picture = (android.graphics.Picture) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
                if (picture == null) {
                    picture = c(f18, d(resources, i17, str3), f27);
                    concurrentHashMap.put(java.lang.Integer.valueOf(i17), picture);
                }
                return new m95.d(picture, i17);
            }
            java.lang.String str4 = i17 + "_scale_" + f17;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) f325072f;
            android.graphics.Picture picture2 = (android.graphics.Picture) concurrentHashMap2.get(str4);
            if (picture2 == null) {
                picture2 = c(f18, d(resources, i17, str3), f27);
                concurrentHashMap2.put(str4, picture2);
            }
            return new m95.d(picture2, i17);
        }
        java.io.InputStream openRawResource = resources.openRawResource(i17);
        try {
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                try {
                    openRawResource.close();
                    inputStream = openRawResource;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e17, "", new java.lang.Object[0]);
                    inputStream = e17;
                }
                long parse = com.tencent.mm.svg.WeChatSVG.parse(org.apache.http.util.EncodingUtils.getString(bArr, com.tencent.mapsdk.internal.rv.f51270c).toString());
                ?? r17 = (parse > 0L ? 1 : (parse == 0L ? 0 : -1));
                if (r17 == 0) {
                    n95.d.a("MicroMsg.SVGCompat", "Parse SVG failed.", new java.lang.Object[0]);
                    str = r17;
                    openRawResource = inputStream;
                } else {
                    float[] viewPort = com.tencent.mm.svg.WeChatSVG.getViewPort(parse);
                    ?? r57 = resources.getDisplayMetrics().density;
                    float f28 = f(resources, i17) ? 1 : 3;
                    i18 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
                    float f29 = (viewPort[0] / f28) * r57 * (i18 > 0 ? f17 : 1.0f);
                    float f37 = (viewPort[1] / f28) * r57;
                    if (i18 <= 0) {
                        f17 = 1.0f;
                    }
                    float f38 = f37 * f17;
                    android.graphics.Picture picture3 = new android.graphics.Picture();
                    int i19 = (int) f29;
                    int i27 = (int) f38;
                    ?? beginRecording = picture3.beginRecording(i19, i27);
                    int renderViewPort = com.tencent.mm.svg.WeChatSVG.renderViewPort(parse, beginRecording, i19, i27);
                    picture3.endRecording();
                    com.tencent.mm.svg.WeChatSVG.release(parse);
                    m95.d dVar = new m95.d(picture3, i17);
                    if (renderViewPort >= 0) {
                        return dVar;
                    }
                    n95.d.a("MicroMsg.SVGCompat", "Render SVG failed. Reason : %s", java.lang.Integer.valueOf(renderViewPort));
                    str = beginRecording;
                    openRawResource = r57;
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e18, "", new java.lang.Object[0]);
                n95.d.a("MicroMsg.SVGCompat", "Get SVGPictureDrawable failed. Reason : IOException", new java.lang.Object[0]);
                str = str;
                openRawResource = openRawResource;
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                        str = str;
                        openRawResource = openRawResource;
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e19, "", new java.lang.Object[0]);
                        str = str;
                        openRawResource = openRawResource;
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th6) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e27, str, new java.lang.Object[i18]);
                }
            }
            throw th6;
        }
    }

    public static boolean f(android.content.res.Resources resources, int i17) {
        java.lang.String resourceName = resources.getResourceName(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(resourceName)) {
            return false;
        }
        return resourceName.endsWith("_light") || resourceName.endsWith("_regular") || resourceName.endsWith("_medium") || resourceName.endsWith("_bold") || resourceName.endsWith("_heavy") || resourceName.endsWith("_filled") || resourceName.endsWith("_light_colorful") || resourceName.endsWith("_regular_colorful") || resourceName.endsWith("_medium_colorful") || resourceName.endsWith("_bold_colorful") || resourceName.endsWith("_heavy_colorful") || resourceName.endsWith("_filled_colorful");
    }

    public static boolean h(android.view.View view, android.graphics.Paint paint) {
        if (view == null) {
            return false;
        }
        try {
            if (fp.h.c(30) && wo.w0.q() && i()) {
                view.setLayerType(2, paint);
            } else if (view.getLayerType() != 1) {
                view.setLayerType(1, paint);
            }
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e17, "", new java.lang.Object[0]);
        }
        if (view.willNotCacheDrawing()) {
            view.setWillNotCacheDrawing(false);
            if (view.getWindowToken() != null) {
                view.buildLayer();
            }
        }
        return true;
    }

    public static boolean i() {
        if (f325075i == null) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_svg_hardware", "1", false, true), 1) > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SVGCompat", "svg openHardWare!!");
                    f325075i = java.lang.Boolean.TRUE;
                } else {
                    f325075i = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGCompat", e17, "svg openHardWare", new java.lang.Object[0]);
                f325075i = java.lang.Boolean.FALSE;
            }
        }
        return f325075i.booleanValue();
    }

    public boolean g(android.content.res.Resources resources, int i17) {
        java.lang.String charSequence;
        try {
            if (resources.getResourceTypeName(i17).equals(com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW)) {
                synchronized (this.f325077b) {
                    android.util.TypedValue typedValue = this.f325076a;
                    if (typedValue == null) {
                        typedValue = new android.util.TypedValue();
                        this.f325076a = typedValue;
                    }
                    resources.getValue(i17, typedValue, true);
                    charSequence = typedValue.string.toString();
                }
                if (charSequence.endsWith(".svg")) {
                    return true;
                }
            }
            return false;
        } catch (android.content.res.Resources.NotFoundException e17) {
            n95.d.c("MicroMsg.SVGCompat", e17, "resource not found", new java.lang.Object[0]);
            return false;
        }
    }
}
