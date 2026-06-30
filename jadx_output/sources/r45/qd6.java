package r45;

/* loaded from: classes4.dex */
public class qd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383865d;

    /* renamed from: e, reason: collision with root package name */
    public int f383866e;

    /* renamed from: f, reason: collision with root package name */
    public int f383867f;

    /* renamed from: g, reason: collision with root package name */
    public long f383868g;

    /* renamed from: h, reason: collision with root package name */
    public int f383869h;

    /* renamed from: i, reason: collision with root package name */
    public int f383870i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383871m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383872n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383873o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383874p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd6)) {
            return false;
        }
        r45.qd6 qd6Var = (r45.qd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383865d), java.lang.Integer.valueOf(qd6Var.f383865d)) && n51.f.a(java.lang.Integer.valueOf(this.f383866e), java.lang.Integer.valueOf(qd6Var.f383866e)) && n51.f.a(java.lang.Integer.valueOf(this.f383867f), java.lang.Integer.valueOf(qd6Var.f383867f)) && n51.f.a(java.lang.Long.valueOf(this.f383868g), java.lang.Long.valueOf(qd6Var.f383868g)) && n51.f.a(java.lang.Integer.valueOf(this.f383869h), java.lang.Integer.valueOf(qd6Var.f383869h)) && n51.f.a(java.lang.Integer.valueOf(this.f383870i), java.lang.Integer.valueOf(qd6Var.f383870i)) && n51.f.a(this.f383871m, qd6Var.f383871m) && n51.f.a(this.f383872n, qd6Var.f383872n) && n51.f.a(this.f383873o, qd6Var.f383873o) && n51.f.a(this.f383874p, qd6Var.f383874p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383865d);
            fVar.e(2, this.f383866e);
            fVar.e(3, this.f383867f);
            fVar.h(4, this.f383868g);
            fVar.e(5, this.f383869h);
            fVar.e(6, this.f383870i);
            java.lang.String str = this.f383871m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f383872n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f383873o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f383874p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383865d) + 0 + b36.f.e(2, this.f383866e) + b36.f.e(3, this.f383867f) + b36.f.h(4, this.f383868g) + b36.f.e(5, this.f383869h) + b36.f.e(6, this.f383870i);
            java.lang.String str5 = this.f383871m;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f383872n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            java.lang.String str7 = this.f383873o;
            if (str7 != null) {
                e17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f383874p;
            return str8 != null ? e17 + b36.f.j(10, str8) : e17;
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
        r45.qd6 qd6Var = (r45.qd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qd6Var.f383865d = aVar2.g(intValue);
                return 0;
            case 2:
                qd6Var.f383866e = aVar2.g(intValue);
                return 0;
            case 3:
                qd6Var.f383867f = aVar2.g(intValue);
                return 0;
            case 4:
                qd6Var.f383868g = aVar2.i(intValue);
                return 0;
            case 5:
                qd6Var.f383869h = aVar2.g(intValue);
                return 0;
            case 6:
                qd6Var.f383870i = aVar2.g(intValue);
                return 0;
            case 7:
                qd6Var.f383871m = aVar2.k(intValue);
                return 0;
            case 8:
                qd6Var.f383872n = aVar2.k(intValue);
                return 0;
            case 9:
                qd6Var.f383873o = aVar2.k(intValue);
                return 0;
            case 10:
                qd6Var.f383874p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
