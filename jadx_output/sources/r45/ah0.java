package r45;

/* loaded from: classes2.dex */
public class ah0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370006d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370007e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ah0)) {
            return false;
        }
        r45.ah0 ah0Var = (r45.ah0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370006d), java.lang.Integer.valueOf(ah0Var.f370006d)) && n51.f.a(java.lang.Boolean.valueOf(this.f370007e), java.lang.Boolean.valueOf(ah0Var.f370007e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370006d);
            fVar.a(2, this.f370007e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f370006d) + 0 + b36.f.a(2, this.f370007e);
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
        r45.ah0 ah0Var = (r45.ah0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ah0Var.f370006d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ah0Var.f370007e = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370006d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "display_switch", valueOf, false);
            eVar.d(jSONObject, "hide_search_entrance", java.lang.Boolean.valueOf(this.f370007e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
