package r45;

/* loaded from: classes7.dex */
public class ec6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373272d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373273e;

    /* renamed from: f, reason: collision with root package name */
    public int f373274f;

    /* renamed from: g, reason: collision with root package name */
    public long f373275g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373276h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373277i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec6)) {
            return false;
        }
        r45.ec6 ec6Var = (r45.ec6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373272d), java.lang.Integer.valueOf(ec6Var.f373272d)) && n51.f.a(this.f373273e, ec6Var.f373273e) && n51.f.a(java.lang.Integer.valueOf(this.f373274f), java.lang.Integer.valueOf(ec6Var.f373274f)) && n51.f.a(java.lang.Long.valueOf(this.f373275g), java.lang.Long.valueOf(ec6Var.f373275g)) && n51.f.a(this.f373276h, ec6Var.f373276h) && n51.f.a(this.f373277i, ec6Var.f373277i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373272d);
            com.tencent.mm.protobuf.g gVar = this.f373273e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f373274f);
            fVar.h(4, this.f373275g);
            java.lang.String str = this.f373276h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f373277i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373272d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f373273e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f373274f) + b36.f.h(4, this.f373275g);
            java.lang.String str3 = this.f373276h;
            if (str3 != null) {
                e18 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f373277i;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.ec6 ec6Var = (r45.ec6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ec6Var.f373272d = aVar2.g(intValue);
                return 0;
            case 2:
                ec6Var.f373273e = aVar2.d(intValue);
                return 0;
            case 3:
                ec6Var.f373274f = aVar2.g(intValue);
                return 0;
            case 4:
                ec6Var.f373275g = aVar2.i(intValue);
                return 0;
            case 5:
                ec6Var.f373276h = aVar2.k(intValue);
                return 0;
            case 6:
                ec6Var.f373277i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
