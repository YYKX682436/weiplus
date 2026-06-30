package r45;

/* loaded from: classes9.dex */
public class di0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f372502d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372503e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.di0)) {
            return false;
        }
        r45.di0 di0Var = (r45.di0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f372502d), java.lang.Boolean.valueOf(di0Var.f372502d)) && n51.f.a(java.lang.Boolean.valueOf(this.f372503e), java.lang.Boolean.valueOf(di0Var.f372503e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f372502d);
            fVar.a(2, this.f372503e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f372502d) + 0 + b36.f.a(2, this.f372503e);
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
        r45.di0 di0Var = (r45.di0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            di0Var.f372502d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        di0Var.f372503e = aVar2.c(intValue);
        return 0;
    }
}
