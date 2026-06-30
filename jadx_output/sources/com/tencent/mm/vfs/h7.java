package com.tencent.mm.vfs;

@j95.b
/* loaded from: classes12.dex */
public final class h7 extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        java.util.Set set;
        java.util.Set set2;
        java.util.Set set3;
        java.util.Set set4;
        java.util.Set set5;
        java.lang.String group;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sdk.platformtools.i1.f192732a = com.tencent.mm.vfs.g7.f212963a;
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        b3Var.getClass();
        com.tencent.mm.vfs.t2 t2Var = new com.tencent.mm.vfs.t2(b3Var, true);
        java.util.List b17 = com.tencent.mm.vfs.q7.b(false);
        java.lang.String e17 = com.tencent.mm.vfs.e8.e(b3Var.c(), "account");
        java.lang.String e18 = com.tencent.mm.vfs.e8.e(b3Var.c(), "accountSalt");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (((java.lang.String) pair.first).equals(e17) || ((java.lang.String) pair.first).equals("ee1da3ae2100e09165c2e52382cfe79f") || ((java.lang.String) pair.first).equals(e18) || ((java.lang.String) pair.second).equals(e18)) {
                it.remove();
            } else {
                com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", " * Other account pair: %s / %s", pair.first, pair.second);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                android.util.Pair pair2 = (android.util.Pair) arrayList.get(i17);
                strArr[i17] = ((java.lang.String) pair2.first) + '|' + ((java.lang.String) pair2.second) + '|' + ((java.lang.String) pair2.second);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" * Other account env: ");
                sb6.append(strArr[i17]);
                com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", sb6.toString());
            }
            t2Var.f213179a.f213114e.put("accountOtherList", strArr);
            t2Var.f213180b = true;
        }
        com.tencent.mm.vfs.a0[] a0VarArr = new com.tencent.mm.vfs.a0[16];
        for (int i18 = 0; i18 < 16; i18++) {
            a0VarArr[i18] = new com.tencent.mm.vfs.DeleteAllFileSystem(new com.tencent.mm.vfs.NativeFileSystem(com.tencent.mm.vfs.w.f213219a[i18]));
        }
        t2Var.c("@CleanRubbish", new com.tencent.mm.vfs.MaintenanceGroup(a0VarArr));
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9a-f]{32}(temp[0-9]+)?");
        try {
            java.lang.Iterable<com.tencent.mm.vfs.x1> list = new com.tencent.mm.vfs.NativeFileSystem("${sdFrom}/MicroMsg").b(com.tencent.mm.vfs.a3.f212781a.c()).list("");
            if (list == null) {
                list = java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.mm.vfs.x1 x1Var : list) {
                boolean z17 = x1Var.f213236f;
                java.lang.String str = x1Var.f213232b;
                if (z17) {
                    java.util.regex.Matcher matcher = compile.matcher(str);
                    if (matcher.matches() && (((group = matcher.group(1)) != null && !group.isEmpty()) || com.tencent.mm.vfs.q7.f213143c)) {
                        arrayList2.add(new com.tencent.mm.vfs.DeleteAllFileSystem(new com.tencent.mm.vfs.NativeFileSystem("${sdFrom}/MicroMsg/" + str)));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                t2Var.c("@CleanAbandon", new com.tencent.mm.vfs.MaintenanceGroup(arrayList2));
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.CleanRubbish", e19, "Failed installing wild account cleaner", new java.lang.Object[0]);
        }
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("old_org\\.chromium\\.android_webview_[0-9]+");
        try {
            java.lang.Iterable<com.tencent.mm.vfs.x1> list2 = new com.tencent.mm.vfs.NativeFileSystem("${dataCache}").b(com.tencent.mm.vfs.a3.f212781a.c()).list("");
            if (list2 == null) {
                list2 = java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.tencent.mm.vfs.x1 x1Var2 : list2) {
                boolean z18 = x1Var2.f213236f;
                java.lang.String str2 = x1Var2.f213232b;
                if (z18 && compile2.matcher(str2).matches()) {
                    arrayList3.add(new com.tencent.mm.vfs.DeleteAllFileSystem(new com.tencent.mm.vfs.NativeFileSystem("${dataCache}/" + str2)));
                }
            }
            if (!arrayList3.isEmpty()) {
                t2Var.c("@CleanOldWebViewCache", new com.tencent.mm.vfs.MaintenanceGroup(arrayList3));
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.CleanRubbish", e27, "Failed installing old WebView cache cleaner", new java.lang.Object[0]);
        }
        com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem qQMusicCacheCleanupFileSystem = new com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem(new com.tencent.mm.vfs.NativeFileSystem("${dataCache}"));
        qQMusicCacheCleanupFileSystem.a("@QQMusicCacheClean", new com.tencent.mm.vfs.p4());
        t2Var.c("@QQMusicCacheClean", qQMusicCacheCleanupFileSystem);
        t2Var.c("@ApkClean", new com.tencent.mm.vfs.ApkCleanupFileSystem(new com.tencent.mm.vfs.NativeFileSystem("${sdTo}/MicroMsg")));
        synchronized (com.tencent.mm.vfs.c1.f212848g) {
            set = com.tencent.mm.vfs.c1.f212853l;
            set2 = com.tencent.mm.vfs.c1.f212854m;
            set3 = com.tencent.mm.vfs.c1.f212856o;
            set4 = com.tencent.mm.vfs.c1.f212855n;
            set5 = com.tencent.mm.vfs.c1.f212857p;
            set3.addAll(java.util.Arrays.asList(".vfs", "MicroMsg", "cache", "files", com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH, "code_cache"));
            com.tencent.mm.vfs.c1.f212853l = java.util.Collections.unmodifiableSet(set);
            com.tencent.mm.vfs.c1.f212854m = java.util.Collections.unmodifiableSet(set2);
            com.tencent.mm.vfs.c1.f212856o = java.util.Collections.unmodifiableSet(set3);
            com.tencent.mm.vfs.c1.f212855n = java.util.Collections.unmodifiableSet(set4);
            com.tencent.mm.vfs.c1.f212857p = java.util.Collections.unmodifiableSet(set5);
            com.tencent.mm.vfs.c1.f212852k = java.util.Collections.unmodifiableSet(com.tencent.mm.vfs.c1.f212852k);
        }
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-NonAccountSdcard-", 10, new java.lang.String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, set, false, true);
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-AccountSdcard-", 11, new java.lang.String[]{"${sdFrom}/MicroMsg/${account}", "${sdTo}/MicroMsg/${account}", "${sdToCache}/${account}", "${sdFrom}/MicroMsg/${accountSalt}", "${sdTo}/MicroMsg/${accountSalt}", "${sdToCache}/${accountSalt}"}, set2, false, true);
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-NonAccountData-", 7, new java.lang.String[]{"${data}", "${dataCache}", "${data}/MicroMsg"}, set3, false, true);
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-FilesData-", 7, new java.lang.String[]{"${data}/files"}, set5, false, true);
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-AccountData-", 8, new java.lang.String[]{"${data}/MicroMsg/${account}", "${dataCache}/${account}"}, set4, false, false);
        java.util.Map c17 = com.tencent.mm.vfs.a3.f212781a.c();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Object e28 = com.tencent.mm.vfs.e8.e(c17, "account");
        if (e28 instanceof java.lang.String) {
            hashSet.add(e28);
        } else if (e28 instanceof java.lang.String[]) {
            hashSet.addAll(java.util.Arrays.asList((java.lang.String[]) e28));
        }
        java.lang.Object e29 = com.tencent.mm.vfs.e8.e(c17, "accountSalt");
        if (e29 instanceof java.lang.String) {
            hashSet.add(e29);
        } else if (e29 instanceof java.lang.String[]) {
            hashSet.addAll(java.util.Arrays.asList((java.lang.String[]) e29));
        }
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-OtherAccountSdcard-", 5, new java.lang.String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, hashSet, true, false);
        com.tencent.mm.vfs.c1.e(t2Var, "@DiskSpace-OtherAccountData-", 9, new java.lang.String[]{"${data}/MicroMsg"}, hashSet, true, false);
        t2Var.c("@MigrationStatistics", new com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem(null));
        t2Var.a(t2Var.f213182d.C);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.z7(null, null, new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), "vfs-statistics").getPath(), null, null).toString()));
            if (jSONObject.optInt("version") != 1) {
                com.tencent.mars.xlog.Log.e("VFS.DiskFileStatistics", "Mismatched file version: " + jSONObject.optInt("version"));
            } else {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("content");
                int length = jSONArray.length();
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i19 = 0; i19 < length; i19++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                    java.lang.String string = jSONObject2.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String string2 = jSONObject2.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    hashMap.put(string2 + '|' + string, new com.tencent.mm.vfs.a1(string, jSONObject2.getInt("type"), jSONObject2.getInt("flags"), string2, jSONObject2.getLong("totalSize"), jSONObject2.getInt("fileCount"), jSONObject2.getInt("dirCount"), jSONObject2.getInt("maxDepth"), jSONObject2.getLong("maxFileSize"), jSONObject2.getLong("filesAge"), jSONObject2.optLong("targetSize"), jSONObject2.optLong("expireTime")));
                }
                com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Loaded statistics, count: " + hashMap.size());
                synchronized (com.tencent.mm.vfs.c1.f212848g) {
                    com.tencent.mm.vfs.c1.f212849h = hashMap;
                    com.tencent.mm.vfs.c1.f212851j = true;
                }
            }
        } catch (java.io.IOException | org.json.JSONException e37) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.DiskFileStatistics", e37, "Unable to load statistics", new java.lang.Object[0]);
        }
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.u0("XWalk", 13, 0, "${data}/app_xwalk_*"));
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.v0("TBSEngine", 13, 0, "${data}/app_tbs_*"));
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.w0("WebViewData", 13, 0, "${data}/app_webview_com_tencent_mm*"));
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.x0("WebViewDataCache", 13, 0, "${dataCache}/webview_com_tencent_mm*"));
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.y0("WeiXin External", 0, 0, "${sdFrom}/MicroMsg/WeiXin"));
        com.tencent.mm.vfs.c1.i(new com.tencent.mm.vfs.z0("@DiskSpace-NonAccountData-${data}-MISC", 7, 0, "${data}/*"));
        com.tencent.mm.vfs.p3 p3Var = com.tencent.mm.vfs.p3.f213124b;
        com.tencent.mm.vfs.x2 x2Var = com.tencent.mm.vfs.c1.f212859r;
        synchronized (p3Var) {
            if (x2Var != null) {
                p3Var.f213125a.add(x2Var);
            }
        }
    }
}
