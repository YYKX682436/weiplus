package r45;

/* loaded from: classes9.dex */
public class k37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378343d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f378344e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k37)) {
            return false;
        }
        r45.k37 k37Var = (r45.k37) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378343d), java.lang.Integer.valueOf(k37Var.f378343d)) && n51.f.a(this.f378344e, k37Var.f378344e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378343d);
            r45.cu5 cu5Var = this.f378344e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f378344e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378343d) + 0;
            r45.cu5 cu5Var2 = this.f378344e;
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
        r45.k37 k37Var = (r45.k37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k37Var.f378343d = aVar2.g(intValue);
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
            k37Var.f378344e = cu5Var3;
        }
        return 0;
    }
}
