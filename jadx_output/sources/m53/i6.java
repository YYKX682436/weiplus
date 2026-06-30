package m53;

/* loaded from: classes8.dex */
public class i6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323799e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323800f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323801g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323802h;

    /* renamed from: i, reason: collision with root package name */
    public int f323803i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323804m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f323805n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i6)) {
            return false;
        }
        m53.i6 i6Var = (m53.i6) fVar;
        return n51.f.a(this.f323798d, i6Var.f323798d) && n51.f.a(this.f323799e, i6Var.f323799e) && n51.f.a(this.f323800f, i6Var.f323800f) && n51.f.a(this.f323801g, i6Var.f323801g) && n51.f.a(this.f323802h, i6Var.f323802h) && n51.f.a(java.lang.Integer.valueOf(this.f323803i), java.lang.Integer.valueOf(i6Var.f323803i)) && n51.f.a(this.f323804m, i6Var.f323804m) && n51.f.a(this.f323805n, i6Var.f323805n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323798d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323799e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323800f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323801g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323802h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f323803i);
            java.lang.String str6 = this.f323804m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f323805n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f323798d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f323799e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f323800f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f323801g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f323802h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            int e17 = j17 + b36.f.e(6, this.f323803i);
            java.lang.String str13 = this.f323804m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f323805n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        m53.i6 i6Var = (m53.i6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i6Var.f323798d = aVar2.k(intValue);
                return 0;
            case 2:
                i6Var.f323799e = aVar2.k(intValue);
                return 0;
            case 3:
                i6Var.f323800f = aVar2.k(intValue);
                return 0;
            case 4:
                i6Var.f323801g = aVar2.k(intValue);
                return 0;
            case 5:
                i6Var.f323802h = aVar2.k(intValue);
                return 0;
            case 6:
                i6Var.f323803i = aVar2.g(intValue);
                return 0;
            case 7:
                i6Var.f323804m = aVar2.k(intValue);
                return 0;
            case 8:
                i6Var.f323805n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
