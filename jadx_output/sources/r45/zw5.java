package r45;

/* loaded from: classes8.dex */
public class zw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392435d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392436e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392437f;

    /* renamed from: g, reason: collision with root package name */
    public int f392438g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392439h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392440i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392441m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392442n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392443o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392444p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw5)) {
            return false;
        }
        r45.zw5 zw5Var = (r45.zw5) fVar;
        return n51.f.a(this.f392435d, zw5Var.f392435d) && n51.f.a(this.f392436e, zw5Var.f392436e) && n51.f.a(this.f392437f, zw5Var.f392437f) && n51.f.a(java.lang.Integer.valueOf(this.f392438g), java.lang.Integer.valueOf(zw5Var.f392438g)) && n51.f.a(this.f392439h, zw5Var.f392439h) && n51.f.a(this.f392440i, zw5Var.f392440i) && n51.f.a(this.f392441m, zw5Var.f392441m) && n51.f.a(this.f392442n, zw5Var.f392442n) && n51.f.a(this.f392443o, zw5Var.f392443o) && n51.f.a(this.f392444p, zw5Var.f392444p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392435d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392436e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f392437f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f392438g);
            java.lang.String str4 = this.f392439h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f392440i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f392441m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f392442n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f392443o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f392444p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f392435d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f392436e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f392437f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            int e17 = j17 + b36.f.e(4, this.f392438g);
            java.lang.String str13 = this.f392439h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f392440i;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f392441m;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f392442n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f392443o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f392444p;
            return str18 != null ? e17 + b36.f.j(10, str18) : e17;
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
        r45.zw5 zw5Var = (r45.zw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zw5Var.f392435d = aVar2.k(intValue);
                return 0;
            case 2:
                zw5Var.f392436e = aVar2.k(intValue);
                return 0;
            case 3:
                zw5Var.f392437f = aVar2.k(intValue);
                return 0;
            case 4:
                zw5Var.f392438g = aVar2.g(intValue);
                return 0;
            case 5:
                zw5Var.f392439h = aVar2.k(intValue);
                return 0;
            case 6:
                zw5Var.f392440i = aVar2.k(intValue);
                return 0;
            case 7:
                zw5Var.f392441m = aVar2.k(intValue);
                return 0;
            case 8:
                zw5Var.f392442n = aVar2.k(intValue);
                return 0;
            case 9:
                zw5Var.f392443o = aVar2.k(intValue);
                return 0;
            case 10:
                zw5Var.f392444p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f392435d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "AppId", str, false);
            eVar.d(jSONObject, "Page", this.f392436e, false);
            eVar.d(jSONObject, "Query", this.f392437f, false);
            eVar.d(jSONObject, "SourceType", java.lang.Integer.valueOf(this.f392438g), false);
            eVar.d(jSONObject, "MinVersion", this.f392439h, false);
            eVar.d(jSONObject, "Title", this.f392440i, false);
            eVar.d(jSONObject, "Desc", this.f392441m, false);
            eVar.d(jSONObject, "ThumbUrl", this.f392442n, false);
            eVar.d(jSONObject, "SrcId", this.f392443o, false);
            eVar.d(jSONObject, "NsLink", this.f392444p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
