package r45;

/* loaded from: classes2.dex */
public class o23 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f381842d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f381843e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.qb1 f381844f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o23)) {
            return false;
        }
        r45.o23 o23Var = (r45.o23) fVar;
        return n51.f.a(this.f381842d, o23Var.f381842d) && n51.f.a(this.f381843e, o23Var.f381843e) && n51.f.a(this.f381844f, o23Var.f381844f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381843e;
        java.util.LinkedList linkedList2 = this.f381842d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            r45.qb1 qb1Var = this.f381844f;
            if (qb1Var != null) {
                fVar.i(3, qb1Var.computeSize());
                this.f381844f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            r45.qb1 qb1Var2 = this.f381844f;
            return qb1Var2 != null ? g17 + b36.f.i(3, qb1Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.o23 o23Var = (r45.o23) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                if (bArr2 != null && bArr2.length > 0) {
                    finderObject.parseFrom(bArr2);
                }
                o23Var.f381842d.add(finderObject);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.lb1 lb1Var = new r45.lb1();
                if (bArr3 != null && bArr3.length > 0) {
                    lb1Var.parseFrom(bArr3);
                }
                o23Var.f381843e.add(lb1Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr4 != null && bArr4.length > 0) {
                qb1Var3.parseFrom(bArr4);
            }
            o23Var.f381844f = qb1Var3;
        }
        return 0;
    }
}
