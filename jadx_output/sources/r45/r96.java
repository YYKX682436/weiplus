package r45;

/* loaded from: classes4.dex */
public class r96 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384660d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f384661e;

    /* renamed from: f, reason: collision with root package name */
    public int f384662f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r96)) {
            return false;
        }
        r45.r96 r96Var = (r45.r96) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384660d), java.lang.Integer.valueOf(r96Var.f384660d)) && n51.f.a(this.f384661e, r96Var.f384661e) && n51.f.a(java.lang.Integer.valueOf(this.f384662f), java.lang.Integer.valueOf(r96Var.f384662f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384660d);
            r45.du5 du5Var = this.f384661e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f384661e.writeFields(fVar);
            }
            fVar.e(3, this.f384662f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384660d) + 0;
            r45.du5 du5Var2 = this.f384661e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f384662f);
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
        r45.r96 r96Var = (r45.r96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r96Var.f384660d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            r96Var.f384662f = aVar2.g(intValue);
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
            r96Var.f384661e = du5Var3;
        }
        return 0;
    }
}
