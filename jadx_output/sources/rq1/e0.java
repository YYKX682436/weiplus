package rq1;

/* loaded from: classes12.dex */
public abstract class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static short[][] f398731c;

    /* renamed from: d, reason: collision with root package name */
    public static int[][] f398732d;

    /* renamed from: e, reason: collision with root package name */
    public static int[][] f398733e;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f398729a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f398730b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f398734f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f398735g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f398736h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static int f398737i = 400;

    /* renamed from: j, reason: collision with root package name */
    public static int f398738j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.HashSet f398739k = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f398740l = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Runnable f398741m = new rq1.z();

    /* renamed from: n, reason: collision with root package name */
    public static final int f398742n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static int f398743o = 0;

    public static int a(java.lang.String str) {
        int i17 = 0;
        for (int i18 = 0; i18 < str.length(); i18++) {
            i17 = (i17 * 131) + ((short) str.charAt(i18));
        }
        return Integer.MAX_VALUE & i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0135, code lost:
    
        if (r9 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(boolean r16) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rq1.e0.b(boolean):int");
    }

    public static int c() {
        com.tencent.mm.vfs.z7 z7Var;
        java.lang.String d17 = d();
        if (!com.tencent.mm.vfs.w6.j(d17 + "/config.conf")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[getCurrentWordBankVersion] config.conf NOT exist, path: %s", d17 + "/config.conf");
            return 1;
        }
        java.io.InputStream inputStream = null;
        com.tencent.mm.vfs.z7 a17 = d17 == null ? null : com.tencent.mm.vfs.z7.a(d17);
        if (a17 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("config.conf", false, false), null, null);
        } else {
            z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/config.conf", false, false), a17.f213280g, a17.f213281h);
        }
        java.util.Properties properties = new java.util.Properties();
        try {
            try {
                inputStream = com.tencent.mm.vfs.w6.D(z7Var, com.tencent.mm.vfs.a3.f212781a.m(z7Var, null));
                properties.load(inputStream);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e17, "[getCurrentWordBankVersion]", new java.lang.Object[0]);
            }
            return java.lang.Integer.parseInt(properties.getProperty("version", java.lang.String.valueOf(1)).trim());
        } finally {
            com.tencent.mm.vfs.e8.d(inputStream);
        }
    }

    public static java.lang.String d() {
        return com.tencent.mm.plugin.websearch.l2.g(2).l() + "/wordBankDir";
    }

    public static java.lang.String e(boolean z17) {
        return new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(d()), z17 ? "fs_kw_main.txt" : "wordBank_Weight_1").o();
    }

    public static java.util.LinkedList f(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] text is null.");
            return linkedList;
        }
        if (f398730b.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] wordBank is loading, Give UP searching");
            return linkedList;
        }
        if (!f398729a.get() || f398731c == null || f398732d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] wordBank has NOT init");
            return linkedList;
        }
        if (str.length() < f398736h || str.length() > f398737i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] text.length(%s) is NOT in range [%s, %s]", java.lang.Integer.valueOf(str.length()), java.lang.Integer.valueOf(f398736h), java.lang.Integer.valueOf(f398737i));
            return linkedList;
        }
        int length = str.length();
        for (int i17 = 0; i17 < str.length() - 1; i17++) {
            int hashCode = str.substring(i17, i17 + 2).hashCode();
            short[][] sArr = f398731c;
            int length2 = hashCode % sArr.length;
            short[] sArr2 = sArr[length2];
            int[] iArr = f398732d[length2];
            int[] iArr2 = f398733e[length2];
            int length3 = sArr2.length;
            if (length3 > 200) {
                java.util.LinkedList linkedList2 = (java.util.LinkedList) f398734f.get(java.lang.Integer.valueOf(length2));
                if (linkedList2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] hashConflictHandler.get(%d) == null", java.lang.Integer.valueOf(length2));
                    return null;
                }
                java.util.Iterator it = linkedList2.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Integer) it.next()).intValue();
                    short s17 = sArr2[i18];
                    if (i17 + s17 > length) {
                        break;
                    }
                    java.lang.String substring = str.substring(i17, s17 + i17);
                    int a17 = a(substring);
                    int i19 = intValue + i18;
                    int i27 = i19 - 1;
                    while (true) {
                        if (i18 > i27) {
                            break;
                        }
                        int i28 = (i18 + i27) / 2;
                        int i29 = iArr[i28];
                        if (a17 == i29) {
                            r45.gb7 gb7Var = new r45.gb7();
                            gb7Var.f375076d = substring;
                            gb7Var.f375077e = iArr2[i28];
                            linkedList.add(gb7Var);
                            break;
                        }
                        if (a17 < i29) {
                            i27 = i28 - 1;
                        } else {
                            i18 = i28 + 1;
                        }
                    }
                    i18 = i19;
                }
            } else {
                for (int i37 = 0; i37 < length3; i37++) {
                    short s18 = sArr2[i37];
                    if (i17 + s18 > length) {
                        break;
                    }
                    java.lang.String substring2 = str.substring(i17, s18 + i17);
                    if (a(substring2) == iArr[i37]) {
                        r45.gb7 gb7Var2 = new r45.gb7();
                        gb7Var2.f375076d = substring2;
                        gb7Var2.f375077e = iArr2[i37];
                        linkedList.add(gb7Var2);
                    }
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static int g(java.lang.String str) {
        com.tencent.mm.vfs.u6 u6Var;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file do NOT exist, path: %s", str);
            return -2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file %s %s", str, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f398730b;
        boolean z17 = 1;
        atomicBoolean.set(true);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = f398729a;
        int i17 = 0;
        atomicBoolean2.set(false);
        long c17 = c01.id.c();
        int k17 = (int) com.tencent.mm.vfs.w6.k(str);
        int i18 = 24;
        if (k17 < 24) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] bytes.length(%s) < 24", java.lang.Integer.valueOf(k17));
            return k17 == 0 ? -4 : -3;
        }
        com.tencent.mm.vfs.u6 u6Var2 = null;
        try {
            try {
                u6Var = new com.tencent.mm.vfs.u6(str);
            } catch (java.lang.Throwable th6) {
                th = th6;
                u6Var = null;
            }
        } catch (java.io.IOException e17) {
            e = e17;
        }
        try {
            byte[] bArr = new byte[k17];
            u6Var.read(bArr);
            int i19 = 16;
            f398735g = ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
            f398736h = ((bArr[4] & 255) << 24) + ((bArr[5] & 255) << 16) + ((bArr[6] & 255) << 8) + (bArr[7] & 255);
            f398737i = ((bArr[8] & 255) << 24) + ((bArr[9] & 255) << 16) + ((bArr[10] & 255) << 8) + (bArr[11] & 255);
            f398738j = ((bArr[12] & 255) << 24) + ((bArr[13] & 255) << 16) + ((bArr[14] & 255) << 8) + (bArr[15] & 255);
            int i27 = ((bArr[16] & 255) << 24) + ((bArr[17] & 255) << 16) + ((bArr[18] & 255) << 8);
            f398743o = 20;
            int i28 = i27 + (bArr[19] & 255);
            if (i28 != 20003) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file broken, wordGroupC: %s, reCreate model", java.lang.Integer.valueOf(i28));
                i(u6Var);
                return -3;
            }
            int i29 = ((k17 - 20) - (i28 * 4)) / 7;
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordCntAvailable = %s", java.lang.Integer.valueOf(i29));
            f398731c = new short[i28];
            f398732d = new int[i28];
            f398733e = new int[i28];
            int i37 = 0;
            int i38 = 0;
            while (i37 < i28) {
                int i39 = f398743o;
                int i47 = i39 + 1;
                int i48 = (bArr[i39] & 255) << i18;
                int i49 = i47 + 1;
                int i57 = i49 + 1;
                int i58 = i48 + ((bArr[i47] & 255) << i19) + ((bArr[i49] & 255) << 8);
                f398743o = i57 + 1;
                int i59 = i58 + (bArr[i57] & 255);
                i38 += i59;
                if (i38 > i29) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[i17] = java.lang.Integer.valueOf(i38);
                    objArr[z17] = java.lang.Integer.valueOf(i29);
                    com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] currCnt(%s) > wordCntAvailable(%s)", objArr);
                    i(u6Var);
                    return -3;
                }
                f398731c[i37] = new short[i59];
                f398732d[i37] = new int[i59];
                f398733e[i37] = new int[i59];
                int i66 = i17;
                while (i66 < i59) {
                    short[] sArr = f398731c[i37];
                    int i67 = f398743o;
                    int i68 = i67 + 1;
                    int i69 = (bArr[i67] << 8) & 255;
                    int i76 = i68 + 1;
                    sArr[i66] = (short) (i69 + (bArr[i68] & 255));
                    int[] iArr = f398732d[i37];
                    int i77 = i76 + 1;
                    int i78 = i77 + 1;
                    int i79 = ((bArr[i76] & 255) << 24) + ((bArr[i77] & 255) << 16);
                    int i86 = i78 + 1;
                    int i87 = i29;
                    int i88 = i86 + 1;
                    iArr[i66] = i79 + ((bArr[i78] & 255) << 8) + (bArr[i86] & 255);
                    int[] iArr2 = f398733e[i37];
                    f398743o = i88 + 1;
                    iArr2[i66] = bArr[i88] & 255;
                    i66++;
                    i29 = i87;
                }
                int i89 = i29;
                if (i59 > 200) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    short s17 = f398731c[i37][0];
                    int i96 = 1;
                    for (int i97 = 1; i97 < i59; i97++) {
                        if (f398731c[i37][i97] != s17) {
                            linkedList.addLast(java.lang.Integer.valueOf(i96));
                            s17 = f398731c[i37][i97];
                            i96 = 1;
                        } else {
                            i96++;
                        }
                    }
                    linkedList.addLast(java.lang.Integer.valueOf(i96));
                    f398734f.put(java.lang.Integer.valueOf(i37), linkedList);
                }
                i37++;
                i18 = 24;
                i19 = 16;
                i29 = i89;
                z17 = 1;
                i17 = 0;
            }
            atomicBoolean2.set(z17);
            atomicBoolean.set(false);
            long ceil = (long) java.lang.Math.ceil(c01.id.c() - c17);
            com.tencent.mm.autogen.mmdata.rpt.WordDictBuildReportStruct wordDictBuildReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WordDictBuildReportStruct();
            wordDictBuildReportStruct.f62984d = i38;
            wordDictBuildReportStruct.f62985e = ceil;
            wordDictBuildReportStruct.f62986f = 2L;
            wordDictBuildReportStruct.k();
            su4.k3.m(wordDictBuildReportStruct);
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] load model from disk use %s ms, total cnt = %s", java.lang.Long.valueOf(ceil), java.lang.Integer.valueOf(i38));
            i(u6Var);
            return 0;
        } catch (java.io.IOException e18) {
            e = e18;
            u6Var2 = u6Var;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e, "", new java.lang.Object[0]);
            i(u6Var2);
            return -5;
        } catch (java.lang.Throwable th7) {
            th = th7;
            i(u6Var);
            throw th;
        }
    }

    public static void h(byte[] bArr) {
        try {
            r45.wj5 wj5Var = (r45.wj5) new r45.wj5().parseFrom(bArr);
            f398735g = wj5Var.f389222d;
            r45.hb7 hb7Var = wj5Var.f389225g;
            int i17 = hb7Var.f376029d;
            java.util.HashSet hashSet = f398739k;
            hashSet.clear();
            hashSet.addAll(hb7Var.f376030e);
            r45.hb7 hb7Var2 = wj5Var.f389224f;
            int i18 = hb7Var2.f376029d;
            java.util.HashSet hashSet2 = f398740l;
            hashSet2.clear();
            java.util.LinkedList linkedList = hb7Var2.f376031f;
            if (linkedList.size() > 0) {
                hashSet2.addAll(linkedList);
            } else {
                java.util.Iterator it = hb7Var2.f376030e.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    r45.gb7 gb7Var = new r45.gb7();
                    gb7Var.f375076d = str;
                    gb7Var.f375077e = 255;
                    hashSet2.add(gb7Var);
                }
            }
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                r45.gb7 gb7Var2 = (r45.gb7) it6.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[white word]: %s %s", gb7Var2.f375076d, java.lang.Integer.valueOf(gb7Var2.f375077e));
            }
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[black word]: %s", (java.lang.String) it7.next());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "realTimeWordsVersion: %s, blackVer: %s whiteVer: %s minMatchLen: %s, maxMatchLen: %s, disable: %s, blackList.size: %s, whiteList.size: %s", java.lang.Integer.valueOf(f398735g), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f398736h), java.lang.Integer.valueOf(f398737i), java.lang.Integer.valueOf(f398738j), java.lang.Integer.valueOf(hashSet.size()), java.lang.Integer.valueOf(hashSet2.size()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e17, "[resolveRealTimeWordBankFile]", new java.lang.Object[0]);
        }
    }

    public static void i(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static int j(java.lang.String str) {
        java.lang.String d17 = d();
        if (com.tencent.mm.vfs.w6.j(d17)) {
            com.tencent.mm.vfs.w6.f(d17);
        }
        com.tencent.mm.vfs.w6.u(d17);
        int Q = com.tencent.mm.vfs.w6.Q(str, d17);
        if (Q >= 0) {
            com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE.moveTextFile();
            com.tencent.mars.xlog.Log.i("MicroMsg.HotWordSearchUtil", "[updateWordBank] unzip success, path: %s", d17);
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.HotWordSearchUtil", "[updateWordBank] unzip fail, ret = " + Q + ", zipFilePath = " + str + ", unzipPath = " + d17);
        return -1;
    }
}
