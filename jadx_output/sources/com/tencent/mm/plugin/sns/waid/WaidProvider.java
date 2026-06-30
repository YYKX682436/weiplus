package com.tencent.mm.plugin.sns.waid;

/* loaded from: classes12.dex */
public class WaidProvider extends android.content.ContentProvider {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f171733i = com.tencent.mm.sdk.platformtools.x2.f193072b + ".ad.waid";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f171734m = {"pkg", "appWaid", "errCode"};

    /* renamed from: e, reason: collision with root package name */
    public long f171736e;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.UriMatcher f171735d = new android.content.UriMatcher(-1);

    /* renamed from: f, reason: collision with root package name */
    public int f171737f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f171738g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f171739h = false;

    public final android.database.MatrixCursor a(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(f171734m, 1);
        android.database.MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
        newRow.add("pkg", str);
        newRow.add("appWaid", str2);
        newRow.add("errCode", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return matrixCursor;
    }

    public synchronized boolean b(com.tencent.mm.pointers.PInt pInt) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "checkWXEnv start, isInitDone=" + me4.c.j() + ", mIsWxEnvCheckEnd=" + this.f171739h);
        if (me4.c.j()) {
            this.f171739h = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return true;
        }
        this.f171739h = false;
        pInt.value = 1;
        new me4.e(this).start();
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "begin wait");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!this.f171739h) {
            synchronized (this.f171738g) {
                try {
                    try {
                        this.f171738g.wait();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "wait exp=" + e17.toString());
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    throw th6;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "after wait, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", fromOnCreate=" + (java.lang.System.currentTimeMillis() - this.f171736e) + ", waitIdx=" + this.f171737f);
        this.f171737f = this.f171737f + 1;
        if (me4.c.j()) {
            com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "checkWXEnv succ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return true;
        }
        this.f171739h = false;
        com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "checkWXEnv expired");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return false;
    }

    public me4.d c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        me4.d dVar = new me4.d();
        try {
            dVar.f325942a = getCallingPackage();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "getCallingPkg exp=" + th6.toString());
        }
        try {
            dVar.f325943b = getContext().getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "getCallingUid exp=" + th7.toString());
        }
        java.lang.String[] strArr = dVar.f325943b;
        if (strArr == null || strArr.length <= 0) {
            dVar.f325944c = 5;
            dVar.f325945d = dVar.f325942a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return dVar;
        }
        if (android.text.TextUtils.isEmpty(dVar.f325942a)) {
            dVar.f325944c = 1;
            dVar.f325945d = dVar.f325943b[0];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return dVar;
        }
        for (java.lang.String str : dVar.f325943b) {
            if (dVar.f325942a.equals(str)) {
                if (dVar.f325943b.length > 1) {
                    dVar.f325944c = 2;
                } else {
                    dVar.f325944c = 3;
                }
                dVar.f325945d = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                return dVar;
            }
        }
        dVar.f325944c = 4;
        dVar.f325945d = dVar.f325943b[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return dVar;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        this.f171735d.addURI(f171733i, "appWaid", 1);
        this.f171736e = java.lang.System.currentTimeMillis();
        me4.b bVar = new me4.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            com.tencent.mars.xlog.Log.i("InitTaskMgr", "start");
            java.util.ArrayList arrayList = bVar.f325938a;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f325940c.post((java.lang.Runnable) it.next());
            }
            arrayList.clear();
            bVar.f325939b.quitSafely();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("InitTaskMgr", "startInit exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "onCreate, this.hash=" + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.database.MatrixCursor matrixCursor;
        java.lang.String str3;
        java.lang.String b17;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("query", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            me4.d c17 = c();
            if (strArr2 == null || strArr2.length <= 0) {
                str3 = "";
            } else {
                java.lang.String str5 = strArr2[0];
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str5 == null) {
                    str5 = "";
                }
                str3 = str5.trim();
            }
            com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "handleQuery queryPkg=" + str3 + ", callingPkg=" + c17.f325945d + ", thread.hash=" + java.lang.Thread.currentThread().hashCode());
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            if (b(pInt)) {
                if (android.text.TextUtils.isEmpty(c17.f325945d)) {
                    com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "handleQuery callingPkg empty");
                    str4 = "";
                    b17 = str4;
                    i17 = 1;
                } else {
                    if (!me4.c.h()) {
                        com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "handleQuery isExptWaidEnable==false");
                        i19 = 2;
                    } else if (this.f171735d.match(uri) != 1) {
                        com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "handleQuery uriMatch failed");
                        i19 = 3;
                    } else {
                        java.lang.String str6 = android.text.TextUtils.isEmpty(str3) ? c17.f325945d : str3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInWhiteList", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInWhiteList", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                        if (c17.f325945d.equals(str6)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppWaidForThirdApp", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                            b17 = me4.c.b(str6);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppWaidForThirdApp", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                            com.tencent.mars.xlog.Log.i("ad.waid.WaidProvider", "handleQuery, appWaid=" + b17);
                            if (android.text.TextUtils.isEmpty(b17)) {
                                i18 = 5;
                            } else {
                                str4 = str6;
                                i17 = 0;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "handleQuery queryPkg!=callingPkg, queryPkg=" + str6 + ", callingPkg=" + c17.f325945d);
                            i18 = 4;
                            b17 = "";
                        }
                        java.lang.String str7 = str6;
                        i17 = i18;
                        str4 = str7;
                    }
                    i17 = i19;
                    str4 = "";
                    b17 = str4;
                }
                me4.f.d(c17.f325945d, c17.f325944c, str3, i17, pInt.value, (int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
                me4.f.c(c17, str3);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                matrixCursor = a(str4, b17 == null ? "" : b17, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            } else {
                com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "checkWXEnv failed");
                matrixCursor = a("", "", -1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidProvider", "handleQuery exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            matrixCursor = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("query", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }
}
