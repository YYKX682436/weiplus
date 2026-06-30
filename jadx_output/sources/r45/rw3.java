package r45;

/* loaded from: classes4.dex */
public class rw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385236e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385237f;

    /* renamed from: g, reason: collision with root package name */
    public int f385238g;

    /* renamed from: h, reason: collision with root package name */
    public int f385239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385241m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385242n;

    /* renamed from: o, reason: collision with root package name */
    public int f385243o;

    /* renamed from: p, reason: collision with root package name */
    public int f385244p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw3)) {
            return false;
        }
        r45.rw3 rw3Var = (r45.rw3) fVar;
        return n51.f.a(this.f385235d, rw3Var.f385235d) && n51.f.a(this.f385236e, rw3Var.f385236e) && n51.f.a(this.f385237f, rw3Var.f385237f) && n51.f.a(java.lang.Integer.valueOf(this.f385238g), java.lang.Integer.valueOf(rw3Var.f385238g)) && n51.f.a(java.lang.Integer.valueOf(this.f385239h), java.lang.Integer.valueOf(rw3Var.f385239h)) && n51.f.a(this.f385240i, rw3Var.f385240i) && n51.f.a(this.f385241m, rw3Var.f385241m) && n51.f.a(this.f385242n, rw3Var.f385242n) && n51.f.a(java.lang.Integer.valueOf(this.f385243o), java.lang.Integer.valueOf(rw3Var.f385243o)) && n51.f.a(java.lang.Integer.valueOf(this.f385244p), java.lang.Integer.valueOf(rw3Var.f385244p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385235d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385236e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385237f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f385238g);
            fVar.e(5, this.f385239h);
            java.lang.String str4 = this.f385240i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f385241m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f385242n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f385243o);
            fVar.e(10, this.f385244p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f385235d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f385236e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f385237f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int e17 = j17 + b36.f.e(4, this.f385238g) + b36.f.e(5, this.f385239h);
            java.lang.String str10 = this.f385240i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f385241m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f385242n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f385243o) + b36.f.e(10, this.f385244p);
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
        r45.rw3 rw3Var = (r45.rw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rw3Var.f385235d = aVar2.k(intValue);
                return 0;
            case 2:
                rw3Var.f385236e = aVar2.k(intValue);
                return 0;
            case 3:
                rw3Var.f385237f = aVar2.k(intValue);
                return 0;
            case 4:
                rw3Var.f385238g = aVar2.g(intValue);
                return 0;
            case 5:
                rw3Var.f385239h = aVar2.g(intValue);
                return 0;
            case 6:
                rw3Var.f385240i = aVar2.k(intValue);
                return 0;
            case 7:
                rw3Var.f385241m = aVar2.k(intValue);
                return 0;
            case 8:
                rw3Var.f385242n = aVar2.k(intValue);
                return 0;
            case 9:
                rw3Var.f385243o = aVar2.g(intValue);
                return 0;
            case 10:
                rw3Var.f385244p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
