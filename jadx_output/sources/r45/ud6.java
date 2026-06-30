package r45;

/* loaded from: classes4.dex */
public class ud6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387269f;

    /* renamed from: g, reason: collision with root package name */
    public int f387270g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387271h;

    /* renamed from: i, reason: collision with root package name */
    public int f387272i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud6)) {
            return false;
        }
        r45.ud6 ud6Var = (r45.ud6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387267d), java.lang.Integer.valueOf(ud6Var.f387267d)) && n51.f.a(this.f387268e, ud6Var.f387268e) && n51.f.a(this.f387269f, ud6Var.f387269f) && n51.f.a(java.lang.Integer.valueOf(this.f387270g), java.lang.Integer.valueOf(ud6Var.f387270g)) && n51.f.a(this.f387271h, ud6Var.f387271h) && n51.f.a(java.lang.Integer.valueOf(this.f387272i), java.lang.Integer.valueOf(ud6Var.f387272i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387267d);
            java.lang.String str = this.f387268e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387269f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387270g);
            java.lang.String str3 = this.f387271h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f387272i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387267d) + 0;
            java.lang.String str4 = this.f387268e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387269f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f387270g);
            java.lang.String str6 = this.f387271h;
            if (str6 != null) {
                e18 += b36.f.j(5, str6);
            }
            return e18 + b36.f.e(6, this.f387272i);
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
        r45.ud6 ud6Var = (r45.ud6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ud6Var.f387267d = aVar2.g(intValue);
                return 0;
            case 2:
                ud6Var.f387268e = aVar2.k(intValue);
                return 0;
            case 3:
                ud6Var.f387269f = aVar2.k(intValue);
                return 0;
            case 4:
                ud6Var.f387270g = aVar2.g(intValue);
                return 0;
            case 5:
                ud6Var.f387271h = aVar2.k(intValue);
                return 0;
            case 6:
                ud6Var.f387272i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
