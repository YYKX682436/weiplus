package r45;

/* loaded from: classes8.dex */
public class z55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391729e;

    /* renamed from: f, reason: collision with root package name */
    public double f391730f;

    /* renamed from: g, reason: collision with root package name */
    public double f391731g;

    /* renamed from: h, reason: collision with root package name */
    public long f391732h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391733i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391734m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391735n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391736o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z55)) {
            return false;
        }
        r45.z55 z55Var = (r45.z55) fVar;
        return n51.f.a(this.f391728d, z55Var.f391728d) && n51.f.a(this.f391729e, z55Var.f391729e) && n51.f.a(java.lang.Double.valueOf(this.f391730f), java.lang.Double.valueOf(z55Var.f391730f)) && n51.f.a(java.lang.Double.valueOf(this.f391731g), java.lang.Double.valueOf(z55Var.f391731g)) && n51.f.a(java.lang.Long.valueOf(this.f391732h), java.lang.Long.valueOf(z55Var.f391732h)) && n51.f.a(this.f391733i, z55Var.f391733i) && n51.f.a(this.f391734m, z55Var.f391734m) && n51.f.a(this.f391735n, z55Var.f391735n) && n51.f.a(this.f391736o, z55Var.f391736o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391728d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391729e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f391730f);
            fVar.c(4, this.f391731g);
            fVar.h(5, this.f391732h);
            java.lang.String str3 = this.f391733i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f391734m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f391735n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f391736o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f391728d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f391729e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int c17 = j17 + b36.f.c(3, this.f391730f) + b36.f.c(4, this.f391731g) + b36.f.h(5, this.f391732h);
            java.lang.String str9 = this.f391733i;
            if (str9 != null) {
                c17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f391734m;
            if (str10 != null) {
                c17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f391735n;
            if (str11 != null) {
                c17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f391736o;
            return str12 != null ? c17 + b36.f.j(9, str12) : c17;
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
        r45.z55 z55Var = (r45.z55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z55Var.f391728d = aVar2.k(intValue);
                return 0;
            case 2:
                z55Var.f391729e = aVar2.k(intValue);
                return 0;
            case 3:
                z55Var.f391730f = aVar2.e(intValue);
                return 0;
            case 4:
                z55Var.f391731g = aVar2.e(intValue);
                return 0;
            case 5:
                z55Var.f391732h = aVar2.i(intValue);
                return 0;
            case 6:
                z55Var.f391733i = aVar2.k(intValue);
                return 0;
            case 7:
                z55Var.f391734m = aVar2.k(intValue);
                return 0;
            case 8:
                z55Var.f391735n = aVar2.k(intValue);
                return 0;
            case 9:
                z55Var.f391736o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
