package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f192291a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(16);
        f192291a = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put(com.tencent.mm.app.MMBugReportContents.f53222c, 10002);
        hashMap.put("handler", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL));
        hashMap.put("sql", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
        hashMap.put("permission", 10005);
        hashMap.put("main_thread_watch", 10006);
        hashMap.put("app_exit_info", 10007);
    }

    public static boolean a(java.lang.String str, byte[] bArr) {
        java.util.Map d17;
        com.tencent.mars.xlog.Log.e("MicroMsg.CrashUpload", "doPost : url = " + str + ", data.length = " + bArr.length);
        org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
        org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(str);
        try {
            org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(bArr);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            org.apache.http.HttpResponse execute = defaultHttpClient.execute(httpPost);
            java.io.InputStream content = execute.getEntity().getContent();
            int statusCode = execute.getStatusLine().getStatusCode();
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.t8.e(content);
            if (e17 != null && e17.length() > 0 && (d17 = com.tencent.mm.sdk.platformtools.aa.d(e17, "Response", null)) != null && "-1000".equalsIgnoreCase((java.lang.String) d17.get(".Response.retCode")) && d17.get(".Response.url") != null) {
                ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.sandbox.monitor.e(d17), 500L);
            }
            com.tencent.mm.app.p4.a(35);
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashUpload", "doPost: responseCode %d returnConnection = %s", java.lang.Integer.valueOf(statusCode), e17);
            return statusCode == 200;
        } catch (java.lang.Exception e18) {
            com.tencent.mm.app.p4.a(36);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashUpload", e18, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.CrashUpload", "doPost e type: %s, msg: %s", e18.getClass().getSimpleName(), e18.getMessage());
            return false;
        }
    }

    public static int b(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str4 = com.tencent.mm.storage.v3.f196273a;
        sb6.append(str4);
        sb6.append("crash/");
        sb6.append(str);
        sb6.append(".");
        sb6.append(str2);
        sb6.append(".crashini");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.sdk.platformtools.t8.r1(l75.a.b(sb7, "count"));
        com.tencent.mm.sdk.platformtools.t8.r1(l75.a.b(sb7, "lasttime"));
        java.lang.System.currentTimeMillis();
        if (z17) {
            str3 = str4 + "crash/" + str + "." + str2 + ".preventcrashlog";
        } else {
            str3 = str4 + "crash/" + str + "." + str2 + ".crashlog";
        }
        if (com.tencent.mm.sandbox.monitor.o.e(str3) < 5242880) {
            com.tencent.mm.app.p4.a(28);
            byte[] f17 = com.tencent.mm.sandbox.monitor.o.f(str3, 0, -1);
            if (!com.tencent.mm.sdk.platformtools.t8.M0(f17)) {
                int length = f17.length;
                java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
                byte[] a17 = kk.y.a(f17);
                com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
                kk.d.b(pByteArray, a17, lowerCase.getBytes());
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.sandbox.monitor.d(length, lowerCase, str2, str, pByteArray));
            }
        } else {
            com.tencent.mm.app.p4.a(29);
        }
        com.tencent.mm.sandbox.monitor.o.b(str3);
        com.tencent.mm.app.p4.a(30);
        new l75.a(sb7).d("count", java.lang.String.valueOf(0));
        new l75.a(sb7).d("lasttime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        return 1;
    }

    public static void c(java.lang.String str, com.tencent.mm.sandbox.monitor.ErrLog$Error errLog$Error) {
        if (!new java.io.File(str).exists()) {
            int i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (i17 == 0) {
                java.lang.String g17 = wo.w0.g(false);
                if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    int hashCode = (android.os.Build.DEVICE + android.os.Build.FINGERPRINT + android.os.Build.MANUFACTURER + wo.w0.m()).hashCode();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("uin[");
                    sb7.append(hashCode);
                    sb7.append("] ");
                    sb6.append(sb7.toString());
                } else {
                    sb6.append("uin[" + g17 + "] ");
                }
            } else {
                sb6.append("uin[" + kk.v.a(i17) + "] ");
            }
            sb6.append(com.tencent.mars.xlog.Log.getSysInfo());
            sb6.append(" BRAND:[" + android.os.Build.BRAND + "] ");
            java.lang.String[] f17 = wo.w0.f();
            if (f17.length > 0) {
                sb6.append("c1[" + f17[0] + "] ");
            }
            if (f17.length > 1) {
                sb6.append("c2[" + f17[1] + "] ");
            }
            sb6.append("\n");
            com.tencent.mm.sandbox.monitor.o.a(str, sb6.toString().getBytes());
        }
        if (com.tencent.mm.sandbox.monitor.o.e(str) > 10485760) {
            com.tencent.mm.sandbox.monitor.o.b(str);
        }
        com.tencent.mm.sandbox.monitor.o.a(str, (errLog$Error.toString() + "\n").getBytes());
    }

    public static int d(java.lang.String str, java.lang.String str2, com.tencent.mm.sandbox.monitor.ErrLog$Error errLog$Error, java.lang.String str3, java.lang.String str4, boolean z17) {
        if (errLog$Error == null || com.tencent.mm.sdk.platformtools.t8.K0(errLog$Error.toString())) {
            return -1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = com.tencent.mm.storage.v3.f196273a;
        sb6.append(str5);
        sb6.append("crash/");
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        java.lang.String str6 = str5 + "crash/" + str + "." + str2 + ".crashini";
        new l75.a(str6).d("count", java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.r1(l75.a.b(str6, "count")) + 1));
        if (com.tencent.mm.sdk.platformtools.t8.r1(l75.a.b(str6, "lasttime")) == 0) {
            new l75.a(str6).d("lasttime", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        java.lang.String str7 = z17 ? str5 + "crash/" + str + "." + str2 + ".preventcrashlog" : str5 + "crash/" + str + "." + str2 + ".crashlog";
        errLog$Error.toString().getClass();
        if (errLog$Error.f192278i) {
            java.io.File file2 = new java.io.File(lp0.b.a());
            if (!file2.exists()) {
                file2.mkdirs();
            }
            java.io.File[] listFiles = file2.listFiles();
            if (listFiles != null) {
                for (java.io.File file3 : listFiles) {
                    long lastModified = file3.lastModified();
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (java.lang.System.currentTimeMillis() - lastModified > 604800000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", file3.getPath());
                        file3.delete();
                    }
                }
            }
            java.lang.String str8 = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(new java.util.Date()) + ".txt";
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", str8);
            c(str8, errLog$Error);
        }
        c(str7, errLog$Error);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.sandbox.monitor.o.b(str3);
        }
        if (str4 != null && str4.endsWith(".fulldmp")) {
            com.tencent.mm.sandbox.monitor.o.b(str4);
            com.tencent.mm.sandbox.monitor.o.b(str4.replace(".fulldmp", ".dmp"));
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashUpload", "delete jniFullDump ".concat(str4));
        }
        b(str, str2, z17);
        return 1;
    }

    public static void e(android.content.Intent intent, java.lang.String str) {
        com.tencent.mm.app.p4.a(15);
        if (intent == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.io.File file = new java.io.File(com.tencent.mm.storage.v3.f196273a + "crashprevent/");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra("tag");
            if (stringExtra == null) {
                stringExtra = "exception";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("exceptionMsg");
            java.lang.String stringExtra3 = intent.getStringExtra("userName");
            boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
            java.lang.String stringExtra4 = intent.getStringExtra("exceptionProcess");
            com.tencent.mm.sandbox.monitor.ErrLog$Error errLog$Error = new com.tencent.mm.sandbox.monitor.ErrLog$Error(stringExtra3, stringExtra, com.tencent.mm.sdk.platformtools.t8.i1(), stringExtra2, booleanExtra);
            com.tencent.mm.sandbox.monitor.ErrLog$PreventError errLog$PreventError = new com.tencent.mm.sandbox.monitor.ErrLog$PreventError(stringExtra3, stringExtra, errLog$Error, stringExtra4);
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.writeParcelable(errLog$PreventError, 0);
            com.tencent.mm.sandbox.monitor.o.a(str, obtain.marshall());
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashUpload", "crashPreventPath:[%s] len:[%d]", str, java.lang.Integer.valueOf(errLog$Error.toString().length()));
            com.tencent.mm.sandbox.monitor.a.a();
            com.tencent.mm.app.p4.a(16);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashUpload", e17, "", new java.lang.Object[0]);
        }
    }
}
