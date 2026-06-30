package r45;

/* loaded from: classes4.dex */
public class k75 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378454d;

    /* renamed from: e, reason: collision with root package name */
    public int f378455e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f378456f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f378457g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k75)) {
            return false;
        }
        r45.k75 k75Var = (r45.k75) fVar;
        return n51.f.a(this.BaseRequest, k75Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f378454d), java.lang.Integer.valueOf(k75Var.f378454d)) && n51.f.a(java.lang.Integer.valueOf(this.f378455e), java.lang.Integer.valueOf(k75Var.f378455e)) && n51.f.a(this.f378456f, k75Var.f378456f) && n51.f.a(this.f378457g, k75Var.f378457g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f378454d);
            fVar.e(3, this.f378455e);
            r45.cu5 cu5Var = this.f378456f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f378456f.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f378457g;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.computeSize());
                this.f378457g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f378454d) + b36.f.e(3, this.f378455e);
            r45.cu5 cu5Var3 = this.f378456f;
            if (cu5Var3 != null) {
                i18 += b36.f.i(4, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f378457g;
            return cu5Var4 != null ? i18 + b36.f.i(5, cu5Var4.computeSize()) : i18;
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
        r45.k75 k75Var = (r45.k75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                k75Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            k75Var.f378454d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            k75Var.f378455e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var5.b(bArr2);
                }
                k75Var.f378456f = cu5Var5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var6.b(bArr3);
            }
            k75Var.f378457g = cu5Var6;
        }
        return 0;
    }
}
