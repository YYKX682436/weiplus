package wn1;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447396d;

    /* renamed from: e, reason: collision with root package name */
    public int f447397e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.b)) {
            return false;
        }
        wn1.b bVar = (wn1.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447396d), java.lang.Integer.valueOf(bVar.f447396d)) && n51.f.a(java.lang.Integer.valueOf(this.f447397e), java.lang.Integer.valueOf(bVar.f447397e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447396d);
            fVar.e(2, this.f447397e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f447396d) + 0 + b36.f.e(2, this.f447397e);
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
        wn1.b bVar = (wn1.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f447396d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bVar.f447397e = aVar2.g(intValue);
        return 0;
    }
}
