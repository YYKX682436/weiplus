package r45;

/* loaded from: classes4.dex */
public class tf6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386379d;

    /* renamed from: e, reason: collision with root package name */
    public int f386380e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386381f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386382g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386383h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386384i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386385m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386386n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tf6)) {
            return false;
        }
        r45.tf6 tf6Var = (r45.tf6) fVar;
        return n51.f.a(this.f386379d, tf6Var.f386379d) && n51.f.a(java.lang.Integer.valueOf(this.f386380e), java.lang.Integer.valueOf(tf6Var.f386380e)) && n51.f.a(this.f386381f, tf6Var.f386381f) && n51.f.a(this.f386382g, tf6Var.f386382g) && n51.f.a(this.f386383h, tf6Var.f386383h) && n51.f.a(this.f386384i, tf6Var.f386384i) && n51.f.a(this.f386385m, tf6Var.f386385m) && n51.f.a(this.f386386n, tf6Var.f386386n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386379d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f386380e);
            java.lang.String str2 = this.f386381f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386382g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386383h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f386384i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f386385m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f386386n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f386379d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f386380e);
            java.lang.String str9 = this.f386381f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f386382g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f386383h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f386384i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f386385m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f386386n;
            return str14 != null ? j17 + b36.f.j(8, str14) : j17;
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
        r45.tf6 tf6Var = (r45.tf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tf6Var.f386379d = aVar2.k(intValue);
                return 0;
            case 2:
                tf6Var.f386380e = aVar2.g(intValue);
                return 0;
            case 3:
                tf6Var.f386381f = aVar2.k(intValue);
                return 0;
            case 4:
                tf6Var.f386382g = aVar2.k(intValue);
                return 0;
            case 5:
                tf6Var.f386383h = aVar2.k(intValue);
                return 0;
            case 6:
                tf6Var.f386384i = aVar2.k(intValue);
                return 0;
            case 7:
                tf6Var.f386385m = aVar2.k(intValue);
                return 0;
            case 8:
                tf6Var.f386386n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
