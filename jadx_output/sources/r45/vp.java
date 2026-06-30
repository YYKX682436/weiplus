package r45;

/* loaded from: classes2.dex */
public class vp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388414e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388415f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388416g;

    /* renamed from: h, reason: collision with root package name */
    public int f388417h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388418i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vp)) {
            return false;
        }
        r45.vp vpVar = (r45.vp) fVar;
        return n51.f.a(this.f388413d, vpVar.f388413d) && n51.f.a(this.f388414e, vpVar.f388414e) && n51.f.a(this.f388415f, vpVar.f388415f) && n51.f.a(this.f388416g, vpVar.f388416g) && n51.f.a(java.lang.Integer.valueOf(this.f388417h), java.lang.Integer.valueOf(vpVar.f388417h)) && n51.f.a(this.f388418i, vpVar.f388418i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388413d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388414e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388415f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388416g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f388417h);
            java.lang.String str5 = this.f388418i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f388413d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f388414e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f388415f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f388416g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f388417h);
            java.lang.String str10 = this.f388418i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.vp vpVar = (r45.vp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vpVar.f388413d = aVar2.k(intValue);
                return 0;
            case 2:
                vpVar.f388414e = aVar2.k(intValue);
                return 0;
            case 3:
                vpVar.f388415f = aVar2.k(intValue);
                return 0;
            case 4:
                vpVar.f388416g = aVar2.k(intValue);
                return 0;
            case 5:
                vpVar.f388417h = aVar2.g(intValue);
                return 0;
            case 6:
                vpVar.f388418i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388413d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ProductId", str, false);
            eVar.d(jSONObject, "ProductName", this.f388414e, false);
            eVar.d(jSONObject, "SellerName", this.f388415f, false);
            eVar.d(jSONObject, "SellerUserName", this.f388416g, false);
            eVar.d(jSONObject, "Price", java.lang.Integer.valueOf(this.f388417h), false);
            eVar.d(jSONObject, "ProductImgUrl", this.f388418i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
