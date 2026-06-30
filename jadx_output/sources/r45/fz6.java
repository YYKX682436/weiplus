package r45;

/* loaded from: classes2.dex */
public class fz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374753d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374755f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fz6)) {
            return false;
        }
        r45.fz6 fz6Var = (r45.fz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374753d), java.lang.Integer.valueOf(fz6Var.f374753d)) && n51.f.a(this.f374754e, fz6Var.f374754e) && n51.f.a(this.f374755f, fz6Var.f374755f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374753d);
            java.lang.String str = this.f374754e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374755f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374753d) + 0;
            java.lang.String str3 = this.f374754e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f374755f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.fz6 fz6Var = (r45.fz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fz6Var.f374753d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fz6Var.f374754e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        fz6Var.f374755f = aVar2.k(intValue);
        return 0;
    }
}
