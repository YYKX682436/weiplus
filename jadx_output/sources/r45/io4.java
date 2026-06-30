package r45;

/* loaded from: classes8.dex */
public class io4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377216d;

    /* renamed from: e, reason: collision with root package name */
    public long f377217e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io4)) {
            return false;
        }
        r45.io4 io4Var = (r45.io4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377216d), java.lang.Long.valueOf(io4Var.f377216d)) && n51.f.a(java.lang.Long.valueOf(this.f377217e), java.lang.Long.valueOf(io4Var.f377217e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f377216d);
            fVar.h(2, this.f377217e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f377216d) + 0 + b36.f.h(2, this.f377217e);
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
        r45.io4 io4Var = (r45.io4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            io4Var.f377216d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        io4Var.f377217e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f377216d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BitMask", valueOf, false);
            eVar.d(jSONObject, "BitVal", java.lang.Long.valueOf(this.f377217e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
