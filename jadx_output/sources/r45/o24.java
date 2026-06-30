package r45;

/* loaded from: classes7.dex */
public class o24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381845d;

    /* renamed from: e, reason: collision with root package name */
    public int f381846e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nd7 f381847f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o24)) {
            return false;
        }
        r45.o24 o24Var = (r45.o24) fVar;
        return n51.f.a(this.BaseRequest, o24Var.BaseRequest) && n51.f.a(this.f381845d, o24Var.f381845d) && n51.f.a(java.lang.Integer.valueOf(this.f381846e), java.lang.Integer.valueOf(o24Var.f381846e)) && n51.f.a(this.f381847f, o24Var.f381847f);
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
            java.lang.String str = this.f381845d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381846e);
            r45.nd7 nd7Var = this.f381847f;
            if (nd7Var != null) {
                fVar.i(4, nd7Var.computeSize());
                this.f381847f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f381845d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f381846e);
            r45.nd7 nd7Var2 = this.f381847f;
            return nd7Var2 != null ? e17 + b36.f.i(4, nd7Var2.computeSize()) : e17;
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
        r45.o24 o24Var = (r45.o24) objArr[1];
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
                o24Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            o24Var.f381845d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            o24Var.f381846e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.nd7 nd7Var3 = new r45.nd7();
            if (bArr2 != null && bArr2.length > 0) {
                nd7Var3.parseFrom(bArr2);
            }
            o24Var.f381847f = nd7Var3;
        }
        return 0;
    }
}
