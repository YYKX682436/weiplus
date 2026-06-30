package r45;

/* loaded from: classes4.dex */
public class p25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382682d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f382683e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p25)) {
            return false;
        }
        r45.p25 p25Var = (r45.p25) fVar;
        return n51.f.a(this.f382682d, p25Var.f382682d) && n51.f.a(java.lang.Boolean.valueOf(this.f382683e), java.lang.Boolean.valueOf(p25Var.f382683e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382682d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f382683e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382682d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f382683e);
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
        r45.p25 p25Var = (r45.p25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p25Var.f382682d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        p25Var.f382683e = aVar2.c(intValue);
        return 0;
    }
}
