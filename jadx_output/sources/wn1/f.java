package wn1;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447417d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f447418e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.f)) {
            return false;
        }
        wn1.f fVar2 = (wn1.f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447417d), java.lang.Integer.valueOf(fVar2.f447417d)) && n51.f.a(this.f447418e, fVar2.f447418e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447417d);
            com.tencent.mm.protobuf.g gVar = this.f447418e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f447417d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f447418e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        wn1.f fVar2 = (wn1.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fVar2.f447417d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        fVar2.f447418e = aVar2.d(intValue);
        return 0;
    }
}
