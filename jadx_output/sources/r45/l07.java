package r45;

/* loaded from: classes4.dex */
public class l07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379064d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379065e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l07)) {
            return false;
        }
        r45.l07 l07Var = (r45.l07) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379064d), java.lang.Long.valueOf(l07Var.f379064d)) && n51.f.a(this.f379065e, l07Var.f379065e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379064d);
            com.tencent.mm.protobuf.g gVar = this.f379065e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f379064d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f379065e;
            return gVar2 != null ? h17 + b36.f.b(2, gVar2) : h17;
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
        r45.l07 l07Var = (r45.l07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l07Var.f379064d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        l07Var.f379065e = aVar2.d(intValue);
        return 0;
    }
}
