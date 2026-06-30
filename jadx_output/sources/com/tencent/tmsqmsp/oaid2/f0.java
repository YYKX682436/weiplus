package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.tencent.tmsqmsp.oaid2.f0 f215587g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f215592e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.BroadcastReceiver f215593f;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.e0 f215588a = new com.tencent.tmsqmsp.oaid2.e0("udid");

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.e0 f215589b = new com.tencent.tmsqmsp.oaid2.e0("oaid");

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.e0 f215591d = new com.tencent.tmsqmsp.oaid2.e0("vaid");

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.e0 f215590c = new com.tencent.tmsqmsp.oaid2.e0("aaid");

    public static com.tencent.tmsqmsp.oaid2.h0 a(android.database.Cursor cursor) {
        com.tencent.tmsqmsp.oaid2.h0 h0Var = new com.tencent.tmsqmsp.oaid2.h0(null, 0);
        if (cursor == null) {
            b("parseValue fail, cursor is null.");
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                h0Var.f215598c = cursor.getString(columnIndex);
            } else {
                b("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                h0Var.f215596a = cursor.getInt(columnIndex2);
            } else {
                b("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                h0Var.f215597b = cursor.getLong(columnIndex3);
            } else {
                b("parseExpired fail, index < 0.");
            }
        } else {
            b("parseValue fail, cursor is closed.");
        }
        return h0Var;
    }

    public static void b(java.lang.String str) {
        com.tencent.tmsqmsp.oaid2.t0.c("MzOpenIdManager ".concat(java.lang.String.valueOf(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r2 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r10, com.tencent.tmsqmsp.oaid2.e0 r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto Lc9
        L5:
            boolean r1 = r11.a()
            if (r1 != 0) goto Lca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "queryId : "
            r1.<init>(r2)
            java.lang.String r2 = r11.f215580c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b(r1)
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lc3
            r4 = 0
            r5 = 0
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lc3
            java.lang.String r7 = r11.f215580c     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lc3
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lc3
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lc3
            if (r2 != 0) goto L57
            r9.a(r10, r8)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            boolean r10 = r9.a(r10, r1)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            java.lang.String r1 = "forceQuery isSupported : "
            r11.<init>(r1)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            r11.append(r10)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            b(r10)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc4
            if (r2 == 0) goto L56
            r2.close()
        L56:
            return r0
        L57:
            com.tencent.tmsqmsp.oaid2.h0 r3 = a(r2)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb8
            java.lang.String r4 = r3.f215598c     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lb8
            r11.a(r4)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            long r5 = r3.f215597b     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r11.a(r5)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            int r5 = r3.f215596a     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r11.a(r5)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r5.<init>()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.String r6 = r11.f215580c     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.String r6 = " errorCode : "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            int r11 = r11.f215578a     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r5.append(r11)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            b(r11)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            int r11 = r3.f215596a     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r3) goto L8f
            r2.close()
            return r4
        L8f:
            r9.a(r10)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            if (r11 == 0) goto L9c
            r2.close()
            return r4
        L9c:
            boolean r10 = r9.a(r10, r1)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.String r1 = "not support, forceQuery isSupported: "
            r11.<init>(r1)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r11.append(r10)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            b(r10)     // Catch: java.lang.Throwable -> Lb5 java.lang.Exception -> Lc6
            r2.close()
            return r4
        Lb5:
            r10 = move-exception
            r0 = r2
            goto Lbd
        Lb8:
            r2.close()
            return r0
        Lbc:
            r10 = move-exception
        Lbd:
            if (r0 == 0) goto Lc2
            r0.close()
        Lc2:
            throw r10
        Lc3:
            r2 = r0
        Lc4:
            if (r2 == 0) goto Lc9
        Lc6:
            r2.close()
        Lc9:
            return r0
        Lca:
            java.lang.String r10 = r11.f215581d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.f0.a(android.content.Context, com.tencent.tmsqmsp.oaid2.e0):java.lang.String");
    }

    public com.tencent.tmsqmsp.oaid2.e0 a(java.lang.String str) {
        if ("oaid".equals(str)) {
            return this.f215589b;
        }
        if ("vaid".equals(str)) {
            return this.f215591d;
        }
        if ("aaid".equals(str)) {
            return this.f215590c;
        }
        if ("udid".equals(str)) {
            return this.f215588a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r1 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0021, code lost:
    
        if (r1.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Boolean r0 = r8.f215592e
            if (r0 == 0) goto Lc
            if (r10 != 0) goto Lc
            boolean r9 = r0.booleanValue()
            goto L8a
        Lc:
            r10 = 1
            r0 = 0
            if (r9 != 0) goto L12
        L10:
            r2 = r0
            goto L24
        L12:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            if (r1 != 0) goto L1a
            r2 = r0
            goto L1b
        L1a:
            r2 = r10
        L1b:
            java.lang.String r3 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r3, r0)
            if (r1 != 0) goto L24
            goto L10
        L24:
            if (r2 != 0) goto L31
            java.lang.String r9 = "is not Supported, for isLegalProvider : false"
            b(r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.f215592e = r9
        L2f:
            r9 = r0
            goto L8a
        L31:
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
            r4 = 0
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
            java.lang.String r9 = "supported"
            r6[r0] = r9     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
            r7 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
            if (r1 != 0) goto L50
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
            r8.f215592e = r9     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L83
        L50:
            com.tencent.tmsqmsp.oaid2.h0 r9 = a(r1)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            java.lang.String r9 = r9.f215598c     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            java.lang.String r10 = "querySupport, result : "
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            java.lang.String r10 = r10.concat(r2)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            b(r10)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            java.lang.String r10 = "0"
            boolean r9 = r10.equals(r9)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            r8.f215592e = r9     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L7c
            if (r1 == 0) goto L78
            r1.close()
        L78:
            return r9
        L79:
            if (r1 == 0) goto L2f
            goto L86
        L7c:
            r9 = move-exception
            if (r1 == 0) goto L82
            r1.close()
        L82:
            throw r9
        L83:
            if (r1 != 0) goto L86
            goto L2f
        L86:
            r1.close()
            goto L2f
        L8a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.f0.a(android.content.Context, boolean):boolean");
    }

    public final void a(android.content.Context context) {
        synchronized (this) {
            if (this.f215593f == null) {
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                this.f215593f = new com.tencent.tmsqmsp.oaid2.d0();
                if (context.getApplicationInfo().targetSdkVersion >= 33 && android.os.Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(this.f215593f, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null, 2);
                } else {
                    context.registerReceiver(this.f215593f, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
                }
            }
        }
    }

    public static final com.tencent.tmsqmsp.oaid2.f0 a() {
        if (f215587g == null) {
            synchronized (com.tencent.tmsqmsp.oaid2.f0.class) {
                f215587g = new com.tencent.tmsqmsp.oaid2.f0();
            }
        }
        return f215587g;
    }
}
