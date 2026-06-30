package r45;

/* loaded from: classes9.dex */
public class ul1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387454d;

    /* renamed from: e, reason: collision with root package name */
    public int f387455e;

    /* renamed from: f, reason: collision with root package name */
    public int f387456f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ul1)) {
            return false;
        }
        r45.ul1 ul1Var = (r45.ul1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387454d), java.lang.Integer.valueOf(ul1Var.f387454d)) && n51.f.a(java.lang.Integer.valueOf(this.f387455e), java.lang.Integer.valueOf(ul1Var.f387455e)) && n51.f.a(java.lang.Integer.valueOf(this.f387456f), java.lang.Integer.valueOf(ul1Var.f387456f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387454d);
            fVar.e(2, this.f387455e);
            fVar.e(3, this.f387456f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f387454d) + 0 + b36.f.e(2, this.f387455e) + b36.f.e(3, this.f387456f);
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
        r45.ul1 ul1Var = (r45.ul1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ul1Var.f387454d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ul1Var.f387455e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ul1Var.f387456f = aVar2.g(intValue);
        return 0;
    }
}
