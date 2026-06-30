package m53;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f324180d;

    /* renamed from: e, reason: collision with root package name */
    public int f324181e;

    /* renamed from: f, reason: collision with root package name */
    public int f324182f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y)) {
            return false;
        }
        m53.y yVar = (m53.y) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f324180d), java.lang.Integer.valueOf(yVar.f324180d)) && n51.f.a(java.lang.Integer.valueOf(this.f324181e), java.lang.Integer.valueOf(yVar.f324181e)) && n51.f.a(java.lang.Integer.valueOf(this.f324182f), java.lang.Integer.valueOf(yVar.f324182f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f324180d);
            fVar.e(2, this.f324181e);
            fVar.e(3, this.f324182f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f324180d) + 0 + b36.f.e(2, this.f324181e) + b36.f.e(3, this.f324182f);
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
        m53.y yVar = (m53.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f324180d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            yVar.f324181e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        yVar.f324182f = aVar2.g(intValue);
        return 0;
    }
}
