package m53;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323687d;

    /* renamed from: e, reason: collision with root package name */
    public int f323688e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g)) {
            return false;
        }
        m53.g gVar = (m53.g) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323687d), java.lang.Integer.valueOf(gVar.f323687d)) && n51.f.a(java.lang.Integer.valueOf(this.f323688e), java.lang.Integer.valueOf(gVar.f323688e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323687d);
            fVar.e(2, this.f323688e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f323687d) + 0 + b36.f.e(2, this.f323688e);
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
        m53.g gVar = (m53.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gVar.f323687d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        gVar.f323688e = aVar2.g(intValue);
        return 0;
    }
}
