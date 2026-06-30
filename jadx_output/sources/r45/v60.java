package r45;

/* loaded from: classes11.dex */
public class v60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387933e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387934f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387935g;

    /* renamed from: h, reason: collision with root package name */
    public int f387936h;

    /* renamed from: i, reason: collision with root package name */
    public int f387937i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v60)) {
            return false;
        }
        r45.v60 v60Var = (r45.v60) fVar;
        return n51.f.a(this.f387932d, v60Var.f387932d) && n51.f.a(this.f387933e, v60Var.f387933e) && n51.f.a(this.f387934f, v60Var.f387934f) && n51.f.a(this.f387935g, v60Var.f387935g) && n51.f.a(java.lang.Integer.valueOf(this.f387936h), java.lang.Integer.valueOf(v60Var.f387936h)) && n51.f.a(java.lang.Integer.valueOf(this.f387937i), java.lang.Integer.valueOf(v60Var.f387937i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387932d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387933e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387934f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387935g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f387936h);
            fVar.e(6, this.f387937i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f387932d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f387933e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f387934f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f387935g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f387936h) + b36.f.e(6, this.f387937i);
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
        r45.v60 v60Var = (r45.v60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v60Var.f387932d = aVar2.k(intValue);
                return 0;
            case 2:
                v60Var.f387933e = aVar2.k(intValue);
                return 0;
            case 3:
                v60Var.f387934f = aVar2.k(intValue);
                return 0;
            case 4:
                v60Var.f387935g = aVar2.k(intValue);
                return 0;
            case 5:
                v60Var.f387936h = aVar2.g(intValue);
                return 0;
            case 6:
                v60Var.f387937i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f387932d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Url", str, false);
            eVar.d(jSONObject, "AESKey", this.f387933e, false);
            eVar.d(jSONObject, "MD5", this.f387934f, false);
            eVar.d(jSONObject, "FileId", this.f387935g, false);
            eVar.d(jSONObject, "MidSize", java.lang.Integer.valueOf(this.f387936h), false);
            eVar.d(jSONObject, "ThumbSize", java.lang.Integer.valueOf(this.f387937i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
