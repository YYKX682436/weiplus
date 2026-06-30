package r45;

/* loaded from: classes2.dex */
public class pn3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383225d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383226e;

    /* renamed from: f, reason: collision with root package name */
    public int f383227f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn3)) {
            return false;
        }
        r45.pn3 pn3Var = (r45.pn3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383225d), java.lang.Integer.valueOf(pn3Var.f383225d)) && n51.f.a(this.f383226e, pn3Var.f383226e) && n51.f.a(java.lang.Integer.valueOf(this.f383227f), java.lang.Integer.valueOf(pn3Var.f383227f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383225d);
            java.lang.String str = this.f383226e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f383227f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383225d) + 0;
            java.lang.String str2 = this.f383226e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f383227f);
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
        r45.pn3 pn3Var = (r45.pn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pn3Var.f383225d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            pn3Var.f383226e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        pn3Var.f383227f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383225d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "RequestKey", this.f383226e, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f383227f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
