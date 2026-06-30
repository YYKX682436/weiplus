package r45;

/* loaded from: classes2.dex */
public class xp5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390317d;

    /* renamed from: e, reason: collision with root package name */
    public int f390318e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xp5)) {
            return false;
        }
        r45.xp5 xp5Var = (r45.xp5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390317d), java.lang.Integer.valueOf(xp5Var.f390317d)) && n51.f.a(java.lang.Integer.valueOf(this.f390318e), java.lang.Integer.valueOf(xp5Var.f390318e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390317d);
            fVar.e(2, this.f390318e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390317d) + 0 + b36.f.e(2, this.f390318e);
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
        r45.xp5 xp5Var = (r45.xp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xp5Var.f390317d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        xp5Var.f390318e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f390317d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ClientType", valueOf, false);
            eVar.d(jSONObject, "SubType", java.lang.Integer.valueOf(this.f390318e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
