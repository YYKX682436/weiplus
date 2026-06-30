package r45;

/* loaded from: classes4.dex */
public class eh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f373470d;

    /* renamed from: e, reason: collision with root package name */
    public int f373471e;

    /* renamed from: f, reason: collision with root package name */
    public int f373472f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f373473g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f373474h;

    /* renamed from: i, reason: collision with root package name */
    public int f373475i;

    /* renamed from: m, reason: collision with root package name */
    public int f373476m;

    /* renamed from: n, reason: collision with root package name */
    public int f373477n;

    /* renamed from: o, reason: collision with root package name */
    public int f373478o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eh0)) {
            return false;
        }
        r45.eh0 eh0Var = (r45.eh0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f373470d), java.lang.Boolean.valueOf(eh0Var.f373470d)) && n51.f.a(java.lang.Integer.valueOf(this.f373471e), java.lang.Integer.valueOf(eh0Var.f373471e)) && n51.f.a(java.lang.Integer.valueOf(this.f373472f), java.lang.Integer.valueOf(eh0Var.f373472f)) && n51.f.a(java.lang.Boolean.valueOf(this.f373473g), java.lang.Boolean.valueOf(eh0Var.f373473g)) && n51.f.a(java.lang.Boolean.valueOf(this.f373474h), java.lang.Boolean.valueOf(eh0Var.f373474h)) && n51.f.a(java.lang.Integer.valueOf(this.f373475i), java.lang.Integer.valueOf(eh0Var.f373475i)) && n51.f.a(java.lang.Integer.valueOf(this.f373476m), java.lang.Integer.valueOf(eh0Var.f373476m)) && n51.f.a(java.lang.Integer.valueOf(this.f373477n), java.lang.Integer.valueOf(eh0Var.f373477n)) && n51.f.a(java.lang.Integer.valueOf(this.f373478o), java.lang.Integer.valueOf(eh0Var.f373478o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f373470d);
            fVar.e(2, this.f373471e);
            fVar.e(3, this.f373472f);
            fVar.a(4, this.f373473g);
            fVar.a(5, this.f373474h);
            fVar.e(6, this.f373475i);
            fVar.e(7, this.f373476m);
            fVar.e(9, this.f373477n);
            fVar.e(10, this.f373478o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f373470d) + 0 + b36.f.e(2, this.f373471e) + b36.f.e(3, this.f373472f) + b36.f.a(4, this.f373473g) + b36.f.a(5, this.f373474h) + b36.f.e(6, this.f373475i) + b36.f.e(7, this.f373476m) + b36.f.e(9, this.f373477n) + b36.f.e(10, this.f373478o);
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
        r45.eh0 eh0Var = (r45.eh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eh0Var.f373470d = aVar2.c(intValue);
                return 0;
            case 2:
                eh0Var.f373471e = aVar2.g(intValue);
                return 0;
            case 3:
                eh0Var.f373472f = aVar2.g(intValue);
                return 0;
            case 4:
                eh0Var.f373473g = aVar2.c(intValue);
                return 0;
            case 5:
                eh0Var.f373474h = aVar2.c(intValue);
                return 0;
            case 6:
                eh0Var.f373475i = aVar2.g(intValue);
                return 0;
            case 7:
                eh0Var.f373476m = aVar2.g(intValue);
                return 0;
            case 8:
            default:
                return -1;
            case 9:
                eh0Var.f373477n = aVar2.g(intValue);
                return 0;
            case 10:
                eh0Var.f373478o = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f373470d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "RetrieveInvalidExposureCard", valueOf, false);
            eVar.d(jSONObject, "ValidExposureAreaRatio", java.lang.Integer.valueOf(this.f373471e), false);
            eVar.d(jSONObject, "ValidExposurePeriod", java.lang.Integer.valueOf(this.f373472f), false);
            eVar.d(jSONObject, "RedDotSample", java.lang.Boolean.valueOf(this.f373473g), false);
            eVar.d(jSONObject, "RecMsgReportSample", java.lang.Boolean.valueOf(this.f373474h), false);
            eVar.d(jSONObject, "RecMsgReportMaxCount", java.lang.Integer.valueOf(this.f373475i), false);
            eVar.d(jSONObject, "RecommendReasonMode", java.lang.Integer.valueOf(this.f373476m), false);
            eVar.d(jSONObject, "KeepPosEndResortSwitch", java.lang.Integer.valueOf(this.f373477n), false);
            eVar.d(jSONObject, "SerialResortReqSwitch", java.lang.Integer.valueOf(this.f373478o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
