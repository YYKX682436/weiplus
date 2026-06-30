package r45;

/* loaded from: classes10.dex */
public class ia4 extends com.tencent.mm.protobuf.f {
    public int A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376869d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376870e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376871f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376872g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f376873h;

    /* renamed from: i, reason: collision with root package name */
    public int f376874i;

    /* renamed from: m, reason: collision with root package name */
    public int f376875m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376876n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376877o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f376878p;

    /* renamed from: q, reason: collision with root package name */
    public int f376879q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376880r;

    /* renamed from: s, reason: collision with root package name */
    public int f376881s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f376882t;

    /* renamed from: u, reason: collision with root package name */
    public int f376883u;

    /* renamed from: v, reason: collision with root package name */
    public int f376884v;

    /* renamed from: w, reason: collision with root package name */
    public int f376885w;

    /* renamed from: x, reason: collision with root package name */
    public int f376886x;

    /* renamed from: y, reason: collision with root package name */
    public int f376887y;

    /* renamed from: z, reason: collision with root package name */
    public float f376888z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ia4)) {
            return false;
        }
        r45.ia4 ia4Var = (r45.ia4) fVar;
        return n51.f.a(this.f376869d, ia4Var.f376869d) && n51.f.a(this.f376870e, ia4Var.f376870e) && n51.f.a(this.f376871f, ia4Var.f376871f) && n51.f.a(this.f376872g, ia4Var.f376872g) && n51.f.a(java.lang.Boolean.valueOf(this.f376873h), java.lang.Boolean.valueOf(ia4Var.f376873h)) && n51.f.a(java.lang.Integer.valueOf(this.f376874i), java.lang.Integer.valueOf(ia4Var.f376874i)) && n51.f.a(java.lang.Integer.valueOf(this.f376875m), java.lang.Integer.valueOf(ia4Var.f376875m)) && n51.f.a(this.f376876n, ia4Var.f376876n) && n51.f.a(java.lang.Boolean.valueOf(this.f376877o), java.lang.Boolean.valueOf(ia4Var.f376877o)) && n51.f.a(java.lang.Boolean.valueOf(this.f376878p), java.lang.Boolean.valueOf(ia4Var.f376878p)) && n51.f.a(java.lang.Integer.valueOf(this.f376879q), java.lang.Integer.valueOf(ia4Var.f376879q)) && n51.f.a(this.f376880r, ia4Var.f376880r) && n51.f.a(java.lang.Integer.valueOf(this.f376881s), java.lang.Integer.valueOf(ia4Var.f376881s)) && n51.f.a(java.lang.Boolean.valueOf(this.f376882t), java.lang.Boolean.valueOf(ia4Var.f376882t)) && n51.f.a(java.lang.Integer.valueOf(this.f376883u), java.lang.Integer.valueOf(ia4Var.f376883u)) && n51.f.a(java.lang.Integer.valueOf(this.f376884v), java.lang.Integer.valueOf(ia4Var.f376884v)) && n51.f.a(java.lang.Integer.valueOf(this.f376885w), java.lang.Integer.valueOf(ia4Var.f376885w)) && n51.f.a(java.lang.Integer.valueOf(this.f376886x), java.lang.Integer.valueOf(ia4Var.f376886x)) && n51.f.a(java.lang.Integer.valueOf(this.f376887y), java.lang.Integer.valueOf(ia4Var.f376887y)) && n51.f.a(java.lang.Float.valueOf(this.f376888z), java.lang.Float.valueOf(ia4Var.f376888z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ia4Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(ia4Var.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376869d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376870e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376871f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f376872g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.a(5, this.f376873h);
            fVar.e(6, this.f376874i);
            fVar.e(7, this.f376875m);
            java.lang.String str5 = this.f376876n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.a(9, this.f376877o);
            fVar.a(10, this.f376878p);
            fVar.e(11, this.f376879q);
            java.lang.String str6 = this.f376880r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            fVar.e(13, this.f376881s);
            fVar.a(14, this.f376882t);
            fVar.e(15, this.f376883u);
            fVar.e(16, this.f376884v);
            fVar.e(17, this.f376885w);
            fVar.e(18, this.f376886x);
            fVar.e(19, this.f376887y);
            fVar.d(20, this.f376888z);
            fVar.e(21, this.A);
            fVar.a(22, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f376869d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f376870e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f376871f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f376872g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int a17 = j17 + b36.f.a(5, this.f376873h) + b36.f.e(6, this.f376874i) + b36.f.e(7, this.f376875m);
            java.lang.String str11 = this.f376876n;
            if (str11 != null) {
                a17 += b36.f.j(8, str11);
            }
            int a18 = a17 + b36.f.a(9, this.f376877o) + b36.f.a(10, this.f376878p) + b36.f.e(11, this.f376879q);
            java.lang.String str12 = this.f376880r;
            if (str12 != null) {
                a18 += b36.f.j(12, str12);
            }
            return a18 + b36.f.e(13, this.f376881s) + b36.f.a(14, this.f376882t) + b36.f.e(15, this.f376883u) + b36.f.e(16, this.f376884v) + b36.f.e(17, this.f376885w) + b36.f.e(18, this.f376886x) + b36.f.e(19, this.f376887y) + b36.f.d(20, this.f376888z) + b36.f.e(21, this.A) + b36.f.a(22, this.B);
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
        r45.ia4 ia4Var = (r45.ia4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ia4Var.f376869d = aVar2.k(intValue);
                return 0;
            case 2:
                ia4Var.f376870e = aVar2.k(intValue);
                return 0;
            case 3:
                ia4Var.f376871f = aVar2.k(intValue);
                return 0;
            case 4:
                ia4Var.f376872g = aVar2.k(intValue);
                return 0;
            case 5:
                ia4Var.f376873h = aVar2.c(intValue);
                return 0;
            case 6:
                ia4Var.f376874i = aVar2.g(intValue);
                return 0;
            case 7:
                ia4Var.f376875m = aVar2.g(intValue);
                return 0;
            case 8:
                ia4Var.f376876n = aVar2.k(intValue);
                return 0;
            case 9:
                ia4Var.f376877o = aVar2.c(intValue);
                return 0;
            case 10:
                ia4Var.f376878p = aVar2.c(intValue);
                return 0;
            case 11:
                ia4Var.f376879q = aVar2.g(intValue);
                return 0;
            case 12:
                ia4Var.f376880r = aVar2.k(intValue);
                return 0;
            case 13:
                ia4Var.f376881s = aVar2.g(intValue);
                return 0;
            case 14:
                ia4Var.f376882t = aVar2.c(intValue);
                return 0;
            case 15:
                ia4Var.f376883u = aVar2.g(intValue);
                return 0;
            case 16:
                ia4Var.f376884v = aVar2.g(intValue);
                return 0;
            case 17:
                ia4Var.f376885w = aVar2.g(intValue);
                return 0;
            case 18:
                ia4Var.f376886x = aVar2.g(intValue);
                return 0;
            case 19:
                ia4Var.f376887y = aVar2.g(intValue);
                return 0;
            case 20:
                ia4Var.f376888z = aVar2.f(intValue);
                return 0;
            case 21:
                ia4Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                ia4Var.B = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
