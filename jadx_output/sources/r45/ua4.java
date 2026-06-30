package r45;

/* loaded from: classes8.dex */
public class ua4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f387166d;

    /* renamed from: e, reason: collision with root package name */
    public long f387167e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ua4)) {
            return false;
        }
        r45.ua4 ua4Var = (r45.ua4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f387166d), java.lang.Long.valueOf(ua4Var.f387166d)) && n51.f.a(java.lang.Long.valueOf(this.f387167e), java.lang.Long.valueOf(ua4Var.f387167e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f387166d);
            fVar.h(2, this.f387167e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f387166d) + 0 + b36.f.h(2, this.f387167e);
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
        r45.ua4 ua4Var = (r45.ua4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ua4Var.f387166d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ua4Var.f387167e = aVar2.i(intValue);
        return 0;
    }
}
