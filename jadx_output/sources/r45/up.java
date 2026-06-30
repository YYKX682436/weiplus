package r45;

/* loaded from: classes2.dex */
public class up extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387539e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387540f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387541g;

    /* renamed from: h, reason: collision with root package name */
    public int f387542h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387543i;

    /* renamed from: m, reason: collision with root package name */
    public int f387544m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up)) {
            return false;
        }
        r45.up upVar = (r45.up) fVar;
        return n51.f.a(this.f387538d, upVar.f387538d) && n51.f.a(this.f387539e, upVar.f387539e) && n51.f.a(this.f387540f, upVar.f387540f) && n51.f.a(this.f387541g, upVar.f387541g) && n51.f.a(java.lang.Integer.valueOf(this.f387542h), java.lang.Integer.valueOf(upVar.f387542h)) && n51.f.a(this.f387543i, upVar.f387543i) && n51.f.a(java.lang.Integer.valueOf(this.f387544m), java.lang.Integer.valueOf(upVar.f387544m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387538d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387539e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387540f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387541g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f387542h);
            java.lang.String str5 = this.f387543i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f387544m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f387538d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f387539e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f387540f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f387541g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f387542h);
            java.lang.String str10 = this.f387543i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f387544m);
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
        r45.up upVar = (r45.up) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                upVar.f387538d = aVar2.k(intValue);
                return 0;
            case 2:
                upVar.f387539e = aVar2.k(intValue);
                return 0;
            case 3:
                upVar.f387540f = aVar2.k(intValue);
                return 0;
            case 4:
                upVar.f387541g = aVar2.k(intValue);
                return 0;
            case 5:
                upVar.f387542h = aVar2.g(intValue);
                return 0;
            case 6:
                upVar.f387543i = aVar2.k(intValue);
                return 0;
            case 7:
                upVar.f387544m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f387538d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Url", this.f387539e, false);
            eVar.d(jSONObject, "Position", this.f387540f, false);
            eVar.d(jSONObject, "DetailInfo", this.f387541g, false);
            eVar.d(jSONObject, "StarLevel", java.lang.Integer.valueOf(this.f387542h), false);
            eVar.d(jSONObject, "Average", this.f387543i, false);
            eVar.d(jSONObject, "PoiFlag", java.lang.Integer.valueOf(this.f387544m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
