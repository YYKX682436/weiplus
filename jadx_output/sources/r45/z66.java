package r45;

/* loaded from: classes8.dex */
public class z66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391753d;

    /* renamed from: e, reason: collision with root package name */
    public int f391754e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z66)) {
            return false;
        }
        r45.z66 z66Var = (r45.z66) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391753d), java.lang.Integer.valueOf(z66Var.f391753d)) && n51.f.a(java.lang.Integer.valueOf(this.f391754e), java.lang.Integer.valueOf(z66Var.f391754e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391753d);
            fVar.e(2, this.f391754e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f391753d) + 0 + b36.f.e(2, this.f391754e);
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
        r45.z66 z66Var = (r45.z66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z66Var.f391753d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        z66Var.f391754e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f391753d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "checkCount", valueOf, false);
            eVar.d(jSONObject, "isFinalCheck", java.lang.Integer.valueOf(this.f391754e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
