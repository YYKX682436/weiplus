package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.otherway.h0 f190945a = new com.tencent.mm.pluginsdk.ui.otherway.h0();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r4 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r8, android.content.Intent r9, java.util.HashSet r10, java.util.ArrayList r11) {
        /*
            r7 = this;
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            r1 = 131072(0x20000, float:1.83671E-40)
            java.util.List r0 = r0.queryIntentActivities(r9, r1)
            kotlin.jvm.internal.o.d(r0)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r2 = r2.packageName
            boolean r3 = r10.contains(r2)
            if (r3 != 0) goto L11
            com.tencent.mm.pluginsdk.ui.otherway.x r3 = new com.tencent.mm.pluginsdk.ui.otherway.x
            r3.<init>()
            r3.f191028d = r1
            android.content.pm.ActivityInfo r4 = r1.activityInfo
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            r5 = 1
            if (r4 == 0) goto L4b
            android.content.pm.PackageManager r6 = r8.getPackageManager()
            java.lang.CharSequence r4 = r6.getApplicationLabel(r4)
            kotlin.jvm.internal.o.d(r4)
            boolean r6 = r26.n0.N(r4)
            r6 = r6 ^ r5
            if (r6 == 0) goto L48
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 != 0) goto L59
        L4b:
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            android.content.pm.PackageManager r4 = r8.getPackageManager()
            java.lang.CharSequence r1 = r1.loadLabel(r4)
            java.lang.String r4 = r1.toString()
        L59:
            r3.f191029e = r4
            r3.f191033i = r5
            r3.f191035n = r5
            r3.f191036o = r9
            r11.add(r3)
            r10.add(r2)
            goto L11
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.otherway.h0.a(android.content.Context, android.content.Intent, java.util.HashSet, java.util.ArrayList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e0, code lost:
    
        if (lb0.d.f317669a.g(r25, com.tencent.mm.pluginsdk.model.a.f188776e) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0240, code lost:
    
        if (lb0.d.f317669a.g(r25, com.tencent.mm.pluginsdk.model.a.f188775d) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigChattingMoreMenuAdShareOpen()) == 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d7, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigAdOpenWayEnhanceWebViewMP()) == 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.openway.RepairerConfigYBWebViewAdOpenWayEnhance()) == 1) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(android.content.Context r23, java.util.ArrayList r24, int r25, android.content.Intent r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.otherway.h0.b(android.content.Context, java.util.ArrayList, int, android.content.Intent, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public final android.content.Intent c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (kotlin.jvm.internal.o.b(str, "text/html")) {
            if (str2 != null && r26.i0.y(str2, "http", false)) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(268435456);
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str2);
                return intent;
            }
        }
        java.util.List list = com.tencent.mm.pluginsdk.ui.tools.f.f191612a;
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.addFlags(268435456);
        android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2 == null ? "" : str2)));
        if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            b17 = b17.buildUpon().appendQueryParameter("displayName", str3).build();
        }
        intent2.putExtra("android.intent.extra.STREAM", b17);
        intent2.addFlags(1);
        intent2.setType(str);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "createSendNormalIntent %s %s %s", str, str2, intent2.toString());
        } catch (java.lang.Exception unused) {
        }
        return intent2;
    }

    public final long d(com.tencent.mm.pluginsdk.ui.otherway.w info, java.util.HashMap recentUseAppTime) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(recentUseAppTime, "recentUseAppTime");
        java.lang.Long l17 = (java.lang.Long) recentUseAppTime.get(info.b());
        if (l17 != null) {
            return l17.longValue();
        }
        int h17 = info.h();
        if (h17 != 2) {
            if (h17 == 3) {
                return 2L;
            }
            if (h17 == 4) {
                return 1L;
            }
            if (h17 != 5) {
                return h17 != 7 ? 0L : 6L;
            }
        }
        return 4L;
    }

    public final android.content.Intent e(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (kotlin.jvm.internal.o.b(str, "text/html")) {
            boolean z17 = false;
            if (str2 != null && r26.i0.y(str2, "http", false)) {
                z17 = true;
            }
            if (z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(android.net.Uri.parse(str2));
                intent.addCategory("android.intent.category.BROWSABLE");
                return intent;
            }
        }
        return com.tencent.mm.pluginsdk.ui.tools.f.b(context, str, str2, str3);
    }

    public final java.util.ArrayList f(java.util.ArrayList dataList, java.lang.String str) {
        java.lang.Iterable<java.lang.String> appList;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        if (str == null || str.length() == 0) {
            return new java.util.ArrayList();
        }
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
        if (N == null) {
            appList = kz5.p0.f313996d;
        } else {
            r45.j56 j56Var = new r45.j56();
            byte[] j17 = N.j("shortcut:" + str);
            if (j17 != null) {
                j56Var.parseFrom(j17);
            }
            appList = j56Var.f377596d;
            kotlin.jvm.internal.o.f(appList, "appList");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : appList) {
            java.util.Iterator it = dataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.pluginsdk.ui.otherway.w) obj).b(), str2)) {
                    break;
                }
            }
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public final void g(java.util.ArrayList dataList, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
        if (N != null) {
            r45.qk5 qk5Var = new r45.qk5();
            byte[] j17 = N.j(str);
            if (j17 != null) {
                qk5Var.parseFrom(j17);
            }
            java.util.LinkedList<r45.gv6> linkedList = qk5Var.f384079d;
            if (linkedList != null) {
                for (r45.gv6 gv6Var : linkedList) {
                    hashMap2.put(gv6Var.f375555d, java.lang.Long.valueOf(gv6Var.f375556e));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mimeType: ");
            sb6.append(str);
            sb6.append(", getRecentUseApp: ");
            java.util.ArrayList arrayList = new java.util.ArrayList(hashMap2.size());
            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                arrayList.add(((java.lang.String) entry.getKey()) + "->" + ((java.lang.Number) entry.getValue()).longValue());
            }
            sb6.append(kz5.n0.g0(arrayList, ", ", null, null, 0, null, null, 62, null));
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", sb6.toString());
        }
        hashMap.putAll(hashMap2);
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(i17);
        kz5.g0.t(dataList, new com.tencent.mm.pluginsdk.ui.otherway.d0(new com.tencent.mm.pluginsdk.ui.otherway.g0(new com.tencent.mm.pluginsdk.ui.otherway.f0(new com.tencent.mm.pluginsdk.ui.otherway.e0(new com.tencent.mm.pluginsdk.ui.otherway.c0(Bi)), Bi), hashMap)));
    }
}
