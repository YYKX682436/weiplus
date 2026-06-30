package m95;

/* loaded from: classes13.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile m95.h f325104a;

    /* renamed from: b, reason: collision with root package name */
    public static android.util.LongSparseArray[] f325105b;

    /* renamed from: c, reason: collision with root package name */
    public static android.util.LongSparseArray f325106c;

    /* renamed from: d, reason: collision with root package name */
    public static m95.j f325107d;

    /* renamed from: e, reason: collision with root package name */
    public static m95.j f325108e;

    /* renamed from: f, reason: collision with root package name */
    public static android.util.LongSparseArray f325109f;

    /* renamed from: g, reason: collision with root package name */
    public static m95.f f325110g;

    /* renamed from: h, reason: collision with root package name */
    public static android.app.Application f325111h;

    /* renamed from: i, reason: collision with root package name */
    public static android.content.res.Resources f325112i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f325113j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Class f325114k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f325115l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f325116m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.ThreadLocal f325117n = new java.lang.ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f325118o = "xiaomi".equalsIgnoreCase(android.os.Build.BRAND);

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f325119p = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public static android.util.TypedValue f325120q = new android.util.TypedValue();

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.reflect.Method f325121r = null;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.reflect.Method f325122s = null;

    public static m95.g a(long j17, m95.i iVar) {
        android.util.LongSparseArray longSparseArray;
        android.util.TypedValue typedValue;
        m95.g gVar;
        try {
            longSparseArray = f325109f;
        } catch (java.lang.Throwable th6) {
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
            return null;
        }
        if (longSparseArray == null || longSparseArray.indexOfKey(j17) < 0) {
            byte[] bArr = f325119p;
            synchronized (bArr) {
                typedValue = f325120q;
                if (typedValue != null) {
                    f325120q = null;
                } else {
                    typedValue = null;
                }
            }
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
            }
            try {
                iVar.f325101c.getValue(iVar.f325099a, typedValue, true);
                long j18 = typedValue.assetCookie << 32;
                int i17 = typedValue.data;
                if (j17 == (j18 | i17)) {
                    synchronized (bArr) {
                        if (f325120q == null) {
                            f325120q = typedValue;
                        }
                    }
                    return null;
                }
                synchronized (bArr) {
                    if (f325120q == null) {
                        f325120q = typedValue;
                    }
                }
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(iVar.f325099a), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)};
                if (n95.d.f335930a != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SVGResourceLoader", "Found a res need justify, %s %s %s", objArr);
                }
                if (f325110g == null) {
                    f325110g = new m95.f();
                }
                java.lang.String a17 = f325110g.a(f325112i.getAssets(), j17);
                if (a17 == null) {
                    return null;
                }
                if (a17.endsWith(".svg")) {
                    java.lang.String substring = a17.substring(a17.lastIndexOf("/") + 1, a17.lastIndexOf("."));
                    int identifier = iVar.f325101c.getIdentifier(substring, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW, f325111h.getPackageName());
                    if (identifier == 0) {
                        n95.d.b("MicroMsg.SVGResourceLoader", "Justified SVG failed, %s %s %s", java.lang.Integer.valueOf(identifier), java.lang.Long.valueOf(j17), substring);
                        return null;
                    }
                    if (f325109f == null) {
                        f325109f = new android.util.LongSparseArray();
                    }
                    m95.g gVar2 = new m95.g(new m95.i(identifier, iVar.f325101c, j17, i17), false);
                    n95.d.b("MicroMsg.SVGResourceLoader", "Justified SVG done, %s %s %s", java.lang.Integer.valueOf(identifier), java.lang.Long.valueOf(j17), substring);
                    f325109f.put(j17, gVar2);
                    return gVar2;
                }
                n95.d.b("MicroMsg.SVGResourceLoader", "Found a res not SVG, %s %s", java.lang.Long.valueOf(j17), a17);
                gVar = new m95.g(null, true);
            } catch (java.lang.Throwable th7) {
                synchronized (f325119p) {
                    if (f325120q == null) {
                        f325120q = typedValue;
                    }
                    throw th7;
                }
            }
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
            return null;
        }
        gVar = (m95.g) f325109f.get(j17);
        return gVar;
    }

    public static void b(android.app.Application application, android.content.res.Resources resources, int i17, android.util.TypedValue typedValue) {
        if (i17 == 0) {
            n95.d.a("MicroMsg.SVGResourceLoader", "preloadDrawable Why this id is %d. TypedValue %s", java.lang.Integer.valueOf(i17), typedValue);
            n95.d.b("MicroMsg.SVGResourceLoader", android.util.Log.getStackTraceString(new java.lang.Throwable()), new java.lang.Object[0]);
        }
        resources.getValue(i17, typedValue, true);
        long j17 = (typedValue.assetCookie << 32) | typedValue.data;
        m95.i iVar = new m95.i(i17, application.getResources(), j17, typedValue.data);
        synchronized (f325106c) {
            f325106c.put(j17, iVar);
        }
    }

    public static void c(android.content.Context context, java.lang.Object obj) {
        java.lang.reflect.Field field;
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("obj cannot be null");
        }
        java.lang.Class<?> cls = obj.getClass();
        while (true) {
            if (cls == null) {
                field = null;
                break;
            }
            try {
                field = cls.getDeclaredField("sPreloadedDrawables");
                field.setAccessible(true);
                break;
            } catch (java.lang.Exception unused) {
            } finally {
                cls.getSuperclass();
            }
        }
        if (field == null) {
            throw new java.lang.NoSuchFieldException();
        }
        try {
            java.lang.Object obj2 = field.get(obj);
            if (obj2 == null) {
                n95.d.a("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is null!! OMG!!!", new java.lang.Object[0]);
                return;
            }
            if (obj2 instanceof android.util.LongSparseArray[]) {
                android.util.LongSparseArray[] longSparseArrayArr = (android.util.LongSparseArray[]) obj2;
                f325105b = longSparseArrayArr;
                android.util.LongSparseArray longSparseArray = longSparseArrayArr[0];
                for (int i17 = 0; i17 < f325105b[0].size(); i17++) {
                    long keyAt = f325105b[0].keyAt(i17);
                    f325107d.put(keyAt, (android.graphics.drawable.Drawable.ConstantState) f325105b[0].get(keyAt));
                }
                for (int i18 = 0; i18 < f325105b[1].size(); i18++) {
                    long keyAt2 = f325105b[1].keyAt(i18);
                    f325108e.put(keyAt2, (android.graphics.drawable.Drawable.ConstantState) f325105b[1].get(keyAt2));
                }
                android.util.LongSparseArray[] longSparseArrayArr2 = f325105b;
                longSparseArrayArr2[0] = f325107d;
                longSparseArrayArr2[1] = f325108e;
                return;
            }
            if (!(obj2 instanceof android.util.LongSparseArray)) {
                n95.d.a("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is others!! OMG!", new java.lang.Object[0]);
                return;
            }
            n95.a aVar = new n95.a(context.getResources(), "sPreloadedDrawables", null);
            android.util.LongSparseArray longSparseArray2 = (android.util.LongSparseArray) aVar.a();
            for (int i19 = 0; i19 < longSparseArray2.size(); i19++) {
                long keyAt3 = longSparseArray2.keyAt(i19);
                f325107d.put(keyAt3, (android.graphics.drawable.Drawable.ConstantState) longSparseArray2.get(keyAt3));
            }
            m95.j jVar = f325107d;
            aVar.b();
            java.lang.reflect.Field field2 = aVar.f335925d;
            if (field2 == null) {
                throw new java.lang.NoSuchFieldException();
            }
            field2.set(aVar.f335922a, jVar);
            if (aVar.a() == null) {
                n95.d.a("MicroMsg.SVGResourceLoader", "resourcePreloadDrawable is null!! OMG!!", new java.lang.Object[0]);
            }
        } catch (java.lang.ClassCastException unused2) {
            throw new java.lang.IllegalArgumentException("unable to cast object");
        }
    }

    public static m95.h d(android.app.Application application, android.content.res.Resources resources) {
        if (f325104a == null) {
            synchronized (m95.k.class) {
                if (f325104a == null) {
                    f325104a = new m95.h(m95.a.f325070d, application, resources);
                }
            }
        }
        return f325104a;
    }

    public static void e(android.app.Application application, java.lang.String str) {
        f325113j = str;
        m95.a.f325069c = str;
        float f17 = application.getResources().getDisplayMetrics().density;
        if (m95.a.f325073g == null) {
            m95.a.f325073g = java.lang.Float.valueOf(f17 / 3.0f);
        }
        m95.a.f325073g.floatValue();
        if (m95.a.f325074h == null) {
            m95.a.f325074h = java.lang.Float.valueOf(f17 / 1.0f);
        }
        m95.a.f325074h.floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SVGCompat", "initDensity -> %s", java.lang.Float.valueOf(f17));
        n95.b.f335926a = str;
        f325111h = application;
        j(application);
    }

    public static android.graphics.drawable.Drawable f(android.content.res.Resources resources, int i17) {
        android.graphics.drawable.Drawable createFromResourceStream;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i17, typedValue, true);
        int i18 = typedValue.type;
        android.graphics.drawable.ColorDrawable colorDrawable = i18 >= 28 && i18 <= 31 ? new android.graphics.drawable.ColorDrawable(typedValue.data) : null;
        if (f325121r == null) {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod = android.content.res.Resources.class.getDeclaredMethod("loadXmlResourceParser", java.lang.String.class, cls, cls, java.lang.String.class);
                f325121r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (f325122s == null) {
            try {
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod2 = android.content.res.AssetManager.class.getDeclaredMethod("openNonAsset", cls2, java.lang.String.class, cls2);
                f325122s = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (colorDrawable != null) {
            return colorDrawable;
        }
        java.lang.CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new android.content.res.Resources.NotFoundException("Resource is not a Drawable (color or path): " + typedValue);
        }
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2.endsWith(".xml")) {
            try {
                android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) f325121r.invoke(resources, charSequence2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(typedValue.assetCookie), "drawable");
                createFromResourceStream = android.graphics.drawable.Drawable.createFromXml(resources, xmlResourceParser);
                xmlResourceParser.close();
            } catch (java.lang.Exception e19) {
                android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + java.lang.Integer.toHexString(i17));
                notFoundException.initCause(e19);
                throw notFoundException;
            }
        } else {
            try {
                java.io.InputStream inputStream = (java.io.InputStream) f325122s.invoke(resources.getAssets(), java.lang.Integer.valueOf(typedValue.assetCookie), charSequence2, 2);
                createFromResourceStream = android.graphics.drawable.Drawable.createFromResourceStream(resources, typedValue, inputStream, charSequence2, null);
                inputStream.close();
            } catch (java.lang.Exception e27) {
                android.content.res.Resources.NotFoundException notFoundException2 = new android.content.res.Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + java.lang.Integer.toHexString(i17));
                notFoundException2.initCause(e27);
                throw notFoundException2;
            }
        }
        return createFromResourceStream;
    }

    public static void g(android.app.Application application, android.content.res.Resources resources, java.lang.Class cls) {
        f325111h = application;
        f325112i = resources;
        if (cls == null) {
            return;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((m95.e) cls.newInstance()).load(d(application, f325112i));
            n95.d.b("MicroMsg.SVGResourceLoader", "SVGCode wrapper size %s, spent %s", java.lang.Integer.valueOf(d(application, f325112i).f325098d.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (android.content.res.Resources.NotFoundException e17) {
            n95.d.c("MicroMsg.SVGResourceLoader", e17, "We found one NotFoundException.", new java.lang.Object[0]);
        }
    }

    public static void h(android.app.Application application, android.content.res.Resources resources) {
        java.lang.Class<?> cls = f325114k;
        if (cls == null) {
            try {
                cls = java.lang.Class.forName(f325113j + ".R$raw");
            } catch (java.lang.ClassNotFoundException unused) {
                java.lang.Object a17 = n95.b.a("WxSVGRawClass");
                cls = a17 != null ? (java.lang.Class) a17 : null;
                if (cls == null) {
                    cls = null;
                }
            }
        }
        if (cls == null) {
            n95.d.a("MicroMsg.SVGResourceLoader", "Raw class is null!", new java.lang.Object[0]);
            return;
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        m95.h d17 = d(application, resources);
        try {
            m95.a aVar = new m95.a();
            for (java.lang.reflect.Field field : declaredFields) {
                int i17 = field.getInt(null);
                if (aVar.g(application.getResources(), i17)) {
                    b(d17.f325095a, d17.f325096b, i17, d17.f325097c);
                }
            }
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException unused2) {
        }
    }

    public static boolean i(android.app.Application application, android.content.res.Resources resources) {
        java.lang.String str = f325113j + ".svg.SVGPreload";
        try {
            n95.d.b("MicroMsg.SVGResourceLoader", "try to load SVGPreload", new java.lang.Object[0]);
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            long nanoTime = java.lang.System.nanoTime();
            g(application, resources, cls);
            n95.d.b("MicroMsg.SVGResourceLoader", "load SVGPreload spent %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime) / 1000));
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            n95.d.a("MicroMsg.SVGResourceLoader", "ClassNotFoundException %s. Go fallback logic.", str);
            return false;
        } catch (java.lang.IllegalAccessException e17) {
            n95.d.a("MicroMsg.SVGResourceLoader", "IllegalAccessException %s", str);
            n95.d.c("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
            return false;
        } catch (java.lang.InstantiationException e18) {
            n95.d.c("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
            n95.d.a("MicroMsg.SVGResourceLoader", "InstantiationException %s", str);
            return false;
        }
    }

    public static void j(android.content.Context context) {
        if (f325107d == null) {
            try {
                f325106c = new android.util.LongSparseArray();
                m95.j jVar = new m95.j();
                f325107d = jVar;
                jVar.f325103d = f325106c;
                m95.j jVar2 = new m95.j();
                f325108e = jVar2;
                jVar2.f325103d = f325106c;
                n95.a aVar = new n95.a(context.getResources(), "mResourcesImpl", null);
                aVar.b();
                c(context, aVar.f335925d != null ? aVar.a() : context.getResources());
                n95.d.b("MicroMsg.SVGResourceLoader", "SVG this resources %s", context.getResources());
            } catch (java.lang.IllegalAccessException e17) {
                n95.d.c("MicroMsg.SVGResourceLoader", e17, "Call reflectPreloadCache failed. Reason : IllegalAccessException.", new java.lang.Object[0]);
            } catch (java.lang.IllegalArgumentException e18) {
                n95.d.c("MicroMsg.SVGResourceLoader", e18, "Call reflectPreloadCache failed. Reason : IllegalArgumentException.", new java.lang.Object[0]);
            } catch (java.lang.NoSuchFieldException e19) {
                n95.d.c("MicroMsg.SVGResourceLoader", e19, "Call reflectPreloadCache failed. Reason : NoSuchFieldException.", new java.lang.Object[0]);
            }
        }
    }
}
