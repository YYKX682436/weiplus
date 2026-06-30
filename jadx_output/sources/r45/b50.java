package r45;

/* loaded from: classes4.dex */
public class b50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370530d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f370531e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b50)) {
            return false;
        }
        r45.b50 b50Var = (r45.b50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370530d), java.lang.Integer.valueOf(b50Var.f370530d)) && n51.f.a(this.f370531e, b50Var.f370531e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370530d);
            r45.cu5 cu5Var = this.f370531e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f370531e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370530d) + 0;
            r45.cu5 cu5Var2 = this.f370531e;
            return cu5Var2 != null ? e17 + b36.f.i(2, cu5Var2.computeSize()) : e17;
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
        r45.b50 b50Var = (r45.b50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b50Var.f370530d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            b50Var.f370531e = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370530d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "CmdId", valueOf, false);
            eVar.d(jSONObject, "CmdBuf", this.f370531e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
