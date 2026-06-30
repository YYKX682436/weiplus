package r45;

/* loaded from: classes4.dex */
public class yo4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391259d;

    /* renamed from: e, reason: collision with root package name */
    public int f391260e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yo4)) {
            return false;
        }
        r45.yo4 yo4Var = (r45.yo4) fVar;
        return n51.f.a(this.f391259d, yo4Var.f391259d) && n51.f.a(java.lang.Integer.valueOf(this.f391260e), java.lang.Integer.valueOf(yo4Var.f391260e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391259d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391260e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f391259d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f391260e);
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
        r45.yo4 yo4Var = (r45.yo4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yo4Var.f391259d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        yo4Var.f391260e = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f391259d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ContactUsername", str, false);
            eVar.d(jSONObject, "ModType", java.lang.Integer.valueOf(this.f391260e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
