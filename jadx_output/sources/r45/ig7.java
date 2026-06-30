package r45;

/* loaded from: classes9.dex */
public class ig7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377040d;

    /* renamed from: e, reason: collision with root package name */
    public int f377041e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ig7)) {
            return false;
        }
        r45.ig7 ig7Var = (r45.ig7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377040d), java.lang.Integer.valueOf(ig7Var.f377040d)) && n51.f.a(java.lang.Integer.valueOf(this.f377041e), java.lang.Integer.valueOf(ig7Var.f377041e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377040d);
            fVar.e(2, this.f377041e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377040d) + 0 + b36.f.e(2, this.f377041e);
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
        r45.ig7 ig7Var = (r45.ig7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ig7Var.f377040d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ig7Var.f377041e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377040d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "layoutId", valueOf, false);
            eVar.d(jSONObject, "hasParent", java.lang.Integer.valueOf(this.f377041e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
