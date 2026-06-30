package r45;

/* loaded from: classes12.dex */
public class l57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379161e;

    /* renamed from: f, reason: collision with root package name */
    public int f379162f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379163g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379164h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379165i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379166m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379167n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379168o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l57)) {
            return false;
        }
        r45.l57 l57Var = (r45.l57) fVar;
        return n51.f.a(this.f379160d, l57Var.f379160d) && n51.f.a(this.f379161e, l57Var.f379161e) && n51.f.a(java.lang.Integer.valueOf(this.f379162f), java.lang.Integer.valueOf(l57Var.f379162f)) && n51.f.a(this.f379163g, l57Var.f379163g) && n51.f.a(this.f379164h, l57Var.f379164h) && n51.f.a(this.f379165i, l57Var.f379165i) && n51.f.a(this.f379166m, l57Var.f379166m) && n51.f.a(this.f379167n, l57Var.f379167n) && n51.f.a(this.f379168o, l57Var.f379168o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379160d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379161e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f379162f);
            java.lang.String str3 = this.f379163g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379164h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379165i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379166m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379167n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f379168o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f379160d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f379161e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            int e17 = j17 + b36.f.e(3, this.f379162f);
            java.lang.String str11 = this.f379163g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f379164h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f379165i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f379166m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f379167n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f379168o;
            return str16 != null ? e17 + b36.f.j(9, str16) : e17;
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
        r45.l57 l57Var = (r45.l57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l57Var.f379160d = aVar2.k(intValue);
                return 0;
            case 2:
                l57Var.f379161e = aVar2.k(intValue);
                return 0;
            case 3:
                l57Var.f379162f = aVar2.g(intValue);
                return 0;
            case 4:
                l57Var.f379163g = aVar2.k(intValue);
                return 0;
            case 5:
                l57Var.f379164h = aVar2.k(intValue);
                return 0;
            case 6:
                l57Var.f379165i = aVar2.k(intValue);
                return 0;
            case 7:
                l57Var.f379166m = aVar2.k(intValue);
                return 0;
            case 8:
                l57Var.f379167n = aVar2.k(intValue);
                return 0;
            case 9:
                l57Var.f379168o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
