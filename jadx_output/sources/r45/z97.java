package r45;

/* loaded from: classes2.dex */
public class z97 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public com.tencent.mm.protobuf.g B;
    public r45.h86 C;
    public r45.fb0 D;
    public r45.j95 E;
    public int F;
    public r45.j30 G;
    public r45.zj6 H;

    /* renamed from: d, reason: collision with root package name */
    public int f391821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391822e;

    /* renamed from: f, reason: collision with root package name */
    public int f391823f;

    /* renamed from: g, reason: collision with root package name */
    public long f391824g;

    /* renamed from: h, reason: collision with root package name */
    public int f391825h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e64 f391826i;

    /* renamed from: n, reason: collision with root package name */
    public int f391828n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391829o;

    /* renamed from: p, reason: collision with root package name */
    public int f391830p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f391831q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f391832r;

    /* renamed from: s, reason: collision with root package name */
    public int f391833s;

    /* renamed from: v, reason: collision with root package name */
    public r45.dk6 f391836v;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f391839y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391840z;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f391827m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f391834t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public int f391835u = 2;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f391837w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f391838x = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z97)) {
            return false;
        }
        r45.z97 z97Var = (r45.z97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391821d), java.lang.Integer.valueOf(z97Var.f391821d)) && n51.f.a(this.f391822e, z97Var.f391822e) && n51.f.a(java.lang.Integer.valueOf(this.f391823f), java.lang.Integer.valueOf(z97Var.f391823f)) && n51.f.a(java.lang.Long.valueOf(this.f391824g), java.lang.Long.valueOf(z97Var.f391824g)) && n51.f.a(java.lang.Integer.valueOf(this.f391825h), java.lang.Integer.valueOf(z97Var.f391825h)) && n51.f.a(this.f391826i, z97Var.f391826i) && n51.f.a(this.f391827m, z97Var.f391827m) && n51.f.a(java.lang.Integer.valueOf(this.f391828n), java.lang.Integer.valueOf(z97Var.f391828n)) && n51.f.a(this.f391829o, z97Var.f391829o) && n51.f.a(java.lang.Integer.valueOf(this.f391830p), java.lang.Integer.valueOf(z97Var.f391830p)) && n51.f.a(this.f391831q, z97Var.f391831q) && n51.f.a(this.f391832r, z97Var.f391832r) && n51.f.a(java.lang.Integer.valueOf(this.f391833s), java.lang.Integer.valueOf(z97Var.f391833s)) && n51.f.a(this.f391834t, z97Var.f391834t) && n51.f.a(java.lang.Integer.valueOf(this.f391835u), java.lang.Integer.valueOf(z97Var.f391835u)) && n51.f.a(this.f391836v, z97Var.f391836v) && n51.f.a(this.f391837w, z97Var.f391837w) && n51.f.a(this.f391838x, z97Var.f391838x) && n51.f.a(this.f391839y, z97Var.f391839y) && n51.f.a(this.f391840z, z97Var.f391840z) && n51.f.a(this.A, z97Var.A) && n51.f.a(this.B, z97Var.B) && n51.f.a(this.C, z97Var.C) && n51.f.a(this.D, z97Var.D) && n51.f.a(this.E, z97Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(z97Var.F)) && n51.f.a(this.G, z97Var.G) && n51.f.a(this.H, z97Var.H);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391821d);
            java.lang.String str = this.f391822e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391823f);
            fVar.h(4, this.f391824g);
            fVar.e(5, this.f391825h);
            r45.e64 e64Var = this.f391826i;
            if (e64Var != null) {
                fVar.i(6, e64Var.computeSize());
                this.f391826i.writeFields(fVar);
            }
            fVar.g(7, 8, this.f391827m);
            fVar.e(8, this.f391828n);
            java.lang.String str2 = this.f391829o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f391830p);
            java.lang.String str3 = this.f391831q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f391832r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f391833s);
            fVar.g(14, 1, this.f391834t);
            fVar.e(15, this.f391835u);
            r45.dk6 dk6Var = this.f391836v;
            if (dk6Var != null) {
                fVar.i(16, dk6Var.computeSize());
                this.f391836v.writeFields(fVar);
            }
            fVar.g(17, 8, this.f391837w);
            fVar.g(18, 8, this.f391838x);
            java.lang.String str5 = this.f391839y;
            if (str5 != null) {
                fVar.j(19, str5);
            }
            com.tencent.mm.protobuf.g gVar = this.f391840z;
            if (gVar != null) {
                fVar.b(20, gVar);
            }
            java.lang.String str6 = this.A;
            if (str6 != null) {
                fVar.j(21, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.B;
            if (gVar2 != null) {
                fVar.b(22, gVar2);
            }
            r45.h86 h86Var = this.C;
            if (h86Var != null) {
                fVar.i(23, h86Var.computeSize());
                this.C.writeFields(fVar);
            }
            r45.fb0 fb0Var = this.D;
            if (fb0Var != null) {
                fVar.i(24, fb0Var.computeSize());
                this.D.writeFields(fVar);
            }
            r45.j95 j95Var = this.E;
            if (j95Var != null) {
                fVar.i(25, j95Var.computeSize());
                this.E.writeFields(fVar);
            }
            fVar.e(26, this.F);
            r45.j30 j30Var = this.G;
            if (j30Var != null) {
                fVar.i(27, j30Var.computeSize());
                this.G.writeFields(fVar);
            }
            r45.zj6 zj6Var = this.H;
            if (zj6Var != null) {
                fVar.i(28, zj6Var.computeSize());
                this.H.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391821d) + 0;
            java.lang.String str7 = this.f391822e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            int e18 = e17 + b36.f.e(3, this.f391823f) + b36.f.h(4, this.f391824g) + b36.f.e(5, this.f391825h);
            r45.e64 e64Var2 = this.f391826i;
            if (e64Var2 != null) {
                e18 += b36.f.i(6, e64Var2.computeSize());
            }
            int g17 = e18 + b36.f.g(7, 8, this.f391827m) + b36.f.e(8, this.f391828n);
            java.lang.String str8 = this.f391829o;
            if (str8 != null) {
                g17 += b36.f.j(9, str8);
            }
            int e19 = g17 + b36.f.e(10, this.f391830p);
            java.lang.String str9 = this.f391831q;
            if (str9 != null) {
                e19 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f391832r;
            if (str10 != null) {
                e19 += b36.f.j(12, str10);
            }
            int e27 = e19 + b36.f.e(13, this.f391833s) + b36.f.g(14, 1, this.f391834t) + b36.f.e(15, this.f391835u);
            r45.dk6 dk6Var2 = this.f391836v;
            if (dk6Var2 != null) {
                e27 += b36.f.i(16, dk6Var2.computeSize());
            }
            int g18 = e27 + b36.f.g(17, 8, this.f391837w) + b36.f.g(18, 8, this.f391838x);
            java.lang.String str11 = this.f391839y;
            if (str11 != null) {
                g18 += b36.f.j(19, str11);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f391840z;
            if (gVar3 != null) {
                g18 += b36.f.b(20, gVar3);
            }
            java.lang.String str12 = this.A;
            if (str12 != null) {
                g18 += b36.f.j(21, str12);
            }
            com.tencent.mm.protobuf.g gVar4 = this.B;
            if (gVar4 != null) {
                g18 += b36.f.b(22, gVar4);
            }
            r45.h86 h86Var2 = this.C;
            if (h86Var2 != null) {
                g18 += b36.f.i(23, h86Var2.computeSize());
            }
            r45.fb0 fb0Var2 = this.D;
            if (fb0Var2 != null) {
                g18 += b36.f.i(24, fb0Var2.computeSize());
            }
            r45.j95 j95Var2 = this.E;
            if (j95Var2 != null) {
                g18 += b36.f.i(25, j95Var2.computeSize());
            }
            int e28 = g18 + b36.f.e(26, this.F);
            r45.j30 j30Var2 = this.G;
            if (j30Var2 != null) {
                e28 += b36.f.i(27, j30Var2.computeSize());
            }
            r45.zj6 zj6Var2 = this.H;
            return zj6Var2 != null ? e28 + b36.f.i(28, zj6Var2.computeSize()) : e28;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391827m.clear();
            this.f391834t.clear();
            this.f391837w.clear();
            this.f391838x.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.z97 z97Var = (r45.z97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z97Var.f391821d = aVar2.g(intValue);
                return 0;
            case 2:
                z97Var.f391822e = aVar2.k(intValue);
                return 0;
            case 3:
                z97Var.f391823f = aVar2.g(intValue);
                return 0;
            case 4:
                z97Var.f391824g = aVar2.i(intValue);
                return 0;
            case 5:
                z97Var.f391825h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    z97Var.f391826i = e64Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw6 fw6Var = new r45.fw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw6Var.parseFrom(bArr3);
                    }
                    z97Var.f391827m.add(fw6Var);
                }
                return 0;
            case 8:
                z97Var.f391828n = aVar2.g(intValue);
                return 0;
            case 9:
                z97Var.f391829o = aVar2.k(intValue);
                return 0;
            case 10:
                z97Var.f391830p = aVar2.g(intValue);
                return 0;
            case 11:
                z97Var.f391831q = aVar2.k(intValue);
                return 0;
            case 12:
                z97Var.f391832r = aVar2.k(intValue);
                return 0;
            case 13:
                z97Var.f391833s = aVar2.g(intValue);
                return 0;
            case 14:
                z97Var.f391834t.add(aVar2.k(intValue));
                return 0;
            case 15:
                z97Var.f391835u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.dk6 dk6Var3 = new r45.dk6();
                    if (bArr4 != null && bArr4.length > 0) {
                        dk6Var3.parseFrom(bArr4);
                    }
                    z97Var.f391836v = dk6Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr5 != null && bArr5.length > 0) {
                        x50Var.parseFrom(bArr5);
                    }
                    z97Var.f391837w.add(x50Var);
                }
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.hx4 hx4Var = new r45.hx4();
                    if (bArr6 != null && bArr6.length > 0) {
                        hx4Var.parseFrom(bArr6);
                    }
                    z97Var.f391838x.add(hx4Var);
                }
                return 0;
            case 19:
                z97Var.f391839y = aVar2.k(intValue);
                return 0;
            case 20:
                z97Var.f391840z = aVar2.d(intValue);
                return 0;
            case 21:
                z97Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                z97Var.B = aVar2.d(intValue);
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.h86 h86Var3 = new r45.h86();
                    if (bArr7 != null && bArr7.length > 0) {
                        h86Var3.parseFrom(bArr7);
                    }
                    z97Var.C = h86Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.fb0 fb0Var3 = new r45.fb0();
                    if (bArr8 != null && bArr8.length > 0) {
                        fb0Var3.parseFrom(bArr8);
                    }
                    z97Var.D = fb0Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.j95 j95Var3 = new r45.j95();
                    if (bArr9 != null && bArr9.length > 0) {
                        j95Var3.parseFrom(bArr9);
                    }
                    z97Var.E = j95Var3;
                }
                return 0;
            case 26:
                z97Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr10 != null && bArr10.length > 0) {
                        j30Var3.parseFrom(bArr10);
                    }
                    z97Var.G = j30Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.zj6 zj6Var3 = new r45.zj6();
                    if (bArr11 != null && bArr11.length > 0) {
                        zj6Var3.parseFrom(bArr11);
                    }
                    z97Var.H = zj6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f391821d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "IsHomePage", valueOf, false);
            eVar.d(jSONObject, "Keyword", this.f391822e, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f391823f), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Long.valueOf(this.f391824g), false);
            eVar.d(jSONObject, "CliVersion", java.lang.Integer.valueOf(this.f391825h), false);
            eVar.d(jSONObject, "Location", this.f391826i, false);
            eVar.d(jSONObject, "MatchUserList", this.f391827m, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f391828n), false);
            eVar.d(jSONObject, "SearchID", this.f391829o, false);
            eVar.d(jSONObject, "SceneActionType", java.lang.Integer.valueOf(this.f391830p), false);
            eVar.d(jSONObject, "SugID", this.f391831q, false);
            eVar.d(jSONObject, "PrefixSug", this.f391832r, false);
            eVar.d(jSONObject, "SugType", java.lang.Integer.valueOf(this.f391833s), false);
            eVar.d(jSONObject, "PrefixQuery", this.f391834t, false);
            eVar.d(jSONObject, "DisplayPattern", java.lang.Integer.valueOf(this.f391835u), false);
            eVar.d(jSONObject, "TagInfo", this.f391836v, false);
            eVar.d(jSONObject, "ExtReqParams", this.f391837w, false);
            eVar.d(jSONObject, "NumConditions", this.f391838x, false);
            eVar.d(jSONObject, "Language", this.f391839y, false);
            eVar.d(jSONObject, "WeAppCtrlInfo", this.f391840z, false);
            eVar.d(jSONObject, "SessionID", this.A, false);
            eVar.d(jSONObject, "BoxCtrlInfo", this.B, false);
            eVar.d(jSONObject, dm.va.TABLE_NAME, this.C, false);
            eVar.d(jSONObject, "DebugCtrlInfo", this.D, false);
            eVar.d(jSONObject, "PoiInfo", this.E, false);
            eVar.d(jSONObject, "DarkMode", java.lang.Integer.valueOf(this.F), false);
            eVar.d(jSONObject, "ChildMode", this.G, false);
            eVar.d(jSONObject, "TagExtInfo", this.H, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
