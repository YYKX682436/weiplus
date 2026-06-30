package r45;

/* loaded from: classes8.dex */
public class gg6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375238e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg6)) {
            return false;
        }
        r45.gg6 gg6Var = (r45.gg6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375237d), java.lang.Integer.valueOf(gg6Var.f375237d)) && n51.f.a(this.f375238e, gg6Var.f375238e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375237d);
            java.lang.String str = this.f375238e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375237d) + 0;
            java.lang.String str2 = this.f375238e;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        r45.gg6 gg6Var = (r45.gg6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gg6Var.f375237d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        gg6Var.f375238e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f375237d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Key", valueOf, false);
            eVar.d(jSONObject, "Val", this.f375238e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
