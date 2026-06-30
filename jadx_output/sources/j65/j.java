package j65;

/* loaded from: classes13.dex */
public class j extends android.content.res.Resources {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Method f297955f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Method f297956g;

    /* renamed from: a, reason: collision with root package name */
    public final j65.v f297957a;

    /* renamed from: b, reason: collision with root package name */
    public final j65.s f297958b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f297959c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f297960d;

    /* renamed from: e, reason: collision with root package name */
    public final j65.f f297961e;

    public j(android.content.res.Resources resources, j65.v vVar, j65.s sVar) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f297957a = vVar;
        if (resources instanceof j65.j) {
            this.f297959c = ((j65.j) resources).f297959c;
        } else {
            this.f297959c = resources;
        }
        this.f297958b = sVar;
        c();
        b();
    }

    public static android.content.res.Resources d(android.content.res.Resources resources, android.content.Context context, j65.v vVar, boolean z17) {
        android.content.res.Resources resources2;
        j65.s sVar = new j65.s();
        if (resources instanceof j65.j) {
            resources = ((j65.j) resources).f297959c;
        }
        if (z17) {
            return new j65.j(resources, vVar, sVar);
        }
        if (com.tencent.mm.ui.bk.I()) {
            resources2 = resources;
        } else {
            android.content.res.Configuration configuration = new android.content.res.Configuration();
            configuration.uiMode |= com.tencent.mm.ui.bk.C() ? 32 : 16;
            resources2 = context.createConfigurationContext(configuration).getResources();
            resources2.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }
        return new j65.j(resources2, vVar, sVar, new j65.f(resources.getDisplayMetrics()));
    }

    public static android.content.res.Resources e(android.content.res.Resources resources, android.content.Context context, boolean z17) {
        return d(resources, context, j65.v.f(context, com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context)), z17);
    }

    public static android.graphics.drawable.Drawable g(android.content.res.Resources resources, int i17) {
        android.graphics.drawable.Drawable createFromResourceStream;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(i17, typedValue, true);
        int i18 = typedValue.type;
        android.graphics.drawable.ColorDrawable colorDrawable = i18 >= 28 && i18 <= 31 ? new android.graphics.drawable.ColorDrawable(typedValue.data) : null;
        if (f297955f == null) {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod = android.content.res.Resources.class.getDeclaredMethod("loadXmlResourceParser", java.lang.String.class, cls, cls, java.lang.String.class);
                f297955f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e17, "", new java.lang.Object[0]);
                return null;
            }
        }
        if (f297956g == null) {
            try {
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod2 = android.content.res.AssetManager.class.getDeclaredMethod("openNonAsset", cls2, java.lang.String.class, cls2);
                f297956g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e18, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e18, "", new java.lang.Object[0]);
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
                android.content.res.XmlResourceParser xmlResourceParser = (android.content.res.XmlResourceParser) f297955f.invoke(resources, charSequence2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(typedValue.assetCookie), "drawable");
                createFromResourceStream = android.graphics.drawable.Drawable.createFromXml(resources, xmlResourceParser);
                xmlResourceParser.close();
            } catch (java.lang.Exception e19) {
                android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException("File " + charSequence2 + " from drawable resource ID #0x" + java.lang.Integer.toHexString(i17));
                notFoundException.initCause(e19);
                throw notFoundException;
            }
        } else {
            try {
                java.io.InputStream inputStream = (java.io.InputStream) f297956g.invoke(resources.getAssets(), java.lang.Integer.valueOf(typedValue.assetCookie), charSequence2, 2);
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

    public static android.graphics.drawable.Drawable h(android.content.res.Resources resources, int i17) {
        if (resources == null) {
            m95.h hVar = m95.k.f325104a;
            return null;
        }
        java.lang.ThreadLocal threadLocal = m95.k.f325117n;
        threadLocal.set(java.lang.Boolean.TRUE);
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i17);
        threadLocal.set(java.lang.Boolean.FALSE);
        return drawable;
    }

    public final android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, int i17) {
        if (drawable != null) {
            return drawable;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MMResources", "Notice!!! drawable == null!!!", new java.lang.Object[0]);
        try {
            if (this.f297958b.f297974a.g(this, i17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMResources", "resources name = %s, this resource %s", getResourceName(i17), this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e17, "critical error", new java.lang.Object[0]);
        }
        return new m95.d(new android.graphics.Picture(), 0);
    }

    public final void b() {
        android.content.res.AssetManager assets = getAssets();
        yo.b bVar = new yo.b(assets, "mThemeCookies", null);
        try {
            bVar.b();
            if (bVar.f464044d != null) {
                j65.i iVar = new j65.i();
                bVar.b();
                java.lang.reflect.Field field = bVar.f464044d;
                if (field == null) {
                    throw new java.lang.NoSuchFieldException();
                }
                field.set(assets, iVar);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e17, "", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e18, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e19, "", new java.lang.Object[0]);
        }
    }

    public final void c() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.content.res.MiuiResources");
            com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "sMiuiThemeEnabled false");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sMiuiThemeEnabled");
            if (declaredField == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMResources", "some thing wrong. %s %s", cls, declaredField);
            } else {
                declaredField.setAccessible(true);
                declaredField.set(null, java.lang.Boolean.FALSE);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "sMiuiThemeEnabled ClassNotFoundException");
        } catch (java.lang.IllegalAccessException unused2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "sMiuiThemeEnabled IllegalAccessException");
        } catch (java.lang.IllegalArgumentException unused3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "sMiuiThemeEnabled IllegalArgumentException");
        } catch (java.lang.NoSuchFieldException unused4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "sMiuiThemeEnabled NoSuchFieldException");
        }
    }

    public final boolean f() {
        j65.v vVar = this.f297957a;
        if (vVar == null) {
            return false;
        }
        vVar.getClass();
        return true;
    }

    @Override // android.content.res.Resources
    public int getColor(int i17) {
        com.tencent.mm.ui.dl.f208346b = hq.b.a();
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        android.content.res.Resources resources = this.f297959c;
        return (n17 && hq.b.a()) ? resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.FG_0) ? resources.getColor(com.tencent.mm.R.color.FG_0_CARE) : i17 == com.tencent.mm.R.color.FG_0_5 ? resources.getColor(com.tencent.mm.R.color.FG_0_5_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.FG_1) ? resources.getColor(com.tencent.mm.R.color.FG_1_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.FG_2) ? resources.getColor(com.tencent.mm.R.color.FG_2_CARE) : i17 == com.tencent.mm.R.color.UN_BW_0_Alpha_0_9 ? resources.getColor(com.tencent.mm.R.color.f478546ag) : (resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.f478502m) || resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.Brand_90)) ? resources.getColor(com.tencent.mm.R.color.Brand_100_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.f478532ac) ? resources.getColor(com.tencent.mm.R.color.Red_100_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.Brand_BG_100) ? resources.getColor(com.tencent.mm.R.color.Brand_BG_100_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.Yellow_BG_100) ? resources.getColor(com.tencent.mm.R.color.Yellow_BG_100_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.f478526a7) ? resources.getColor(com.tencent.mm.R.color.Orange_100_CARE) : resources.getColor(i17) == resources.getColor(com.tencent.mm.R.color.f478554ao) ? resources.getColor(com.tencent.mm.R.color.Yellow_100_CARE) : resources.getColor(i17) : resources.getColor(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17) {
        if (!com.tencent.mm.sdk.platformtools.x2.n() || !hq.b.a()) {
            return super.getColorStateList(i17);
        }
        int defaultColor = super.getColorStateList(i17).getDefaultColor();
        android.content.res.Resources resources = this.f297959c;
        return defaultColor == resources.getColor(com.tencent.mm.R.color.FG_0) ? super.getColorStateList(com.tencent.mm.R.color.FG_0_CARE) : i17 == com.tencent.mm.R.color.FG_0_5 ? super.getColorStateList(com.tencent.mm.R.color.FG_0_5_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.FG_1) ? super.getColorStateList(com.tencent.mm.R.color.FG_1_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.FG_2) ? super.getColorStateList(com.tencent.mm.R.color.FG_2_CARE) : i17 == com.tencent.mm.R.color.UN_BW_0_Alpha_0_9 ? super.getColorStateList(com.tencent.mm.R.color.f478546ag) : (super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.f478502m) || super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.Brand_90)) ? super.getColorStateList(com.tencent.mm.R.color.Brand_100_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.f478532ac) ? super.getColorStateList(com.tencent.mm.R.color.Red_100_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.Brand_BG_100) ? super.getColorStateList(com.tencent.mm.R.color.Brand_BG_100_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.Yellow_BG_100) ? super.getColorStateList(com.tencent.mm.R.color.Yellow_BG_100_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.f478526a7) ? super.getColorStateList(com.tencent.mm.R.color.Orange_100_CARE) : super.getColorStateList(i17).getDefaultColor() == resources.getColor(com.tencent.mm.R.color.f478554ao) ? super.getColorStateList(com.tencent.mm.R.color.Yellow_100_CARE) : super.getColorStateList(i17);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        j65.f fVar = this.f297961e;
        return fVar != null ? fVar.e() : this.f297959c.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18) {
        if (i17 != 0) {
            android.graphics.drawable.Drawable e17 = this.f297958b.f297974a.g(this, i17) ? m95.a.e(this, i17, 0.0f) : null;
            if (e17 != null) {
                return e17;
            }
        }
        return a(super.getDrawableForDensity(i17, i18), i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i17) {
        com.tencent.mm.ui.id.f208924f = i17;
        return super.getLayout(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18) {
        java.lang.String d17;
        boolean z17 = this.f297960d;
        android.content.res.Resources resources = this.f297959c;
        if (z17) {
            try {
                return com.tencent.mm.sdk.platformtools.p9.e(resources.getResourceEntryName(i17));
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        if (f() && (d17 = this.f297957a.d(i17, i18)) != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(d17.toString());
        }
        return com.tencent.mm.sdk.platformtools.p9.e(resources.getQuantityString(i17, i18));
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i17, int i18) {
        java.lang.String d17;
        boolean z17 = this.f297960d;
        android.content.res.Resources resources = this.f297959c;
        if (!z17) {
            return (!f() || (d17 = this.f297957a.d(i17, i18)) == null) ? com.tencent.mm.sdk.platformtools.p9.e(resources.getQuantityString(i17, i18)) : com.tencent.mm.sdk.platformtools.p9.e(d17.toString());
        }
        try {
            return com.tencent.mm.sdk.platformtools.p9.e(resources.getResourceEntryName(i17));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17) {
        java.lang.String e17;
        boolean z17 = this.f297960d;
        android.content.res.Resources resources = this.f297959c;
        if (z17) {
            try {
                return com.tencent.mm.sdk.platformtools.p9.e(resources.getResourceEntryName(i17));
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        if (f() && (e17 = this.f297957a.e(i17)) != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(e17.toString().toString());
        }
        try {
            java.lang.String string = resources.getString(i17);
            return string != null ? com.tencent.mm.sdk.platformtools.p9.e(string.toString()) : com.tencent.mm.sdk.platformtools.p9.e(resources.getString(i17));
        } catch (java.lang.Exception unused2) {
            return "";
        }
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i17) {
        java.lang.String[] a17;
        java.lang.String[] strArr = null;
        if (f()) {
            j65.v vVar = this.f297957a;
            vVar.getClass();
            if (j65.v.f297985j == null) {
                vVar.i(fp.q.a(), j65.v.f297979d);
            }
            if (j65.v.f297985j == null || (a17 = j65.v.f297985j.a(i17)) == null || java.util.Arrays.stream(a17).allMatch(new j65.v$$b())) {
                if (j65.v.f297988m == null) {
                    vVar.h(j65.v.f297979d);
                }
                if (j65.v.f297988m != null) {
                    strArr = j65.v.f297988m.a(i17);
                }
            } else {
                strArr = a17;
            }
        }
        if (strArr == null && ((strArr = super.getStringArray(i17)) == null || strArr.length == 0)) {
            return strArr;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(com.tencent.mm.sdk.platformtools.p9.e(str));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17) {
        java.lang.String e17;
        boolean z17 = this.f297960d;
        android.content.res.Resources resources = this.f297959c;
        if (z17) {
            try {
                return com.tencent.mm.sdk.platformtools.p9.e(resources.getResourceEntryName(i17));
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        if (f() && (e17 = this.f297957a.e(i17)) != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(e17.toString());
        }
        java.lang.String string = resources.getString(i17);
        if (string != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(string.toString());
        }
        return com.tencent.mm.sdk.platformtools.p9.e(resources.getString(i17));
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i17) {
        java.lang.String[] stringArray = getStringArray(i17);
        return stringArray != null ? stringArray : super.getTextArray(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i17) {
        return super.getXml(i17);
    }

    public void i(android.content.res.Configuration configuration) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "dancy test locale %s, orientation %s, uimode:%s, systemfont:%s, getConfiguration.uimode:%s", configuration.locale, java.lang.Integer.valueOf(configuration.orientation), java.lang.Integer.valueOf(configuration.uiMode), java.lang.Float.valueOf(configuration.fontScale), java.lang.Integer.valueOf(getConfiguration().uiMode));
        boolean I = com.tencent.mm.ui.bk.I();
        android.content.res.Resources resources = this.f297959c;
        if ((I && com.tencent.mm.sdk.platformtools.x2.n()) || !com.tencent.mm.ui.bk.I()) {
            j65.m.b(configuration, resources);
            if (resources != null) {
                resources.getConfiguration().updateFrom(configuration);
            }
        }
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        j65.f fVar = this.f297961e;
        fVar.getClass();
        if (j65.f.h()) {
            android.util.DisplayMetrics displayMetrics2 = j65.f.f297939c;
            displayMetrics.density = displayMetrics2.density;
            displayMetrics.densityDpi = displayMetrics2.densityDpi;
            displayMetrics.scaledDensity = displayMetrics2.scaledDensity;
            displayMetrics2.setTo(displayMetrics);
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(getConfiguration());
        configuration2.fontScale += 0.1f;
        super.updateConfiguration(configuration2, getDisplayMetrics());
        u75.f.f425187a = null;
        xn5.p0 p0Var = xn5.q0.f455702a;
        if (p0Var.b().c() != null) {
            xn5.i1.f455684b.d(-1);
        }
        xn5.z b17 = p0Var.b().b();
        if (b17 != null) {
            b17.c();
        }
        super.updateConfiguration(fVar.b(configuration), getDisplayMetrics());
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.Iterator it = ((java.util.ArrayList) k35.m1.f303913a).iterator();
        while (it.hasNext()) {
            ((k35.l1) it.next()).reset();
        }
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i17) {
        return this.f297959c.obtainTypedArray(i17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17, android.util.TypedValue typedValue) {
        return super.openRawResource(i17, typedValue);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        android.content.res.Resources resources = this.f297959c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "updateConfiguration: before modifications: args_density: %s, args_density_dpi, args_uimode: %s", java.lang.Float.valueOf(displayMetrics.density), java.lang.Integer.valueOf(configuration.densityDpi), java.lang.Integer.valueOf(configuration.uiMode));
        j65.f fVar = this.f297961e;
        if (fVar != null) {
            configuration = fVar.b(configuration);
            displayMetrics = fVar.e();
        }
        try {
            if ((com.tencent.mm.ui.bk.I() && com.tencent.mm.sdk.platformtools.x2.n()) || !com.tencent.mm.ui.bk.I()) {
                j65.m.b(configuration, resources);
                if (resources != null) {
                    resources.getConfiguration().updateFrom(configuration);
                    resources.updateConfiguration(configuration, displayMetrics);
                }
            }
            if (fVar != null && j65.f.h()) {
                fVar.l(configuration, displayMetrics);
            }
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMResources", e17, "Rarely exception.", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "updateConfiguration: after modifications: density: %s, density_dpi: %s, uimode: %s", java.lang.Float.valueOf(displayMetrics.density), java.lang.Integer.valueOf(configuration.densityDpi), java.lang.Integer.valueOf(configuration.uiMode));
        super.updateConfiguration(configuration, displayMetrics);
        java.util.Iterator it = ((java.util.ArrayList) k35.m1.f303913a).iterator();
        while (it.hasNext()) {
            ((k35.l1) it.next()).reset();
        }
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18, android.content.res.Resources.Theme theme) {
        if (i17 != 0) {
            android.graphics.drawable.Drawable e17 = this.f297958b.f297974a.g(this, i17) ? m95.a.e(this, i17, 0.0f) : null;
            if (e17 != null) {
                return e17;
            }
        }
        return a(super.getDrawableForDensity(i17, i18, theme), i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18, java.lang.Object... objArr) {
        java.lang.String a17;
        if (this.f297960d) {
            try {
                return com.tencent.mm.sdk.platformtools.p9.e(this.f297959c.getResourceEntryName(i17));
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        if (f()) {
            j65.v vVar = this.f297957a;
            vVar.getClass();
            if (j65.v.f297984i == null) {
                vVar.i(fp.q.a(), j65.v.f297979d);
            }
            if (j65.v.f297984i == null || (a17 = j65.v.f297984i.a(i17, i18, objArr)) == null || a17.isEmpty()) {
                if (j65.v.f297987l == null) {
                    vVar.h(j65.v.f297979d);
                }
                a17 = j65.v.f297987l != null ? j65.v.f297987l.a(i17, i18, objArr) : null;
            }
            if (a17 != null) {
                return a17.toString();
            }
        }
        return com.tencent.mm.sdk.platformtools.p9.e(this.f297959c.getQuantityString(i17, i18, objArr));
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17, java.lang.CharSequence charSequence) {
        java.lang.String e17;
        boolean z17 = this.f297960d;
        android.content.res.Resources resources = this.f297959c;
        if (z17) {
            try {
                return com.tencent.mm.sdk.platformtools.p9.e(resources.getResourceEntryName(i17));
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        if (f() && (e17 = this.f297957a.e(i17)) != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(e17.toString());
        }
        java.lang.String string = resources.getString(i17);
        if (string != null) {
            return com.tencent.mm.sdk.platformtools.p9.e(string.toString());
        }
        return com.tencent.mm.sdk.platformtools.p9.e(resources.getString(i17));
    }

    public j(android.content.res.Resources resources, j65.v vVar, j65.s sVar, j65.f fVar) {
        super(resources.getAssets(), fVar.e(), fVar.b(resources.getConfiguration()));
        this.f297961e = fVar;
        this.f297957a = vVar;
        if (resources instanceof j65.j) {
            this.f297959c = ((j65.j) resources).f297959c;
        } else {
            this.f297959c = resources;
        }
        this.f297958b = sVar;
        c();
        b();
        try {
            this.f297960d = com.tencent.mm.sdk.platformtools.x2.d().getBoolean("ShowStringName", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMResources", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMResources", "originalResources:%s mmresource:%s", resources, this);
    }
}
