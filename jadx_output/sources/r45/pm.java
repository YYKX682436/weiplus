package r45;

/* loaded from: classes4.dex */
public class pm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383173d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.pm) && n51.f.a(java.lang.Integer.valueOf(this.f383173d), java.lang.Integer.valueOf(((r45.pm) fVar).f383173d));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f383173d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f383173d) + 0;
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
        r45.pm pmVar = (r45.pm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        pmVar.f383173d = aVar2.g(intValue);
        return 0;
    }
}
