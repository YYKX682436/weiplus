package wn1;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f447437d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f447438e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.l)) {
            return false;
        }
        wn1.l lVar = (wn1.l) fVar;
        return n51.f.a(this.f447437d, lVar.f447437d) && n51.f.a(this.f447438e, lVar.f447438e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f447437d);
            fVar.g(2, 3, this.f447438e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.f447437d) + 0 + b36.f.g(2, 3, this.f447438e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f447437d.clear();
            this.f447438e.clear();
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
        wn1.l lVar = (wn1.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lVar.f447437d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        lVar.f447438e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }
}
