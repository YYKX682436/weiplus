package r45;

/* loaded from: classes9.dex */
public class dq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372653d;

    /* renamed from: e, reason: collision with root package name */
    public int f372654e;

    /* renamed from: f, reason: collision with root package name */
    public int f372655f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372656g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372657h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372658i;

    /* renamed from: m, reason: collision with root package name */
    public int f372659m;

    /* renamed from: n, reason: collision with root package name */
    public int f372660n;

    /* renamed from: o, reason: collision with root package name */
    public int f372661o;

    /* renamed from: p, reason: collision with root package name */
    public int f372662p;

    /* renamed from: q, reason: collision with root package name */
    public int f372663q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dq0)) {
            return false;
        }
        r45.dq0 dq0Var = (r45.dq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372653d), java.lang.Integer.valueOf(dq0Var.f372653d)) && n51.f.a(java.lang.Integer.valueOf(this.f372654e), java.lang.Integer.valueOf(dq0Var.f372654e)) && n51.f.a(java.lang.Integer.valueOf(this.f372655f), java.lang.Integer.valueOf(dq0Var.f372655f)) && n51.f.a(this.f372656g, dq0Var.f372656g) && n51.f.a(this.f372657h, dq0Var.f372657h) && n51.f.a(this.f372658i, dq0Var.f372658i) && n51.f.a(java.lang.Integer.valueOf(this.f372659m), java.lang.Integer.valueOf(dq0Var.f372659m)) && n51.f.a(java.lang.Integer.valueOf(this.f372660n), java.lang.Integer.valueOf(dq0Var.f372660n)) && n51.f.a(java.lang.Integer.valueOf(this.f372661o), java.lang.Integer.valueOf(dq0Var.f372661o)) && n51.f.a(java.lang.Integer.valueOf(this.f372662p), java.lang.Integer.valueOf(dq0Var.f372662p)) && n51.f.a(java.lang.Integer.valueOf(this.f372663q), java.lang.Integer.valueOf(dq0Var.f372663q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372653d);
            fVar.e(2, this.f372654e);
            fVar.e(3, this.f372655f);
            java.lang.String str = this.f372656g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f372657h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372658i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f372659m);
            fVar.e(8, this.f372660n);
            fVar.e(9, this.f372661o);
            fVar.e(10, this.f372662p);
            fVar.e(11, this.f372663q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372653d) + 0 + b36.f.e(2, this.f372654e) + b36.f.e(3, this.f372655f);
            java.lang.String str4 = this.f372656g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f372657h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f372658i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.e(7, this.f372659m) + b36.f.e(8, this.f372660n) + b36.f.e(9, this.f372661o) + b36.f.e(10, this.f372662p) + b36.f.e(11, this.f372663q);
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
        r45.dq0 dq0Var = (r45.dq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dq0Var.f372653d = aVar2.g(intValue);
                return 0;
            case 2:
                dq0Var.f372654e = aVar2.g(intValue);
                return 0;
            case 3:
                dq0Var.f372655f = aVar2.g(intValue);
                return 0;
            case 4:
                dq0Var.f372656g = aVar2.k(intValue);
                return 0;
            case 5:
                dq0Var.f372657h = aVar2.k(intValue);
                return 0;
            case 6:
                dq0Var.f372658i = aVar2.k(intValue);
                return 0;
            case 7:
                dq0Var.f372659m = aVar2.g(intValue);
                return 0;
            case 8:
                dq0Var.f372660n = aVar2.g(intValue);
                return 0;
            case 9:
                dq0Var.f372661o = aVar2.g(intValue);
                return 0;
            case 10:
                dq0Var.f372662p = aVar2.g(intValue);
                return 0;
            case 11:
                dq0Var.f372663q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
