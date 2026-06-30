package r45;

/* loaded from: classes2.dex */
public class ha6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375982d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f375983e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375984f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375985g;

    /* renamed from: h, reason: collision with root package name */
    public int f375986h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375987i;

    /* renamed from: m, reason: collision with root package name */
    public int f375988m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375989n;

    /* renamed from: o, reason: collision with root package name */
    public int f375990o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha6)) {
            return false;
        }
        r45.ha6 ha6Var = (r45.ha6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375982d), java.lang.Integer.valueOf(ha6Var.f375982d)) && n51.f.a(java.lang.Boolean.valueOf(this.f375983e), java.lang.Boolean.valueOf(ha6Var.f375983e)) && n51.f.a(this.f375984f, ha6Var.f375984f) && n51.f.a(this.f375985g, ha6Var.f375985g) && n51.f.a(java.lang.Integer.valueOf(this.f375986h), java.lang.Integer.valueOf(ha6Var.f375986h)) && n51.f.a(this.f375987i, ha6Var.f375987i) && n51.f.a(java.lang.Integer.valueOf(this.f375988m), java.lang.Integer.valueOf(ha6Var.f375988m)) && n51.f.a(this.f375989n, ha6Var.f375989n) && n51.f.a(java.lang.Integer.valueOf(this.f375990o), java.lang.Integer.valueOf(ha6Var.f375990o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375982d);
            fVar.a(2, this.f375983e);
            java.lang.String str = this.f375984f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f375985g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f375986h);
            java.lang.String str3 = this.f375987i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f375988m);
            java.lang.String str4 = this.f375989n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f375990o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375982d) + 0 + b36.f.a(2, this.f375983e);
            java.lang.String str5 = this.f375984f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f375985g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f375986h);
            java.lang.String str7 = this.f375987i;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            int e19 = e18 + b36.f.e(7, this.f375988m);
            java.lang.String str8 = this.f375989n;
            if (str8 != null) {
                e19 += b36.f.j(8, str8);
            }
            return e19 + b36.f.e(9, this.f375990o);
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
        r45.ha6 ha6Var = (r45.ha6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ha6Var.f375982d = aVar2.g(intValue);
                return 0;
            case 2:
                ha6Var.f375983e = aVar2.c(intValue);
                return 0;
            case 3:
                ha6Var.f375984f = aVar2.k(intValue);
                return 0;
            case 4:
                ha6Var.f375985g = aVar2.k(intValue);
                return 0;
            case 5:
                ha6Var.f375986h = aVar2.g(intValue);
                return 0;
            case 6:
                ha6Var.f375987i = aVar2.k(intValue);
                return 0;
            case 7:
                ha6Var.f375988m = aVar2.g(intValue);
                return 0;
            case 8:
                ha6Var.f375989n = aVar2.k(intValue);
                return 0;
            case 9:
                ha6Var.f375990o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
