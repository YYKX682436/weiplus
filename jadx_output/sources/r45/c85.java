package r45;

/* loaded from: classes9.dex */
public class c85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371373d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f371374e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c85)) {
            return false;
        }
        r45.c85 c85Var = (r45.c85) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371373d), java.lang.Integer.valueOf(c85Var.f371373d)) && n51.f.a(this.f371374e, c85Var.f371374e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371373d);
            fVar.g(2, 8, this.f371374e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f371373d) + 0 + b36.f.g(2, 8, this.f371374e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371374e.clear();
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
        r45.c85 c85Var = (r45.c85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c85Var.f371373d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b85 b85Var = new r45.b85();
            if (bArr2 != null && bArr2.length > 0) {
                b85Var.parseFrom(bArr2);
            }
            c85Var.f371374e.add(b85Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371373d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "PhoneNumList", this.f371374e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
