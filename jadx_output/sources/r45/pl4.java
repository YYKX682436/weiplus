package r45;

/* loaded from: classes10.dex */
public class pl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383158f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383159g;

    /* renamed from: h, reason: collision with root package name */
    public int f383160h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383161i;

    /* renamed from: m, reason: collision with root package name */
    public int f383162m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383163n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl4)) {
            return false;
        }
        r45.pl4 pl4Var = (r45.pl4) fVar;
        return n51.f.a(this.f383156d, pl4Var.f383156d) && n51.f.a(this.f383157e, pl4Var.f383157e) && n51.f.a(this.f383158f, pl4Var.f383158f) && n51.f.a(this.f383159g, pl4Var.f383159g) && n51.f.a(java.lang.Integer.valueOf(this.f383160h), java.lang.Integer.valueOf(pl4Var.f383160h)) && n51.f.a(this.f383161i, pl4Var.f383161i) && n51.f.a(java.lang.Integer.valueOf(this.f383162m), java.lang.Integer.valueOf(pl4Var.f383162m)) && n51.f.a(this.f383163n, pl4Var.f383163n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383156d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383157e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383158f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f383159g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f383160h);
            java.lang.String str5 = this.f383161i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f383162m);
            java.lang.String str6 = this.f383163n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383156d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f383157e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f383158f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f383159g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f383160h);
            java.lang.String str11 = this.f383161i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f383162m);
            java.lang.String str12 = this.f383163n;
            return str12 != null ? e18 + b36.f.j(8, str12) : e18;
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
        r45.pl4 pl4Var = (r45.pl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pl4Var.f383156d = aVar2.k(intValue);
                return 0;
            case 2:
                pl4Var.f383157e = aVar2.k(intValue);
                return 0;
            case 3:
                pl4Var.f383158f = aVar2.k(intValue);
                return 0;
            case 4:
                pl4Var.f383159g = aVar2.k(intValue);
                return 0;
            case 5:
                pl4Var.f383160h = aVar2.g(intValue);
                return 0;
            case 6:
                pl4Var.f383161i = aVar2.k(intValue);
                return 0;
            case 7:
                pl4Var.f383162m = aVar2.g(intValue);
                return 0;
            case 8:
                pl4Var.f383163n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
