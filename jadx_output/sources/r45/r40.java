package r45;

/* loaded from: classes4.dex */
public class r40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384517d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f384518e;

    /* renamed from: f, reason: collision with root package name */
    public int f384519f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f384520g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r40)) {
            return false;
        }
        r45.r40 r40Var = (r45.r40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384517d), java.lang.Integer.valueOf(r40Var.f384517d)) && n51.f.a(this.f384518e, r40Var.f384518e) && n51.f.a(java.lang.Integer.valueOf(this.f384519f), java.lang.Integer.valueOf(r40Var.f384519f)) && n51.f.a(this.f384520g, r40Var.f384520g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384517d);
            r45.cu5 cu5Var = this.f384518e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f384518e.writeFields(fVar);
            }
            fVar.e(3, this.f384519f);
            r45.cu5 cu5Var2 = this.f384520g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f384520g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384517d) + 0;
            r45.cu5 cu5Var3 = this.f384518e;
            if (cu5Var3 != null) {
                e17 += b36.f.i(2, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f384519f);
            r45.cu5 cu5Var4 = this.f384520g;
            return cu5Var4 != null ? e18 + b36.f.i(4, cu5Var4.computeSize()) : e18;
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
        r45.r40 r40Var = (r45.r40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r40Var.f384517d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var5.b(bArr);
                }
                r40Var.f384518e = cu5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            r40Var.f384519f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var6.b(bArr2);
            }
            r40Var.f384520g = cu5Var6;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f384517d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "OperationType", valueOf, false);
            eVar.d(jSONObject, "OperationInfo", this.f384518e, false);
            eVar.d(jSONObject, "OperationContentLength", java.lang.Integer.valueOf(this.f384519f), false);
            eVar.d(jSONObject, "ExtOperationInfo", this.f384520g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
