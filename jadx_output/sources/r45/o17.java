package r45;

/* loaded from: classes11.dex */
public class o17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381828d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381829e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381830f;

    /* renamed from: g, reason: collision with root package name */
    public int f381831g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381832h;

    /* renamed from: i, reason: collision with root package name */
    public int f381833i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f381834m;

    /* renamed from: n, reason: collision with root package name */
    public int f381835n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381836o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o17)) {
            return false;
        }
        r45.o17 o17Var = (r45.o17) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381828d), java.lang.Integer.valueOf(o17Var.f381828d)) && n51.f.a(this.f381829e, o17Var.f381829e) && n51.f.a(this.f381830f, o17Var.f381830f) && n51.f.a(java.lang.Integer.valueOf(this.f381831g), java.lang.Integer.valueOf(o17Var.f381831g)) && n51.f.a(this.f381832h, o17Var.f381832h) && n51.f.a(java.lang.Integer.valueOf(this.f381833i), java.lang.Integer.valueOf(o17Var.f381833i)) && n51.f.a(java.lang.Boolean.valueOf(this.f381834m), java.lang.Boolean.valueOf(o17Var.f381834m)) && n51.f.a(java.lang.Integer.valueOf(this.f381835n), java.lang.Integer.valueOf(o17Var.f381835n)) && n51.f.a(this.f381836o, o17Var.f381836o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381828d);
            com.tencent.mm.protobuf.g gVar = this.f381829e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f381830f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f381831g);
            com.tencent.mm.protobuf.g gVar2 = this.f381832h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.e(6, this.f381833i);
            fVar.a(7, this.f381834m);
            fVar.e(8, this.f381835n);
            com.tencent.mm.protobuf.g gVar3 = this.f381836o;
            if (gVar3 != null) {
                fVar.b(9, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381828d) + 0;
            com.tencent.mm.protobuf.g gVar4 = this.f381829e;
            if (gVar4 != null) {
                e17 += b36.f.b(2, gVar4);
            }
            java.lang.String str2 = this.f381830f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            int e18 = e17 + b36.f.e(4, this.f381831g);
            com.tencent.mm.protobuf.g gVar5 = this.f381832h;
            if (gVar5 != null) {
                e18 += b36.f.b(5, gVar5);
            }
            int e19 = e18 + b36.f.e(6, this.f381833i) + b36.f.a(7, this.f381834m) + b36.f.e(8, this.f381835n);
            com.tencent.mm.protobuf.g gVar6 = this.f381836o;
            return gVar6 != null ? e19 + b36.f.b(9, gVar6) : e19;
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
        r45.o17 o17Var = (r45.o17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o17Var.f381828d = aVar2.g(intValue);
                return 0;
            case 2:
                o17Var.f381829e = aVar2.d(intValue);
                return 0;
            case 3:
                o17Var.f381830f = aVar2.k(intValue);
                return 0;
            case 4:
                o17Var.f381831g = aVar2.g(intValue);
                return 0;
            case 5:
                o17Var.f381832h = aVar2.d(intValue);
                return 0;
            case 6:
                o17Var.f381833i = aVar2.g(intValue);
                return 0;
            case 7:
                o17Var.f381834m = aVar2.c(intValue);
                return 0;
            case 8:
                o17Var.f381835n = aVar2.g(intValue);
                return 0;
            case 9:
                o17Var.f381836o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
