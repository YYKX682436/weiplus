package r45;

/* loaded from: classes4.dex */
public class s96 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385582d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f385583e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f385584f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s96)) {
            return false;
        }
        r45.s96 s96Var = (r45.s96) fVar;
        return n51.f.a(this.BaseRequest, s96Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f385582d), java.lang.Integer.valueOf(s96Var.f385582d)) && n51.f.a(this.f385583e, s96Var.f385583e) && n51.f.a(this.f385584f, s96Var.f385584f);
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
            fVar.e(2, this.f385582d);
            fVar.g(3, 8, this.f385583e);
            r45.cu5 cu5Var = this.f385584f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f385584f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f385582d) + b36.f.g(3, 8, this.f385583e);
            r45.cu5 cu5Var2 = this.f385584f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f385583e.clear();
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
        r45.s96 s96Var = (r45.s96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                s96Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            s96Var.f385582d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.o96 o96Var = new r45.o96();
                if (bArr3 != null && bArr3.length > 0) {
                    o96Var.parseFrom(bArr3);
                }
                s96Var.f385583e.add(o96Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var3.b(bArr4);
            }
            s96Var.f385584f = cu5Var3;
        }
        return 0;
    }
}
