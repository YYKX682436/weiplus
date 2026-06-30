package r45;

/* loaded from: classes2.dex */
public class fx4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374688d;

    /* renamed from: e, reason: collision with root package name */
    public int f374689e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374690f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374691g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374692h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374693i;

    /* renamed from: m, reason: collision with root package name */
    public int f374694m;

    /* renamed from: n, reason: collision with root package name */
    public int f374695n;

    /* renamed from: o, reason: collision with root package name */
    public int f374696o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374697p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374698q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f374699r;

    /* renamed from: s, reason: collision with root package name */
    public int f374700s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx4)) {
            return false;
        }
        r45.fx4 fx4Var = (r45.fx4) fVar;
        return n51.f.a(this.f374688d, fx4Var.f374688d) && n51.f.a(java.lang.Integer.valueOf(this.f374689e), java.lang.Integer.valueOf(fx4Var.f374689e)) && n51.f.a(this.f374690f, fx4Var.f374690f) && n51.f.a(this.f374691g, fx4Var.f374691g) && n51.f.a(this.f374692h, fx4Var.f374692h) && n51.f.a(this.f374693i, fx4Var.f374693i) && n51.f.a(java.lang.Integer.valueOf(this.f374694m), java.lang.Integer.valueOf(fx4Var.f374694m)) && n51.f.a(java.lang.Integer.valueOf(this.f374695n), java.lang.Integer.valueOf(fx4Var.f374695n)) && n51.f.a(java.lang.Integer.valueOf(this.f374696o), java.lang.Integer.valueOf(fx4Var.f374696o)) && n51.f.a(this.f374697p, fx4Var.f374697p) && n51.f.a(this.f374698q, fx4Var.f374698q) && n51.f.a(this.f374699r, fx4Var.f374699r) && n51.f.a(java.lang.Integer.valueOf(this.f374700s), java.lang.Integer.valueOf(fx4Var.f374700s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374688d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f374689e);
            java.lang.String str2 = this.f374690f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374691g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374692h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f374693i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f374694m);
            fVar.e(8, this.f374695n);
            fVar.e(9, this.f374696o);
            java.lang.String str6 = this.f374697p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f374698q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f374699r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f374700s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f374688d;
            int j17 = (str9 != null ? 0 + b36.f.j(1, str9) : 0) + b36.f.e(2, this.f374689e);
            java.lang.String str10 = this.f374690f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f374691g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f374692h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f374693i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f374694m) + b36.f.e(8, this.f374695n) + b36.f.e(9, this.f374696o);
            java.lang.String str14 = this.f374697p;
            if (str14 != null) {
                e17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f374698q;
            if (str15 != null) {
                e17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f374699r;
            if (str16 != null) {
                e17 += b36.f.j(12, str16);
            }
            return e17 + b36.f.e(13, this.f374700s);
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
        r45.fx4 fx4Var = (r45.fx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fx4Var.f374688d = aVar2.k(intValue);
                return 0;
            case 2:
                fx4Var.f374689e = aVar2.g(intValue);
                return 0;
            case 3:
                fx4Var.f374690f = aVar2.k(intValue);
                return 0;
            case 4:
                fx4Var.f374691g = aVar2.k(intValue);
                return 0;
            case 5:
                fx4Var.f374692h = aVar2.k(intValue);
                return 0;
            case 6:
                fx4Var.f374693i = aVar2.k(intValue);
                return 0;
            case 7:
                fx4Var.f374694m = aVar2.g(intValue);
                return 0;
            case 8:
                fx4Var.f374695n = aVar2.g(intValue);
                return 0;
            case 9:
                fx4Var.f374696o = aVar2.g(intValue);
                return 0;
            case 10:
                fx4Var.f374697p = aVar2.k(intValue);
                return 0;
            case 11:
                fx4Var.f374698q = aVar2.k(intValue);
                return 0;
            case 12:
                fx4Var.f374699r = aVar2.k(intValue);
                return 0;
            case 13:
                fx4Var.f374700s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
