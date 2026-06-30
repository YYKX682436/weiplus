package p33;

/* loaded from: classes2.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f351645d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof p33.t) && n51.f.a(java.lang.Double.valueOf(this.f351645d), java.lang.Double.valueOf(((p33.t) fVar).f351645d));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).c(1, this.f351645d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.f351645d) + 0;
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
        p33.t tVar = (p33.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        tVar.f351645d = aVar2.e(intValue);
        return 0;
    }
}
