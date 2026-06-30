package r45;

/* loaded from: classes4.dex */
public class s35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385466d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385467e;

    /* renamed from: f, reason: collision with root package name */
    public int f385468f;

    /* renamed from: g, reason: collision with root package name */
    public int f385469g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385470h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385471i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f385472m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f385473n;

    /* renamed from: o, reason: collision with root package name */
    public int f385474o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s35)) {
            return false;
        }
        r45.s35 s35Var = (r45.s35) fVar;
        return n51.f.a(this.f385466d, s35Var.f385466d) && n51.f.a(this.f385467e, s35Var.f385467e) && n51.f.a(java.lang.Integer.valueOf(this.f385468f), java.lang.Integer.valueOf(s35Var.f385468f)) && n51.f.a(java.lang.Integer.valueOf(this.f385469g), java.lang.Integer.valueOf(s35Var.f385469g)) && n51.f.a(this.f385470h, s35Var.f385470h) && n51.f.a(this.f385471i, s35Var.f385471i) && n51.f.a(java.lang.Boolean.valueOf(this.f385472m), java.lang.Boolean.valueOf(s35Var.f385472m)) && n51.f.a(java.lang.Boolean.valueOf(this.f385473n), java.lang.Boolean.valueOf(s35Var.f385473n)) && n51.f.a(java.lang.Integer.valueOf(this.f385474o), java.lang.Integer.valueOf(s35Var.f385474o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385466d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385467e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f385468f);
            fVar.e(4, this.f385469g);
            java.lang.String str3 = this.f385470h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f385471i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(20, this.f385472m);
            fVar.a(21, this.f385473n);
            fVar.e(22, this.f385474o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385466d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385467e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f385468f) + b36.f.e(4, this.f385469g);
            java.lang.String str7 = this.f385470h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f385471i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.a(20, this.f385472m) + b36.f.a(21, this.f385473n) + b36.f.e(22, this.f385474o);
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
        r45.s35 s35Var = (r45.s35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s35Var.f385466d = aVar2.k(intValue);
                return 0;
            case 2:
                s35Var.f385467e = aVar2.k(intValue);
                return 0;
            case 3:
                s35Var.f385468f = aVar2.g(intValue);
                return 0;
            case 4:
                s35Var.f385469g = aVar2.g(intValue);
                return 0;
            case 5:
                s35Var.f385470h = aVar2.k(intValue);
                return 0;
            case 6:
                s35Var.f385471i = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        s35Var.f385472m = aVar2.c(intValue);
                        return 0;
                    case 21:
                        s35Var.f385473n = aVar2.c(intValue);
                        return 0;
                    case 22:
                        s35Var.f385474o = aVar2.g(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
