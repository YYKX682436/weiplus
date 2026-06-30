package r45;

/* loaded from: classes8.dex */
public class rx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385274d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385275e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385276f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385277g;

    /* renamed from: h, reason: collision with root package name */
    public int f385278h;

    /* renamed from: i, reason: collision with root package name */
    public int f385279i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rx5)) {
            return false;
        }
        r45.rx5 rx5Var = (r45.rx5) fVar;
        return n51.f.a(this.f385274d, rx5Var.f385274d) && n51.f.a(this.f385275e, rx5Var.f385275e) && n51.f.a(this.f385276f, rx5Var.f385276f) && n51.f.a(this.f385277g, rx5Var.f385277g) && n51.f.a(java.lang.Integer.valueOf(this.f385278h), java.lang.Integer.valueOf(rx5Var.f385278h)) && n51.f.a(java.lang.Integer.valueOf(this.f385279i), java.lang.Integer.valueOf(rx5Var.f385279i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385274d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385275e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385276f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385277g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f385278h);
            fVar.e(6, this.f385279i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385274d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385275e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f385276f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f385277g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f385278h) + b36.f.e(6, this.f385279i);
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
        r45.rx5 rx5Var = (r45.rx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rx5Var.f385274d = aVar2.k(intValue);
                return 0;
            case 2:
                rx5Var.f385275e = aVar2.k(intValue);
                return 0;
            case 3:
                rx5Var.f385276f = aVar2.k(intValue);
                return 0;
            case 4:
                rx5Var.f385277g = aVar2.k(intValue);
                return 0;
            case 5:
                rx5Var.f385278h = aVar2.g(intValue);
                return 0;
            case 6:
                rx5Var.f385279i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f385274d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UserName", str, false);
            eVar.d(jSONObject, "SourceDisplayName", this.f385275e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f385276f, false);
            eVar.d(jSONObject, "AppID", this.f385277g, false);
            eVar.d(jSONObject, "TradingGuaranteeFlag", java.lang.Integer.valueOf(this.f385278h), false);
            eVar.d(jSONObject, "BrandOfficialFlag", java.lang.Integer.valueOf(this.f385279i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
