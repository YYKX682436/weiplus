package r45;

/* loaded from: classes8.dex */
public class va0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388022e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388023f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388024g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va0)) {
            return false;
        }
        r45.va0 va0Var = (r45.va0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388021d), java.lang.Integer.valueOf(va0Var.f388021d)) && n51.f.a(this.f388022e, va0Var.f388022e) && n51.f.a(this.f388023f, va0Var.f388023f) && n51.f.a(this.f388024g, va0Var.f388024g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388021d);
            java.lang.String str = this.f388022e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388023f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f388024g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388021d) + 0;
            java.lang.String str4 = this.f388022e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f388023f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388024g;
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
        r45.va0 va0Var = (r45.va0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            va0Var.f388021d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            va0Var.f388022e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            va0Var.f388023f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        va0Var.f388024g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f388021d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BrandFlag", valueOf, false);
            eVar.d(jSONObject, "ExternalInfo", this.f388022e, false);
            eVar.d(jSONObject, "BrandInfo", this.f388023f, false);
            eVar.d(jSONObject, "BrandIconURL", this.f388024g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
