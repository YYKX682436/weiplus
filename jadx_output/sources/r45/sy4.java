package r45;

/* loaded from: classes9.dex */
public class sy4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f386016d;

    /* renamed from: e, reason: collision with root package name */
    public int f386017e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sy4)) {
            return false;
        }
        r45.sy4 sy4Var = (r45.sy4) fVar;
        return n51.f.a(this.f386016d, sy4Var.f386016d) && n51.f.a(java.lang.Integer.valueOf(this.f386017e), java.lang.Integer.valueOf(sy4Var.f386017e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f386016d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f386016d.writeFields(fVar);
            }
            fVar.e(2, this.f386017e);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f386016d;
            return (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0) + b36.f.e(2, this.f386017e);
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
        r45.sy4 sy4Var = (r45.sy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            sy4Var.f386017e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.bn6 bn6Var3 = new r45.bn6();
            if (bArr != null && bArr.length > 0) {
                bn6Var3.parseFrom(bArr);
            }
            sy4Var.f386016d = bn6Var3;
        }
        return 0;
    }
}
