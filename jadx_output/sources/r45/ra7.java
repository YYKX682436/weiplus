package r45;

/* loaded from: classes8.dex */
public class ra7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f384700d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f384701e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ra7)) {
            return false;
        }
        r45.ra7 ra7Var = (r45.ra7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f384700d), java.lang.Boolean.valueOf(ra7Var.f384700d)) && n51.f.a(java.lang.Boolean.valueOf(this.f384701e), java.lang.Boolean.valueOf(ra7Var.f384701e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f384700d);
            fVar.a(2, this.f384701e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f384700d) + 0 + b36.f.a(2, this.f384701e);
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
        r45.ra7 ra7Var = (r45.ra7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ra7Var.f384700d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ra7Var.f384701e = aVar2.c(intValue);
        return 0;
    }
}
