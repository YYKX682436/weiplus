package r45;

/* loaded from: classes4.dex */
public class gs0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375508d;

    /* renamed from: e, reason: collision with root package name */
    public long f375509e;

    /* renamed from: f, reason: collision with root package name */
    public int f375510f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f375511g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gs0)) {
            return false;
        }
        r45.gs0 gs0Var = (r45.gs0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375508d), java.lang.Integer.valueOf(gs0Var.f375508d)) && n51.f.a(java.lang.Long.valueOf(this.f375509e), java.lang.Long.valueOf(gs0Var.f375509e)) && n51.f.a(java.lang.Integer.valueOf(this.f375510f), java.lang.Integer.valueOf(gs0Var.f375510f)) && n51.f.a(this.f375511g, gs0Var.f375511g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375511g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375508d);
            fVar.h(2, this.f375509e);
            fVar.e(3, this.f375510f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f375508d) + 0 + b36.f.h(2, this.f375509e) + b36.f.e(3, this.f375510f) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.gs0 gs0Var = (r45.gs0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gs0Var.f375508d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gs0Var.f375509e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            gs0Var.f375510f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.eu5 eu5Var = new r45.eu5();
            if (bArr2 != null && bArr2.length > 0) {
                eu5Var.b(bArr2);
            }
            gs0Var.f375511g.add(eu5Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f375508d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ScopeId", valueOf, false);
            eVar.d(jSONObject, "Version", java.lang.Long.valueOf(this.f375509e), false);
            eVar.d(jSONObject, "FieldSize", java.lang.Integer.valueOf(this.f375510f), false);
            eVar.d(jSONObject, "VersionScopeFields", this.f375511g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
