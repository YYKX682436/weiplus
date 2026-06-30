package r45;

/* loaded from: classes2.dex */
public class ca7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371404d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f371405e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371406f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371407g;

    /* renamed from: h, reason: collision with root package name */
    public int f371408h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371409i;

    /* renamed from: m, reason: collision with root package name */
    public long f371410m;

    /* renamed from: n, reason: collision with root package name */
    public int f371411n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371412o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371413p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371414q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371415r;

    /* renamed from: s, reason: collision with root package name */
    public long f371416s;

    /* renamed from: t, reason: collision with root package name */
    public int f371417t;

    /* renamed from: u, reason: collision with root package name */
    public int f371418u;

    /* renamed from: v, reason: collision with root package name */
    public int f371419v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f371420w;

    /* renamed from: x, reason: collision with root package name */
    public float f371421x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f371422y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca7)) {
            return false;
        }
        r45.ca7 ca7Var = (r45.ca7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371404d), java.lang.Integer.valueOf(ca7Var.f371404d)) && n51.f.a(java.lang.Integer.valueOf(this.f371405e), java.lang.Integer.valueOf(ca7Var.f371405e)) && n51.f.a(this.f371406f, ca7Var.f371406f) && n51.f.a(this.f371407g, ca7Var.f371407g) && n51.f.a(java.lang.Integer.valueOf(this.f371408h), java.lang.Integer.valueOf(ca7Var.f371408h)) && n51.f.a(this.f371409i, ca7Var.f371409i) && n51.f.a(java.lang.Long.valueOf(this.f371410m), java.lang.Long.valueOf(ca7Var.f371410m)) && n51.f.a(java.lang.Integer.valueOf(this.f371411n), java.lang.Integer.valueOf(ca7Var.f371411n)) && n51.f.a(this.f371412o, ca7Var.f371412o) && n51.f.a(this.f371413p, ca7Var.f371413p) && n51.f.a(this.f371414q, ca7Var.f371414q) && n51.f.a(this.f371415r, ca7Var.f371415r) && n51.f.a(java.lang.Long.valueOf(this.f371416s), java.lang.Long.valueOf(ca7Var.f371416s)) && n51.f.a(java.lang.Integer.valueOf(this.f371417t), java.lang.Integer.valueOf(ca7Var.f371417t)) && n51.f.a(java.lang.Integer.valueOf(this.f371418u), java.lang.Integer.valueOf(ca7Var.f371418u)) && n51.f.a(java.lang.Integer.valueOf(this.f371419v), java.lang.Integer.valueOf(ca7Var.f371419v)) && n51.f.a(this.f371420w, ca7Var.f371420w) && n51.f.a(java.lang.Float.valueOf(this.f371421x), java.lang.Float.valueOf(ca7Var.f371421x)) && n51.f.a(this.f371422y, ca7Var.f371422y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371404d);
            fVar.e(2, this.f371405e);
            java.lang.String str = this.f371406f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371407g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f371408h);
            java.lang.String str3 = this.f371409i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f371410m);
            fVar.e(8, this.f371411n);
            java.lang.String str4 = this.f371412o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f371413p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f371414q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f371415r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.h(13, this.f371416s);
            fVar.e(14, this.f371417t);
            fVar.e(15, this.f371418u);
            fVar.e(16, this.f371419v);
            java.lang.String str8 = this.f371420w;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            fVar.d(18, this.f371421x);
            java.lang.String str9 = this.f371422y;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371404d) + 0 + b36.f.e(2, this.f371405e);
            java.lang.String str10 = this.f371406f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f371407g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f371408h);
            java.lang.String str12 = this.f371409i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            int h17 = e18 + b36.f.h(7, this.f371410m) + b36.f.e(8, this.f371411n);
            java.lang.String str13 = this.f371412o;
            if (str13 != null) {
                h17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f371413p;
            if (str14 != null) {
                h17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f371414q;
            if (str15 != null) {
                h17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f371415r;
            if (str16 != null) {
                h17 += b36.f.j(12, str16);
            }
            int h18 = h17 + b36.f.h(13, this.f371416s) + b36.f.e(14, this.f371417t) + b36.f.e(15, this.f371418u) + b36.f.e(16, this.f371419v);
            java.lang.String str17 = this.f371420w;
            if (str17 != null) {
                h18 += b36.f.j(17, str17);
            }
            int d17 = h18 + b36.f.d(18, this.f371421x);
            java.lang.String str18 = this.f371422y;
            return str18 != null ? d17 + b36.f.j(19, str18) : d17;
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
        r45.ca7 ca7Var = (r45.ca7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ca7Var.f371404d = aVar2.g(intValue);
                return 0;
            case 2:
                ca7Var.f371405e = aVar2.g(intValue);
                return 0;
            case 3:
                ca7Var.f371406f = aVar2.k(intValue);
                return 0;
            case 4:
                ca7Var.f371407g = aVar2.k(intValue);
                return 0;
            case 5:
                ca7Var.f371408h = aVar2.g(intValue);
                return 0;
            case 6:
                ca7Var.f371409i = aVar2.k(intValue);
                return 0;
            case 7:
                ca7Var.f371410m = aVar2.i(intValue);
                return 0;
            case 8:
                ca7Var.f371411n = aVar2.g(intValue);
                return 0;
            case 9:
                ca7Var.f371412o = aVar2.k(intValue);
                return 0;
            case 10:
                ca7Var.f371413p = aVar2.k(intValue);
                return 0;
            case 11:
                ca7Var.f371414q = aVar2.k(intValue);
                return 0;
            case 12:
                ca7Var.f371415r = aVar2.k(intValue);
                return 0;
            case 13:
                ca7Var.f371416s = aVar2.i(intValue);
                return 0;
            case 14:
                ca7Var.f371417t = aVar2.g(intValue);
                return 0;
            case 15:
                ca7Var.f371418u = aVar2.g(intValue);
                return 0;
            case 16:
                ca7Var.f371419v = aVar2.g(intValue);
                return 0;
            case 17:
                ca7Var.f371420w = aVar2.k(intValue);
                return 0;
            case 18:
                ca7Var.f371421x = aVar2.f(intValue);
                return 0;
            case 19:
                ca7Var.f371422y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
