package r45;

/* loaded from: classes4.dex */
public class ir3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377280d;

    /* renamed from: e, reason: collision with root package name */
    public int f377281e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f377282f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ir3)) {
            return false;
        }
        r45.ir3 ir3Var = (r45.ir3) fVar;
        return n51.f.a(this.BaseRequest, ir3Var.BaseRequest) && n51.f.a(this.f377280d, ir3Var.f377280d) && n51.f.a(java.lang.Integer.valueOf(this.f377281e), java.lang.Integer.valueOf(ir3Var.f377281e)) && n51.f.a(this.f377282f, ir3Var.f377282f);
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
            java.lang.String str = this.f377280d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f377281e);
            r45.cu5 cu5Var = this.f377282f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f377282f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f377280d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f377281e);
            r45.cu5 cu5Var2 = this.f377282f;
            return cu5Var2 != null ? e17 + b36.f.i(4, cu5Var2.computeSize()) : e17;
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
        r45.ir3 ir3Var = (r45.ir3) objArr[1];
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
                ir3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ir3Var.f377280d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ir3Var.f377281e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            ir3Var.f377282f = cu5Var3;
        }
        return 0;
    }
}
