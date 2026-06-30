package r45;

/* loaded from: classes2.dex */
public class ga5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375041d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375043f;

    /* renamed from: g, reason: collision with root package name */
    public long f375044g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ga5)) {
            return false;
        }
        r45.ga5 ga5Var = (r45.ga5) fVar;
        return n51.f.a(this.f375041d, ga5Var.f375041d) && n51.f.a(this.f375042e, ga5Var.f375042e) && n51.f.a(this.f375043f, ga5Var.f375043f) && n51.f.a(java.lang.Long.valueOf(this.f375044g), java.lang.Long.valueOf(ga5Var.f375044g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375041d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375042e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375043f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f375044g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f375041d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f375042e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f375043f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f375044g);
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
        r45.ga5 ga5Var = (r45.ga5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ga5Var.f375041d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ga5Var.f375042e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ga5Var.f375043f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ga5Var.f375044g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f375041d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "userName", str, false);
            eVar.d(jSONObject, "avatarUrl", this.f375042e, false);
            eVar.d(jSONObject, "displayName", this.f375043f, false);
            eVar.d(jSONObject, "selectTime", java.lang.Long.valueOf(this.f375044g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
