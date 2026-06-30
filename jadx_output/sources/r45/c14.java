package r45;

/* loaded from: classes9.dex */
public class c14 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371206d;

    /* renamed from: e, reason: collision with root package name */
    public int f371207e;

    /* renamed from: f, reason: collision with root package name */
    public int f371208f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371209g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371210h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371211i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371212m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371213n;

    /* renamed from: o, reason: collision with root package name */
    public int f371214o;

    /* renamed from: p, reason: collision with root package name */
    public int f371215p;

    /* renamed from: q, reason: collision with root package name */
    public int f371216q;

    /* renamed from: r, reason: collision with root package name */
    public int f371217r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c14)) {
            return false;
        }
        r45.c14 c14Var = (r45.c14) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371206d), java.lang.Integer.valueOf(c14Var.f371206d)) && n51.f.a(java.lang.Integer.valueOf(this.f371207e), java.lang.Integer.valueOf(c14Var.f371207e)) && n51.f.a(java.lang.Integer.valueOf(this.f371208f), java.lang.Integer.valueOf(c14Var.f371208f)) && n51.f.a(this.f371209g, c14Var.f371209g) && n51.f.a(this.f371210h, c14Var.f371210h) && n51.f.a(this.f371211i, c14Var.f371211i) && n51.f.a(this.f371212m, c14Var.f371212m) && n51.f.a(this.f371213n, c14Var.f371213n) && n51.f.a(java.lang.Integer.valueOf(this.f371214o), java.lang.Integer.valueOf(c14Var.f371214o)) && n51.f.a(java.lang.Integer.valueOf(this.f371215p), java.lang.Integer.valueOf(c14Var.f371215p)) && n51.f.a(java.lang.Integer.valueOf(this.f371216q), java.lang.Integer.valueOf(c14Var.f371216q)) && n51.f.a(java.lang.Integer.valueOf(this.f371217r), java.lang.Integer.valueOf(c14Var.f371217r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371206d);
            fVar.e(2, this.f371207e);
            fVar.e(3, this.f371208f);
            java.lang.String str = this.f371209g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f371210h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f371211i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f371212m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f371213n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f371214o);
            fVar.e(10, this.f371215p);
            fVar.e(11, this.f371216q);
            fVar.e(12, this.f371217r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371206d) + 0 + b36.f.e(2, this.f371207e) + b36.f.e(3, this.f371208f);
            java.lang.String str6 = this.f371209g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f371210h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f371211i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f371212m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f371213n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f371214o) + b36.f.e(10, this.f371215p) + b36.f.e(11, this.f371216q) + b36.f.e(12, this.f371217r);
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
        r45.c14 c14Var = (r45.c14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c14Var.f371206d = aVar2.g(intValue);
                return 0;
            case 2:
                c14Var.f371207e = aVar2.g(intValue);
                return 0;
            case 3:
                c14Var.f371208f = aVar2.g(intValue);
                return 0;
            case 4:
                c14Var.f371209g = aVar2.k(intValue);
                return 0;
            case 5:
                c14Var.f371210h = aVar2.k(intValue);
                return 0;
            case 6:
                c14Var.f371211i = aVar2.k(intValue);
                return 0;
            case 7:
                c14Var.f371212m = aVar2.k(intValue);
                return 0;
            case 8:
                c14Var.f371213n = aVar2.k(intValue);
                return 0;
            case 9:
                c14Var.f371214o = aVar2.g(intValue);
                return 0;
            case 10:
                c14Var.f371215p = aVar2.g(intValue);
                return 0;
            case 11:
                c14Var.f371216q = aVar2.g(intValue);
                return 0;
            case 12:
                c14Var.f371217r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
