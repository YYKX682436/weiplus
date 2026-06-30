package r45;

/* loaded from: classes4.dex */
public class vb6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388077d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388078e;

    /* renamed from: f, reason: collision with root package name */
    public int f388079f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388080g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388081h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388082i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388083m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388084n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb6)) {
            return false;
        }
        r45.vb6 vb6Var = (r45.vb6) fVar;
        return n51.f.a(this.f388077d, vb6Var.f388077d) && n51.f.a(this.f388078e, vb6Var.f388078e) && n51.f.a(java.lang.Integer.valueOf(this.f388079f), java.lang.Integer.valueOf(vb6Var.f388079f)) && n51.f.a(this.f388080g, vb6Var.f388080g) && n51.f.a(this.f388081h, vb6Var.f388081h) && n51.f.a(this.f388082i, vb6Var.f388082i) && n51.f.a(this.f388083m, vb6Var.f388083m) && n51.f.a(this.f388084n, vb6Var.f388084n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388077d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388078e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f388079f);
            java.lang.String str3 = this.f388080g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f388081h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f388082i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f388083m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f388084n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f388077d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f388078e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f388079f);
            java.lang.String str10 = this.f388080g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f388081h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f388082i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f388083m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f388084n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        r45.vb6 vb6Var = (r45.vb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vb6Var.f388077d = aVar2.k(intValue);
                return 0;
            case 2:
                vb6Var.f388078e = aVar2.k(intValue);
                return 0;
            case 3:
                vb6Var.f388079f = aVar2.g(intValue);
                return 0;
            case 4:
                vb6Var.f388080g = aVar2.k(intValue);
                return 0;
            case 5:
                vb6Var.f388081h = aVar2.k(intValue);
                return 0;
            case 6:
                vb6Var.f388082i = aVar2.k(intValue);
                return 0;
            case 7:
                vb6Var.f388083m = aVar2.k(intValue);
                return 0;
            case 8:
                vb6Var.f388084n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388077d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Signature", str, false);
            eVar.d(jSONObject, "BGurl", this.f388078e, false);
            eVar.d(jSONObject, "BGsize", java.lang.Integer.valueOf(this.f388079f), false);
            eVar.d(jSONObject, "BGmd5sum", this.f388080g, false);
            eVar.d(jSONObject, "BGaeskey", this.f388081h, false);
            eVar.d(jSONObject, "BGauthkey", this.f388082i, false);
            eVar.d(jSONObject, "BGid", this.f388083m, false);
            eVar.d(jSONObject, "BGfileid", this.f388084n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
