package r45;

/* loaded from: classes8.dex */
public class r37 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384512d;

    /* renamed from: e, reason: collision with root package name */
    public long f384513e;

    /* renamed from: f, reason: collision with root package name */
    public int f384514f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384515g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r37)) {
            return false;
        }
        r45.r37 r37Var = (r45.r37) fVar;
        return n51.f.a(this.BaseResponse, r37Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384512d), java.lang.Integer.valueOf(r37Var.f384512d)) && n51.f.a(java.lang.Long.valueOf(this.f384513e), java.lang.Long.valueOf(r37Var.f384513e)) && n51.f.a(java.lang.Integer.valueOf(this.f384514f), java.lang.Integer.valueOf(r37Var.f384514f)) && n51.f.a(this.f384515g, r37Var.f384515g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384515g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384512d);
            fVar.h(3, this.f384513e);
            fVar.e(4, this.f384514f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384512d) + b36.f.h(3, this.f384513e) + b36.f.e(4, this.f384514f) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.r37 r37Var = (r45.r37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                r37Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            r37Var.f384512d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            r37Var.f384513e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            r37Var.f384514f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.bd6 bd6Var = new r45.bd6();
            if (bArr3 != null && bArr3.length > 0) {
                bd6Var.parseFrom(bArr3);
            }
            r37Var.f384515g.add(bd6Var);
        }
        return 0;
    }
}
