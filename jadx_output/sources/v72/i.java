package v72;

/* loaded from: classes12.dex */
public class i extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f433664e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f433665f;

    /* renamed from: g, reason: collision with root package name */
    public o13.v f433666g;

    /* renamed from: h, reason: collision with root package name */
    public v72.a f433667h;

    /* renamed from: i, reason: collision with root package name */
    public l75.k0 f433668i;

    /* renamed from: m, reason: collision with root package name */
    public final l75.q0 f433669m = new v72.b(this);

    public static boolean j(v72.e eVar) {
        r45.bq0 bq0Var;
        java.util.LinkedList linkedList;
        r45.hp0 hp0Var;
        return (eVar == null || (bq0Var = eVar.f433657e) == null || eVar.f433654b != 4 || (linkedList = bq0Var.f370964f) == null || linkedList.isEmpty() || (hp0Var = ((r45.gp0) bq0Var.f370964f.get(0)).J1) == null || hp0Var.f376370x == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    public static int k(v72.i iVar, v72.e eVar) {
        java.lang.String str;
        int[] iArr;
        java.lang.String str2;
        java.lang.String[] strArr;
        java.lang.String str3;
        r45.lp0 lp0Var;
        r45.bq0 bq0Var;
        ?? r96;
        int i17;
        v72.i iVar2;
        java.lang.String str4;
        long j17;
        long j18;
        int i18;
        char c17;
        char c18;
        java.lang.String i19;
        java.lang.String i27;
        char c19;
        java.lang.String i28;
        java.lang.String i29;
        java.lang.String str5;
        iVar.getClass();
        long j19 = eVar.f433653a;
        int i37 = eVar.f433654b;
        long j27 = eVar.f433655c;
        java.lang.String str6 = eVar.f433656d;
        r45.bq0 bq0Var2 = eVar.f433657e;
        r45.lp0 L = o72.x1.L(i37, bq0Var2, eVar.f433658f);
        if (L == null) {
            return 0;
        }
        java.lang.String str7 = L.f379696g;
        java.lang.String str8 = L.f379695f;
        if (str7 == null || str7.length() == 0 || str7.equals(str8)) {
            str7 = L.f379695f;
            str = null;
        } else {
            str = str8;
        }
        java.lang.String str9 = L.f379698i;
        java.lang.String[] strArr2 = new java.lang.String[3];
        int[] iArr2 = new int[3];
        if (str7 == null || str7.length() <= 0) {
            iArr = iArr2;
            str2 = str9;
            strArr = strArr2;
            str3 = str;
            lp0Var = L;
            bq0Var = bq0Var2;
            r96 = 0;
            i17 = 0;
        } else {
            com.tencent.mm.storage.z3 a17 = ((com.tencent.mm.plugin.fts.p) iVar.f433666g).a(str7);
            java.lang.String P0 = a17.P0();
            java.lang.String i38 = o13.n.i(P0, false);
            java.lang.String i39 = o13.n.i(P0, true);
            java.lang.String w07 = a17.w0();
            java.lang.String i47 = o13.n.i(w07, false);
            java.lang.String i48 = o13.n.i(w07, true);
            if (w07 == null || w07.length() == 0) {
                i47 = i38;
                i48 = i39;
                str5 = null;
                i38 = null;
                i39 = null;
            } else {
                str5 = P0;
                P0 = w07;
            }
            strArr2[0] = P0;
            strArr2[1] = i47;
            strArr2[2] = i48;
            iArr2[0] = 9;
            iArr2[1] = 10;
            iArr2[2] = 11;
            iArr = iArr2;
            str2 = str9;
            strArr = strArr2;
            lp0Var = L;
            str3 = str;
            r96 = 0;
            bq0Var = bq0Var2;
            int l17 = 0 + iVar.l(strArr2, iArr, j19, i37, j27, str6);
            strArr[0] = str5;
            strArr[1] = i38;
            strArr[2] = i39;
            iArr[0] = 12;
            iArr[1] = 13;
            iArr[2] = 14;
            i17 = l17 + iVar.l(strArr, iArr, j19, i37, j27, str6);
        }
        if (str3 == null || str3.length() <= 0) {
            iVar2 = iVar;
        } else {
            com.tencent.mm.storage.z3 a18 = ((com.tencent.mm.plugin.fts.p) iVar.f433666g).a(str3);
            java.lang.String w08 = a18.w0();
            if (w08 == null || w08.length() == 0) {
                c19 = 1;
                w08 = a18.P0();
                i28 = o13.n.i(w08, r96);
                i29 = o13.n.i(w08, true);
            } else {
                i28 = o13.n.i(w08, r96);
                c19 = 1;
                i29 = o13.n.i(w08, true);
            }
            strArr[r96] = w08;
            strArr[c19] = i28;
            strArr[2] = i29;
            iArr[r96] = 16;
            iArr[c19] = 17;
            iArr[2] = 18;
            iVar2 = iVar;
            i17 += iVar.l(strArr, iArr, j19, i37, j27, str6);
        }
        java.lang.String str10 = str2;
        if (str10 != null && str10.length() > 0) {
            com.tencent.mm.storage.z3 a19 = ((com.tencent.mm.plugin.fts.p) iVar2.f433666g).a(str10);
            java.lang.String w09 = a19.w0();
            if (w09 == null || w09.length() == 0) {
                c17 = 0;
                c18 = 1;
                w09 = a19.P0();
                i19 = o13.n.i(w09, false);
                i27 = o13.n.i(w09, true);
            } else {
                c17 = 0;
                i19 = o13.n.i(w09, false);
                c18 = 1;
                i27 = o13.n.i(w09, true);
            }
            strArr[c17] = w09;
            strArr[c18] = i19;
            strArr[2] = i27;
            iArr[c17] = 20;
            iArr[c18] = 21;
            iArr[2] = 22;
            i17 += iVar.l(strArr, iArr, j19, i37, j27, str6);
        }
        int i49 = i17;
        r45.lp0 lp0Var2 = lp0Var;
        java.util.LinkedList<java.lang.String> linkedList = lp0Var2.f379699m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        for (java.lang.String str11 : linkedList) {
            if (str11 != null && str11.length() > 0) {
                sb6.append(str11);
                sb6.append("\u200b");
            }
        }
        if (sb6.length() > 0) {
            str4 = str6;
            j17 = j27;
            j18 = j19;
            i18 = i37;
            iVar2.f433667h.N(196608, 7, j19, str4, j17, sb6.toString(), i18);
            i49++;
        } else {
            str4 = str6;
            j17 = j27;
            j18 = j19;
            i18 = i37;
        }
        int i57 = i49;
        if (i18 == 2) {
            int i58 = i18;
            java.lang.String str12 = lp0Var2.f379693d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                iVar2.f433667h.N(196608, 23, j18, str4, j17, str12, i58);
                i57++;
            }
            return i57;
        }
        if (i18 == 14) {
            int i59 = i18;
            r45.bq0 bq0Var3 = bq0Var;
            if (bq0Var3.f370964f != null) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.Iterator it = bq0Var3.f370964f.iterator();
                while (it.hasNext()) {
                    java.lang.String s17 = o72.x1.s((r45.gp0) it.next());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                        sb6.append(s17);
                        sb6.append("\u200b");
                    }
                }
                java.lang.String stringBuffer2 = stringBuffer.toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringBuffer2)) {
                    iVar2.f433667h.N(196608, 1, j18, str4, j17, stringBuffer2, i59);
                    i57++;
                }
            }
            return i57;
        }
        if (i18 != 21) {
            if (i18 == 5) {
                int i66 = i18;
                java.lang.String str13 = lp0Var2.f379693d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                    iVar2.f433667h.N(196608, 1, j18, str4, j17, str13, i66);
                    i57++;
                }
                return i57;
            }
            if (i18 == 6) {
                int i67 = i18;
                r45.bq0 bq0Var4 = bq0Var;
                java.lang.String str14 = bq0Var4.f370970o;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str14)) {
                    iVar2.f433667h.N(196608, 4, j18, str4, j17, str14, i67);
                    i57++;
                }
                java.lang.String str15 = bq0Var4.f370966h.f383274o;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str15)) {
                    iVar2.f433667h.N(196608, 5, j18, str4, j17, str15, i67);
                    i57++;
                }
                java.lang.String str16 = bq0Var4.f370966h.f383272m;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str16)) {
                    iVar2.f433667h.N(196608, 6, j18, str4, j17, str16, i67);
                    i57++;
                }
                return i57;
            }
            if (i18 != 7 && i18 != 32 && i18 != 33) {
                java.lang.String str17 = lp0Var2.f379693d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str17)) {
                    iVar2.f433667h.N(196608, 1, j18, str4, j17, str17, i18);
                    i57++;
                }
                java.lang.String str18 = lp0Var2.f379694e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str18)) {
                    iVar2.f433667h.N(196608, 2, j18, str4, j17, str18, i18);
                    i57++;
                }
                return i57;
            }
        }
        int i68 = i18;
        java.lang.String str19 = lp0Var2.f379693d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str19)) {
            iVar2.f433667h.N(196608, 1, j18, str4, j17, str19, i68);
            i57++;
        }
        java.lang.String str20 = lp0Var2.f379694e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str20)) {
            iVar2.f433667h.N(196608, 3, j18, str4, j17, str20, i68);
            i57++;
        }
        return i57;
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c hVar = uVar.f351140b == 1 ? new v72.h(this, uVar) : new v72.g(this, uVar);
        ((com.tencent.mm.plugin.fts.t) this.f433665f).b(-65536, hVar);
        return hVar;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchFavoriteLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Success!");
        this.f433664e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f433665f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        this.f433667h = (v72.a) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(256);
        this.f433666g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).fj();
        this.f433668i = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2();
        ((com.tencent.mm.plugin.fts.t) this.f433664e).b(131122, new v72.c(this, null));
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this.f433669m);
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this.f433669m);
        this.f433667h = null;
        this.f433664e = null;
        this.f433665f = null;
        return true;
    }

    public final int l(java.lang.String[] strArr, int[] iArr, long j17, int i17, long j18, java.lang.String str) {
        java.lang.String str2;
        int i18;
        java.lang.String str3 = strArr[0];
        java.lang.String str4 = strArr[1];
        java.lang.String str5 = strArr[2];
        if (str3 == null || str3.length() <= 0) {
            return 0;
        }
        if (str3.equalsIgnoreCase(str4)) {
            str5 = null;
            str2 = null;
        } else {
            str2 = str4;
        }
        java.lang.String str6 = (str2 == null || !str2.equalsIgnoreCase(str5)) ? str5 : null;
        this.f433667h.N(196608, iArr[0], j17, str, j18, str3, i17);
        if (str2 == null || str2.length() <= 0) {
            i18 = 1;
        } else {
            this.f433667h.N(196608, iArr[1], j17, str, j18, str2, i17);
            i18 = 2;
        }
        if (str6 == null || str6.length() <= 0) {
            return i18;
        }
        this.f433667h.N(196608, iArr[2], j17, str, j18, str6, i17);
        return i18 + 1;
    }
}
