package r45;

/* loaded from: classes8.dex */
public class lx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379951e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379952f;

    /* renamed from: g, reason: collision with root package name */
    public int f379953g;

    /* renamed from: h, reason: collision with root package name */
    public int f379954h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379955i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379956m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx5)) {
            return false;
        }
        r45.lx5 lx5Var = (r45.lx5) fVar;
        return n51.f.a(this.f379950d, lx5Var.f379950d) && n51.f.a(this.f379951e, lx5Var.f379951e) && n51.f.a(this.f379952f, lx5Var.f379952f) && n51.f.a(java.lang.Integer.valueOf(this.f379953g), java.lang.Integer.valueOf(lx5Var.f379953g)) && n51.f.a(java.lang.Integer.valueOf(this.f379954h), java.lang.Integer.valueOf(lx5Var.f379954h)) && n51.f.a(this.f379955i, lx5Var.f379955i) && n51.f.a(this.f379956m, lx5Var.f379956m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379950d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379951e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379952f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f379953g);
            fVar.e(5, this.f379954h);
            java.lang.String str4 = this.f379955i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f379956m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f379950d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f379951e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f379952f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f379953g) + b36.f.e(5, this.f379954h);
            java.lang.String str8 = this.f379955i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379956m;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        r45.lx5 lx5Var = (r45.lx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lx5Var.f379950d = aVar2.k(intValue);
                return 0;
            case 2:
                lx5Var.f379951e = aVar2.k(intValue);
                return 0;
            case 3:
                lx5Var.f379952f = aVar2.k(intValue);
                return 0;
            case 4:
                lx5Var.f379953g = aVar2.g(intValue);
                return 0;
            case 5:
                lx5Var.f379954h = aVar2.g(intValue);
                return 0;
            case 6:
                lx5Var.f379955i = aVar2.k(intValue);
                return 0;
            case 7:
                lx5Var.f379956m = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f379950d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "SessionId", str, false);
            eVar.d(jSONObject, "SearchId", this.f379951e, false);
            eVar.d(jSONObject, "RequestId", this.f379952f, false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f379953g), false);
            eVar.d(jSONObject, "SubType", java.lang.Integer.valueOf(this.f379954h), false);
            eVar.d(jSONObject, "DocID", this.f379955i, false);
            eVar.d(jSONObject, "ExtendInfo", this.f379956m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
