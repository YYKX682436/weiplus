package r45;

/* loaded from: classes7.dex */
public class vb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388058d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388059e;

    /* renamed from: f, reason: collision with root package name */
    public int f388060f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sv6 f388061g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388062h;

    /* renamed from: i, reason: collision with root package name */
    public r45.mv5 f388063i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388064m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388065n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388066o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388067p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb)) {
            return false;
        }
        r45.vb vbVar = (r45.vb) fVar;
        return n51.f.a(this.f388058d, vbVar.f388058d) && n51.f.a(this.f388059e, vbVar.f388059e) && n51.f.a(java.lang.Integer.valueOf(this.f388060f), java.lang.Integer.valueOf(vbVar.f388060f)) && n51.f.a(this.f388061g, vbVar.f388061g) && n51.f.a(this.f388062h, vbVar.f388062h) && n51.f.a(this.f388063i, vbVar.f388063i) && n51.f.a(this.f388064m, vbVar.f388064m) && n51.f.a(this.f388065n, vbVar.f388065n) && n51.f.a(this.f388066o, vbVar.f388066o) && n51.f.a(this.f388067p, vbVar.f388067p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388058d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388059e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f388060f);
            r45.sv6 sv6Var = this.f388061g;
            if (sv6Var != null) {
                fVar.i(4, sv6Var.computeSize());
                this.f388061g.writeFields(fVar);
            }
            java.lang.String str3 = this.f388062h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.mv5 mv5Var = this.f388063i;
            if (mv5Var != null) {
                fVar.i(6, mv5Var.computeSize());
                this.f388063i.writeFields(fVar);
            }
            java.lang.String str4 = this.f388064m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f388065n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f388066o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f388067p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f388058d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f388059e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f388060f);
            r45.sv6 sv6Var2 = this.f388061g;
            if (sv6Var2 != null) {
                e17 += b36.f.i(4, sv6Var2.computeSize());
            }
            java.lang.String str10 = this.f388062h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            r45.mv5 mv5Var2 = this.f388063i;
            if (mv5Var2 != null) {
                e17 += b36.f.i(6, mv5Var2.computeSize());
            }
            java.lang.String str11 = this.f388064m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f388065n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f388066o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f388067p;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.vb vbVar = (r45.vb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vbVar.f388058d = aVar2.k(intValue);
                return 0;
            case 2:
                vbVar.f388059e = aVar2.k(intValue);
                return 0;
            case 3:
                vbVar.f388060f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sv6 sv6Var3 = new r45.sv6();
                    if (bArr != null && bArr.length > 0) {
                        sv6Var3.parseFrom(bArr);
                    }
                    vbVar.f388061g = sv6Var3;
                }
                return 0;
            case 5:
                vbVar.f388062h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.mv5 mv5Var3 = new r45.mv5();
                    if (bArr2 != null && bArr2.length > 0) {
                        mv5Var3.parseFrom(bArr2);
                    }
                    vbVar.f388063i = mv5Var3;
                }
                return 0;
            case 7:
                vbVar.f388064m = aVar2.k(intValue);
                return 0;
            case 8:
                vbVar.f388065n = aVar2.k(intValue);
                return 0;
            case 9:
                vbVar.f388066o = aVar2.k(intValue);
                return 0;
            case 10:
                vbVar.f388067p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388058d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "scope", str, false);
            eVar.d(jSONObject, "scopeDesc", this.f388059e, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f388060f), false);
            eVar.d(jSONObject, "userAvatarInfo", this.f388061g, false);
            eVar.d(jSONObject, "scope_sub_desc", this.f388062h, false);
            eVar.d(jSONObject, "risk_popup_info", this.f388063i, false);
            eVar.d(jSONObject, "auth_wording", this.f388064m, false);
            eVar.d(jSONObject, "bottom_desc", this.f388065n, false);
            eVar.d(jSONObject, "scope_sec_desc", this.f388066o, false);
            eVar.d(jSONObject, "item_title", this.f388067p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
