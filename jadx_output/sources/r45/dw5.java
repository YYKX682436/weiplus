package r45;

/* loaded from: classes2.dex */
public class dw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372785d;

    /* renamed from: e, reason: collision with root package name */
    public int f372786e;

    /* renamed from: f, reason: collision with root package name */
    public int f372787f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dw5)) {
            return false;
        }
        r45.dw5 dw5Var = (r45.dw5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372785d), java.lang.Integer.valueOf(dw5Var.f372785d)) && n51.f.a(java.lang.Integer.valueOf(this.f372786e), java.lang.Integer.valueOf(dw5Var.f372786e)) && n51.f.a(java.lang.Integer.valueOf(this.f372787f), java.lang.Integer.valueOf(dw5Var.f372787f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372785d);
            fVar.e(2, this.f372786e);
            fVar.e(3, this.f372787f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372785d) + 0 + b36.f.e(2, this.f372786e) + b36.f.e(3, this.f372787f);
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
        r45.dw5 dw5Var = (r45.dw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dw5Var.f372785d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dw5Var.f372786e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        dw5Var.f372787f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f372785d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Entry", valueOf, false);
            eVar.d(jSONObject, "Timestamp", java.lang.Integer.valueOf(this.f372786e), false);
            eVar.d(jSONObject, "OpType", java.lang.Integer.valueOf(this.f372787f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
