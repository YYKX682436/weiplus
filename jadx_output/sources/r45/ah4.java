package r45;

/* loaded from: classes7.dex */
public class ah4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f370011d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f370012e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ah4)) {
            return false;
        }
        r45.ah4 ah4Var = (r45.ah4) fVar;
        return n51.f.a(this.f370011d, ah4Var.f370011d) && n51.f.a(java.lang.Integer.valueOf(this.f370012e), java.lang.Integer.valueOf(ah4Var.f370012e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f370011d);
            fVar.e(2, this.f370012e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f370011d) + 0 + b36.f.e(2, this.f370012e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370011d.clear();
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
        r45.ah4 ah4Var = (r45.ah4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            ah4Var.f370012e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ch4 ch4Var = new r45.ch4();
            if (bArr2 != null && bArr2.length > 0) {
                ch4Var.parseFrom(bArr2);
            }
            ah4Var.f370011d.add(ch4Var);
        }
        return 0;
    }
}
