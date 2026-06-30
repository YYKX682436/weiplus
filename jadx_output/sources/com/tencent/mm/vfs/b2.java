package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.b2 f212807a = new com.tencent.mm.vfs.b2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f212808b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f212809c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f212810d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f212811e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f212812f;

    static {
        int length = com.tencent.mm.vfs.l2.f213044c.length;
        int length2 = com.tencent.mm.vfs.l2.f213045d.length;
        int length3 = com.tencent.mm.vfs.l2.f213048g.length;
        int length4 = com.tencent.mm.vfs.l2.f213049h.length;
        int length5 = com.tencent.mm.vfs.l2.f213051j.length;
        int length6 = com.tencent.mm.vfs.l2.f213052k.length;
        f212808b = new java.util.LinkedHashMap();
        f212809c = new java.util.LinkedHashMap();
        f212810d = new java.util.ArrayList();
        f212811e = new java.util.ArrayList();
        com.tencent.mm.vfs.FastList.Tagger tagger = new com.tencent.mm.vfs.FastList.Tagger();
        tagger.orTag = 3;
        jz5.l lVar = new jz5.l("/", tagger);
        com.tencent.mm.vfs.FastList.Tagger tagger2 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger2.skip = true;
        jz5.l lVar2 = new jz5.l("${data}/lib", tagger2);
        com.tencent.mm.vfs.FastList.Tagger tagger3 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger3.skip = true;
        jz5.l lVar3 = new jz5.l("${data}/code_cache", tagger3);
        com.tencent.mm.vfs.FastList.Tagger tagger4 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger4.orTag = 0;
        tagger4.depth = 1;
        jz5.l lVar4 = new jz5.l("${data}/MicroMsg", tagger4);
        com.tencent.mm.vfs.FastList.Tagger tagger5 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger5.orTag = 0;
        tagger5.depth = 1;
        jz5.l lVar5 = new jz5.l("${data}/files", tagger5);
        com.tencent.mm.vfs.FastList.Tagger tagger6 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger6.orTag = 0;
        tagger6.depth = 1;
        jz5.l lVar6 = new jz5.l("${extData}", tagger6);
        com.tencent.mm.vfs.FastList.Tagger tagger7 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger7.orTag = 0;
        tagger7.depth = 1;
        jz5.l lVar7 = new jz5.l("${extData}/MicroMsg", tagger7);
        com.tencent.mm.vfs.FastList.Tagger tagger8 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger8.orTag = 3;
        tagger8.depth = 1;
        com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern = new com.tencent.mm.vfs.FastList.TaggerPattern();
        taggerPattern.pattern = "account.bin";
        taggerPattern.orTag = 0;
        tagger8.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern};
        jz5.l lVar8 = new jz5.l("${data}", tagger8);
        com.tencent.mm.vfs.FastList.Tagger tagger9 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger9.orTag = 0;
        tagger9.depth = 1;
        com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern2 = new com.tencent.mm.vfs.FastList.TaggerPattern();
        taggerPattern2.pattern = "PreDownloadCheck.db*";
        taggerPattern2.orTag = 3;
        tagger9.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern2};
        jz5.l lVar9 = new jz5.l("${data}/MicroMsg/${account}", tagger9);
        com.tencent.mm.vfs.FastList.Tagger tagger10 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger10.orTag = 1;
        jz5.l lVar10 = new jz5.l("${data}/MicroMsg/${accountAllOther}", tagger10);
        com.tencent.mm.vfs.FastList.Tagger tagger11 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger11.orTag = 1;
        jz5.l lVar11 = new jz5.l("${extData}/MicroMsg/${accountAllOther}", tagger11);
        com.tencent.mm.vfs.FastList.Tagger tagger12 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger12.orTag = 2;
        jz5.l lVar12 = new jz5.l("${data}/MicroMsg/CheckResUpdate", tagger12);
        com.tencent.mm.vfs.FastList.Tagger tagger13 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger13.orTag = 2;
        jz5.l lVar13 = new jz5.l("${sdTo}/MicroMsg/CheckResUpdate", tagger13);
        com.tencent.mm.vfs.FastList.Tagger tagger14 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger14.orTag = 2;
        jz5.l lVar14 = new jz5.l("${data}/files/public/maas-sdk", tagger14);
        com.tencent.mm.vfs.FastList.Tagger tagger15 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger15.orTag = 2;
        jz5.l lVar15 = new jz5.l("${data}/files/public/live", tagger15);
        com.tencent.mm.vfs.FastList.Tagger tagger16 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger16.orTag = 2;
        jz5.l lVar16 = new jz5.l("${data}/files/XNetLib", tagger16);
        com.tencent.mm.vfs.FastList.Tagger tagger17 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger17.orTag = 24;
        jz5.l lVar17 = new jz5.l("${data}/tinker", tagger17);
        com.tencent.mm.vfs.FastList.Tagger tagger18 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger18.orTag = 25;
        jz5.l lVar18 = new jz5.l("${sdTo}/MicroMsg/${account}/MassSendImg", tagger18);
        com.tencent.mm.vfs.FastList.Tagger tagger19 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger19.orTag = 3;
        jz5.l lVar19 = new jz5.l("${dataCache}", tagger19);
        com.tencent.mm.vfs.FastList.Tagger tagger20 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger20.orTag = 3;
        jz5.l lVar20 = new jz5.l("${extCache}", tagger20);
        com.tencent.mm.vfs.FastList.Tagger tagger21 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger21.orTag = 0;
        jz5.l lVar21 = new jz5.l("${data}/.vfs", tagger21);
        com.tencent.mm.vfs.FastList.Tagger tagger22 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger22.orTag = 0;
        jz5.l lVar22 = new jz5.l("${data}/.auth_cache", tagger22);
        com.tencent.mm.vfs.FastList.Tagger tagger23 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger23.orTag = 0;
        jz5.l lVar23 = new jz5.l("${data}/MicroMsg/last_avatar_dir", tagger23);
        com.tencent.mm.vfs.FastList.Tagger tagger24 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger24.orTag = 0;
        jz5.l lVar24 = new jz5.l("${data}/app_lib", tagger24);
        com.tencent.mm.vfs.FastList.Tagger tagger25 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger25.orTag = 0;
        jz5.l lVar25 = new jz5.l("${data}/app_dex", tagger25);
        com.tencent.mm.vfs.FastList.Tagger tagger26 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger26.orTag = 0;
        jz5.l lVar26 = new jz5.l("${data}/app_recover_lib", tagger26);
        com.tencent.mm.vfs.FastList.Tagger tagger27 = new com.tencent.mm.vfs.FastList.Tagger();
        tagger27.orTag = 0;
        f212812f = kz5.c0.i(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25, lVar26, new jz5.l("${data}/MicroMsg/recovery", tagger27));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.vfs.y1 c(java.util.List r24, com.tencent.wcdb.support.CancellationSignal r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.b2.c(java.util.List, com.tencent.wcdb.support.CancellationSignal, boolean):com.tencent.mm.vfs.y1");
    }

    public static final void e(int i17, java.util.Map map, yz5.r rVar, java.util.ArrayList arrayList, java.util.Map map2, q26.n nVar, java.util.Map map3) {
        com.tencent.mm.vfs.FileSystem fileSystem;
        java.util.Iterator it = nVar.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            if ((intValue & 4095) == i17 && (fileSystem = (com.tencent.mm.vfs.FileSystem) map.get(str)) != null) {
                com.tencent.mm.vfs.b2 b2Var = f212807a;
                java.lang.Object b17 = fileSystem.b(map3);
                kotlin.jvm.internal.o.f(b17, "configure(...)");
                java.util.List b18 = b2Var.b((com.tencent.mm.vfs.q2) b17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : b18) {
                    if (rVar == null || ((java.lang.Boolean) rVar.C(str, java.lang.Integer.valueOf(intValue), map3, (java.lang.String) obj)).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    arrayList.add(new jz5.l((java.lang.String) it6.next(), map2.get(str)));
                }
            }
        }
    }

    public static final java.lang.Iterable g(boolean z17, com.tencent.mm.vfs.l6 l6Var) {
        java.lang.Object[] objArr;
        char c17;
        java.util.List b17 = com.tencent.mm.vfs.q7.b(true);
        java.util.Map h17 = f212807a.h(b17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 0;
        java.util.TreeMap treeMap = new java.util.TreeMap();
        kz5.c1.p(treeMap, new jz5.l[0]);
        java.lang.Object obj = ((java.util.HashMap) h17).get("account");
        int i18 = 2;
        java.util.List list = f212810d;
        java.util.Iterator it = java.util.Arrays.asList(f212811e, list).iterator();
        pm5.h hVar = pm5.i.f356903e;
        pm5.c cVar = new pm5.c(it, hVar);
        while (cVar.hasNext()) {
            jz5.l lVar = (jz5.l) cVar.next();
            java.lang.String[] b18 = new com.tencent.mm.vfs.f1((java.lang.String) lVar.f302833d).b(h17);
            if (b18 != null) {
                int length = b18.length;
                int i19 = i17;
                while (i19 < length) {
                    treeMap.put(b18[i19], lVar.f302834e);
                    i19++;
                    i17 = 0;
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) f212808b;
        pm5.c cVar2 = new pm5.c(java.util.Arrays.asList(((java.util.LinkedHashMap) f212809c).entrySet(), linkedHashMap2.entrySet()).iterator(), hVar);
        while (cVar2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) cVar2.next();
            com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) com.tencent.mm.vfs.a3.f212781a.e().get(entry.getKey());
            if (fileSystem != null) {
                java.lang.Integer num = (java.lang.Integer) com.tencent.mm.vfs.l2.f213042a.get(entry.getKey());
                if (num == null) {
                    num = (java.lang.Integer) entry.getValue();
                }
                kotlin.jvm.internal.o.d(num);
                int intValue = num.intValue();
                java.lang.Object key = entry.getKey();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object b19 = fileSystem.b(h17);
                kotlin.jvm.internal.o.f(b19, "configure(...)");
                linkedHashMap.put(key, new com.tencent.mm.vfs.m6(intValue, str, (com.tencent.mm.vfs.q2) b19));
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap(h17);
        java.util.Iterator it6 = ((java.util.ArrayList) b17).iterator();
        while (it6.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it6.next();
            if (!kotlin.jvm.internal.o.b(pair.first, obj)) {
                hashMap.put("account", pair.first);
                hashMap.put("accountSalt", pair.second);
                if (kotlin.jvm.internal.o.b(pair.first, pair.second)) {
                    objArr = new java.lang.String[]{pair.first};
                } else {
                    objArr = new java.lang.String[i18];
                    objArr[0] = pair.first;
                    objArr[1] = pair.second;
                }
                hashMap.put("accountSd", objArr);
                java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
                while (true) {
                    c17 = '-';
                    if (!it7.hasNext()) {
                        break;
                    }
                    jz5.l lVar2 = (jz5.l) it7.next();
                    java.lang.String str2 = ((java.lang.String) lVar2.f302834e) + '-' + ((java.lang.String) pair.first);
                    java.lang.String[] b27 = new com.tencent.mm.vfs.f1((java.lang.String) lVar2.f302833d).b(hashMap);
                    if (b27 != null) {
                        int length2 = b27.length;
                        int i27 = 0;
                        while (i27 < length2) {
                            treeMap.put(b27[i27], str2);
                            i27++;
                            it6 = it6;
                        }
                    }
                    it6 = it6;
                }
                java.util.Iterator it8 = it6;
                for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    java.lang.String str3 = ((java.lang.String) entry2.getKey()) + c17 + ((java.lang.String) pair.first);
                    com.tencent.mm.vfs.FileSystem fileSystem2 = (com.tencent.mm.vfs.FileSystem) com.tencent.mm.vfs.a3.f212781a.e().get(entry2.getKey());
                    if (fileSystem2 != null) {
                        int intValue2 = ((java.lang.Number) entry2.getValue()).intValue();
                        java.lang.String str4 = (java.lang.String) entry2.getKey();
                        java.lang.Object b28 = fileSystem2.b(hashMap);
                        kotlin.jvm.internal.o.f(b28, "configure(...)");
                        linkedHashMap.put(str3, new com.tencent.mm.vfs.m6(intValue2, str4, (com.tencent.mm.vfs.q2) b28));
                        c17 = '-';
                    }
                }
                it6 = it8;
                i18 = 2;
            }
        }
        int i28 = 0;
        java.util.TreeMap treeMap2 = new java.util.TreeMap();
        kz5.c1.p(treeMap2, new jz5.l[0]);
        java.util.TreeMap treeMap3 = new java.util.TreeMap();
        kz5.c1.p(treeMap3, new jz5.l[0]);
        java.lang.String[] strArr = com.tencent.mm.vfs.l2.f213044c;
        int length3 = strArr.length;
        int i29 = 0;
        int i37 = 0;
        while (i29 < length3) {
            java.lang.String str5 = strArr[i29];
            int i38 = i37 + 1;
            int i39 = com.tencent.mm.vfs.l2.f213045d[i37];
            java.lang.String[] b29 = new com.tencent.mm.vfs.f1(str5).b(h17);
            if (b29 != null) {
                for (java.lang.String str6 : b29) {
                    treeMap2.put(str6, java.lang.Integer.valueOf(i39));
                }
            }
            i29++;
            i37 = i38;
        }
        java.lang.String[] strArr2 = com.tencent.mm.vfs.l2.f213048g;
        int length4 = strArr2.length;
        int i47 = 0;
        int i48 = 0;
        while (i47 < length4) {
            java.lang.String str7 = strArr2[i47];
            int i49 = i48 + 1;
            yz5.p pVar = com.tencent.mm.vfs.l2.f213049h[i48];
            java.lang.String[] b37 = new com.tencent.mm.vfs.f1(str7).b(h17);
            if (b37 != null) {
                for (java.lang.String str8 : b37) {
                    treeMap3.put(str8, pVar);
                }
            }
            i47++;
            i48 = i49;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String[] strArr3 = com.tencent.mm.vfs.l2.f213051j;
        int length5 = strArr3.length;
        int i57 = 0;
        while (i28 < length5) {
            hashMap2.put(strArr3[i28], com.tencent.mm.vfs.l2.f213052k[i57]);
            i28++;
            i57++;
        }
        if (kotlin.jvm.internal.o.b(j62.e.g().a("clicfg_clean_enable_donotclean", "1", true, true), "1")) {
            for (java.util.Map.Entry entry3 : com.tencent.mm.vfs.e7.f212914d.entrySet()) {
                java.lang.String str9 = (java.lang.String) entry3.getKey();
                java.util.List list2 = (java.util.List) entry3.getValue();
                hashMap2.get(str9);
                hashMap2.put(str9, new com.tencent.mm.vfs.u5(list2));
            }
        }
        return new pm5.b(com.tencent.mm.vfs.l2.f213043b, new com.tencent.mm.vfs.a2(h17, treeMap2, treeMap3, new com.tencent.mm.vfs.g6(linkedHashMap, treeMap, treeMap2, treeMap3, hashMap2, z17, l6Var)));
    }

    public static final java.lang.String i(long j17) {
        java.lang.String str;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(j17));
        com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("xlogPrivate");
        if (b17 == null || (str = b17.D("", false)) == null) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getPath() + "/xlog";
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.vfs.FastList.Tagger tagger = new com.tencent.mm.vfs.FastList.Tagger();
        tagger.path = str;
        tagger.andTag = -1;
        tagger.orTag = 0;
        com.tencent.mm.vfs.FastList.TaggerPattern taggerPattern = new com.tencent.mm.vfs.FastList.TaggerPattern();
        taggerPattern.pattern = "*_" + format + ".xlog";
        taggerPattern.orTag = 0;
        tagger.patterns = new com.tencent.mm.vfs.FastList.TaggerPattern[]{taggerPattern};
        com.tencent.mm.vfs.l2.f213061t = kz5.b0.c(tagger);
        com.tencent.mm.vfs.l2.f213060s = format;
        kotlin.jvm.internal.o.d(format);
        return format;
    }

    public final java.lang.String a(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            kotlin.jvm.internal.o.d(canonicalPath);
            return canonicalPath;
        } catch (java.io.IOException unused) {
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.o.d(absolutePath);
            return absolutePath;
        }
    }

    public final java.util.List b(com.tencent.mm.vfs.q2 q2Var) {
        if (q2Var instanceof com.tencent.mm.vfs.h4) {
            java.util.List singletonList = java.util.Collections.singletonList(((com.tencent.mm.vfs.h4) q2Var).f212975e);
            kotlin.jvm.internal.o.f(singletonList, "singletonList(...)");
            return singletonList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.vfs.q2 q2Var2 : com.tencent.mm.vfs.e8.c(q2Var, null)) {
            if (q2Var2 instanceof com.tencent.mm.vfs.h4) {
                arrayList.add(((com.tencent.mm.vfs.h4) q2Var2).f212975e);
            }
        }
        return arrayList;
    }

    public final java.util.List d(java.util.List list, java.util.List list2, java.util.Map map) {
        com.tencent.mm.vfs.FastList.TaggerPattern[] taggerPatternArr;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            java.lang.String[] b17 = new com.tencent.mm.vfs.f1((java.lang.String) lVar.f302833d).b(map);
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    com.tencent.mm.vfs.FastList.Tagger tagger = (com.tencent.mm.vfs.FastList.Tagger) lVar.f302834e;
                    com.tencent.mm.vfs.FastList.Tagger tagger2 = new com.tencent.mm.vfs.FastList.Tagger();
                    com.tencent.mm.vfs.b2 b2Var = f212807a;
                    kotlin.jvm.internal.o.d(str);
                    tagger2.path = b2Var.a(str);
                    tagger2.skip = tagger.skip;
                    tagger2.andTag = tagger.andTag;
                    tagger2.orTag = tagger.orTag;
                    tagger2.depth = tagger.depth;
                    com.tencent.mm.vfs.FastList.TaggerPattern[] taggerPatternArr2 = tagger.patterns;
                    if (taggerPatternArr2 != null) {
                        java.lang.Object[] copyOf = java.util.Arrays.copyOf(taggerPatternArr2, taggerPatternArr2.length);
                        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                        taggerPatternArr = (com.tencent.mm.vfs.FastList.TaggerPattern[]) copyOf;
                    } else {
                        taggerPatternArr = null;
                    }
                    tagger2.patterns = taggerPatternArr;
                    list.add(tagger2);
                }
            }
        }
        return list;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.tencent.mm.vfs.l2.f213054m);
        java.util.List list = com.tencent.mm.vfs.l2.f213056o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jz5.l("XWebEngine", (java.lang.String) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (!com.tencent.mm.vfs.l2.f213064w) {
            arrayList.add(new jz5.l("PublicResource", "maas-sdk"));
        }
        return arrayList;
    }

    public final java.util.Map h(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap(com.tencent.mm.vfs.a3.f212781a.c());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.Object first = pair.first;
            kotlin.jvm.internal.o.f(first, "first");
            linkedHashSet.add(first);
            java.lang.Object second = pair.second;
            kotlin.jvm.internal.o.f(second, "second");
            linkedHashSet.add(second);
        }
        kotlin.jvm.internal.m0.a(linkedHashSet).remove(com.tencent.mm.vfs.e8.e(hashMap, "account"));
        kotlin.jvm.internal.m0.a(linkedHashSet).remove(com.tencent.mm.vfs.e8.e(hashMap, "accountSalt"));
        linkedHashSet.remove("ee1da3ae2100e09165c2e52382cfe79f");
        hashMap.put("accountAllOther", linkedHashSet.toArray(new java.lang.String[0]));
        hashMap.put("xwebKeepOld", com.tencent.mm.vfs.l2.f213055n.toArray(new java.lang.String[0]));
        return hashMap;
    }

    public final int j(int i17, boolean z17) {
        int i18;
        if (z17) {
            if ((i17 & 65536) != 0 || (i18 = i17 & 4095) == 1 || i18 == 12 || i18 == 13) {
                return 1;
            }
            return i18 + 3;
        }
        int i19 = i17 & 4095;
        if (i19 == 1) {
            return 27;
        }
        if (i19 == 12) {
            return 28;
        }
        if (i19 == 13) {
            return 29;
        }
        if ((i17 & 65536) != 0) {
            return 0;
        }
        return i19 + 3;
    }
}
