package m53;

/* loaded from: classes8.dex */
public class z3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f324230d;

    /* renamed from: e, reason: collision with root package name */
    public int f324231e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f324232f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z3)) {
            return false;
        }
        m53.z3 z3Var = (m53.z3) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f324230d), java.lang.Boolean.valueOf(z3Var.f324230d)) && n51.f.a(java.lang.Integer.valueOf(this.f324231e), java.lang.Integer.valueOf(z3Var.f324231e)) && n51.f.a(this.f324232f, z3Var.f324232f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324232f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f324230d);
            fVar.e(2, this.f324231e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f324230d) + 0 + b36.f.e(2, this.f324231e) + b36.f.g(3, 8, linkedList);
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
        m53.z3 z3Var = (m53.z3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z3Var.f324230d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            z3Var.f324231e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            m53.y yVar = new m53.y();
            if (bArr2 != null && bArr2.length > 0) {
                yVar.parseFrom(bArr2);
            }
            z3Var.f324232f.add(yVar);
        }
        return 0;
    }
}
