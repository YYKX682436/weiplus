package r45;

/* loaded from: classes2.dex */
public class w34 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388839d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f388840e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f388841f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w34)) {
            return false;
        }
        r45.w34 w34Var = (r45.w34) fVar;
        return n51.f.a(this.BaseRequest, w34Var.BaseRequest) && n51.f.a(this.f388839d, w34Var.f388839d) && n51.f.a(this.f388840e, w34Var.f388840e) && n51.f.a(this.f388841f, w34Var.f388841f);
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
            java.lang.String str = this.f388839d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f388840e);
            fVar.g(4, 2, this.f388841f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f388839d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.f388840e) + b36.f.g(4, 2, this.f388841f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388840e.clear();
            this.f388841f.clear();
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
        r45.w34 w34Var = (r45.w34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                w34Var.f388839d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                w34Var.f388840e.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            w34Var.f388841f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            w34Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
