package r45;

/* loaded from: classes9.dex */
public class sq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385906d;

    /* renamed from: e, reason: collision with root package name */
    public int f385907e;

    /* renamed from: f, reason: collision with root package name */
    public int f385908f;

    /* renamed from: g, reason: collision with root package name */
    public int f385909g;

    /* renamed from: h, reason: collision with root package name */
    public int f385910h;

    /* renamed from: i, reason: collision with root package name */
    public int f385911i;

    /* renamed from: m, reason: collision with root package name */
    public int f385912m;

    /* renamed from: n, reason: collision with root package name */
    public int f385913n;

    /* renamed from: o, reason: collision with root package name */
    public int f385914o;

    /* renamed from: p, reason: collision with root package name */
    public int f385915p;

    /* renamed from: q, reason: collision with root package name */
    public int f385916q;

    /* renamed from: r, reason: collision with root package name */
    public int f385917r;

    /* renamed from: s, reason: collision with root package name */
    public int f385918s;

    /* renamed from: t, reason: collision with root package name */
    public int f385919t;

    /* renamed from: u, reason: collision with root package name */
    public int f385920u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sq0)) {
            return false;
        }
        r45.sq0 sq0Var = (r45.sq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385906d), java.lang.Integer.valueOf(sq0Var.f385906d)) && n51.f.a(java.lang.Integer.valueOf(this.f385907e), java.lang.Integer.valueOf(sq0Var.f385907e)) && n51.f.a(java.lang.Integer.valueOf(this.f385908f), java.lang.Integer.valueOf(sq0Var.f385908f)) && n51.f.a(java.lang.Integer.valueOf(this.f385909g), java.lang.Integer.valueOf(sq0Var.f385909g)) && n51.f.a(java.lang.Integer.valueOf(this.f385910h), java.lang.Integer.valueOf(sq0Var.f385910h)) && n51.f.a(java.lang.Integer.valueOf(this.f385911i), java.lang.Integer.valueOf(sq0Var.f385911i)) && n51.f.a(java.lang.Integer.valueOf(this.f385912m), java.lang.Integer.valueOf(sq0Var.f385912m)) && n51.f.a(java.lang.Integer.valueOf(this.f385913n), java.lang.Integer.valueOf(sq0Var.f385913n)) && n51.f.a(java.lang.Integer.valueOf(this.f385914o), java.lang.Integer.valueOf(sq0Var.f385914o)) && n51.f.a(java.lang.Integer.valueOf(this.f385915p), java.lang.Integer.valueOf(sq0Var.f385915p)) && n51.f.a(java.lang.Integer.valueOf(this.f385916q), java.lang.Integer.valueOf(sq0Var.f385916q)) && n51.f.a(java.lang.Integer.valueOf(this.f385917r), java.lang.Integer.valueOf(sq0Var.f385917r)) && n51.f.a(java.lang.Integer.valueOf(this.f385918s), java.lang.Integer.valueOf(sq0Var.f385918s)) && n51.f.a(java.lang.Integer.valueOf(this.f385919t), java.lang.Integer.valueOf(sq0Var.f385919t)) && n51.f.a(java.lang.Integer.valueOf(this.f385920u), java.lang.Integer.valueOf(sq0Var.f385920u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385906d);
            fVar.e(2, this.f385907e);
            fVar.e(3, this.f385908f);
            fVar.e(4, this.f385909g);
            fVar.e(5, this.f385910h);
            fVar.e(6, this.f385911i);
            fVar.e(7, this.f385912m);
            fVar.e(8, this.f385913n);
            fVar.e(9, this.f385914o);
            fVar.e(10, this.f385915p);
            fVar.e(11, this.f385916q);
            fVar.e(12, this.f385917r);
            fVar.e(13, this.f385918s);
            fVar.e(14, this.f385919t);
            fVar.e(15, this.f385920u);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f385906d) + 0 + b36.f.e(2, this.f385907e) + b36.f.e(3, this.f385908f) + b36.f.e(4, this.f385909g) + b36.f.e(5, this.f385910h) + b36.f.e(6, this.f385911i) + b36.f.e(7, this.f385912m) + b36.f.e(8, this.f385913n) + b36.f.e(9, this.f385914o) + b36.f.e(10, this.f385915p) + b36.f.e(11, this.f385916q) + b36.f.e(12, this.f385917r) + b36.f.e(13, this.f385918s) + b36.f.e(14, this.f385919t) + b36.f.e(15, this.f385920u);
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
        r45.sq0 sq0Var = (r45.sq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sq0Var.f385906d = aVar2.g(intValue);
                return 0;
            case 2:
                sq0Var.f385907e = aVar2.g(intValue);
                return 0;
            case 3:
                sq0Var.f385908f = aVar2.g(intValue);
                return 0;
            case 4:
                sq0Var.f385909g = aVar2.g(intValue);
                return 0;
            case 5:
                sq0Var.f385910h = aVar2.g(intValue);
                return 0;
            case 6:
                sq0Var.f385911i = aVar2.g(intValue);
                return 0;
            case 7:
                sq0Var.f385912m = aVar2.g(intValue);
                return 0;
            case 8:
                sq0Var.f385913n = aVar2.g(intValue);
                return 0;
            case 9:
                sq0Var.f385914o = aVar2.g(intValue);
                return 0;
            case 10:
                sq0Var.f385915p = aVar2.g(intValue);
                return 0;
            case 11:
                sq0Var.f385916q = aVar2.g(intValue);
                return 0;
            case 12:
                sq0Var.f385917r = aVar2.g(intValue);
                return 0;
            case 13:
                sq0Var.f385918s = aVar2.g(intValue);
                return 0;
            case 14:
                sq0Var.f385919t = aVar2.g(intValue);
                return 0;
            case 15:
                sq0Var.f385920u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
