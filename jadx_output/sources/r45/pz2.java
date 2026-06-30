package r45;

/* loaded from: classes2.dex */
public class pz2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383489d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.qb1 f383490e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pz2)) {
            return false;
        }
        r45.pz2 pz2Var = (r45.pz2) fVar;
        return n51.f.a(this.f383489d, pz2Var.f383489d) && n51.f.a(this.f383490e, pz2Var.f383490e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383489d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.qb1 qb1Var = this.f383490e;
            if (qb1Var != null) {
                fVar.i(2, qb1Var.computeSize());
                this.f383490e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.qb1 qb1Var2 = this.f383490e;
            return qb1Var2 != null ? g17 + b36.f.i(2, qb1Var2.computeSize()) : g17;
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
        r45.pz2 pz2Var = (r45.pz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.r03 r03Var = new r45.r03();
                if (bArr2 != null && bArr2.length > 0) {
                    r03Var.parseFrom(bArr2);
                }
                pz2Var.f383489d.add(r03Var);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr3 != null && bArr3.length > 0) {
                qb1Var3.parseFrom(bArr3);
            }
            pz2Var.f383490e = qb1Var3;
        }
        return 0;
    }
}
