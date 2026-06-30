package r45;

/* loaded from: classes8.dex */
public class bw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371099d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371100e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371101f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371102g;

    /* renamed from: h, reason: collision with root package name */
    public int f371103h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371104i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371105m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371106n;

    /* renamed from: o, reason: collision with root package name */
    public int f371107o;

    /* renamed from: p, reason: collision with root package name */
    public int f371108p;

    /* renamed from: q, reason: collision with root package name */
    public int f371109q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bw5)) {
            return false;
        }
        r45.bw5 bw5Var = (r45.bw5) fVar;
        return n51.f.a(this.f371099d, bw5Var.f371099d) && n51.f.a(this.f371100e, bw5Var.f371100e) && n51.f.a(this.f371101f, bw5Var.f371101f) && n51.f.a(this.f371102g, bw5Var.f371102g) && n51.f.a(java.lang.Integer.valueOf(this.f371103h), java.lang.Integer.valueOf(bw5Var.f371103h)) && n51.f.a(this.f371104i, bw5Var.f371104i) && n51.f.a(this.f371105m, bw5Var.f371105m) && n51.f.a(this.f371106n, bw5Var.f371106n) && n51.f.a(java.lang.Integer.valueOf(this.f371107o), java.lang.Integer.valueOf(bw5Var.f371107o)) && n51.f.a(java.lang.Integer.valueOf(this.f371108p), java.lang.Integer.valueOf(bw5Var.f371108p)) && n51.f.a(java.lang.Integer.valueOf(this.f371109q), java.lang.Integer.valueOf(bw5Var.f371109q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371099d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371100e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f371101f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f371102g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f371103h);
            java.lang.String str5 = this.f371104i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f371105m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f371106n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f371107o);
            fVar.e(10, this.f371108p);
            fVar.e(11, this.f371109q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f371099d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f371100e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f371101f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f371102g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int e17 = j17 + b36.f.e(5, this.f371103h);
            java.lang.String str12 = this.f371104i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f371105m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f371106n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.e(9, this.f371107o) + b36.f.e(10, this.f371108p) + b36.f.e(11, this.f371109q);
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
        r45.bw5 bw5Var = (r45.bw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bw5Var.f371099d = aVar2.k(intValue);
                return 0;
            case 2:
                bw5Var.f371100e = aVar2.k(intValue);
                return 0;
            case 3:
                bw5Var.f371101f = aVar2.k(intValue);
                return 0;
            case 4:
                bw5Var.f371102g = aVar2.k(intValue);
                return 0;
            case 5:
                bw5Var.f371103h = aVar2.g(intValue);
                return 0;
            case 6:
                bw5Var.f371104i = aVar2.k(intValue);
                return 0;
            case 7:
                bw5Var.f371105m = aVar2.k(intValue);
                return 0;
            case 8:
                bw5Var.f371106n = aVar2.k(intValue);
                return 0;
            case 9:
                bw5Var.f371107o = aVar2.g(intValue);
                return 0;
            case 10:
                bw5Var.f371108p = aVar2.g(intValue);
                return 0;
            case 11:
                bw5Var.f371109q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f371099d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f371100e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f371101f, false);
            eVar.d(jSONObject, "Link", this.f371102g, false);
            eVar.d(jSONObject, "ItemShowType", java.lang.Integer.valueOf(this.f371103h), false);
            eVar.d(jSONObject, "SourceUsername", this.f371104i, false);
            eVar.d(jSONObject, "SourceDisplayName", this.f371105m, false);
            eVar.d(jSONObject, "Vid", this.f371106n, false);
            eVar.d(jSONObject, "Duraion", java.lang.Integer.valueOf(this.f371107o), false);
            eVar.d(jSONObject, "Width", java.lang.Integer.valueOf(this.f371108p), false);
            eVar.d(jSONObject, "Height", java.lang.Integer.valueOf(this.f371109q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
