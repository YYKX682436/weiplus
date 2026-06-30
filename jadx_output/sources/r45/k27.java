package r45;

/* loaded from: classes8.dex */
public class k27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378335d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f378336e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k27)) {
            return false;
        }
        r45.k27 k27Var = (r45.k27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378335d), java.lang.Integer.valueOf(k27Var.f378335d)) && n51.f.a(this.f378336e, k27Var.f378336e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378335d);
            fVar.g(2, 8, this.f378336e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f378335d) + 0 + b36.f.g(2, 8, this.f378336e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378336e.clear();
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
        r45.k27 k27Var = (r45.k27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k27Var.f378335d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.j27 j27Var = new r45.j27();
            if (bArr2 != null && bArr2.length > 0) {
                j27Var.parseFrom(bArr2);
            }
            k27Var.f378336e.add(j27Var);
        }
        return 0;
    }
}
