package r45;

/* loaded from: classes9.dex */
public class f34 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373983d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373984e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373985f;

    /* renamed from: g, reason: collision with root package name */
    public int f373986g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f34)) {
            return false;
        }
        r45.f34 f34Var = (r45.f34) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373983d), java.lang.Integer.valueOf(f34Var.f373983d)) && n51.f.a(this.f373984e, f34Var.f373984e) && n51.f.a(this.f373985f, f34Var.f373985f) && n51.f.a(java.lang.Integer.valueOf(this.f373986g), java.lang.Integer.valueOf(f34Var.f373986g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373983d);
            java.lang.String str = this.f373984e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373985f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f373986g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373983d) + 0;
            java.lang.String str3 = this.f373984e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f373985f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f373986g);
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
        r45.f34 f34Var = (r45.f34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f34Var.f373983d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f34Var.f373984e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            f34Var.f373985f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        f34Var.f373986g = aVar2.g(intValue);
        return 0;
    }
}
