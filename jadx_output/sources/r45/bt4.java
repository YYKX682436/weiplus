package r45;

/* loaded from: classes10.dex */
public class bt4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371037e;

    /* renamed from: f, reason: collision with root package name */
    public int f371038f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371039g;

    /* renamed from: h, reason: collision with root package name */
    public int f371040h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371041i;

    /* renamed from: m, reason: collision with root package name */
    public int f371042m;

    /* renamed from: n, reason: collision with root package name */
    public int f371043n;

    /* renamed from: o, reason: collision with root package name */
    public long f371044o;

    /* renamed from: p, reason: collision with root package name */
    public long f371045p;

    /* renamed from: q, reason: collision with root package name */
    public long f371046q;

    /* renamed from: r, reason: collision with root package name */
    public int f371047r;

    /* renamed from: s, reason: collision with root package name */
    public int f371048s;

    /* renamed from: t, reason: collision with root package name */
    public int f371049t;

    /* renamed from: u, reason: collision with root package name */
    public int f371050u;

    /* renamed from: v, reason: collision with root package name */
    public long f371051v;

    /* renamed from: w, reason: collision with root package name */
    public int f371052w;

    /* renamed from: x, reason: collision with root package name */
    public int f371053x;

    /* renamed from: y, reason: collision with root package name */
    public int f371054y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bt4)) {
            return false;
        }
        r45.bt4 bt4Var = (r45.bt4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371036d), java.lang.Integer.valueOf(bt4Var.f371036d)) && n51.f.a(this.f371037e, bt4Var.f371037e) && n51.f.a(java.lang.Integer.valueOf(this.f371038f), java.lang.Integer.valueOf(bt4Var.f371038f)) && n51.f.a(this.f371039g, bt4Var.f371039g) && n51.f.a(java.lang.Integer.valueOf(this.f371040h), java.lang.Integer.valueOf(bt4Var.f371040h)) && n51.f.a(this.f371041i, bt4Var.f371041i) && n51.f.a(java.lang.Integer.valueOf(this.f371042m), java.lang.Integer.valueOf(bt4Var.f371042m)) && n51.f.a(java.lang.Integer.valueOf(this.f371043n), java.lang.Integer.valueOf(bt4Var.f371043n)) && n51.f.a(java.lang.Long.valueOf(this.f371044o), java.lang.Long.valueOf(bt4Var.f371044o)) && n51.f.a(java.lang.Long.valueOf(this.f371045p), java.lang.Long.valueOf(bt4Var.f371045p)) && n51.f.a(java.lang.Long.valueOf(this.f371046q), java.lang.Long.valueOf(bt4Var.f371046q)) && n51.f.a(java.lang.Integer.valueOf(this.f371047r), java.lang.Integer.valueOf(bt4Var.f371047r)) && n51.f.a(java.lang.Integer.valueOf(this.f371048s), java.lang.Integer.valueOf(bt4Var.f371048s)) && n51.f.a(java.lang.Integer.valueOf(this.f371049t), java.lang.Integer.valueOf(bt4Var.f371049t)) && n51.f.a(java.lang.Integer.valueOf(this.f371050u), java.lang.Integer.valueOf(bt4Var.f371050u)) && n51.f.a(java.lang.Long.valueOf(this.f371051v), java.lang.Long.valueOf(bt4Var.f371051v)) && n51.f.a(java.lang.Integer.valueOf(this.f371052w), java.lang.Integer.valueOf(bt4Var.f371052w)) && n51.f.a(java.lang.Integer.valueOf(this.f371053x), java.lang.Integer.valueOf(bt4Var.f371053x)) && n51.f.a(java.lang.Integer.valueOf(this.f371054y), java.lang.Integer.valueOf(bt4Var.f371054y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371036d);
            java.lang.String str = this.f371037e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f371038f);
            java.lang.String str2 = this.f371039g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f371040h);
            java.lang.String str3 = this.f371041i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f371042m);
            fVar.e(8, this.f371043n);
            fVar.h(9, this.f371044o);
            fVar.h(10, this.f371045p);
            fVar.h(11, this.f371046q);
            fVar.e(12, this.f371047r);
            fVar.e(13, this.f371048s);
            fVar.e(14, this.f371049t);
            fVar.e(15, this.f371050u);
            fVar.h(16, this.f371051v);
            fVar.e(17, this.f371052w);
            fVar.e(18, this.f371053x);
            fVar.e(19, this.f371054y);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371036d) + 0;
            java.lang.String str4 = this.f371037e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f371038f);
            java.lang.String str5 = this.f371039g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            int e19 = e18 + b36.f.e(5, this.f371040h);
            java.lang.String str6 = this.f371041i;
            if (str6 != null) {
                e19 += b36.f.j(6, str6);
            }
            return e19 + b36.f.e(7, this.f371042m) + b36.f.e(8, this.f371043n) + b36.f.h(9, this.f371044o) + b36.f.h(10, this.f371045p) + b36.f.h(11, this.f371046q) + b36.f.e(12, this.f371047r) + b36.f.e(13, this.f371048s) + b36.f.e(14, this.f371049t) + b36.f.e(15, this.f371050u) + b36.f.h(16, this.f371051v) + b36.f.e(17, this.f371052w) + b36.f.e(18, this.f371053x) + b36.f.e(19, this.f371054y);
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
        r45.bt4 bt4Var = (r45.bt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bt4Var.f371036d = aVar2.g(intValue);
                return 0;
            case 2:
                bt4Var.f371037e = aVar2.k(intValue);
                return 0;
            case 3:
                bt4Var.f371038f = aVar2.g(intValue);
                return 0;
            case 4:
                bt4Var.f371039g = aVar2.k(intValue);
                return 0;
            case 5:
                bt4Var.f371040h = aVar2.g(intValue);
                return 0;
            case 6:
                bt4Var.f371041i = aVar2.k(intValue);
                return 0;
            case 7:
                bt4Var.f371042m = aVar2.g(intValue);
                return 0;
            case 8:
                bt4Var.f371043n = aVar2.g(intValue);
                return 0;
            case 9:
                bt4Var.f371044o = aVar2.i(intValue);
                return 0;
            case 10:
                bt4Var.f371045p = aVar2.i(intValue);
                return 0;
            case 11:
                bt4Var.f371046q = aVar2.i(intValue);
                return 0;
            case 12:
                bt4Var.f371047r = aVar2.g(intValue);
                return 0;
            case 13:
                bt4Var.f371048s = aVar2.g(intValue);
                return 0;
            case 14:
                bt4Var.f371049t = aVar2.g(intValue);
                return 0;
            case 15:
                bt4Var.f371050u = aVar2.g(intValue);
                return 0;
            case 16:
                bt4Var.f371051v = aVar2.i(intValue);
                return 0;
            case 17:
                bt4Var.f371052w = aVar2.g(intValue);
                return 0;
            case 18:
                bt4Var.f371053x = aVar2.g(intValue);
                return 0;
            case 19:
                bt4Var.f371054y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
