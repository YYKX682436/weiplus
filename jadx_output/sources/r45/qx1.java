package r45;

/* loaded from: classes4.dex */
public class qx1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384332d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f384333e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public long f384334f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx1)) {
            return false;
        }
        r45.qx1 qx1Var = (r45.qx1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384332d), java.lang.Integer.valueOf(qx1Var.f384332d)) && n51.f.a(this.f384333e, qx1Var.f384333e) && n51.f.a(java.lang.Long.valueOf(this.f384334f), java.lang.Long.valueOf(qx1Var.f384334f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384333e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384332d);
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f384334f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f384332d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f384334f);
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
        r45.qx1 qx1Var = (r45.qx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qx1Var.f384332d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qx1Var.f384334f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xn1 xn1Var = new r45.xn1();
            if (bArr2 != null && bArr2.length > 0) {
                xn1Var.parseFrom(bArr2);
            }
            qx1Var.f384333e.add(xn1Var);
        }
        return 0;
    }
}
