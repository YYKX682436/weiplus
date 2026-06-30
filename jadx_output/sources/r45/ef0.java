package r45;

/* loaded from: classes4.dex */
public class ef0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373383d;

    /* renamed from: e, reason: collision with root package name */
    public int f373384e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef0)) {
            return false;
        }
        r45.ef0 ef0Var = (r45.ef0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373383d), java.lang.Integer.valueOf(ef0Var.f373383d)) && n51.f.a(java.lang.Integer.valueOf(this.f373384e), java.lang.Integer.valueOf(ef0Var.f373384e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373383d);
            fVar.e(2, this.f373384e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373383d) + 0 + b36.f.e(2, this.f373384e);
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
        r45.ef0 ef0Var = (r45.ef0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ef0Var.f373383d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ef0Var.f373384e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f373383d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BeginTime", valueOf, false);
            eVar.d(jSONObject, "EndTime", java.lang.Integer.valueOf(this.f373384e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
