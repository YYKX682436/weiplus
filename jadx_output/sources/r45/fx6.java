package r45;

/* loaded from: classes7.dex */
public class fx6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374718d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dz3 f374719e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx6)) {
            return false;
        }
        r45.fx6 fx6Var = (r45.fx6) fVar;
        return n51.f.a(this.f374718d, fx6Var.f374718d) && n51.f.a(this.f374719e, fx6Var.f374719e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374718d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.dz3 dz3Var = this.f374719e;
            if (dz3Var != null) {
                fVar.i(2, dz3Var.computeSize());
                this.f374719e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374718d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.dz3 dz3Var2 = this.f374719e;
            return dz3Var2 != null ? j17 + b36.f.i(2, dz3Var2.computeSize()) : j17;
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
        r45.fx6 fx6Var = (r45.fx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fx6Var.f374718d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.dz3 dz3Var3 = new r45.dz3();
            if (bArr != null && bArr.length > 0) {
                dz3Var3.parseFrom(bArr);
            }
            fx6Var.f374719e = dz3Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f374718d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "VerifyContent", str, false);
            eVar.d(jSONObject, "ImgInfoList", this.f374719e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
