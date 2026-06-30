package r45;

/* loaded from: classes2.dex */
public class j95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377670g;

    /* renamed from: h, reason: collision with root package name */
    public float f377671h;

    /* renamed from: i, reason: collision with root package name */
    public float f377672i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377673m;

    /* renamed from: n, reason: collision with root package name */
    public long f377674n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j95)) {
            return false;
        }
        r45.j95 j95Var = (r45.j95) fVar;
        return n51.f.a(this.f377667d, j95Var.f377667d) && n51.f.a(this.f377668e, j95Var.f377668e) && n51.f.a(this.f377669f, j95Var.f377669f) && n51.f.a(this.f377670g, j95Var.f377670g) && n51.f.a(java.lang.Float.valueOf(this.f377671h), java.lang.Float.valueOf(j95Var.f377671h)) && n51.f.a(java.lang.Float.valueOf(this.f377672i), java.lang.Float.valueOf(j95Var.f377672i)) && n51.f.a(this.f377673m, j95Var.f377673m) && n51.f.a(java.lang.Long.valueOf(this.f377674n), java.lang.Long.valueOf(j95Var.f377674n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377667d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377668e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377669f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f377670g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.d(5, this.f377671h);
            fVar.d(6, this.f377672i);
            java.lang.String str5 = this.f377673m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f377674n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f377667d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f377668e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f377669f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f377670g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int d17 = j17 + b36.f.d(5, this.f377671h) + b36.f.d(6, this.f377672i);
            java.lang.String str10 = this.f377673m;
            if (str10 != null) {
                d17 += b36.f.j(7, str10);
            }
            return d17 + b36.f.h(8, this.f377674n);
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
        r45.j95 j95Var = (r45.j95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j95Var.f377667d = aVar2.k(intValue);
                return 0;
            case 2:
                j95Var.f377668e = aVar2.k(intValue);
                return 0;
            case 3:
                j95Var.f377669f = aVar2.k(intValue);
                return 0;
            case 4:
                j95Var.f377670g = aVar2.k(intValue);
                return 0;
            case 5:
                j95Var.f377671h = aVar2.f(intValue);
                return 0;
            case 6:
                j95Var.f377672i = aVar2.f(intValue);
                return 0;
            case 7:
                j95Var.f377673m = aVar2.k(intValue);
                return 0;
            case 8:
                j95Var.f377674n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f377667d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "PoiID", str, false);
            eVar.d(jSONObject, "Country", this.f377668e, false);
            eVar.d(jSONObject, "City", this.f377669f, false);
            eVar.d(jSONObject, "PoiName", this.f377670g, false);
            eVar.d(jSONObject, "Latitude", java.lang.Float.valueOf(this.f377671h), false);
            eVar.d(jSONObject, "Longitude", java.lang.Float.valueOf(this.f377672i), false);
            eVar.d(jSONObject, "PoiQuery", this.f377673m, false);
            eVar.d(jSONObject, "SnsID", java.lang.Long.valueOf(this.f377674n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
