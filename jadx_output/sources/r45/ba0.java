package r45;

/* loaded from: classes2.dex */
public class ba0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f370646d = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.ba0) && n51.f.a(this.f370646d, ((r45.ba0) fVar).f370646d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f370646d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f370646d) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370646d.clear();
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
        r45.ba0 ba0Var = (r45.ba0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.xz4 xz4Var = new r45.xz4();
            if (bArr2 != null && bArr2.length > 0) {
                xz4Var.parseFrom(bArr2);
            }
            ba0Var.f370646d.add(xz4Var);
        }
        return 0;
    }
}
