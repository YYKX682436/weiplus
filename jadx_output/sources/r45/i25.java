package r45;

/* loaded from: classes9.dex */
public class i25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376687d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j25 f376688e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i25)) {
            return false;
        }
        r45.i25 i25Var = (r45.i25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376687d), java.lang.Integer.valueOf(i25Var.f376687d)) && n51.f.a(this.f376688e, i25Var.f376688e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376687d);
            r45.j25 j25Var = this.f376688e;
            if (j25Var != null) {
                fVar.i(2, j25Var.computeSize());
                this.f376688e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376687d) + 0;
            r45.j25 j25Var2 = this.f376688e;
            return j25Var2 != null ? e17 + b36.f.i(2, j25Var2.computeSize()) : e17;
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
        r45.i25 i25Var = (r45.i25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i25Var.f376687d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.j25 j25Var3 = new r45.j25();
            if (bArr != null && bArr.length > 0) {
                j25Var3.parseFrom(bArr);
            }
            i25Var.f376688e = j25Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f376687d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "OplogRet", this.f376688e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
