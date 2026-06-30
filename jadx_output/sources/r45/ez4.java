package r45;

/* loaded from: classes9.dex */
public class ez4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373846e;

    /* renamed from: f, reason: collision with root package name */
    public int f373847f;

    /* renamed from: g, reason: collision with root package name */
    public int f373848g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373849h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez4)) {
            return false;
        }
        r45.ez4 ez4Var = (r45.ez4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373845d), java.lang.Integer.valueOf(ez4Var.f373845d)) && n51.f.a(this.f373846e, ez4Var.f373846e) && n51.f.a(java.lang.Integer.valueOf(this.f373847f), java.lang.Integer.valueOf(ez4Var.f373847f)) && n51.f.a(java.lang.Integer.valueOf(this.f373848g), java.lang.Integer.valueOf(ez4Var.f373848g)) && n51.f.a(this.f373849h, ez4Var.f373849h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373845d);
            java.lang.String str = this.f373846e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f373847f);
            fVar.e(5, this.f373848g);
            java.lang.String str2 = this.f373849h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373845d) + 0;
            java.lang.String str3 = this.f373846e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int e18 = e17 + b36.f.e(4, this.f373847f) + b36.f.e(5, this.f373848g);
            java.lang.String str4 = this.f373849h;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.ez4 ez4Var = (r45.ez4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ez4Var.f373845d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ez4Var.f373846e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ez4Var.f373847f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            ez4Var.f373848g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        ez4Var.f373849h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373845d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Seq", valueOf, false);
            eVar.d(jSONObject, "FileList", this.f373846e, false);
            eVar.d(jSONObject, "IsRoot", java.lang.Integer.valueOf(this.f373847f), false);
            eVar.d(jSONObject, "NetType", java.lang.Integer.valueOf(this.f373848g), false);
            eVar.d(jSONObject, "CheckSum", this.f373849h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
