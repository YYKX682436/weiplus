package r45;

/* loaded from: classes12.dex */
public class ps extends r45.mr5 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f383346J;
    public java.lang.String K;
    public r45.gz3 L;
    public r45.hz3 M;
    public java.lang.String N;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383349f;

    /* renamed from: g, reason: collision with root package name */
    public int f383350g;

    /* renamed from: h, reason: collision with root package name */
    public int f383351h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383352i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f383353m;

    /* renamed from: n, reason: collision with root package name */
    public int f383354n;

    /* renamed from: o, reason: collision with root package name */
    public float f383355o;

    /* renamed from: p, reason: collision with root package name */
    public float f383356p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383357q;

    /* renamed from: r, reason: collision with root package name */
    public int f383358r;

    /* renamed from: s, reason: collision with root package name */
    public int f383359s;

    /* renamed from: t, reason: collision with root package name */
    public int f383360t;

    /* renamed from: u, reason: collision with root package name */
    public int f383361u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f383362v;

    /* renamed from: w, reason: collision with root package name */
    public int f383363w;

    /* renamed from: x, reason: collision with root package name */
    public int f383364x;

    /* renamed from: y, reason: collision with root package name */
    public int f383365y;

    /* renamed from: z, reason: collision with root package name */
    public int f383366z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps)) {
            return false;
        }
        r45.ps psVar = (r45.ps) fVar;
        return n51.f.a(this.f383347d, psVar.f383347d) && n51.f.a(this.f383348e, psVar.f383348e) && n51.f.a(this.f383349f, psVar.f383349f) && n51.f.a(java.lang.Integer.valueOf(this.f383350g), java.lang.Integer.valueOf(psVar.f383350g)) && n51.f.a(java.lang.Integer.valueOf(this.f383351h), java.lang.Integer.valueOf(psVar.f383351h)) && n51.f.a(this.f383352i, psVar.f383352i) && n51.f.a(this.f383353m, psVar.f383353m) && n51.f.a(java.lang.Integer.valueOf(this.f383354n), java.lang.Integer.valueOf(psVar.f383354n)) && n51.f.a(java.lang.Float.valueOf(this.f383355o), java.lang.Float.valueOf(psVar.f383355o)) && n51.f.a(java.lang.Float.valueOf(this.f383356p), java.lang.Float.valueOf(psVar.f383356p)) && n51.f.a(this.f383357q, psVar.f383357q) && n51.f.a(java.lang.Integer.valueOf(this.f383358r), java.lang.Integer.valueOf(psVar.f383358r)) && n51.f.a(java.lang.Integer.valueOf(this.f383359s), java.lang.Integer.valueOf(psVar.f383359s)) && n51.f.a(java.lang.Integer.valueOf(this.f383360t), java.lang.Integer.valueOf(psVar.f383360t)) && n51.f.a(java.lang.Integer.valueOf(this.f383361u), java.lang.Integer.valueOf(psVar.f383361u)) && n51.f.a(this.f383362v, psVar.f383362v) && n51.f.a(java.lang.Integer.valueOf(this.f383363w), java.lang.Integer.valueOf(psVar.f383363w)) && n51.f.a(java.lang.Integer.valueOf(this.f383364x), java.lang.Integer.valueOf(psVar.f383364x)) && n51.f.a(java.lang.Integer.valueOf(this.f383365y), java.lang.Integer.valueOf(psVar.f383365y)) && n51.f.a(java.lang.Integer.valueOf(this.f383366z), java.lang.Integer.valueOf(psVar.f383366z)) && n51.f.a(this.A, psVar.A) && n51.f.a(this.B, psVar.B) && n51.f.a(this.C, psVar.C) && n51.f.a(this.D, psVar.D) && n51.f.a(this.E, psVar.E) && n51.f.a(this.F, psVar.F) && n51.f.a(this.G, psVar.G) && n51.f.a(this.H, psVar.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(psVar.I)) && n51.f.a(this.f383346J, psVar.f383346J) && n51.f.a(this.K, psVar.K) && n51.f.a(this.L, psVar.L) && n51.f.a(this.M, psVar.M) && n51.f.a(this.N, psVar.N);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383347d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383348e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383349f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f383350g);
            fVar.e(5, this.f383351h);
            java.lang.String str4 = this.f383352i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.cu5 cu5Var = this.f383353m;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.computeSize());
                this.f383353m.writeFields(fVar);
            }
            fVar.e(8, this.f383354n);
            fVar.d(9, this.f383355o);
            fVar.d(10, this.f383356p);
            java.lang.String str5 = this.f383357q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            fVar.e(12, this.f383358r);
            fVar.e(13, this.f383359s);
            fVar.e(14, this.f383360t);
            fVar.e(15, this.f383361u);
            java.lang.String str6 = this.f383362v;
            if (str6 != null) {
                fVar.j(16, str6);
            }
            fVar.e(17, this.f383363w);
            fVar.e(18, this.f383364x);
            fVar.e(19, this.f383365y);
            fVar.e(20, this.f383366z);
            java.lang.String str7 = this.A;
            if (str7 != null) {
                fVar.j(21, str7);
            }
            java.lang.String str8 = this.B;
            if (str8 != null) {
                fVar.j(22, str8);
            }
            java.lang.String str9 = this.C;
            if (str9 != null) {
                fVar.j(23, str9);
            }
            java.lang.String str10 = this.D;
            if (str10 != null) {
                fVar.j(24, str10);
            }
            java.lang.String str11 = this.E;
            if (str11 != null) {
                fVar.j(25, str11);
            }
            java.lang.String str12 = this.F;
            if (str12 != null) {
                fVar.j(26, str12);
            }
            java.lang.String str13 = this.G;
            if (str13 != null) {
                fVar.j(27, str13);
            }
            java.lang.String str14 = this.H;
            if (str14 != null) {
                fVar.j(28, str14);
            }
            fVar.e(29, this.I);
            java.lang.String str15 = this.f383346J;
            if (str15 != null) {
                fVar.j(30, str15);
            }
            java.lang.String str16 = this.K;
            if (str16 != null) {
                fVar.j(31, str16);
            }
            r45.gz3 gz3Var = this.L;
            if (gz3Var != null) {
                fVar.i(32, gz3Var.computeSize());
                this.L.writeFields(fVar);
            }
            r45.hz3 hz3Var = this.M;
            if (hz3Var != null) {
                fVar.i(33, hz3Var.computeSize());
                this.M.writeFields(fVar);
            }
            java.lang.String str17 = this.N;
            if (str17 != null) {
                fVar.j(35, str17);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str18 = this.f383347d;
            int j17 = str18 != null ? b36.f.j(1, str18) + 0 : 0;
            java.lang.String str19 = this.f383348e;
            if (str19 != null) {
                j17 += b36.f.j(2, str19);
            }
            java.lang.String str20 = this.f383349f;
            if (str20 != null) {
                j17 += b36.f.j(3, str20);
            }
            int e17 = j17 + b36.f.e(4, this.f383350g) + b36.f.e(5, this.f383351h);
            java.lang.String str21 = this.f383352i;
            if (str21 != null) {
                e17 += b36.f.j(6, str21);
            }
            r45.cu5 cu5Var2 = this.f383353m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(7, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f383354n) + b36.f.d(9, this.f383355o) + b36.f.d(10, this.f383356p);
            java.lang.String str22 = this.f383357q;
            if (str22 != null) {
                e18 += b36.f.j(11, str22);
            }
            int e19 = e18 + b36.f.e(12, this.f383358r) + b36.f.e(13, this.f383359s) + b36.f.e(14, this.f383360t) + b36.f.e(15, this.f383361u);
            java.lang.String str23 = this.f383362v;
            if (str23 != null) {
                e19 += b36.f.j(16, str23);
            }
            int e27 = e19 + b36.f.e(17, this.f383363w) + b36.f.e(18, this.f383364x) + b36.f.e(19, this.f383365y) + b36.f.e(20, this.f383366z);
            java.lang.String str24 = this.A;
            if (str24 != null) {
                e27 += b36.f.j(21, str24);
            }
            java.lang.String str25 = this.B;
            if (str25 != null) {
                e27 += b36.f.j(22, str25);
            }
            java.lang.String str26 = this.C;
            if (str26 != null) {
                e27 += b36.f.j(23, str26);
            }
            java.lang.String str27 = this.D;
            if (str27 != null) {
                e27 += b36.f.j(24, str27);
            }
            java.lang.String str28 = this.E;
            if (str28 != null) {
                e27 += b36.f.j(25, str28);
            }
            java.lang.String str29 = this.F;
            if (str29 != null) {
                e27 += b36.f.j(26, str29);
            }
            java.lang.String str30 = this.G;
            if (str30 != null) {
                e27 += b36.f.j(27, str30);
            }
            java.lang.String str31 = this.H;
            if (str31 != null) {
                e27 += b36.f.j(28, str31);
            }
            int e28 = e27 + b36.f.e(29, this.I);
            java.lang.String str32 = this.f383346J;
            if (str32 != null) {
                e28 += b36.f.j(30, str32);
            }
            java.lang.String str33 = this.K;
            if (str33 != null) {
                e28 += b36.f.j(31, str33);
            }
            r45.gz3 gz3Var2 = this.L;
            if (gz3Var2 != null) {
                e28 += b36.f.i(32, gz3Var2.computeSize());
            }
            r45.hz3 hz3Var2 = this.M;
            if (hz3Var2 != null) {
                e28 += b36.f.i(33, hz3Var2.computeSize());
            }
            java.lang.String str34 = this.N;
            return str34 != null ? e28 + b36.f.j(35, str34) : e28;
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
        r45.ps psVar = (r45.ps) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                psVar.f383347d = aVar2.k(intValue);
                return 0;
            case 2:
                psVar.f383348e = aVar2.k(intValue);
                return 0;
            case 3:
                psVar.f383349f = aVar2.k(intValue);
                return 0;
            case 4:
                psVar.f383350g = aVar2.g(intValue);
                return 0;
            case 5:
                psVar.f383351h = aVar2.g(intValue);
                return 0;
            case 6:
                psVar.f383352i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    psVar.f383353m = cu5Var3;
                }
                return 0;
            case 8:
                psVar.f383354n = aVar2.g(intValue);
                return 0;
            case 9:
                psVar.f383355o = aVar2.f(intValue);
                return 0;
            case 10:
                psVar.f383356p = aVar2.f(intValue);
                return 0;
            case 11:
                psVar.f383357q = aVar2.k(intValue);
                return 0;
            case 12:
                psVar.f383358r = aVar2.g(intValue);
                return 0;
            case 13:
                psVar.f383359s = aVar2.g(intValue);
                return 0;
            case 14:
                psVar.f383360t = aVar2.g(intValue);
                return 0;
            case 15:
                psVar.f383361u = aVar2.g(intValue);
                return 0;
            case 16:
                psVar.f383362v = aVar2.k(intValue);
                return 0;
            case 17:
                psVar.f383363w = aVar2.g(intValue);
                return 0;
            case 18:
                psVar.f383364x = aVar2.g(intValue);
                return 0;
            case 19:
                psVar.f383365y = aVar2.g(intValue);
                return 0;
            case 20:
                psVar.f383366z = aVar2.g(intValue);
                return 0;
            case 21:
                psVar.A = aVar2.k(intValue);
                return 0;
            case 22:
                psVar.B = aVar2.k(intValue);
                return 0;
            case 23:
                psVar.C = aVar2.k(intValue);
                return 0;
            case 24:
                psVar.D = aVar2.k(intValue);
                return 0;
            case 25:
                psVar.E = aVar2.k(intValue);
                return 0;
            case 26:
                psVar.F = aVar2.k(intValue);
                return 0;
            case 27:
                psVar.G = aVar2.k(intValue);
                return 0;
            case 28:
                psVar.H = aVar2.k(intValue);
                return 0;
            case 29:
                psVar.I = aVar2.g(intValue);
                return 0;
            case 30:
                psVar.f383346J = aVar2.k(intValue);
                return 0;
            case 31:
                psVar.K = aVar2.k(intValue);
                return 0;
            case 32:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.gz3 gz3Var3 = new r45.gz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        gz3Var3.parseFrom(bArr2);
                    }
                    psVar.L = gz3Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.hz3 hz3Var3 = new r45.hz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        hz3Var3.parseFrom(bArr3);
                    }
                    psVar.M = hz3Var3;
                }
                return 0;
            case 34:
            default:
                return -1;
            case 35:
                psVar.N = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f383347d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ClientImgId", str, false);
            eVar.d(jSONObject, "FromUserName", this.f383348e, false);
            eVar.d(jSONObject, "ToUserName", this.f383349f, false);
            eVar.d(jSONObject, "ThumbHeight", java.lang.Integer.valueOf(this.f383350g), false);
            eVar.d(jSONObject, "ThumbWidth", java.lang.Integer.valueOf(this.f383351h), false);
            eVar.d(jSONObject, "MsgSource", this.f383352i, false);
            eVar.d(jSONObject, "ClientStat", this.f383353m, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f383354n), false);
            eVar.d(jSONObject, "Longitude", java.lang.Float.valueOf(this.f383355o), false);
            eVar.d(jSONObject, "Latitude", java.lang.Float.valueOf(this.f383356p), false);
            eVar.d(jSONObject, "AttachedContent", this.f383357q, false);
            eVar.d(jSONObject, "MidHeight", java.lang.Integer.valueOf(this.f383358r), false);
            eVar.d(jSONObject, "MidWidth", java.lang.Integer.valueOf(this.f383359s), false);
            eVar.d(jSONObject, "HDHeight", java.lang.Integer.valueOf(this.f383360t), false);
            eVar.d(jSONObject, "HDWidth", java.lang.Integer.valueOf(this.f383361u), false);
            eVar.d(jSONObject, "AESKey", this.f383362v, false);
            eVar.d(jSONObject, "EncryVer", java.lang.Integer.valueOf(this.f383363w), false);
            eVar.d(jSONObject, "CRC32", java.lang.Integer.valueOf(this.f383364x), false);
            eVar.d(jSONObject, "MsgForwardType", java.lang.Integer.valueOf(this.f383365y), false);
            eVar.d(jSONObject, "Source", java.lang.Integer.valueOf(this.f383366z), false);
            eVar.d(jSONObject, "AppId", this.A, false);
            eVar.d(jSONObject, "MessageAction", this.B, false);
            eVar.d(jSONObject, "MessageExt", this.C, false);
            eVar.d(jSONObject, "MediaTagName", this.D, false);
            eVar.d(jSONObject, "SendMsgTicket", this.E, false);
            eVar.d(jSONObject, "PlatformSignature", this.F, false);
            eVar.d(jSONObject, "ImgDataHash", this.G, false);
            eVar.d(jSONObject, "ImgSourceUrl", this.H, false);
            eVar.d(jSONObject, "NoCommit", java.lang.Integer.valueOf(this.I), false);
            eVar.d(jSONObject, "RawMd5", this.f383346J, false);
            eVar.d(jSONObject, "OriginSourceMd5", this.K, false);
            eVar.d(jSONObject, "ImgSourceInfo", this.L, false);
            eVar.d(jSONObject, "ImgWxaInfo", this.M, false);
            eVar.d(jSONObject, "SecHashInfoBase64", this.N, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
