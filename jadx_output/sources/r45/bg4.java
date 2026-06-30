package r45;

/* loaded from: classes2.dex */
public class bg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370742d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370745g;

    /* renamed from: h, reason: collision with root package name */
    public long f370746h;

    /* renamed from: i, reason: collision with root package name */
    public int f370747i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370748m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370749n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bg4)) {
            return false;
        }
        r45.bg4 bg4Var = (r45.bg4) fVar;
        return n51.f.a(this.f370742d, bg4Var.f370742d) && n51.f.a(this.f370743e, bg4Var.f370743e) && n51.f.a(this.f370744f, bg4Var.f370744f) && n51.f.a(this.f370745g, bg4Var.f370745g) && n51.f.a(java.lang.Long.valueOf(this.f370746h), java.lang.Long.valueOf(bg4Var.f370746h)) && n51.f.a(java.lang.Integer.valueOf(this.f370747i), java.lang.Integer.valueOf(bg4Var.f370747i)) && n51.f.a(this.f370748m, bg4Var.f370748m) && n51.f.a(java.lang.Boolean.valueOf(this.f370749n), java.lang.Boolean.valueOf(bg4Var.f370749n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370742d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370743e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370744f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370745g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f370746h);
            fVar.e(6, this.f370747i);
            java.lang.String str5 = this.f370748m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f370749n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f370742d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f370743e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f370744f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f370745g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int h17 = j17 + b36.f.h(5, this.f370746h) + b36.f.e(6, this.f370747i);
            java.lang.String str10 = this.f370748m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            return h17 + b36.f.a(8, this.f370749n);
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
        r45.bg4 bg4Var = (r45.bg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bg4Var.f370742d = aVar2.k(intValue);
                return 0;
            case 2:
                bg4Var.f370743e = aVar2.k(intValue);
                return 0;
            case 3:
                bg4Var.f370744f = aVar2.k(intValue);
                return 0;
            case 4:
                bg4Var.f370745g = aVar2.k(intValue);
                return 0;
            case 5:
                bg4Var.f370746h = aVar2.i(intValue);
                return 0;
            case 6:
                bg4Var.f370747i = aVar2.g(intValue);
                return 0;
            case 7:
                bg4Var.f370748m = aVar2.k(intValue);
                return 0;
            case 8:
                bg4Var.f370749n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
