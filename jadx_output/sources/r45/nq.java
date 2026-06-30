package r45;

/* loaded from: classes4.dex */
public class nq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f381588d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.nq) && n51.f.a(java.lang.Long.valueOf(this.f381588d), java.lang.Long.valueOf(((r45.nq) fVar).f381588d));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).h(1, this.f381588d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f381588d) + 0;
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
        r45.nq nqVar = (r45.nq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        nqVar.f381588d = aVar2.i(intValue);
        return 0;
    }
}
