package r45;

/* loaded from: classes8.dex */
public class rn3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385022d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385023e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385024f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385025g;

    /* renamed from: h, reason: collision with root package name */
    public int f385026h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385027i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385028m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rn3)) {
            return false;
        }
        r45.rn3 rn3Var = (r45.rn3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385022d), java.lang.Integer.valueOf(rn3Var.f385022d)) && n51.f.a(this.f385023e, rn3Var.f385023e) && n51.f.a(this.f385024f, rn3Var.f385024f) && n51.f.a(this.f385025g, rn3Var.f385025g) && n51.f.a(java.lang.Integer.valueOf(this.f385026h), java.lang.Integer.valueOf(rn3Var.f385026h)) && n51.f.a(this.f385027i, rn3Var.f385027i) && n51.f.a(this.f385028m, rn3Var.f385028m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385022d);
            java.lang.String str = this.f385023e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385024f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f385025g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f385026h);
            java.lang.String str4 = this.f385027i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f385028m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385022d) + 0;
            java.lang.String str6 = this.f385023e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385024f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385025g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f385026h);
            java.lang.String str9 = this.f385027i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f385028m;
            return str10 != null ? e18 + b36.f.j(7, str10) : e18;
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
        r45.rn3 rn3Var = (r45.rn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rn3Var.f385022d = aVar2.g(intValue);
                return 0;
            case 2:
                rn3Var.f385023e = aVar2.k(intValue);
                return 0;
            case 3:
                rn3Var.f385024f = aVar2.k(intValue);
                return 0;
            case 4:
                rn3Var.f385025g = aVar2.k(intValue);
                return 0;
            case 5:
                rn3Var.f385026h = aVar2.g(intValue);
                return 0;
            case 6:
                rn3Var.f385027i = aVar2.k(intValue);
                return 0;
            case 7:
                rn3Var.f385028m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f385022d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "SessionId", this.f385023e, false);
            eVar.d(jSONObject, "RequestId", this.f385024f, false);
            eVar.d(jSONObject, "SearchId", this.f385025g, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f385026h), false);
            eVar.d(jSONObject, "Query", this.f385027i, false);
            eVar.d(jSONObject, "Content", this.f385028m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
