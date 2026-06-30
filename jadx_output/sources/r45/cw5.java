package r45;

/* loaded from: classes8.dex */
public class cw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371870d;

    /* renamed from: e, reason: collision with root package name */
    public long f371871e;

    /* renamed from: f, reason: collision with root package name */
    public int f371872f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f371873g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cw5)) {
            return false;
        }
        r45.cw5 cw5Var = (r45.cw5) fVar;
        return n51.f.a(this.f371870d, cw5Var.f371870d) && n51.f.a(java.lang.Long.valueOf(this.f371871e), java.lang.Long.valueOf(cw5Var.f371871e)) && n51.f.a(java.lang.Integer.valueOf(this.f371872f), java.lang.Integer.valueOf(cw5Var.f371872f)) && n51.f.a(java.lang.Boolean.valueOf(this.f371873g), java.lang.Boolean.valueOf(cw5Var.f371873g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371870d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f371871e);
            fVar.e(3, this.f371872f);
            fVar.a(4, this.f371873g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f371870d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f371871e) + b36.f.e(3, this.f371872f) + b36.f.a(4, this.f371873g);
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
        r45.cw5 cw5Var = (r45.cw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cw5Var.f371870d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cw5Var.f371871e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            cw5Var.f371872f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cw5Var.f371873g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f371870d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "SearchPrefix", str, false);
            eVar.d(jSONObject, "SearchTimestampMs", java.lang.Long.valueOf(this.f371871e), false);
            eVar.d(jSONObject, "ClickType", java.lang.Integer.valueOf(this.f371872f), false);
            eVar.d(jSONObject, "IsLocalClick", java.lang.Boolean.valueOf(this.f371873g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
