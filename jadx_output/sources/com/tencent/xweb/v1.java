package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class v1 extends android.content.ContextWrapper implements tx5.g {

    /* renamed from: n, reason: collision with root package name */
    public static android.content.pm.PackageInfo f220604n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f220605o;

    /* renamed from: p, reason: collision with root package name */
    public static android.content.res.Resources f220606p;

    /* renamed from: q, reason: collision with root package name */
    public static java.util.HashMap f220607q;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f220608d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.Resources f220609e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.res.Resources.Theme f220610f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.LayoutInflater f220611g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.pm.ApplicationInfo f220612h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f220613i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ClassLoader f220614m;

    public v1(android.content.Context context) {
        super(context);
        this.f220613i = false;
    }

    public final android.content.res.Resources a(android.content.res.Resources resources, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 35) {
            by5.c4.f("XWebContextWrapper", "fixAssetConflictOverAndroid15, only executed on Android 15+ machines.");
            return resources;
        }
        if (!com.tencent.xweb.b.m().h("asset_conflict_fix", com.tencent.xweb.WebView.getModuleName(), true)) {
            by5.c4.f("XWebContextWrapper", "fixAssetConflictOverAndroid15, latest config closes this patch.");
            return resources;
        }
        try {
            android.content.res.AssetManager assetManager = (android.content.res.AssetManager) android.content.res.AssetManager.class.newInstance();
            android.content.res.Resources resources2 = new android.content.res.Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            java.lang.reflect.Method method = assetManager.getClass().getMethod("addAssetPath", java.lang.String.class);
            java.lang.Object[] objArr = (java.lang.Object[]) resources.getAssets().getClass().getMethod("getApkAssets", new java.lang.Class[0]).invoke(resources.getAssets(), new java.lang.Object[0]);
            java.lang.reflect.Method method2 = java.lang.Class.forName("android.content.res.ApkAssets").getMethod("getAssetPath", new java.lang.Class[0]);
            if (objArr == null) {
                by5.c4.c("XWebContextWrapper", "fixAssetConflictOverAndroid15, resources may have no assets.");
                return resources;
            }
            for (java.lang.Object obj : objArr) {
                java.lang.String str2 = (java.lang.String) method2.invoke(obj, new java.lang.Object[0]);
                if (!str.equals(str2)) {
                    by5.c4.f("XWebContextWrapper", "fixAssetConflictOverAndroid15, used assetPath: " + str2);
                    method.invoke(assetManager, str2);
                }
            }
            method.invoke(assetManager, str);
            by5.c4.f("XWebContextWrapper", "fixAssetConflictOverAndroid15, used assetPath: " + str);
            return resources2;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebContextWrapper", "fixAssetConflictOverAndroid15 error", th6);
            return resources;
        }
    }

    public final android.content.pm.ApplicationInfo b(android.content.Context context, java.lang.String str) {
        by5.c4.f("XWebContextWrapper", "getApplicationInfoFromApkPath, path:" + str);
        android.content.pm.PackageInfo c17 = c(context, str);
        if (c17 != null) {
            android.content.pm.ApplicationInfo applicationInfo = c17.applicationInfo;
            this.f220612h = applicationInfo;
            if (applicationInfo != null) {
                applicationInfo.sourceDir = str;
                applicationInfo.publicSourceDir = str;
            }
        }
        return this.f220612h;
    }

    public synchronized android.content.pm.PackageInfo c(android.content.Context context, java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(f220605o)) {
            return f220604n;
        }
        f220605o = str;
        android.content.pm.PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        f220604n = packageArchiveInfo;
        return packageArchiveInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.res.Resources d(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            android.content.res.Resources r0 = com.tencent.xweb.v1.f220606p
            if (r0 == 0) goto La
            r6.b(r7, r8)
            android.content.res.Resources r7 = com.tencent.xweb.v1.f220606p
            return r7
        La:
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L28
            int r2 = r8.length()
            if (r2 != 0) goto L15
            goto L28
        L15:
            java.io.File r2 = new java.io.File
            r2.<init>(r8)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L28
            boolean r2 = r2.isFile()
            if (r2 == 0) goto L28
            r2 = r0
            goto L29
        L28:
            r2 = r1
        L29:
            java.lang.String r3 = "XWebContextWrapper"
            if (r2 == 0) goto Lac
            android.content.pm.ApplicationInfo r2 = r6.b(r7, r8)
            r6.f220612h = r2
            if (r2 == 0) goto L69
            r2.sourceDir = r8
            r2.publicSourceDir = r8
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L53
            android.content.pm.ApplicationInfo r2 = r6.f220612h     // Catch: java.lang.Throwable -> L53
            android.content.res.Resources r7 = r7.getResourcesForApplication(r2)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L69
            android.content.res.Resources r7 = r6.a(r7, r8)     // Catch: java.lang.Throwable -> L53
            com.tencent.xweb.v1.f220606p = r7     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = "getResources, use application resources"
            by5.c4.f(r3, r7)     // Catch: java.lang.Throwable -> L53
            android.content.res.Resources r7 = com.tencent.xweb.v1.f220606p     // Catch: java.lang.Throwable -> L53
            return r7
        L53:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getResources, error:"
            r2.<init>(r4)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            by5.c4.c(r3, r7)
        L69:
            java.lang.String r7 = "getResources failed, try getResourcesWithReflect"
            by5.c4.f(r3, r7)
            java.lang.Class<android.content.res.AssetManager> r7 = android.content.res.AssetManager.class
            java.lang.Object r7 = r7.newInstance()     // Catch: java.lang.Throwable -> L9f
            android.content.res.AssetManager r7 = (android.content.res.AssetManager) r7     // Catch: java.lang.Throwable -> L9f
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = "addAssetPath"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r1] = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.reflect.Method r0 = r2.getMethod(r4, r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object[] r1 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L9f
            r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r0 = super.getResources()     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = new android.content.res.Resources     // Catch: java.lang.Throwable -> L9f
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r1.<init>(r7, r2, r0)     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r7 = move-exception
            java.lang.String r0 = "getResourcesWithReflect error"
            by5.c4.d(r3, r0, r7)
            r1 = 0
        La6:
            android.content.res.Resources r7 = r6.a(r1, r8)
            com.tencent.xweb.v1.f220606p = r7
        Lac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getResources, resources:"
            r7.<init>(r8)
            android.content.res.Resources r8 = com.tencent.xweb.v1.f220606p
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            by5.c4.f(r3, r7)
            android.content.res.Resources r7 = com.tencent.xweb.v1.f220606p
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.v1.d(android.content.Context, java.lang.String):android.content.res.Resources");
    }

    public void e(java.util.Locale locale) {
        try {
            android.content.res.Resources resources = this.f220609e;
            if (resources == null) {
                by5.c4.c("XWebContextWrapper", "updateResourceLocale, resources is null");
                return;
            }
            android.content.res.Configuration configuration = resources.getConfiguration();
            by5.c4.f("XWebContextWrapper", "updateResourceLocale, resources:" + resources + ", new locale:" + locale + ", old locale:" + configuration.locale);
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebContextWrapper", "updateResourceLocale, error", th6);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
        return org.xwalk.core.XWalkEnvironment.b(this.f220608d);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        android.content.res.Resources resources = getResources();
        return resources != null ? resources.getAssets() : super.getAssets();
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        return this.f220608d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        if (this.f220614m != null) {
            by5.c4.f("XWebContextWrapper", "getClassLoader, customized class loader:" + this.f220614m);
            return this.f220614m;
        }
        java.lang.ClassLoader b17 = vx5.k.f441374a.b();
        if (b17 == null) {
            by5.c4.f("XWebContextWrapper", "getClassLoader, super class loader");
            return super.getClassLoader();
        }
        by5.c4.f("XWebContextWrapper", "getClassLoader, webview core class loader:" + b17);
        return b17;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.String getPackageName() {
        return this.f220608d.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.res.Resources getResources() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.v1.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (str.equals("layout_inflater")) {
            by5.c4.f("XWebContextWrapper", "getSystemService, layoutInflater:" + this.f220611g);
            return this.f220611g;
        }
        try {
            by5.c4.f("XWebContextWrapper", "getSystemService, context:" + this.f220608d + ", activity? " + (this.f220608d instanceof android.app.Activity));
            return this.f220608d.getSystemService(str);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebContextWrapper", "getSystemService error", th6);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f220610f;
        return theme != null ? theme : super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        if (this.f220608d.getTheme() != null) {
            this.f220608d.getTheme().applyStyle(i17, true);
        } else {
            super.setTheme(i17);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            intent.setComponent(new android.content.ComponentName(getBaseContext(), component.getClassName()));
        }
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.ComponentName startService(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            intent.setComponent(new android.content.ComponentName(getBaseContext(), component.getClassName()));
        }
        return super.startService(intent);
    }
}
