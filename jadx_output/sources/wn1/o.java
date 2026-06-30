package wn1;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f447444d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f447445e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.o)) {
            return false;
        }
        wn1.o oVar = (wn1.o) fVar;
        return n51.f.a(this.f447444d, oVar.f447444d) && n51.f.a(java.lang.Integer.valueOf(this.f447445e), java.lang.Integer.valueOf(oVar.f447445e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f447444d);
            fVar.e(2, this.f447445e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f447444d) + 0 + b36.f.e(2, this.f447445e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f447444d.clear();
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
        wn1.o oVar = (wn1.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            oVar.f447445e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            wn1.n nVar = new wn1.n();
            if (bArr2 != null && bArr2.length > 0) {
                nVar.parseFrom(bArr2);
            }
            oVar.f447444d.add(nVar);
        }
        return 0;
    }
}
