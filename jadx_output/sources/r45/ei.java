package r45;

/* loaded from: classes14.dex */
public class ei extends r45.js5 {
    public java.lang.String A;
    public int B;
    public r45.qt4 C;
    public int D;
    public java.lang.String E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373509d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373510e;

    /* renamed from: f, reason: collision with root package name */
    public int f373511f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373512g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373513h;

    /* renamed from: i, reason: collision with root package name */
    public r45.kx3 f373514i;

    /* renamed from: m, reason: collision with root package name */
    public r45.jo f373515m;

    /* renamed from: n, reason: collision with root package name */
    public r45.rt4 f373516n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373517o;

    /* renamed from: p, reason: collision with root package name */
    public int f373518p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373519q;

    /* renamed from: r, reason: collision with root package name */
    public int f373520r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hu5 f373521s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f373522t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f373523u;

    /* renamed from: v, reason: collision with root package name */
    public r45.w56 f373524v;

    /* renamed from: w, reason: collision with root package name */
    public int f373525w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f373526x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f373527y;

    /* renamed from: z, reason: collision with root package name */
    public int f373528z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei)) {
            return false;
        }
        r45.ei eiVar = (r45.ei) fVar;
        return n51.f.a(this.BaseResponse, eiVar.BaseResponse) && n51.f.a(this.f373509d, eiVar.f373509d) && n51.f.a(this.f373510e, eiVar.f373510e) && n51.f.a(java.lang.Integer.valueOf(this.f373511f), java.lang.Integer.valueOf(eiVar.f373511f)) && n51.f.a(this.f373512g, eiVar.f373512g) && n51.f.a(this.f373513h, eiVar.f373513h) && n51.f.a(this.f373514i, eiVar.f373514i) && n51.f.a(this.f373515m, eiVar.f373515m) && n51.f.a(this.f373516n, eiVar.f373516n) && n51.f.a(this.f373517o, eiVar.f373517o) && n51.f.a(java.lang.Integer.valueOf(this.f373518p), java.lang.Integer.valueOf(eiVar.f373518p)) && n51.f.a(this.f373519q, eiVar.f373519q) && n51.f.a(java.lang.Integer.valueOf(this.f373520r), java.lang.Integer.valueOf(eiVar.f373520r)) && n51.f.a(this.f373521s, eiVar.f373521s) && n51.f.a(this.f373522t, eiVar.f373522t) && n51.f.a(this.f373523u, eiVar.f373523u) && n51.f.a(this.f373524v, eiVar.f373524v) && n51.f.a(java.lang.Integer.valueOf(this.f373525w), java.lang.Integer.valueOf(eiVar.f373525w)) && n51.f.a(this.f373526x, eiVar.f373526x) && n51.f.a(this.f373527y, eiVar.f373527y) && n51.f.a(java.lang.Integer.valueOf(this.f373528z), java.lang.Integer.valueOf(eiVar.f373528z)) && n51.f.a(this.A, eiVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(eiVar.B)) && n51.f.a(this.C, eiVar.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(eiVar.D)) && n51.f.a(this.E, eiVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(eiVar.F));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f373509d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373510e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f373511f);
            java.lang.String str3 = this.f373512g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f373513h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.kx3 kx3Var = this.f373514i;
            if (kx3Var != null) {
                fVar.i(7, kx3Var.computeSize());
                this.f373514i.writeFields(fVar);
            }
            r45.jo joVar = this.f373515m;
            if (joVar != null) {
                fVar.i(8, joVar.computeSize());
                this.f373515m.writeFields(fVar);
            }
            r45.rt4 rt4Var = this.f373516n;
            if (rt4Var != null) {
                fVar.i(9, rt4Var.computeSize());
                this.f373516n.writeFields(fVar);
            }
            java.lang.String str5 = this.f373517o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f373518p);
            java.lang.String str6 = this.f373519q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            fVar.e(13, this.f373520r);
            r45.hu5 hu5Var = this.f373521s;
            if (hu5Var != null) {
                fVar.i(14, hu5Var.computeSize());
                this.f373521s.writeFields(fVar);
            }
            java.lang.String str7 = this.f373522t;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            java.lang.String str8 = this.f373523u;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            r45.w56 w56Var = this.f373524v;
            if (w56Var != null) {
                fVar.i(17, w56Var.computeSize());
                this.f373524v.writeFields(fVar);
            }
            fVar.e(18, this.f373525w);
            java.lang.String str9 = this.f373526x;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            java.lang.String str10 = this.f373527y;
            if (str10 != null) {
                fVar.j(20, str10);
            }
            fVar.e(21, this.f373528z);
            java.lang.String str11 = this.A;
            if (str11 != null) {
                fVar.j(22, str11);
            }
            fVar.e(23, this.B);
            r45.qt4 qt4Var = this.C;
            if (qt4Var != null) {
                fVar.i(24, qt4Var.computeSize());
                this.C.writeFields(fVar);
            }
            fVar.e(25, this.D);
            java.lang.String str12 = this.E;
            if (str12 != null) {
                fVar.j(26, str12);
            }
            fVar.e(27, this.F);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str13 = this.f373509d;
            if (str13 != null) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f373510e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            int e17 = i18 + b36.f.e(4, this.f373511f);
            java.lang.String str15 = this.f373512g;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f373513h;
            if (str16 != null) {
                e17 += b36.f.j(6, str16);
            }
            r45.kx3 kx3Var2 = this.f373514i;
            if (kx3Var2 != null) {
                e17 += b36.f.i(7, kx3Var2.computeSize());
            }
            r45.jo joVar2 = this.f373515m;
            if (joVar2 != null) {
                e17 += b36.f.i(8, joVar2.computeSize());
            }
            r45.rt4 rt4Var2 = this.f373516n;
            if (rt4Var2 != null) {
                e17 += b36.f.i(9, rt4Var2.computeSize());
            }
            java.lang.String str17 = this.f373517o;
            if (str17 != null) {
                e17 += b36.f.j(10, str17);
            }
            int e18 = e17 + b36.f.e(11, this.f373518p);
            java.lang.String str18 = this.f373519q;
            if (str18 != null) {
                e18 += b36.f.j(12, str18);
            }
            int e19 = e18 + b36.f.e(13, this.f373520r);
            r45.hu5 hu5Var2 = this.f373521s;
            if (hu5Var2 != null) {
                e19 += b36.f.i(14, hu5Var2.computeSize());
            }
            java.lang.String str19 = this.f373522t;
            if (str19 != null) {
                e19 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.f373523u;
            if (str20 != null) {
                e19 += b36.f.j(16, str20);
            }
            r45.w56 w56Var2 = this.f373524v;
            if (w56Var2 != null) {
                e19 += b36.f.i(17, w56Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(18, this.f373525w);
            java.lang.String str21 = this.f373526x;
            if (str21 != null) {
                e27 += b36.f.j(19, str21);
            }
            java.lang.String str22 = this.f373527y;
            if (str22 != null) {
                e27 += b36.f.j(20, str22);
            }
            int e28 = e27 + b36.f.e(21, this.f373528z);
            java.lang.String str23 = this.A;
            if (str23 != null) {
                e28 += b36.f.j(22, str23);
            }
            int e29 = e28 + b36.f.e(23, this.B);
            r45.qt4 qt4Var2 = this.C;
            if (qt4Var2 != null) {
                e29 += b36.f.i(24, qt4Var2.computeSize());
            }
            int e37 = e29 + b36.f.e(25, this.D);
            java.lang.String str24 = this.E;
            if (str24 != null) {
                e37 += b36.f.j(26, str24);
            }
            return e37 + b36.f.e(27, this.F);
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
        r45.ei eiVar = (r45.ei) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    eiVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                eiVar.f373509d = aVar2.k(intValue);
                return 0;
            case 3:
                eiVar.f373510e = aVar2.k(intValue);
                return 0;
            case 4:
                eiVar.f373511f = aVar2.g(intValue);
                return 0;
            case 5:
                eiVar.f373512g = aVar2.k(intValue);
                return 0;
            case 6:
                eiVar.f373513h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kx3Var3.parseFrom(bArr2);
                    }
                    eiVar.f373514i = kx3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jo joVar3 = new r45.jo();
                    if (bArr3 != null && bArr3.length > 0) {
                        joVar3.parseFrom(bArr3);
                    }
                    eiVar.f373515m = joVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.rt4 rt4Var3 = new r45.rt4();
                    if (bArr4 != null && bArr4.length > 0) {
                        rt4Var3.parseFrom(bArr4);
                    }
                    eiVar.f373516n = rt4Var3;
                }
                return 0;
            case 10:
                eiVar.f373517o = aVar2.k(intValue);
                return 0;
            case 11:
                eiVar.f373518p = aVar2.g(intValue);
                return 0;
            case 12:
                eiVar.f373519q = aVar2.k(intValue);
                return 0;
            case 13:
                eiVar.f373520r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.hu5 hu5Var3 = new r45.hu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        hu5Var3.parseFrom(bArr5);
                    }
                    eiVar.f373521s = hu5Var3;
                }
                return 0;
            case 15:
                eiVar.f373522t = aVar2.k(intValue);
                return 0;
            case 16:
                eiVar.f373523u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.w56 w56Var3 = new r45.w56();
                    if (bArr6 != null && bArr6.length > 0) {
                        w56Var3.parseFrom(bArr6);
                    }
                    eiVar.f373524v = w56Var3;
                }
                return 0;
            case 18:
                eiVar.f373525w = aVar2.g(intValue);
                return 0;
            case 19:
                eiVar.f373526x = aVar2.k(intValue);
                return 0;
            case 20:
                eiVar.f373527y = aVar2.k(intValue);
                return 0;
            case 21:
                eiVar.f373528z = aVar2.g(intValue);
                return 0;
            case 22:
                eiVar.A = aVar2.k(intValue);
                return 0;
            case 23:
                eiVar.B = aVar2.g(intValue);
                return 0;
            case 24:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.qt4 qt4Var3 = new r45.qt4();
                    if (bArr7 != null && bArr7.length > 0) {
                        qt4Var3.parseFrom(bArr7);
                    }
                    eiVar.C = qt4Var3;
                }
                return 0;
            case 25:
                eiVar.D = aVar2.g(intValue);
                return 0;
            case 26:
                eiVar.E = aVar2.k(intValue);
                return 0;
            case 27:
                eiVar.F = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "ticket", this.f373509d, false);
            eVar.d(jSONObject, "SmsNo", this.f373510e, false);
            eVar.d(jSONObject, "NeedSetPwd", java.lang.Integer.valueOf(this.f373511f), false);
            eVar.d(jSONObject, "Pwd", this.f373512g, false);
            eVar.d(jSONObject, "Username", this.f373513h, false);
            eVar.d(jSONObject, "NewHostList", this.f373514i, false);
            eVar.d(jSONObject, "BuiltinIPList", this.f373515m, false);
            eVar.d(jSONObject, "NetworkControl", this.f373516n, false);
            eVar.d(jSONObject, "AuthTicket", this.f373517o, false);
            eVar.d(jSONObject, "SafeDevice", java.lang.Integer.valueOf(this.f373518p), false);
            eVar.d(jSONObject, "CC", this.f373519q, false);
            eVar.d(jSONObject, "ObsoleteItem1", java.lang.Integer.valueOf(this.f373520r), false);
            eVar.d(jSONObject, "SafeDeviceList", this.f373521s, false);
            eVar.d(jSONObject, "PureMobile", this.f373522t, false);
            eVar.d(jSONObject, "FormatedMobile", this.f373523u, false);
            eVar.d(jSONObject, "ShowStyle", this.f373524v, false);
            eVar.d(jSONObject, "MmtlsControlBitFlag", java.lang.Integer.valueOf(this.f373525w), false);
            eVar.d(jSONObject, "SmsUpCode", this.f373526x, false);
            eVar.d(jSONObject, "SmsUpMobile", this.f373527y, false);
            eVar.d(jSONObject, "MobileCheckType", java.lang.Integer.valueOf(this.f373528z), false);
            eVar.d(jSONObject, "RegSessionId", this.A, false);
            eVar.d(jSONObject, "Restart", java.lang.Integer.valueOf(this.B), false);
            eVar.d(jSONObject, "networkCheckExtInfo", this.C, false);
            eVar.d(jSONObject, "CertRegion", java.lang.Integer.valueOf(this.D), false);
            eVar.d(jSONObject, "VerifyTicket", this.E, false);
            eVar.d(jSONObject, "NeedDoPostCheck", java.lang.Integer.valueOf(this.F), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
