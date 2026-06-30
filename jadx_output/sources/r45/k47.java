package r45;

/* loaded from: classes7.dex */
public class k47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378375e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378376f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k47)) {
            return false;
        }
        r45.k47 k47Var = (r45.k47) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378374d), java.lang.Integer.valueOf(k47Var.f378374d)) && n51.f.a(this.f378375e, k47Var.f378375e) && n51.f.a(this.f378376f, k47Var.f378376f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378374d);
            java.lang.String str = this.f378375e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f378376f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378374d) + 0;
            java.lang.String str2 = this.f378375e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378376f;
            return gVar2 != null ? e17 + b36.f.b(3, gVar2) : e17;
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
        r45.k47 k47Var = (r45.k47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k47Var.f378374d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            k47Var.f378375e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k47Var.f378376f = aVar2.d(intValue);
        return 0;
    }
}
