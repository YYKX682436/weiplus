package r45;

/* loaded from: classes8.dex */
public class lw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379889d;

    /* renamed from: e, reason: collision with root package name */
    public int f379890e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379891f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379892g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379893h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379894i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379895m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379896n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379897o;

    /* renamed from: p, reason: collision with root package name */
    public int f379898p;

    /* renamed from: q, reason: collision with root package name */
    public int f379899q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379900r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379901s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lw5)) {
            return false;
        }
        r45.lw5 lw5Var = (r45.lw5) fVar;
        return n51.f.a(this.f379889d, lw5Var.f379889d) && n51.f.a(java.lang.Integer.valueOf(this.f379890e), java.lang.Integer.valueOf(lw5Var.f379890e)) && n51.f.a(this.f379891f, lw5Var.f379891f) && n51.f.a(this.f379892g, lw5Var.f379892g) && n51.f.a(this.f379893h, lw5Var.f379893h) && n51.f.a(this.f379894i, lw5Var.f379894i) && n51.f.a(this.f379895m, lw5Var.f379895m) && n51.f.a(this.f379896n, lw5Var.f379896n) && n51.f.a(this.f379897o, lw5Var.f379897o) && n51.f.a(java.lang.Integer.valueOf(this.f379898p), java.lang.Integer.valueOf(lw5Var.f379898p)) && n51.f.a(java.lang.Integer.valueOf(this.f379899q), java.lang.Integer.valueOf(lw5Var.f379899q)) && n51.f.a(this.f379900r, lw5Var.f379900r) && n51.f.a(this.f379901s, lw5Var.f379901s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379889d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f379890e);
            java.lang.String str2 = this.f379891f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379892g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379893h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379894i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379895m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379896n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f379897o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f379898p);
            fVar.e(11, this.f379899q);
            java.lang.String str9 = this.f379900r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f379901s;
            if (str10 == null) {
                return 0;
            }
            fVar.j(13, str10);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f379889d;
            int j17 = (str11 != null ? 0 + b36.f.j(1, str11) : 0) + b36.f.e(2, this.f379890e);
            java.lang.String str12 = this.f379891f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f379892g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f379893h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f379894i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f379895m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f379896n;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f379897o;
            if (str18 != null) {
                j17 += b36.f.j(9, str18);
            }
            int e17 = j17 + b36.f.e(10, this.f379898p) + b36.f.e(11, this.f379899q);
            java.lang.String str19 = this.f379900r;
            if (str19 != null) {
                e17 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f379901s;
            return str20 != null ? e17 + b36.f.j(13, str20) : e17;
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
        r45.lw5 lw5Var = (r45.lw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lw5Var.f379889d = aVar2.k(intValue);
                return 0;
            case 2:
                lw5Var.f379890e = aVar2.g(intValue);
                return 0;
            case 3:
                lw5Var.f379891f = aVar2.k(intValue);
                return 0;
            case 4:
                lw5Var.f379892g = aVar2.k(intValue);
                return 0;
            case 5:
                lw5Var.f379893h = aVar2.k(intValue);
                return 0;
            case 6:
                lw5Var.f379894i = aVar2.k(intValue);
                return 0;
            case 7:
                lw5Var.f379895m = aVar2.k(intValue);
                return 0;
            case 8:
                lw5Var.f379896n = aVar2.k(intValue);
                return 0;
            case 9:
                lw5Var.f379897o = aVar2.k(intValue);
                return 0;
            case 10:
                lw5Var.f379898p = aVar2.g(intValue);
                return 0;
            case 11:
                lw5Var.f379899q = aVar2.g(intValue);
                return 0;
            case 12:
                lw5Var.f379900r = aVar2.k(intValue);
                return 0;
            case 13:
                lw5Var.f379901s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f379889d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "EmoticonMD5", str, false);
            eVar.d(jSONObject, "EmoticonType", java.lang.Integer.valueOf(this.f379890e), false);
            eVar.d(jSONObject, "EmoticonProductId", this.f379891f, false);
            eVar.d(jSONObject, "ThumbImgUrl", this.f379892g, false);
            eVar.d(jSONObject, "DesignerId", this.f379893h, false);
            eVar.d(jSONObject, "ActivityId", this.f379894i, false);
            eVar.d(jSONObject, "AttachedText", this.f379895m, false);
            eVar.d(jSONObject, "AttachedTextColor", this.f379896n, false);
            eVar.d(jSONObject, "LensId", this.f379897o, false);
            eVar.d(jSONObject, "EmoticonWidth", java.lang.Integer.valueOf(this.f379898p), false);
            eVar.d(jSONObject, "EmoticonHeight", java.lang.Integer.valueOf(this.f379899q), false);
            eVar.d(jSONObject, "EncryptUrl", this.f379900r, false);
            eVar.d(jSONObject, "AesKey", this.f379901s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
