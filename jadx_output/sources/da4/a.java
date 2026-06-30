package da4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f227768a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f227769b;

    public a(android.content.Context context, java.util.Map map) {
        java.lang.String str;
        int i17;
        java.lang.String d17;
        this.f227769b = new java.lang.ref.WeakReference(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (map.containsKey(".adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            if (map.containsKey(".RecXml.adxml.adCanvasInfo.adMarketJump.marketTag.marketSchema")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                str = ".RecXml.adxml.adCanvasInfo.adMarketJump.";
                i17 = 0;
                d17 = d(str.concat("marketTag"), 0);
                while (true) {
                    if (!map.containsKey(d17 + ".marketSchema") || i17 >= 20) {
                        break;
                    }
                    da4.d dVar = new da4.d();
                    dVar.f227776c = (java.lang.String) map.get(d17 + ".brand");
                    dVar.f227777d = (java.lang.String) map.get(d17 + ".appPackage");
                    dVar.f227778e = (java.lang.String) map.get(d17 + ".marketName");
                    dVar.f227775b = b(map, d17, "marketPackage");
                    dVar.f227774a = b(map, d17, "marketSchema");
                    a(dVar);
                    arrayList.add(dVar);
                    com.tencent.mars.xlog.Log.i("MICROMSG.AdAppMarketHelper", dVar.toString());
                    i17++;
                    d17 = d(str.concat("marketTag"), i17);
                }
                java.util.Collections.sort(arrayList, new da4.c());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                this.f227768a = arrayList;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyPrefix", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        str = ".adxml.adCanvasInfo.adMarketJump.";
        i17 = 0;
        d17 = d(str.concat("marketTag"), 0);
        while (true) {
            if (!map.containsKey(d17 + ".marketSchema")) {
                break;
            } else {
                break;
            }
            da4.d dVar2 = new da4.d();
            dVar2.f227776c = (java.lang.String) map.get(d17 + ".brand");
            dVar2.f227777d = (java.lang.String) map.get(d17 + ".appPackage");
            dVar2.f227778e = (java.lang.String) map.get(d17 + ".marketName");
            dVar2.f227775b = b(map, d17, "marketPackage");
            dVar2.f227774a = b(map, d17, "marketSchema");
            a(dVar2);
            arrayList.add(dVar2);
            com.tencent.mars.xlog.Log.i("MICROMSG.AdAppMarketHelper", dVar2.toString());
            i17++;
            d17 = d(str.concat("marketTag"), i17);
        }
        java.util.Collections.sort(arrayList, new da4.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        this.f227768a = arrayList;
    }

    public static boolean e(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                if (!android.text.TextUtils.isEmpty(intent.getAction()) && intent.getData() != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 6);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    return true;
                }
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("MICROMSG.AdAppMarketHelper", "isAppMarketIntentValid has something error");
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1958, 7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAppMarketIntentValid", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    public static boolean f(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (intent != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("brand_state", false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                return booleanExtra;
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("MICROMSG.AdAppMarketHelper", "setBrandState has something error");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBrandSuccess", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return false;
    }

    public static da4.a g(android.content.Context context, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            da4.a aVar = new da4.a(context, str, map);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return aVar;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(3:13|14|(10:16|(2:19|17)|20|21|22|4|5|6|7|8))|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        com.tencent.mars.xlog.Log.e("MICROMSG.AdAppMarketHelper", "report19790 exp:" + r8.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.util.Map r13) {
        /*
            java.lang.String r0 = "report19790"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "build19790ExtraInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            if (r13 == 0) goto L3e
            boolean r3 = r13.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L3e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Set r4 = r13.keySet()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3e
        L22:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r13.get(r5)     // Catch: java.lang.Throwable -> L3e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L3e
            goto L22
        L36:
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L43
        L3e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            java.lang.String r13 = ""
        L43:
            java.lang.String r2 = "MICROMSG.AdAppMarketHelper"
            java.lang.String r3 = "report19790 snsId="
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE     // Catch: java.lang.Throwable -> La3
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La3
            r6 = 0
            r5[r6] = r8     // Catch: java.lang.Throwable -> La3
            r6 = 1
            r5[r6] = r9     // Catch: java.lang.Throwable -> La3
            r6 = 2
            r5[r6] = r10     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> La3
            r7 = 3
            r5[r7] = r6     // Catch: java.lang.Throwable -> La3
            r6 = 4
            r5[r6] = r12     // Catch: java.lang.Throwable -> La3
            r6 = 5
            r5[r6] = r13     // Catch: java.lang.Throwable -> La3
            r6 = 19790(0x4d4e, float:2.7732E-41)
            r4.d(r6, r5)     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La3
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", uxInfo="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r9)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", adExtInfo ="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", actType ="
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r11)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", actValue = "
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r12)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = ", extInfo = "
            r4.append(r8)     // Catch: java.lang.Throwable -> La3
            r4.append(r13)     // Catch: java.lang.Throwable -> La3
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> La3
            com.tencent.mars.xlog.Log.i(r2, r8)     // Catch: java.lang.Throwable -> La3
            goto Lba
        La3:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "report19790 exp:"
            r9.<init>(r10)
            java.lang.String r8 = r8.toString()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.mars.xlog.Log.e(r2, r8)
        Lba:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da4.a.h(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.util.Map):void");
    }

    public final void a(da4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (dVar != null) {
            java.lang.String str = android.os.Build.BRAND;
            java.lang.String str2 = android.os.Build.MANUFACTURER;
            java.lang.String str3 = dVar.f227776c;
            dVar.f227779f = 2;
            if (!android.text.TextUtils.isEmpty(str3) && str != null) {
                java.lang.String lowerCase = str3.toLowerCase();
                java.lang.String lowerCase2 = str.toLowerCase();
                int i17 = 0;
                if (lowerCase.equals(lowerCase2)) {
                    dVar.f227779f = 0;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    if (str2 != null) {
                        java.lang.String lowerCase3 = lowerCase.toLowerCase();
                        java.lang.String lowerCase4 = str2.toLowerCase();
                        if (lowerCase3.equals(lowerCase4)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                        } else if (lowerCase3.contains(lowerCase4)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i17 = 1;
                        } else if (lowerCase4.contains(lowerCase3)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                            i17 = 2;
                        }
                        dVar.f227779f = i17;
                        if (i17 >= 2 && lowerCase.contains(lowerCase2)) {
                            dVar.f227779f = 1;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computePriorityWithManufacture", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
                    i17 = 3;
                    dVar.f227779f = i17;
                    if (i17 >= 2) {
                        dVar.f227779f = 1;
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeMarketNodePriority", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
    }

    public final java.util.List b(java.util.Map map, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        java.lang.String d17 = d(str + "." + str2, 0);
        while (map.containsKey(d17) && i17 < 10) {
            java.lang.String str3 = (java.lang.String) map.get(d17);
            if (!android.text.TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
            i17++;
            d17 = d(str + "." + str2, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return arrayList;
    }

    public final java.util.List c(org.json.JSONObject jSONObject, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(jSONArray.optString(i17, ""));
            }
        } else if (opt instanceof java.lang.String) {
            arrayList.add((java.lang.String) opt);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getElementList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return arrayList;
    }

    public final java.lang.String d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return str;
        }
        java.lang.String str2 = str + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNodeKey", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        return str2;
    }

    public android.content.Intent i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            android.content.Intent j17 = j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return j17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
    }

    public final android.content.Intent j() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.Context context;
        java.lang.String str4;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        android.content.Intent intent;
        android.content.Intent intent2;
        java.lang.String str11 = "screenIntentInner";
        java.lang.String str12 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("screenIntentInner", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        android.content.Context context2 = (android.content.Context) this.f227769b.get();
        java.lang.String str13 = "MICROMSG.AdAppMarketHelper";
        if (context2 == null) {
            com.tencent.mars.xlog.Log.w("MICROMSG.AdAppMarketHelper", "the context is null, activity is finished?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("screenIntentInner", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            return null;
        }
        java.util.List list = this.f227768a;
        if (list != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                java.lang.String str14 = "setBrandState";
                java.lang.String str15 = "whichPriorityIsSuccess";
                if (it6.hasNext()) {
                    da4.d dVar = (da4.d) it6.next();
                    if (dVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        android.content.pm.PackageManager packageManager = context2.getPackageManager();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        context = context2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        it = it6;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList = arrayList2;
                        java.util.List<java.lang.String> list2 = dVar.f227774a;
                        java.lang.String str16 = str11;
                        java.util.List list3 = dVar.f227775b;
                        if (list2 == null || list2.isEmpty()) {
                            str6 = str12;
                            str7 = str13;
                            str8 = "brand_state";
                            str9 = "setBrandState";
                            str10 = "whichPriorityIsSuccess";
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        } else {
                            str8 = "brand_state";
                            if (list3 == null || list3.isEmpty()) {
                                str6 = str12;
                                str7 = str13;
                                str9 = "setBrandState";
                                str10 = "whichPriorityIsSuccess";
                                for (java.lang.String str17 : list2) {
                                    java.lang.String str18 = dVar.f227777d;
                                    java.lang.String str19 = dVar.f227778e;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                    da4.b bVar = new da4.b(str17, "", str18, str19);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                    arrayList4.add(bVar);
                                }
                            } else {
                                java.util.Iterator it7 = list3.iterator();
                                while (it7.hasNext()) {
                                    java.util.Iterator it8 = it7;
                                    java.lang.String str20 = (java.lang.String) it7.next();
                                    for (java.lang.String str21 : list2) {
                                        java.lang.String str22 = str14;
                                        java.lang.String str23 = str12;
                                        java.lang.String str24 = dVar.f227777d;
                                        java.lang.String str25 = str15;
                                        java.lang.String str26 = dVar.f227778e;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                        java.lang.String str27 = str13;
                                        da4.b bVar2 = new da4.b(str21, str20, str24, str26);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIntentNode", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                        arrayList4.add(bVar2);
                                        str12 = str23;
                                        str14 = str22;
                                        str15 = str25;
                                        str13 = str27;
                                    }
                                    it7 = it8;
                                }
                                str6 = str12;
                                str7 = str13;
                                str9 = str14;
                                str10 = str15;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntentNodes", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        }
                        java.util.Iterator it9 = arrayList4.iterator();
                        while (it9.hasNext()) {
                            da4.b bVar3 = (da4.b) it9.next();
                            bVar3.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                            try {
                                intent2 = bVar3.a();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                            } catch (java.lang.Throwable unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AdAppMarketIntentNode", "there is something wrong in toIntent");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                                intent2 = null;
                            }
                            if (intent2 != null) {
                                arrayList3.add(intent2);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                        java.util.Iterator it10 = arrayList3.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                                intent = null;
                                break;
                            }
                            intent = (android.content.Intent) it10.next();
                            if (intent.resolveActivity(packageManager) != null) {
                                intent.putExtra("market_priority", dVar.f227779f);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("screenIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
                                break;
                            }
                        }
                        if (intent != null) {
                            java.lang.String str28 = str7;
                            com.tencent.mars.xlog.Log.i(str28, "screenIntentInner, useNode=" + dVar);
                            int i17 = dVar.f227779f;
                            java.lang.String str29 = str6;
                            java.lang.String str30 = str10;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str30, str29);
                            boolean z17 = i17 <= 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str30, str29);
                            java.lang.String str31 = str9;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str31, str29);
                            try {
                                intent.putExtra(str8, z17);
                            } catch (java.lang.Throwable unused2) {
                                com.tencent.mars.xlog.Log.w(str28, "setBrandState has something error");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str31, str29);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str16, str29);
                            return intent;
                        }
                        str5 = str16;
                        str3 = str6;
                        str4 = str7;
                    } else {
                        str3 = str12;
                        context = context2;
                        str4 = str13;
                        arrayList = arrayList2;
                        it = it6;
                        str5 = str11;
                    }
                    str13 = str4;
                    str12 = str3;
                    str11 = str5;
                    context2 = context;
                    it6 = it;
                    arrayList2 = arrayList;
                } else {
                    str = str11;
                    str2 = str12;
                    java.lang.String str32 = str13;
                    java.util.ArrayList arrayList5 = arrayList2;
                    if (!arrayList5.isEmpty()) {
                        com.tencent.mars.xlog.Log.e(str32, "--screenIntentInner, no tagNode match--");
                        da4.d dVar2 = (da4.d) arrayList5.get(0);
                        if (dVar2 != null) {
                            com.tencent.mars.xlog.Log.i(str32, "screenIntentInner, default");
                            android.content.Intent intent3 = new android.content.Intent();
                            java.lang.String str33 = dVar2.f227777d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTargetPkg", str2);
                            try {
                                if (!android.text.TextUtils.isEmpty(str33)) {
                                    intent3.putExtra("target_app_id", str33);
                                }
                            } catch (java.lang.Throwable unused3) {
                                com.tencent.mars.xlog.Log.w(str32, "setBrandState has something error");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTargetPkg", str2);
                            int i18 = dVar2.f227779f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("whichPriorityIsSuccess", str2);
                            boolean z18 = i18 <= 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("whichPriorityIsSuccess", str2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBrandState", str2);
                            try {
                                intent3.putExtra("brand_state", z18);
                            } catch (java.lang.Throwable unused4) {
                                com.tencent.mars.xlog.Log.w(str32, "setBrandState has something error");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBrandState", str2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                            return intent3;
                        }
                        com.tencent.mars.xlog.Log.w(str32, "screenIntentInner, null");
                    }
                }
            }
        } else {
            str = "screenIntentInner";
            str2 = "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return null;
    }

    public a(android.content.Context context, java.lang.String str, java.util.Map map) {
        this.f227769b = new java.lang.ref.WeakReference(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        java.lang.String d17 = d(str + "marketTag", 0);
        while (true) {
            if (!map.containsKey(d17 + ".marketSchema") || i17 >= 20) {
                break;
            }
            da4.d dVar = new da4.d();
            dVar.f227776c = (java.lang.String) map.get(d17 + ".brand");
            dVar.f227777d = (java.lang.String) map.get(d17 + ".appPackage");
            dVar.f227778e = (java.lang.String) map.get(d17 + ".marketName");
            dVar.f227775b = b(map, d17, "marketPackage");
            dVar.f227774a = b(map, d17, "marketSchema");
            a(dVar);
            arrayList.add(dVar);
            i17++;
            d17 = d(str + "marketTag", i17);
        }
        java.util.Collections.sort(arrayList, new da4.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        this.f227768a = arrayList;
    }

    public a(android.content.Context context, org.json.JSONArray jSONArray) {
        this.f227769b = new java.lang.ref.WeakReference(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            try {
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    if (jSONObject != null) {
                        da4.d dVar = new da4.d();
                        dVar.f227776c = jSONObject.optString("brand", "");
                        dVar.f227777d = jSONObject.optString("appPackage", "");
                        dVar.f227778e = jSONObject.optString("marketName", "");
                        dVar.f227775b = c(jSONObject, "marketPackage");
                        dVar.f227774a = c(jSONObject, "marketSchema");
                        a(dVar);
                        arrayList.add(dVar);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        this.f227768a = arrayList;
    }

    public a(android.content.Context context, r45.m3 m3Var) {
        java.util.LinkedList linkedList;
        this.f227769b = new java.lang.ref.WeakReference(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m3Var != null && (linkedList = m3Var.f380108d) != null && !linkedList.isEmpty()) {
            try {
                int min = java.lang.Math.min(linkedList.size(), 20);
                for (int i17 = 0; i17 < min; i17++) {
                    r45.qi4 qi4Var = (r45.qi4) linkedList.get(i17);
                    if (qi4Var != null) {
                        java.util.LinkedList linkedList2 = qi4Var.f384021e;
                        java.util.LinkedList linkedList3 = qi4Var.f384022f;
                        da4.d dVar = new da4.d();
                        dVar.f227776c = qi4Var.f384020d;
                        dVar.f227777d = qi4Var.f384023g;
                        dVar.f227778e = qi4Var.f384024h;
                        dVar.f227775b = linkedList3 == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedList3);
                        dVar.f227774a = linkedList2 == null ? new java.util.ArrayList() : new java.util.ArrayList(linkedList2);
                        a(dVar);
                        arrayList.add(dVar);
                        com.tencent.mars.xlog.Log.i("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb, tagNode=" + dVar);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb exp=" + th6.toString());
            }
            java.util.Collections.sort(arrayList, new da4.c());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } else {
            com.tencent.mars.xlog.Log.e("MICROMSG.AdAppMarketHelper", "createMarketTagList from pb, adMarketJump or market_tag is null/empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMarketTagList", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        }
        this.f227768a = arrayList;
    }
}
