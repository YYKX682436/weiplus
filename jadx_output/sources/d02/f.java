package d02;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f225311d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f225312e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.f)) {
            return false;
        }
        d02.f fVar2 = (d02.f) fVar;
        return n51.f.a(this.f225311d, fVar2.f225311d) && n51.f.a(java.lang.Integer.valueOf(this.f225312e), java.lang.Integer.valueOf(fVar2.f225312e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f225311d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f225312e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(4, 8, linkedList) + 0 + b36.f.e(5, this.f225312e);
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
        d02.f fVar2 = (d02.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            fVar2.f225312e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            d02.p pVar = new d02.p();
            if (bArr2 != null && bArr2.length > 0) {
                pVar.parseFrom(bArr2);
            }
            fVar2.f225311d.add(pVar);
        }
        return 0;
    }
}
