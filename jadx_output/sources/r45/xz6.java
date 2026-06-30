package r45;

/* loaded from: classes9.dex */
public class xz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390634e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390635f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390636g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390637h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390638i;

    /* renamed from: m, reason: collision with root package name */
    public int f390639m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz6)) {
            return false;
        }
        r45.xz6 xz6Var = (r45.xz6) fVar;
        return n51.f.a(this.f390633d, xz6Var.f390633d) && n51.f.a(this.f390634e, xz6Var.f390634e) && n51.f.a(this.f390635f, xz6Var.f390635f) && n51.f.a(this.f390636g, xz6Var.f390636g) && n51.f.a(this.f390637h, xz6Var.f390637h) && n51.f.a(this.f390638i, xz6Var.f390638i) && n51.f.a(java.lang.Integer.valueOf(this.f390639m), java.lang.Integer.valueOf(xz6Var.f390639m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390633d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390634e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390635f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390636g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f390637h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f390638i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f390639m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f390633d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f390634e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f390635f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f390636g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f390637h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f390638i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.e(7, this.f390639m);
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
        r45.xz6 xz6Var = (r45.xz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xz6Var.f390633d = aVar2.k(intValue);
                return 0;
            case 2:
                xz6Var.f390634e = aVar2.k(intValue);
                return 0;
            case 3:
                xz6Var.f390635f = aVar2.k(intValue);
                return 0;
            case 4:
                xz6Var.f390636g = aVar2.k(intValue);
                return 0;
            case 5:
                xz6Var.f390637h = aVar2.k(intValue);
                return 0;
            case 6:
                xz6Var.f390638i = aVar2.k(intValue);
                return 0;
            case 7:
                xz6Var.f390639m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
