package r45;

/* loaded from: classes8.dex */
public class za7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391875d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391876e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391877f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391878g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391879h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391880i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391881m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.za7)) {
            return false;
        }
        r45.za7 za7Var = (r45.za7) fVar;
        return n51.f.a(this.f391875d, za7Var.f391875d) && n51.f.a(this.f391876e, za7Var.f391876e) && n51.f.a(this.f391877f, za7Var.f391877f) && n51.f.a(this.f391878g, za7Var.f391878g) && n51.f.a(this.f391879h, za7Var.f391879h) && n51.f.a(this.f391880i, za7Var.f391880i) && n51.f.a(this.f391881m, za7Var.f391881m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391875d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391876e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391877f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391878g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f391879h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f391880i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f391881m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f391875d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f391876e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f391877f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f391878g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f391879h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f391880i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f391881m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.za7 za7Var = (r45.za7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                za7Var.f391875d = aVar2.k(intValue);
                return 0;
            case 2:
                za7Var.f391876e = aVar2.k(intValue);
                return 0;
            case 3:
                za7Var.f391877f = aVar2.k(intValue);
                return 0;
            case 4:
                za7Var.f391878g = aVar2.k(intValue);
                return 0;
            case 5:
                za7Var.f391879h = aVar2.k(intValue);
                return 0;
            case 6:
                za7Var.f391880i = aVar2.k(intValue);
                return 0;
            case 7:
                za7Var.f391881m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
