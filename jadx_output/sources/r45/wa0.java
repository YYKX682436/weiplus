package r45;

/* loaded from: classes8.dex */
public class wa0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389002e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389003f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389004g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa0)) {
            return false;
        }
        r45.wa0 wa0Var = (r45.wa0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389001d), java.lang.Integer.valueOf(wa0Var.f389001d)) && n51.f.a(this.f389002e, wa0Var.f389002e) && n51.f.a(this.f389003f, wa0Var.f389003f) && n51.f.a(this.f389004g, wa0Var.f389004g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389001d);
            java.lang.String str = this.f389002e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389003f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f389004g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389001d) + 0;
            java.lang.String str4 = this.f389002e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f389003f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f389004g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.wa0 wa0Var = (r45.wa0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wa0Var.f389001d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wa0Var.f389002e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wa0Var.f389003f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wa0Var.f389004g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f389001d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BrandFlag", valueOf, false);
            eVar.d(jSONObject, "ExternalInfo", this.f389002e, false);
            eVar.d(jSONObject, "BrandInfo", this.f389003f, false);
            eVar.d(jSONObject, "BrandIconURL", this.f389004g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
