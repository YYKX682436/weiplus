package r45;

/* loaded from: classes8.dex */
public class e64 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f373046d;

    /* renamed from: e, reason: collision with root package name */
    public float f373047e;

    /* renamed from: f, reason: collision with root package name */
    public int f373048f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373050h;

    /* renamed from: i, reason: collision with root package name */
    public int f373051i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373052m;

    /* renamed from: n, reason: collision with root package name */
    public int f373053n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e64)) {
            return false;
        }
        r45.e64 e64Var = (r45.e64) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f373046d), java.lang.Float.valueOf(e64Var.f373046d)) && n51.f.a(java.lang.Float.valueOf(this.f373047e), java.lang.Float.valueOf(e64Var.f373047e)) && n51.f.a(java.lang.Integer.valueOf(this.f373048f), java.lang.Integer.valueOf(e64Var.f373048f)) && n51.f.a(this.f373049g, e64Var.f373049g) && n51.f.a(this.f373050h, e64Var.f373050h) && n51.f.a(java.lang.Integer.valueOf(this.f373051i), java.lang.Integer.valueOf(e64Var.f373051i)) && n51.f.a(this.f373052m, e64Var.f373052m) && n51.f.a(java.lang.Integer.valueOf(this.f373053n), java.lang.Integer.valueOf(e64Var.f373053n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f373046d);
            fVar.d(2, this.f373047e);
            fVar.e(3, this.f373048f);
            java.lang.String str = this.f373049g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f373050h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f373051i);
            java.lang.String str3 = this.f373052m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f373053n);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f373046d) + 0 + b36.f.d(2, this.f373047e) + b36.f.e(3, this.f373048f);
            java.lang.String str4 = this.f373049g;
            if (str4 != null) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f373050h;
            if (str5 != null) {
                d17 += b36.f.j(5, str5);
            }
            int e17 = d17 + b36.f.e(6, this.f373051i);
            java.lang.String str6 = this.f373052m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f373053n);
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
        r45.e64 e64Var = (r45.e64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e64Var.f373046d = aVar2.f(intValue);
                return 0;
            case 2:
                e64Var.f373047e = aVar2.f(intValue);
                return 0;
            case 3:
                e64Var.f373048f = aVar2.g(intValue);
                return 0;
            case 4:
                e64Var.f373049g = aVar2.k(intValue);
                return 0;
            case 5:
                e64Var.f373050h = aVar2.k(intValue);
                return 0;
            case 6:
                e64Var.f373051i = aVar2.g(intValue);
                return 0;
            case 7:
                e64Var.f373052m = aVar2.k(intValue);
                return 0;
            case 8:
                e64Var.f373053n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Float valueOf = java.lang.Float.valueOf(this.f373046d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Longitude", valueOf, false);
            eVar.d(jSONObject, "Latitude", java.lang.Float.valueOf(this.f373047e), false);
            eVar.d(jSONObject, "Precision", java.lang.Integer.valueOf(this.f373048f), false);
            eVar.d(jSONObject, "MacAddr", this.f373049g, false);
            eVar.d(jSONObject, "CellId", this.f373050h, false);
            eVar.d(jSONObject, "GPSSource", java.lang.Integer.valueOf(this.f373051i), false);
            eVar.d(jSONObject, "Address", this.f373052m, false);
            eVar.d(jSONObject, "AddrFlag", java.lang.Integer.valueOf(this.f373053n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
