package r45;

/* loaded from: classes9.dex */
public class n75 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381137g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381138h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f381139i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381140m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n75)) {
            return false;
        }
        r45.n75 n75Var = (r45.n75) fVar;
        return n51.f.a(this.f381134d, n75Var.f381134d) && n51.f.a(this.f381135e, n75Var.f381135e) && n51.f.a(this.f381136f, n75Var.f381136f) && n51.f.a(this.f381137g, n75Var.f381137g) && n51.f.a(this.f381138h, n75Var.f381138h) && n51.f.a(java.lang.Boolean.valueOf(this.f381139i), java.lang.Boolean.valueOf(n75Var.f381139i)) && n51.f.a(this.f381140m, n75Var.f381140m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381134d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381135e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381136f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381137g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381138h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.a(6, this.f381139i);
            java.lang.String str6 = this.f381140m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f381134d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f381135e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f381136f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f381137g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f381138h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int a17 = j17 + b36.f.a(6, this.f381139i);
            java.lang.String str12 = this.f381140m;
            return str12 != null ? a17 + b36.f.j(7, str12) : a17;
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
        r45.n75 n75Var = (r45.n75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n75Var.f381134d = aVar2.k(intValue);
                return 0;
            case 2:
                n75Var.f381135e = aVar2.k(intValue);
                return 0;
            case 3:
                n75Var.f381136f = aVar2.k(intValue);
                return 0;
            case 4:
                n75Var.f381137g = aVar2.k(intValue);
                return 0;
            case 5:
                n75Var.f381138h = aVar2.k(intValue);
                return 0;
            case 6:
                n75Var.f381139i = aVar2.c(intValue);
                return 0;
            case 7:
                n75Var.f381140m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
