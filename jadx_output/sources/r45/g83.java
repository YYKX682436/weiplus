package r45;

/* loaded from: classes15.dex */
public class g83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374979d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374980e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374981f;

    /* renamed from: g, reason: collision with root package name */
    public int f374982g;

    /* renamed from: h, reason: collision with root package name */
    public int f374983h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374984i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374985m;

    /* renamed from: n, reason: collision with root package name */
    public long f374986n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f374987o;

    /* renamed from: p, reason: collision with root package name */
    public int f374988p;

    /* renamed from: q, reason: collision with root package name */
    public int f374989q;

    /* renamed from: r, reason: collision with root package name */
    public int f374990r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g83)) {
            return false;
        }
        r45.g83 g83Var = (r45.g83) fVar;
        return n51.f.a(this.f374979d, g83Var.f374979d) && n51.f.a(this.f374980e, g83Var.f374980e) && n51.f.a(this.f374981f, g83Var.f374981f) && n51.f.a(java.lang.Integer.valueOf(this.f374982g), java.lang.Integer.valueOf(g83Var.f374982g)) && n51.f.a(java.lang.Integer.valueOf(this.f374983h), java.lang.Integer.valueOf(g83Var.f374983h)) && n51.f.a(this.f374984i, g83Var.f374984i) && n51.f.a(this.f374985m, g83Var.f374985m) && n51.f.a(java.lang.Long.valueOf(this.f374986n), java.lang.Long.valueOf(g83Var.f374986n)) && n51.f.a(java.lang.Boolean.valueOf(this.f374987o), java.lang.Boolean.valueOf(g83Var.f374987o)) && n51.f.a(java.lang.Integer.valueOf(this.f374988p), java.lang.Integer.valueOf(g83Var.f374988p)) && n51.f.a(java.lang.Integer.valueOf(this.f374989q), java.lang.Integer.valueOf(g83Var.f374989q)) && n51.f.a(java.lang.Integer.valueOf(this.f374990r), java.lang.Integer.valueOf(g83Var.f374990r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374979d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374980e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374981f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f374982g);
            fVar.e(5, this.f374983h);
            java.lang.String str4 = this.f374984i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f374985m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f374986n);
            fVar.a(9, this.f374987o);
            fVar.e(10, this.f374988p);
            fVar.e(11, this.f374989q);
            fVar.e(12, this.f374990r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f374979d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f374980e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f374981f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f374982g) + b36.f.e(5, this.f374983h);
            java.lang.String str9 = this.f374984i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f374985m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.h(8, this.f374986n) + b36.f.a(9, this.f374987o) + b36.f.e(10, this.f374988p) + b36.f.e(11, this.f374989q) + b36.f.e(12, this.f374990r);
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
        r45.g83 g83Var = (r45.g83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g83Var.f374979d = aVar2.k(intValue);
                return 0;
            case 2:
                g83Var.f374980e = aVar2.k(intValue);
                return 0;
            case 3:
                g83Var.f374981f = aVar2.k(intValue);
                return 0;
            case 4:
                g83Var.f374982g = aVar2.g(intValue);
                return 0;
            case 5:
                g83Var.f374983h = aVar2.g(intValue);
                return 0;
            case 6:
                g83Var.f374984i = aVar2.k(intValue);
                return 0;
            case 7:
                g83Var.f374985m = aVar2.k(intValue);
                return 0;
            case 8:
                g83Var.f374986n = aVar2.i(intValue);
                return 0;
            case 9:
                g83Var.f374987o = aVar2.c(intValue);
                return 0;
            case 10:
                g83Var.f374988p = aVar2.g(intValue);
                return 0;
            case 11:
                g83Var.f374989q = aVar2.g(intValue);
                return 0;
            case 12:
                g83Var.f374990r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
