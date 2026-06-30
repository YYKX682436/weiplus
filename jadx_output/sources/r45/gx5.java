package r45;

/* loaded from: classes12.dex */
public class gx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f375614d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f375615e;

    /* renamed from: f, reason: collision with root package name */
    public int f375616f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375617g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375618h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375619i;

    /* renamed from: m, reason: collision with root package name */
    public int f375620m;

    /* renamed from: n, reason: collision with root package name */
    public int f375621n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375622o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375623p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375624q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f375625r;

    /* renamed from: s, reason: collision with root package name */
    public int f375626s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f375627t;

    /* renamed from: u, reason: collision with root package name */
    public r45.wa0 f375628u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f375629v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f375630w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx5)) {
            return false;
        }
        r45.gx5 gx5Var = (r45.gx5) fVar;
        return n51.f.a(this.f375614d, gx5Var.f375614d) && n51.f.a(this.f375615e, gx5Var.f375615e) && n51.f.a(java.lang.Integer.valueOf(this.f375616f), java.lang.Integer.valueOf(gx5Var.f375616f)) && n51.f.a(this.f375617g, gx5Var.f375617g) && n51.f.a(this.f375618h, gx5Var.f375618h) && n51.f.a(this.f375619i, gx5Var.f375619i) && n51.f.a(java.lang.Integer.valueOf(this.f375620m), java.lang.Integer.valueOf(gx5Var.f375620m)) && n51.f.a(java.lang.Integer.valueOf(this.f375621n), java.lang.Integer.valueOf(gx5Var.f375621n)) && n51.f.a(this.f375622o, gx5Var.f375622o) && n51.f.a(this.f375623p, gx5Var.f375623p) && n51.f.a(this.f375624q, gx5Var.f375624q) && n51.f.a(this.f375625r, gx5Var.f375625r) && n51.f.a(java.lang.Integer.valueOf(this.f375626s), java.lang.Integer.valueOf(gx5Var.f375626s)) && n51.f.a(this.f375627t, gx5Var.f375627t) && n51.f.a(this.f375628u, gx5Var.f375628u) && n51.f.a(this.f375629v, gx5Var.f375629v) && n51.f.a(this.f375630w, gx5Var.f375630w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f375614d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f375614d.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f375615e;
            if (du5Var2 != null) {
                fVar.i(2, du5Var2.computeSize());
                this.f375615e.writeFields(fVar);
            }
            fVar.e(3, this.f375616f);
            java.lang.String str = this.f375617g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f375618h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f375619i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f375620m);
            fVar.e(8, this.f375621n);
            java.lang.String str4 = this.f375622o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f375623p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f375624q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f375625r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(13, this.f375626s);
            java.lang.String str8 = this.f375627t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            r45.wa0 wa0Var = this.f375628u;
            if (wa0Var != null) {
                fVar.i(15, wa0Var.computeSize());
                this.f375628u.writeFields(fVar);
            }
            java.lang.String str9 = this.f375629v;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f375630w;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f375614d;
            int i18 = du5Var3 != null ? b36.f.i(1, du5Var3.computeSize()) + 0 : 0;
            r45.du5 du5Var4 = this.f375615e;
            if (du5Var4 != null) {
                i18 += b36.f.i(2, du5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f375616f);
            java.lang.String str11 = this.f375617g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f375618h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f375619i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            int e18 = e17 + b36.f.e(7, this.f375620m) + b36.f.e(8, this.f375621n);
            java.lang.String str14 = this.f375622o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f375623p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f375624q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f375625r;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            int e19 = e18 + b36.f.e(13, this.f375626s);
            java.lang.String str18 = this.f375627t;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            r45.wa0 wa0Var2 = this.f375628u;
            if (wa0Var2 != null) {
                e19 += b36.f.i(15, wa0Var2.computeSize());
            }
            java.lang.String str19 = this.f375629v;
            if (str19 != null) {
                e19 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f375630w;
            return str20 != null ? e19 + b36.f.j(17, str20) : e19;
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
        r45.gx5 gx5Var = (r45.gx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    gx5Var.f375614d = du5Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    gx5Var.f375615e = du5Var6;
                }
                return 0;
            case 3:
                gx5Var.f375616f = aVar2.g(intValue);
                return 0;
            case 4:
                gx5Var.f375617g = aVar2.k(intValue);
                return 0;
            case 5:
                gx5Var.f375618h = aVar2.k(intValue);
                return 0;
            case 6:
                gx5Var.f375619i = aVar2.k(intValue);
                return 0;
            case 7:
                gx5Var.f375620m = aVar2.g(intValue);
                return 0;
            case 8:
                gx5Var.f375621n = aVar2.g(intValue);
                return 0;
            case 9:
                gx5Var.f375622o = aVar2.k(intValue);
                return 0;
            case 10:
                gx5Var.f375623p = aVar2.k(intValue);
                return 0;
            case 11:
                gx5Var.f375624q = aVar2.k(intValue);
                return 0;
            case 12:
                gx5Var.f375625r = aVar2.k(intValue);
                return 0;
            case 13:
                gx5Var.f375626s = aVar2.g(intValue);
                return 0;
            case 14:
                gx5Var.f375627t = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.wa0 wa0Var3 = new r45.wa0();
                    if (bArr3 != null && bArr3.length > 0) {
                        wa0Var3.parseFrom(bArr3);
                    }
                    gx5Var.f375628u = wa0Var3;
                }
                return 0;
            case 16:
                gx5Var.f375629v = aVar2.k(intValue);
                return 0;
            case 17:
                gx5Var.f375630w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f375614d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "NickName", this.f375615e, false);
            eVar.d(jSONObject, "Sex", java.lang.Integer.valueOf(this.f375616f), false);
            eVar.d(jSONObject, "Province", this.f375617g, false);
            eVar.d(jSONObject, "City", this.f375618h, false);
            eVar.d(jSONObject, "Signature", this.f375619i, false);
            eVar.d(jSONObject, "PersonalCard", java.lang.Integer.valueOf(this.f375620m), false);
            eVar.d(jSONObject, "VerifyFlag", java.lang.Integer.valueOf(this.f375621n), false);
            eVar.d(jSONObject, "VerifyInfo", this.f375622o, false);
            eVar.d(jSONObject, "Weibo", this.f375623p, false);
            eVar.d(jSONObject, "Alias", this.f375624q, false);
            eVar.d(jSONObject, "WeiboNickname", this.f375625r, false);
            eVar.d(jSONObject, "WeiboFlag", java.lang.Integer.valueOf(this.f375626s), false);
            eVar.d(jSONObject, "Country", this.f375627t, false);
            eVar.d(jSONObject, "CustomizedInfo", this.f375628u, false);
            eVar.d(jSONObject, "BigHeadImgUrl", this.f375629v, false);
            eVar.d(jSONObject, "SmallHeadImgUrl", this.f375630w, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
