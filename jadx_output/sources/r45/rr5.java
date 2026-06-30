package r45;

/* loaded from: classes12.dex */
public class rr5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385143e;

    /* renamed from: f, reason: collision with root package name */
    public long f385144f;

    /* renamed from: g, reason: collision with root package name */
    public int f385145g;

    /* renamed from: h, reason: collision with root package name */
    public int f385146h;

    /* renamed from: i, reason: collision with root package name */
    public int f385147i;

    /* renamed from: m, reason: collision with root package name */
    public int f385148m;

    /* renamed from: n, reason: collision with root package name */
    public int f385149n;

    /* renamed from: o, reason: collision with root package name */
    public int f385150o;

    /* renamed from: p, reason: collision with root package name */
    public float f385151p;

    /* renamed from: q, reason: collision with root package name */
    public float f385152q;

    /* renamed from: r, reason: collision with root package name */
    public float f385153r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr5)) {
            return false;
        }
        r45.rr5 rr5Var = (r45.rr5) fVar;
        return n51.f.a(this.f385142d, rr5Var.f385142d) && n51.f.a(this.f385143e, rr5Var.f385143e) && n51.f.a(java.lang.Long.valueOf(this.f385144f), java.lang.Long.valueOf(rr5Var.f385144f)) && n51.f.a(java.lang.Integer.valueOf(this.f385145g), java.lang.Integer.valueOf(rr5Var.f385145g)) && n51.f.a(java.lang.Integer.valueOf(this.f385146h), java.lang.Integer.valueOf(rr5Var.f385146h)) && n51.f.a(java.lang.Integer.valueOf(this.f385147i), java.lang.Integer.valueOf(rr5Var.f385147i)) && n51.f.a(java.lang.Integer.valueOf(this.f385148m), java.lang.Integer.valueOf(rr5Var.f385148m)) && n51.f.a(java.lang.Integer.valueOf(this.f385149n), java.lang.Integer.valueOf(rr5Var.f385149n)) && n51.f.a(java.lang.Integer.valueOf(this.f385150o), java.lang.Integer.valueOf(rr5Var.f385150o)) && n51.f.a(java.lang.Float.valueOf(this.f385151p), java.lang.Float.valueOf(rr5Var.f385151p)) && n51.f.a(java.lang.Float.valueOf(this.f385152q), java.lang.Float.valueOf(rr5Var.f385152q)) && n51.f.a(java.lang.Float.valueOf(this.f385153r), java.lang.Float.valueOf(rr5Var.f385153r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385142d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385143e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f385144f);
            fVar.e(4, this.f385145g);
            fVar.e(5, this.f385146h);
            fVar.e(6, this.f385147i);
            fVar.e(7, this.f385148m);
            fVar.e(8, this.f385149n);
            fVar.e(9, this.f385150o);
            fVar.d(10, this.f385151p);
            fVar.d(11, this.f385152q);
            fVar.d(12, this.f385153r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385142d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f385143e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f385144f) + b36.f.e(4, this.f385145g) + b36.f.e(5, this.f385146h) + b36.f.e(6, this.f385147i) + b36.f.e(7, this.f385148m) + b36.f.e(8, this.f385149n) + b36.f.e(9, this.f385150o) + b36.f.d(10, this.f385151p) + b36.f.d(11, this.f385152q) + b36.f.d(12, this.f385153r);
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
        r45.rr5 rr5Var = (r45.rr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rr5Var.f385142d = aVar2.k(intValue);
                return 0;
            case 2:
                rr5Var.f385143e = aVar2.k(intValue);
                return 0;
            case 3:
                rr5Var.f385144f = aVar2.i(intValue);
                return 0;
            case 4:
                rr5Var.f385145g = aVar2.g(intValue);
                return 0;
            case 5:
                rr5Var.f385146h = aVar2.g(intValue);
                return 0;
            case 6:
                rr5Var.f385147i = aVar2.g(intValue);
                return 0;
            case 7:
                rr5Var.f385148m = aVar2.g(intValue);
                return 0;
            case 8:
                rr5Var.f385149n = aVar2.g(intValue);
                return 0;
            case 9:
                rr5Var.f385150o = aVar2.g(intValue);
                return 0;
            case 10:
                rr5Var.f385151p = aVar2.f(intValue);
                return 0;
            case 11:
                rr5Var.f385152q = aVar2.f(intValue);
                return 0;
            case 12:
                rr5Var.f385153r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
