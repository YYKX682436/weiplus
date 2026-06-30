package r45;

/* loaded from: classes7.dex */
public class pg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383018d;

    /* renamed from: e, reason: collision with root package name */
    public int f383019e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383020f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383021g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383022h;

    /* renamed from: i, reason: collision with root package name */
    public int f383023i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383024m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383025n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383026o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg4)) {
            return false;
        }
        r45.pg4 pg4Var = (r45.pg4) fVar;
        return n51.f.a(this.f383018d, pg4Var.f383018d) && n51.f.a(java.lang.Integer.valueOf(this.f383019e), java.lang.Integer.valueOf(pg4Var.f383019e)) && n51.f.a(this.f383020f, pg4Var.f383020f) && n51.f.a(this.f383021g, pg4Var.f383021g) && n51.f.a(this.f383022h, pg4Var.f383022h) && n51.f.a(java.lang.Integer.valueOf(this.f383023i), java.lang.Integer.valueOf(pg4Var.f383023i)) && n51.f.a(this.f383024m, pg4Var.f383024m) && n51.f.a(this.f383025n, pg4Var.f383025n) && n51.f.a(this.f383026o, pg4Var.f383026o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383018d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383019e);
            java.lang.String str2 = this.f383020f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383021g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383022h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f383023i);
            java.lang.String str5 = this.f383024m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f383025n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f383026o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f383018d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f383019e);
            java.lang.String str9 = this.f383020f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f383021g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f383022h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f383023i);
            java.lang.String str12 = this.f383024m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f383025n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f383026o;
            return str14 != null ? e17 + b36.f.j(9, str14) : e17;
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
        r45.pg4 pg4Var = (r45.pg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pg4Var.f383018d = aVar2.k(intValue);
                return 0;
            case 2:
                pg4Var.f383019e = aVar2.g(intValue);
                return 0;
            case 3:
                pg4Var.f383020f = aVar2.k(intValue);
                return 0;
            case 4:
                pg4Var.f383021g = aVar2.k(intValue);
                return 0;
            case 5:
                pg4Var.f383022h = aVar2.k(intValue);
                return 0;
            case 6:
                pg4Var.f383023i = aVar2.g(intValue);
                return 0;
            case 7:
                pg4Var.f383024m = aVar2.k(intValue);
                return 0;
            case 8:
                pg4Var.f383025n = aVar2.k(intValue);
                return 0;
            case 9:
                pg4Var.f383026o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
