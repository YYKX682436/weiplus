package r45;

/* loaded from: classes7.dex */
public class i87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376820d;

    /* renamed from: e, reason: collision with root package name */
    public long f376821e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i87)) {
            return false;
        }
        r45.i87 i87Var = (r45.i87) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376820d), java.lang.Long.valueOf(i87Var.f376820d)) && n51.f.a(java.lang.Long.valueOf(this.f376821e), java.lang.Long.valueOf(i87Var.f376821e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376820d);
            fVar.h(2, this.f376821e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f376820d) + 0 + b36.f.h(2, this.f376821e);
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
        r45.i87 i87Var = (r45.i87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i87Var.f376820d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i87Var.f376821e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f376820d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "file_index", valueOf, false);
            eVar.d(jSONObject, "receive_size", java.lang.Long.valueOf(this.f376821e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
