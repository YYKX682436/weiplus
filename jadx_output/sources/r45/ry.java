package r45;

/* loaded from: classes8.dex */
public class ry extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f385280d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f385281e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ry)) {
            return false;
        }
        r45.ry ryVar = (r45.ry) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f385280d), java.lang.Boolean.valueOf(ryVar.f385280d)) && n51.f.a(java.lang.Boolean.valueOf(this.f385281e), java.lang.Boolean.valueOf(ryVar.f385281e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f385280d);
            fVar.a(2, this.f385281e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f385280d) + 0 + b36.f.a(2, this.f385281e);
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
        r45.ry ryVar = (r45.ry) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ryVar.f385280d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ryVar.f385281e = aVar2.c(intValue);
        return 0;
    }
}
