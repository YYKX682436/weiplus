package rp;

/* loaded from: classes12.dex */
public final class i implements com.tencent.nativecrash.NativeCrash.CrashCallback {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f398333c;

    /* renamed from: a, reason: collision with root package name */
    public volatile rp.e f398334a;

    /* renamed from: b, reason: collision with root package name */
    public volatile rp.g f398335b;

    public i(rp.d dVar) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String replace = bm5.f1.a().replace(':', '_');
        java.io.File file = new java.io.File(context.getFilesDir(), "crash/NativeCrash_" + replace + '_' + java.lang.System.currentTimeMillis());
        file.getParentFile().mkdirs();
        int i17 = f398333c ? 2176 : 2048;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatNativeCrash", "new flags enabled: " + f398333c);
        com.tencent.nativecrash.NativeCrash.init(file.getAbsolutePath(), 1871, i17, false);
        com.tencent.nativecrash.NativeCrash.resetCustomInfo();
        com.tencent.nativecrash.NativeCrash.customInfo("Client Version: " + com.tencent.mm.sdk.platformtools.z.f193111g);
        com.tencent.nativecrash.NativeCrash.customInfo("Base Version: " + lp0.a.f320249c);
        com.tencent.nativecrash.NativeCrash.crashCallback(this);
    }

    public static void a(java.io.BufferedReader bufferedReader, java.lang.StringBuilder sb6) {
        java.lang.String readLine;
        int indexOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            readLine = bufferedReader.readLine();
            if (readLine == null || readLine.isEmpty() || (indexOf = readLine.indexOf(" -> ")) <= 0) {
                break;
            } else {
                arrayList.add(readLine.substring(indexOf + 4));
            }
        }
        if (arrayList.size() < 900) {
            sb6.append("FileDescriptors less than 900 lines\n");
            return;
        }
        java.util.Collections.sort(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = (java.lang.String) arrayList.get(0);
        int size = arrayList.size();
        int i17 = 1;
        for (int i18 = 1; i18 < size; i18++) {
            java.lang.String str2 = (java.lang.String) arrayList.get(i18);
            if (str2.equals(str)) {
                i17++;
            } else {
                arrayList2.add(android.util.Pair.create(str, java.lang.Integer.valueOf(i17)));
                i17 = 1;
                str = str2;
            }
        }
        arrayList2.add(android.util.Pair.create(str, java.lang.Integer.valueOf(i17)));
        java.util.Collections.sort(arrayList2, new rp.d());
        sb6.append("[File Descriptors]\n");
        if (readLine != null && readLine.startsWith("Total: ")) {
            sb6.append(readLine);
            sb6.append('\n');
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            sb6.append('(');
            sb6.append(pair.second);
            sb6.append(") ");
            sb6.append((java.lang.String) pair.first);
            sb6.append('\n');
        }
        sb6.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static rp.f b(int r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.i.b(int, java.lang.String, java.lang.String):rp.f");
    }

    public static void c(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObject2;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.isFile() || (jSONObject2 = (org.json.JSONObject) jSONObject.opt(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN)) == null) {
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        jSONObject3.putOpt("contents", jSONArray);
                        jSONObject2.putOpt("threads", jSONObject3);
                        bufferedReader.close();
                        return;
                    }
                    if (readLine.startsWith("[File Descriptors]")) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        a(bufferedReader, sb6);
                        jSONObject.putOpt("File Descriptors", org.json.JSONObject.wrap(sb6.toString().split("\n")));
                    } else if (readLine.startsWith("[DumpThread:")) {
                        org.json.JSONObject putOpt = new org.json.JSONObject().putOpt(ya.b.INDEX, java.lang.Integer.valueOf(jSONArray.length()));
                        d(putOpt, bufferedReader);
                        jSONArray.put(putOpt);
                    } else if (readLine.startsWith("[DumpThread statis]")) {
                        while (true) {
                            java.lang.String readLine2 = bufferedReader.readLine();
                            if (readLine2 != null && !readLine2.isEmpty()) {
                                java.lang.String[] split = readLine2.split("=", 2);
                                if (split.length > 1) {
                                    jSONObject3.put(split[0].trim(), split[1].trim());
                                }
                            }
                        }
                    } else if (readLine.startsWith("[Mappings]")) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (true) {
                            java.lang.String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null || readLine3.isEmpty()) {
                                break;
                            } else {
                                arrayList.add(readLine3);
                            }
                        }
                        jSONObject.putOpt("Mappings", org.json.JSONObject.wrap(arrayList));
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeChatNativeCrash", e17, "parseFullDumpToJSON failed", new java.lang.Object[0]);
        }
    }

    public static void d(org.json.JSONObject jSONObject, java.io.BufferedReader bufferedReader) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.isEmpty()) {
                break;
            }
            java.lang.String[] split = readLine.split("=", 2);
            if (split[0].startsWith("Backtrace")) {
                while (true) {
                    java.lang.String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null || readLine2.isEmpty()) {
                        break;
                    } else {
                        arrayList.add(readLine2);
                    }
                }
            } else if (split.length > 1) {
                jSONObject.put(split[0].trim(), split[1].trim());
            }
        }
        jSONObject.put("BackTrace", org.json.JSONObject.wrap(arrayList));
    }

    @Override // com.tencent.nativecrash.NativeCrash.CrashCallback
    public boolean onCrashDumped(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatNativeCrash", "onCrashDumped");
        rp.f b17 = b(i17, str, str2);
        if (this.f398334a != null) {
            ((com.tencent.mm.app.w3) this.f398334a).getClass();
            boolean[] zArr = com.tencent.mm.app.y3.f53925a;
        }
        if (this.f398335b != null) {
            this.f398335b.a(b17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatNativeCrash", "[MAPPINGS]");
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/" + android.os.Process.myPid() + "/maps"), 1024);
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.WeChatNativeCrash", readLine);
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeChatNativeCrash", e17, "Cannot read dump file: %s", str2);
        }
        com.tencent.mars.xlog.Log.appenderFlush();
        com.tencent.mars.xlog.Log.appenderClose();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return false;
        }
        d55.w wVar = new d55.w(com.tencent.mm.sdk.platformtools.x2.f193071a, "recovery_statistic");
        wVar.e();
        int i18 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        boolean z18 = wVar.getBoolean("launch_recovery_real", false);
        boolean z19 = wVar.getBoolean("recover_from_crash", false);
        int i19 = wVar.getInt("recovery_status", -1);
        int i27 = wVar.getInt("recovery_from", 0);
        int i28 = wVar.getInt("recover_internal_status", 0);
        int i29 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        boolean z27 = wVar.getBoolean("recover_is_discard", false);
        wVar.getString("recover_app_ver", "");
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193111g;
        wVar.g("crash_count", i18);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", z18);
        wVar.putBoolean("recover_from_crash", z19);
        wVar.putInt("recovery_status", i19);
        wVar.putInt("recovery_from", i27);
        wVar.putInt("recover_internal_status", i28);
        wVar.putInt("recover_launch_mode", i29);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", z27);
        wVar.putString("recover_app_ver", str3);
        wVar.c();
        d55.r0.a().c(4);
        return false;
    }
}
