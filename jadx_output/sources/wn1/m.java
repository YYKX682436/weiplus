package wn1;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f447439d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f447440e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.m)) {
            return false;
        }
        wn1.m mVar = (wn1.m) fVar;
        return n51.f.a(this.f447439d, mVar.f447439d) && n51.f.a(this.f447440e, mVar.f447440e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f447439d);
            fVar.g(2, 3, this.f447440e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.f447439d) + 0 + b36.f.g(2, 3, this.f447440e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f447439d.clear();
            this.f447440e.clear();
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
        wn1.m mVar = (wn1.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f447439d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        mVar.f447440e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }
}
