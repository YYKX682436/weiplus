package r45;

/* loaded from: classes8.dex */
public class aw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370304h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370305i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370306m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370307n;

    /* renamed from: o, reason: collision with root package name */
    public int f370308o;

    /* renamed from: p, reason: collision with root package name */
    public int f370309p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370310q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370311r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370312s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370313t;

    /* renamed from: u, reason: collision with root package name */
    public int f370314u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f370315v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw5)) {
            return false;
        }
        r45.aw5 aw5Var = (r45.aw5) fVar;
        return n51.f.a(this.f370300d, aw5Var.f370300d) && n51.f.a(this.f370301e, aw5Var.f370301e) && n51.f.a(this.f370302f, aw5Var.f370302f) && n51.f.a(this.f370303g, aw5Var.f370303g) && n51.f.a(this.f370304h, aw5Var.f370304h) && n51.f.a(this.f370305i, aw5Var.f370305i) && n51.f.a(this.f370306m, aw5Var.f370306m) && n51.f.a(this.f370307n, aw5Var.f370307n) && n51.f.a(java.lang.Integer.valueOf(this.f370308o), java.lang.Integer.valueOf(aw5Var.f370308o)) && n51.f.a(java.lang.Integer.valueOf(this.f370309p), java.lang.Integer.valueOf(aw5Var.f370309p)) && n51.f.a(this.f370310q, aw5Var.f370310q) && n51.f.a(this.f370311r, aw5Var.f370311r) && n51.f.a(this.f370312s, aw5Var.f370312s) && n51.f.a(this.f370313t, aw5Var.f370313t) && n51.f.a(java.lang.Integer.valueOf(this.f370314u), java.lang.Integer.valueOf(aw5Var.f370314u)) && n51.f.a(this.f370315v, aw5Var.f370315v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370300d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370301e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370302f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370303g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f370304h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f370305i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f370306m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f370307n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.e(9, this.f370308o);
            fVar.e(10, this.f370309p);
            com.tencent.mm.protobuf.g gVar = this.f370310q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            java.lang.String str9 = this.f370311r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370312s;
            if (gVar2 != null) {
                fVar.b(13, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f370313t;
            if (gVar3 != null) {
                fVar.b(14, gVar3);
            }
            fVar.e(15, this.f370314u);
            java.lang.String str10 = this.f370315v;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f370300d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f370301e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f370302f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f370303g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f370304h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f370305i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f370306m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f370307n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            int e17 = j17 + b36.f.e(9, this.f370308o) + b36.f.e(10, this.f370309p);
            com.tencent.mm.protobuf.g gVar4 = this.f370310q;
            if (gVar4 != null) {
                e17 += b36.f.b(11, gVar4);
            }
            java.lang.String str19 = this.f370311r;
            if (str19 != null) {
                e17 += b36.f.j(12, str19);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f370312s;
            if (gVar5 != null) {
                e17 += b36.f.b(13, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f370313t;
            if (gVar6 != null) {
                e17 += b36.f.b(14, gVar6);
            }
            int e18 = e17 + b36.f.e(15, this.f370314u);
            java.lang.String str20 = this.f370315v;
            return str20 != null ? e18 + b36.f.j(16, str20) : e18;
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
        r45.aw5 aw5Var = (r45.aw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aw5Var.f370300d = aVar2.k(intValue);
                return 0;
            case 2:
                aw5Var.f370301e = aVar2.k(intValue);
                return 0;
            case 3:
                aw5Var.f370302f = aVar2.k(intValue);
                return 0;
            case 4:
                aw5Var.f370303g = aVar2.k(intValue);
                return 0;
            case 5:
                aw5Var.f370304h = aVar2.k(intValue);
                return 0;
            case 6:
                aw5Var.f370305i = aVar2.k(intValue);
                return 0;
            case 7:
                aw5Var.f370306m = aVar2.k(intValue);
                return 0;
            case 8:
                aw5Var.f370307n = aVar2.k(intValue);
                return 0;
            case 9:
                aw5Var.f370308o = aVar2.g(intValue);
                return 0;
            case 10:
                aw5Var.f370309p = aVar2.g(intValue);
                return 0;
            case 11:
                aw5Var.f370310q = aVar2.d(intValue);
                return 0;
            case 12:
                aw5Var.f370311r = aVar2.k(intValue);
                return 0;
            case 13:
                aw5Var.f370312s = aVar2.d(intValue);
                return 0;
            case 14:
                aw5Var.f370313t = aVar2.d(intValue);
                return 0;
            case 15:
                aw5Var.f370314u = aVar2.g(intValue);
                return 0;
            case 16:
                aw5Var.f370315v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f370300d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Username", str, false);
            eVar.d(jSONObject, "NickName", this.f370301e, false);
            eVar.d(jSONObject, "Fullpy", this.f370302f, false);
            eVar.d(jSONObject, "AliasName", this.f370303g, false);
            eVar.d(jSONObject, "Country", this.f370304h, false);
            eVar.d(jSONObject, "Province", this.f370305i, false);
            eVar.d(jSONObject, "City", this.f370306m, false);
            eVar.d(jSONObject, "Signature", this.f370307n, false);
            eVar.d(jSONObject, "Sex", java.lang.Integer.valueOf(this.f370308o), false);
            eVar.d(jSONObject, "VerifyFlag", java.lang.Integer.valueOf(this.f370309p), false);
            eVar.d(jSONObject, "CertInfo", this.f370310q, false);
            eVar.d(jSONObject, "BrandIconUrl", this.f370311r, false);
            eVar.d(jSONObject, "ExternalInfo", this.f370312s, false);
            eVar.d(jSONObject, "BrandInfo", this.f370313t, false);
            eVar.d(jSONObject, "BrandFlag", java.lang.Integer.valueOf(this.f370314u), false);
            eVar.d(jSONObject, "HeadImgUrl", this.f370315v, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
