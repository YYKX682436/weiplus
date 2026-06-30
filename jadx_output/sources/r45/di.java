package r45;

/* loaded from: classes14.dex */
public class di extends r45.mr5 {
    public r45.z66 A;
    public r45.qt4 B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public r45.cu5 f372481J;
    public r45.c66 K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372482d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372483e;

    /* renamed from: f, reason: collision with root package name */
    public int f372484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372485g;

    /* renamed from: h, reason: collision with root package name */
    public int f372486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372487i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372488m;

    /* renamed from: n, reason: collision with root package name */
    public int f372489n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372490o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f372491p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f372492q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f372493r;

    /* renamed from: s, reason: collision with root package name */
    public int f372494s;

    /* renamed from: t, reason: collision with root package name */
    public int f372495t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f372496u;

    /* renamed from: v, reason: collision with root package name */
    public int f372497v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f372498w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f372499x;

    /* renamed from: y, reason: collision with root package name */
    public r45.cu5 f372500y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f372501z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.di)) {
            return false;
        }
        r45.di diVar = (r45.di) fVar;
        return n51.f.a(this.BaseRequest, diVar.BaseRequest) && n51.f.a(this.f372482d, diVar.f372482d) && n51.f.a(this.f372483e, diVar.f372483e) && n51.f.a(java.lang.Integer.valueOf(this.f372484f), java.lang.Integer.valueOf(diVar.f372484f)) && n51.f.a(this.f372485g, diVar.f372485g) && n51.f.a(java.lang.Integer.valueOf(this.f372486h), java.lang.Integer.valueOf(diVar.f372486h)) && n51.f.a(this.f372487i, diVar.f372487i) && n51.f.a(this.f372488m, diVar.f372488m) && n51.f.a(java.lang.Integer.valueOf(this.f372489n), java.lang.Integer.valueOf(diVar.f372489n)) && n51.f.a(this.f372490o, diVar.f372490o) && n51.f.a(this.f372491p, diVar.f372491p) && n51.f.a(this.f372492q, diVar.f372492q) && n51.f.a(this.f372493r, diVar.f372493r) && n51.f.a(java.lang.Integer.valueOf(this.f372494s), java.lang.Integer.valueOf(diVar.f372494s)) && n51.f.a(java.lang.Integer.valueOf(this.f372495t), java.lang.Integer.valueOf(diVar.f372495t)) && n51.f.a(this.f372496u, diVar.f372496u) && n51.f.a(java.lang.Integer.valueOf(this.f372497v), java.lang.Integer.valueOf(diVar.f372497v)) && n51.f.a(this.f372498w, diVar.f372498w) && n51.f.a(this.f372499x, diVar.f372499x) && n51.f.a(this.f372500y, diVar.f372500y) && n51.f.a(this.f372501z, diVar.f372501z) && n51.f.a(this.A, diVar.A) && n51.f.a(this.B, diVar.B) && n51.f.a(this.C, diVar.C) && n51.f.a(this.D, diVar.D) && n51.f.a(this.E, diVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(diVar.F)) && n51.f.a(this.G, diVar.G) && n51.f.a(this.H, diVar.H) && n51.f.a(this.I, diVar.I) && n51.f.a(this.f372481J, diVar.f372481J) && n51.f.a(this.K, diVar.K);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f372482d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372483e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f372484f);
            java.lang.String str3 = this.f372485g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f372486h);
            java.lang.String str4 = this.f372487i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f372488m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f372489n);
            java.lang.String str6 = this.f372490o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f372491p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            r45.cu5 cu5Var = this.f372492q;
            if (cu5Var != null) {
                fVar.i(12, cu5Var.computeSize());
                this.f372492q.writeFields(fVar);
            }
            java.lang.String str8 = this.f372493r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f372494s);
            fVar.e(15, this.f372495t);
            java.lang.String str9 = this.f372496u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            fVar.e(17, this.f372497v);
            java.lang.String str10 = this.f372498w;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            r45.cu5 cu5Var2 = this.f372499x;
            if (cu5Var2 != null) {
                fVar.i(19, cu5Var2.computeSize());
                this.f372499x.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f372500y;
            if (cu5Var3 != null) {
                fVar.i(20, cu5Var3.computeSize());
                this.f372500y.writeFields(fVar);
            }
            java.lang.String str11 = this.f372501z;
            if (str11 != null) {
                fVar.j(21, str11);
            }
            r45.z66 z66Var = this.A;
            if (z66Var != null) {
                fVar.i(22, z66Var.computeSize());
                this.A.writeFields(fVar);
            }
            r45.qt4 qt4Var = this.B;
            if (qt4Var != null) {
                fVar.i(23, qt4Var.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str12 = this.C;
            if (str12 != null) {
                fVar.j(24, str12);
            }
            java.lang.String str13 = this.D;
            if (str13 != null) {
                fVar.j(25, str13);
            }
            java.lang.String str14 = this.E;
            if (str14 != null) {
                fVar.j(26, str14);
            }
            fVar.e(27, this.F);
            java.lang.String str15 = this.G;
            if (str15 != null) {
                fVar.j(29, str15);
            }
            java.lang.String str16 = this.H;
            if (str16 != null) {
                fVar.j(30, str16);
            }
            java.lang.String str17 = this.I;
            if (str17 != null) {
                fVar.j(31, str17);
            }
            r45.cu5 cu5Var4 = this.f372481J;
            if (cu5Var4 != null) {
                fVar.i(32, cu5Var4.computeSize());
                this.f372481J.writeFields(fVar);
            }
            r45.c66 c66Var = this.K;
            if (c66Var != null) {
                fVar.i(33, c66Var.computeSize());
                this.K.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str18 = this.f372482d;
            if (str18 != null) {
                i18 += b36.f.j(2, str18);
            }
            java.lang.String str19 = this.f372483e;
            if (str19 != null) {
                i18 += b36.f.j(3, str19);
            }
            int e17 = i18 + b36.f.e(4, this.f372484f);
            java.lang.String str20 = this.f372485g;
            if (str20 != null) {
                e17 += b36.f.j(5, str20);
            }
            int e18 = e17 + b36.f.e(6, this.f372486h);
            java.lang.String str21 = this.f372487i;
            if (str21 != null) {
                e18 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f372488m;
            if (str22 != null) {
                e18 += b36.f.j(8, str22);
            }
            int e19 = e18 + b36.f.e(9, this.f372489n);
            java.lang.String str23 = this.f372490o;
            if (str23 != null) {
                e19 += b36.f.j(10, str23);
            }
            java.lang.String str24 = this.f372491p;
            if (str24 != null) {
                e19 += b36.f.j(11, str24);
            }
            r45.cu5 cu5Var5 = this.f372492q;
            if (cu5Var5 != null) {
                e19 += b36.f.i(12, cu5Var5.computeSize());
            }
            java.lang.String str25 = this.f372493r;
            if (str25 != null) {
                e19 += b36.f.j(13, str25);
            }
            int e27 = e19 + b36.f.e(14, this.f372494s) + b36.f.e(15, this.f372495t);
            java.lang.String str26 = this.f372496u;
            if (str26 != null) {
                e27 += b36.f.j(16, str26);
            }
            int e28 = e27 + b36.f.e(17, this.f372497v);
            java.lang.String str27 = this.f372498w;
            if (str27 != null) {
                e28 += b36.f.j(18, str27);
            }
            r45.cu5 cu5Var6 = this.f372499x;
            if (cu5Var6 != null) {
                e28 += b36.f.i(19, cu5Var6.computeSize());
            }
            r45.cu5 cu5Var7 = this.f372500y;
            if (cu5Var7 != null) {
                e28 += b36.f.i(20, cu5Var7.computeSize());
            }
            java.lang.String str28 = this.f372501z;
            if (str28 != null) {
                e28 += b36.f.j(21, str28);
            }
            r45.z66 z66Var2 = this.A;
            if (z66Var2 != null) {
                e28 += b36.f.i(22, z66Var2.computeSize());
            }
            r45.qt4 qt4Var2 = this.B;
            if (qt4Var2 != null) {
                e28 += b36.f.i(23, qt4Var2.computeSize());
            }
            java.lang.String str29 = this.C;
            if (str29 != null) {
                e28 += b36.f.j(24, str29);
            }
            java.lang.String str30 = this.D;
            if (str30 != null) {
                e28 += b36.f.j(25, str30);
            }
            java.lang.String str31 = this.E;
            if (str31 != null) {
                e28 += b36.f.j(26, str31);
            }
            int e29 = e28 + b36.f.e(27, this.F);
            java.lang.String str32 = this.G;
            if (str32 != null) {
                e29 += b36.f.j(29, str32);
            }
            java.lang.String str33 = this.H;
            if (str33 != null) {
                e29 += b36.f.j(30, str33);
            }
            java.lang.String str34 = this.I;
            if (str34 != null) {
                e29 += b36.f.j(31, str34);
            }
            r45.cu5 cu5Var8 = this.f372481J;
            if (cu5Var8 != null) {
                e29 += b36.f.i(32, cu5Var8.computeSize());
            }
            r45.c66 c66Var2 = this.K;
            return c66Var2 != null ? e29 + b36.f.i(33, c66Var2.computeSize()) : e29;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.di diVar = (r45.di) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    diVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                diVar.f372482d = aVar2.k(intValue);
                return 0;
            case 3:
                diVar.f372483e = aVar2.k(intValue);
                return 0;
            case 4:
                diVar.f372484f = aVar2.g(intValue);
                return 0;
            case 5:
                diVar.f372485g = aVar2.k(intValue);
                return 0;
            case 6:
                diVar.f372486h = aVar2.g(intValue);
                return 0;
            case 7:
                diVar.f372487i = aVar2.k(intValue);
                return 0;
            case 8:
                diVar.f372488m = aVar2.k(intValue);
                return 0;
            case 9:
                diVar.f372489n = aVar2.g(intValue);
                return 0;
            case 10:
                diVar.f372490o = aVar2.k(intValue);
                return 0;
            case 11:
                diVar.f372491p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var9.b(bArr2);
                    }
                    diVar.f372492q = cu5Var9;
                }
                return 0;
            case 13:
                diVar.f372493r = aVar2.k(intValue);
                return 0;
            case 14:
                diVar.f372494s = aVar2.g(intValue);
                return 0;
            case 15:
                diVar.f372495t = aVar2.g(intValue);
                return 0;
            case 16:
                diVar.f372496u = aVar2.k(intValue);
                return 0;
            case 17:
                diVar.f372497v = aVar2.g(intValue);
                return 0;
            case 18:
                diVar.f372498w = aVar2.k(intValue);
                return 0;
            case 19:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var10.b(bArr3);
                    }
                    diVar.f372499x = cu5Var10;
                }
                return 0;
            case 20:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var11.b(bArr4);
                    }
                    diVar.f372500y = cu5Var11;
                }
                return 0;
            case 21:
                diVar.f372501z = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.z66 z66Var3 = new r45.z66();
                    if (bArr5 != null && bArr5.length > 0) {
                        z66Var3.parseFrom(bArr5);
                    }
                    diVar.A = z66Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.qt4 qt4Var3 = new r45.qt4();
                    if (bArr6 != null && bArr6.length > 0) {
                        qt4Var3.parseFrom(bArr6);
                    }
                    diVar.B = qt4Var3;
                }
                return 0;
            case 24:
                diVar.C = aVar2.k(intValue);
                return 0;
            case 25:
                diVar.D = aVar2.k(intValue);
                return 0;
            case 26:
                diVar.E = aVar2.k(intValue);
                return 0;
            case 27:
                diVar.F = aVar2.g(intValue);
                return 0;
            case 28:
            default:
                return -1;
            case 29:
                diVar.G = aVar2.k(intValue);
                return 0;
            case 30:
                diVar.H = aVar2.k(intValue);
                return 0;
            case 31:
                diVar.I = aVar2.k(intValue);
                return 0;
            case 32:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var12.b(bArr7);
                    }
                    diVar.f372481J = cu5Var12;
                }
                return 0;
            case 33:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.c66 c66Var3 = new r45.c66();
                    if (bArr8 != null && bArr8.length > 0) {
                        c66Var3.parseFrom(bArr8);
                    }
                    diVar.K = c66Var3;
                }
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "UserName", this.f372482d, false);
            eVar.d(jSONObject, "Mobile", this.f372483e, false);
            eVar.d(jSONObject, "Opcode", java.lang.Integer.valueOf(this.f372484f), false);
            eVar.d(jSONObject, "Verifycode", this.f372485g, false);
            eVar.d(jSONObject, "DialFlag", java.lang.Integer.valueOf(this.f372486h), false);
            eVar.d(jSONObject, "DialLang", this.f372487i, false);
            eVar.d(jSONObject, "AuthTicket", this.f372488m, false);
            eVar.d(jSONObject, "ForceReg", java.lang.Integer.valueOf(this.f372489n), false);
            eVar.d(jSONObject, "SafeDeviceName", this.f372490o, false);
            eVar.d(jSONObject, "SafeDeviceType", this.f372491p, false);
            eVar.d(jSONObject, "RandomEncryKey", this.f372492q, false);
            eVar.d(jSONObject, "Language", this.f372493r, false);
            eVar.d(jSONObject, "InputMobileRetrys", java.lang.Integer.valueOf(this.f372494s), false);
            eVar.d(jSONObject, "AdjustRet", java.lang.Integer.valueOf(this.f372495t), false);
            eVar.d(jSONObject, "ClientSeqID", this.f372496u, false);
            eVar.d(jSONObject, "MobileCheckType", java.lang.Integer.valueOf(this.f372497v), false);
            eVar.d(jSONObject, "RegSessionId", this.f372498w, false);
            eVar.d(jSONObject, "SpamBuffer", this.f372499x, false);
            eVar.d(jSONObject, "ExtSpamInfo", this.f372500y, false);
            eVar.d(jSONObject, "ThirdAppAuthTicket", this.f372501z, false);
            eVar.d(jSONObject, "SmsUpCheckExtInfo", this.A, false);
            eVar.d(jSONObject, "networkCheckExtInfo", this.B, false);
            eVar.d(jSONObject, "ExtRegUrl", this.C, false);
            eVar.d(jSONObject, "PolicyAgreementTicket", this.D, false);
            eVar.d(jSONObject, "VerifyTicket", this.E, false);
            eVar.d(jSONObject, "IsAffiliated", java.lang.Integer.valueOf(this.F), false);
            eVar.d(jSONObject, "SimMobileMsgID", this.G, false);
            eVar.d(jSONObject, "authTargetUserName", this.H, false);
            eVar.d(jSONObject, "UserSelfShowName", this.I, false);
            eVar.d(jSONObject, "GatewayTicket", this.f372481J, false);
            eVar.d(jSONObject, "SimChannelTokenInfoList", this.K, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
