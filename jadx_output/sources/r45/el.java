package r45;

/* loaded from: classes8.dex */
public class el extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373591d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.el) && n51.f.a(java.lang.Integer.valueOf(this.f373591d), java.lang.Integer.valueOf(((r45.el) fVar).f373591d));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f373591d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f373591d) + 0;
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
        r45.el elVar = (r45.el) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        elVar.f373591d = aVar2.g(intValue);
        return 0;
    }
}
