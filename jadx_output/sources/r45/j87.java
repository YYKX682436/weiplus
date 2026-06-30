package r45;

/* loaded from: classes7.dex */
public class j87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377653d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377654e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j87)) {
            return false;
        }
        r45.j87 j87Var = (r45.j87) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377653d), java.lang.Integer.valueOf(j87Var.f377653d)) && n51.f.a(this.f377654e, j87Var.f377654e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377653d);
            com.tencent.mm.protobuf.g gVar = this.f377654e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377653d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f377654e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
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
        r45.j87 j87Var = (r45.j87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j87Var.f377653d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        j87Var.f377654e = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377653d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "func", valueOf, false);
            eVar.d(jSONObject, "content", this.f377654e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
