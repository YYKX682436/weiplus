package r45;

/* loaded from: classes8.dex */
public class xb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f389941d;

    /* renamed from: e, reason: collision with root package name */
    public int f389942e;

    /* renamed from: f, reason: collision with root package name */
    public int f389943f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb0)) {
            return false;
        }
        r45.xb0 xb0Var = (r45.xb0) fVar;
        return n51.f.a(this.f389941d, xb0Var.f389941d) && n51.f.a(java.lang.Integer.valueOf(this.f389942e), java.lang.Integer.valueOf(xb0Var.f389942e)) && n51.f.a(java.lang.Integer.valueOf(this.f389943f), java.lang.Integer.valueOf(xb0Var.f389943f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f389941d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f389941d.writeFields(fVar);
            }
            fVar.e(2, this.f389942e);
            fVar.e(3, this.f389943f);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f389941d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.computeSize()) : 0) + b36.f.e(2, this.f389942e) + b36.f.e(3, this.f389943f);
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
        r45.xb0 xb0Var = (r45.xb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                xb0Var.f389942e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            xb0Var.f389943f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr != null && bArr.length > 0) {
                du5Var3.b(bArr);
            }
            xb0Var.f389941d = du5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f389941d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "DeleteContactScene", java.lang.Integer.valueOf(this.f389942e), false);
            eVar.d(jSONObject, "IsRetainChatHistory", java.lang.Integer.valueOf(this.f389943f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
