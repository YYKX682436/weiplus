package r45;

/* loaded from: classes12.dex */
public class de5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372354d;

    /* renamed from: e, reason: collision with root package name */
    public int f372355e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372356f;

    /* renamed from: g, reason: collision with root package name */
    public int f372357g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372358h;

    /* renamed from: i, reason: collision with root package name */
    public int f372359i;

    /* renamed from: m, reason: collision with root package name */
    public int f372360m;

    /* renamed from: n, reason: collision with root package name */
    public int f372361n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372362o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372363p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de5)) {
            return false;
        }
        r45.de5 de5Var = (r45.de5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372354d), java.lang.Integer.valueOf(de5Var.f372354d)) && n51.f.a(java.lang.Integer.valueOf(this.f372355e), java.lang.Integer.valueOf(de5Var.f372355e)) && n51.f.a(this.f372356f, de5Var.f372356f) && n51.f.a(java.lang.Integer.valueOf(this.f372357g), java.lang.Integer.valueOf(de5Var.f372357g)) && n51.f.a(this.f372358h, de5Var.f372358h) && n51.f.a(java.lang.Integer.valueOf(this.f372359i), java.lang.Integer.valueOf(de5Var.f372359i)) && n51.f.a(java.lang.Integer.valueOf(this.f372360m), java.lang.Integer.valueOf(de5Var.f372360m)) && n51.f.a(java.lang.Integer.valueOf(this.f372361n), java.lang.Integer.valueOf(de5Var.f372361n)) && n51.f.a(this.f372362o, de5Var.f372362o) && n51.f.a(this.f372363p, de5Var.f372363p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372354d);
            fVar.e(2, this.f372355e);
            com.tencent.mm.protobuf.g gVar = this.f372356f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f372357g);
            java.lang.String str = this.f372358h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f372359i);
            fVar.e(7, this.f372360m);
            fVar.e(8, this.f372361n);
            com.tencent.mm.protobuf.g gVar2 = this.f372362o;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f372363p;
            if (gVar3 != null) {
                fVar.b(10, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372354d) + 0 + b36.f.e(2, this.f372355e);
            com.tencent.mm.protobuf.g gVar4 = this.f372356f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            int e18 = e17 + b36.f.e(4, this.f372357g);
            java.lang.String str2 = this.f372358h;
            if (str2 != null) {
                e18 += b36.f.j(5, str2);
            }
            int e19 = e18 + b36.f.e(6, this.f372359i) + b36.f.e(7, this.f372360m) + b36.f.e(8, this.f372361n);
            com.tencent.mm.protobuf.g gVar5 = this.f372362o;
            if (gVar5 != null) {
                e19 += b36.f.b(9, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f372363p;
            return gVar6 != null ? e19 + b36.f.b(10, gVar6) : e19;
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
        r45.de5 de5Var = (r45.de5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                de5Var.f372354d = aVar2.g(intValue);
                return 0;
            case 2:
                de5Var.f372355e = aVar2.g(intValue);
                return 0;
            case 3:
                de5Var.f372356f = aVar2.d(intValue);
                return 0;
            case 4:
                de5Var.f372357g = aVar2.g(intValue);
                return 0;
            case 5:
                de5Var.f372358h = aVar2.k(intValue);
                return 0;
            case 6:
                de5Var.f372359i = aVar2.g(intValue);
                return 0;
            case 7:
                de5Var.f372360m = aVar2.g(intValue);
                return 0;
            case 8:
                de5Var.f372361n = aVar2.g(intValue);
                return 0;
            case 9:
                de5Var.f372362o = aVar2.d(intValue);
                return 0;
            case 10:
                de5Var.f372363p = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
