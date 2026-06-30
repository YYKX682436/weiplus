package r45;

/* loaded from: classes8.dex */
public class ge4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375167d;

    /* renamed from: e, reason: collision with root package name */
    public long f375168e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ge4)) {
            return false;
        }
        r45.ge4 ge4Var = (r45.ge4) fVar;
        return n51.f.a(this.f375167d, ge4Var.f375167d) && n51.f.a(java.lang.Long.valueOf(this.f375168e), java.lang.Long.valueOf(ge4Var.f375168e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375167d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f375168e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f375167d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f375168e);
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
        r45.ge4 ge4Var = (r45.ge4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ge4Var.f375167d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ge4Var.f375168e = aVar2.i(intValue);
        return 0;
    }
}
