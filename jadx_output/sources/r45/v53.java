package r45;

/* loaded from: classes14.dex */
public class v53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f387893d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f387894e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f387895f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387896g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387897h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387898i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387899m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387900n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387901o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v53)) {
            return false;
        }
        r45.v53 v53Var = (r45.v53) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f387893d), java.lang.Boolean.valueOf(v53Var.f387893d)) && n51.f.a(java.lang.Boolean.valueOf(this.f387894e), java.lang.Boolean.valueOf(v53Var.f387894e)) && n51.f.a(java.lang.Boolean.valueOf(this.f387895f), java.lang.Boolean.valueOf(v53Var.f387895f)) && n51.f.a(this.f387896g, v53Var.f387896g) && n51.f.a(this.f387897h, v53Var.f387897h) && n51.f.a(this.f387898i, v53Var.f387898i) && n51.f.a(this.f387899m, v53Var.f387899m) && n51.f.a(this.f387900n, v53Var.f387900n) && n51.f.a(this.f387901o, v53Var.f387901o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f387893d);
            fVar.a(2, this.f387894e);
            fVar.a(3, this.f387895f);
            java.lang.String str = this.f387896g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f387897h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f387898i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f387899m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f387900n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f387901o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f387893d) + 0 + b36.f.a(2, this.f387894e) + b36.f.a(3, this.f387895f);
            java.lang.String str7 = this.f387896g;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f387897h;
            if (str8 != null) {
                a17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f387898i;
            if (str9 != null) {
                a17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f387899m;
            if (str10 != null) {
                a17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f387900n;
            if (str11 != null) {
                a17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f387901o;
            return str12 != null ? a17 + b36.f.j(9, str12) : a17;
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
        r45.v53 v53Var = (r45.v53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v53Var.f387893d = aVar2.c(intValue);
                return 0;
            case 2:
                v53Var.f387894e = aVar2.c(intValue);
                return 0;
            case 3:
                v53Var.f387895f = aVar2.c(intValue);
                return 0;
            case 4:
                v53Var.f387896g = aVar2.k(intValue);
                return 0;
            case 5:
                v53Var.f387897h = aVar2.k(intValue);
                return 0;
            case 6:
                v53Var.f387898i = aVar2.k(intValue);
                return 0;
            case 7:
                v53Var.f387899m = aVar2.k(intValue);
                return 0;
            case 8:
                v53Var.f387900n = aVar2.k(intValue);
                return 0;
            case 9:
                v53Var.f387901o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
