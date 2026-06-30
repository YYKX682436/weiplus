package r45;

/* loaded from: classes8.dex */
public class ma4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380294d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380295e;

    /* renamed from: f, reason: collision with root package name */
    public int f380296f;

    /* renamed from: g, reason: collision with root package name */
    public int f380297g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380298h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380299i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380300m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380301n;

    /* renamed from: o, reason: collision with root package name */
    public long f380302o;

    /* renamed from: p, reason: collision with root package name */
    public long f380303p;

    /* renamed from: q, reason: collision with root package name */
    public long f380304q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380305r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma4)) {
            return false;
        }
        r45.ma4 ma4Var = (r45.ma4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380294d), java.lang.Integer.valueOf(ma4Var.f380294d)) && n51.f.a(this.f380295e, ma4Var.f380295e) && n51.f.a(java.lang.Integer.valueOf(this.f380296f), java.lang.Integer.valueOf(ma4Var.f380296f)) && n51.f.a(java.lang.Integer.valueOf(this.f380297g), java.lang.Integer.valueOf(ma4Var.f380297g)) && n51.f.a(this.f380298h, ma4Var.f380298h) && n51.f.a(this.f380299i, ma4Var.f380299i) && n51.f.a(this.f380300m, ma4Var.f380300m) && n51.f.a(this.f380301n, ma4Var.f380301n) && n51.f.a(java.lang.Long.valueOf(this.f380302o), java.lang.Long.valueOf(ma4Var.f380302o)) && n51.f.a(java.lang.Long.valueOf(this.f380303p), java.lang.Long.valueOf(ma4Var.f380303p)) && n51.f.a(java.lang.Long.valueOf(this.f380304q), java.lang.Long.valueOf(ma4Var.f380304q)) && n51.f.a(this.f380305r, ma4Var.f380305r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380294d);
            java.lang.String str = this.f380295e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380296f);
            fVar.e(4, this.f380297g);
            com.tencent.mm.protobuf.g gVar = this.f380298h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f380299i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f380300m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str2 = this.f380301n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.h(9, this.f380302o);
            fVar.h(10, this.f380303p);
            fVar.h(11, this.f380304q);
            java.lang.String str3 = this.f380305r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380294d) + 0;
            java.lang.String str4 = this.f380295e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f380296f) + b36.f.e(4, this.f380297g);
            com.tencent.mm.protobuf.g gVar4 = this.f380298h;
            if (gVar4 != null) {
                e18 += b36.f.b(5, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f380299i;
            if (gVar5 != null) {
                e18 += b36.f.b(6, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f380300m;
            if (gVar6 != null) {
                e18 += b36.f.b(7, gVar6);
            }
            java.lang.String str5 = this.f380301n;
            if (str5 != null) {
                e18 += b36.f.j(8, str5);
            }
            int h17 = e18 + b36.f.h(9, this.f380302o) + b36.f.h(10, this.f380303p) + b36.f.h(11, this.f380304q);
            java.lang.String str6 = this.f380305r;
            return str6 != null ? h17 + b36.f.j(12, str6) : h17;
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
        r45.ma4 ma4Var = (r45.ma4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ma4Var.f380294d = aVar2.g(intValue);
                return 0;
            case 2:
                ma4Var.f380295e = aVar2.k(intValue);
                return 0;
            case 3:
                ma4Var.f380296f = aVar2.g(intValue);
                return 0;
            case 4:
                ma4Var.f380297g = aVar2.g(intValue);
                return 0;
            case 5:
                ma4Var.f380298h = aVar2.d(intValue);
                return 0;
            case 6:
                ma4Var.f380299i = aVar2.d(intValue);
                return 0;
            case 7:
                ma4Var.f380300m = aVar2.d(intValue);
                return 0;
            case 8:
                ma4Var.f380301n = aVar2.k(intValue);
                return 0;
            case 9:
                ma4Var.f380302o = aVar2.i(intValue);
                return 0;
            case 10:
                ma4Var.f380303p = aVar2.i(intValue);
                return 0;
            case 11:
                ma4Var.f380304q = aVar2.i(intValue);
                return 0;
            case 12:
                ma4Var.f380305r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
