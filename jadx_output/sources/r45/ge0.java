package r45;

/* loaded from: classes11.dex */
public class ge0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375153d;

    /* renamed from: e, reason: collision with root package name */
    public int f375154e;

    /* renamed from: f, reason: collision with root package name */
    public int f375155f;

    /* renamed from: g, reason: collision with root package name */
    public int f375156g;

    /* renamed from: h, reason: collision with root package name */
    public int f375157h;

    /* renamed from: i, reason: collision with root package name */
    public int f375158i;

    /* renamed from: m, reason: collision with root package name */
    public int f375159m;

    /* renamed from: n, reason: collision with root package name */
    public int f375160n;

    /* renamed from: o, reason: collision with root package name */
    public int f375161o;

    /* renamed from: p, reason: collision with root package name */
    public int f375162p;

    /* renamed from: q, reason: collision with root package name */
    public int f375163q;

    /* renamed from: r, reason: collision with root package name */
    public int f375164r;

    /* renamed from: s, reason: collision with root package name */
    public int f375165s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ge0)) {
            return false;
        }
        r45.ge0 ge0Var = (r45.ge0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375153d), java.lang.Integer.valueOf(ge0Var.f375153d)) && n51.f.a(java.lang.Integer.valueOf(this.f375154e), java.lang.Integer.valueOf(ge0Var.f375154e)) && n51.f.a(java.lang.Integer.valueOf(this.f375155f), java.lang.Integer.valueOf(ge0Var.f375155f)) && n51.f.a(java.lang.Integer.valueOf(this.f375156g), java.lang.Integer.valueOf(ge0Var.f375156g)) && n51.f.a(java.lang.Integer.valueOf(this.f375157h), java.lang.Integer.valueOf(ge0Var.f375157h)) && n51.f.a(java.lang.Integer.valueOf(this.f375158i), java.lang.Integer.valueOf(ge0Var.f375158i)) && n51.f.a(java.lang.Integer.valueOf(this.f375159m), java.lang.Integer.valueOf(ge0Var.f375159m)) && n51.f.a(java.lang.Integer.valueOf(this.f375160n), java.lang.Integer.valueOf(ge0Var.f375160n)) && n51.f.a(java.lang.Integer.valueOf(this.f375161o), java.lang.Integer.valueOf(ge0Var.f375161o)) && n51.f.a(java.lang.Integer.valueOf(this.f375162p), java.lang.Integer.valueOf(ge0Var.f375162p)) && n51.f.a(java.lang.Integer.valueOf(this.f375163q), java.lang.Integer.valueOf(ge0Var.f375163q)) && n51.f.a(java.lang.Integer.valueOf(this.f375164r), java.lang.Integer.valueOf(ge0Var.f375164r)) && n51.f.a(java.lang.Integer.valueOf(this.f375165s), java.lang.Integer.valueOf(ge0Var.f375165s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375153d);
            fVar.e(2, this.f375154e);
            fVar.e(3, this.f375155f);
            fVar.e(4, this.f375156g);
            fVar.e(5, this.f375157h);
            fVar.e(6, this.f375158i);
            fVar.e(7, this.f375159m);
            fVar.e(8, this.f375160n);
            fVar.e(9, this.f375161o);
            fVar.e(10, this.f375162p);
            fVar.e(11, this.f375163q);
            fVar.e(12, this.f375164r);
            fVar.e(13, this.f375165s);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f375153d) + 0 + b36.f.e(2, this.f375154e) + b36.f.e(3, this.f375155f) + b36.f.e(4, this.f375156g) + b36.f.e(5, this.f375157h) + b36.f.e(6, this.f375158i) + b36.f.e(7, this.f375159m) + b36.f.e(8, this.f375160n) + b36.f.e(9, this.f375161o) + b36.f.e(10, this.f375162p) + b36.f.e(11, this.f375163q) + b36.f.e(12, this.f375164r) + b36.f.e(13, this.f375165s);
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
        r45.ge0 ge0Var = (r45.ge0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ge0Var.f375153d = aVar2.g(intValue);
                return 0;
            case 2:
                ge0Var.f375154e = aVar2.g(intValue);
                return 0;
            case 3:
                ge0Var.f375155f = aVar2.g(intValue);
                return 0;
            case 4:
                ge0Var.f375156g = aVar2.g(intValue);
                return 0;
            case 5:
                ge0Var.f375157h = aVar2.g(intValue);
                return 0;
            case 6:
                ge0Var.f375158i = aVar2.g(intValue);
                return 0;
            case 7:
                ge0Var.f375159m = aVar2.g(intValue);
                return 0;
            case 8:
                ge0Var.f375160n = aVar2.g(intValue);
                return 0;
            case 9:
                ge0Var.f375161o = aVar2.g(intValue);
                return 0;
            case 10:
                ge0Var.f375162p = aVar2.g(intValue);
                return 0;
            case 11:
                ge0Var.f375163q = aVar2.g(intValue);
                return 0;
            case 12:
                ge0Var.f375164r = aVar2.g(intValue);
                return 0;
            case 13:
                ge0Var.f375165s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
