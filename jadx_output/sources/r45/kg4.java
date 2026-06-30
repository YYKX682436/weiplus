package r45;

/* loaded from: classes2.dex */
public class kg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378679d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378680e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378681f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378682g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378683h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378684i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378686n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kg4)) {
            return false;
        }
        r45.kg4 kg4Var = (r45.kg4) fVar;
        return n51.f.a(this.f378679d, kg4Var.f378679d) && n51.f.a(this.f378680e, kg4Var.f378680e) && n51.f.a(this.f378681f, kg4Var.f378681f) && n51.f.a(this.f378682g, kg4Var.f378682g) && n51.f.a(this.f378683h, kg4Var.f378683h) && n51.f.a(this.f378684i, kg4Var.f378684i) && n51.f.a(this.f378685m, kg4Var.f378685m) && n51.f.a(java.lang.Boolean.valueOf(this.f378686n), java.lang.Boolean.valueOf(kg4Var.f378686n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378679d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378680e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378681f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378682g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f378683h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f378684i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f378685m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f378686n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f378679d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f378680e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f378681f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f378682g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f378683h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f378684i;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f378685m;
            if (str14 != null) {
                j17 += b36.f.j(8, str14);
            }
            return j17 + b36.f.a(9, this.f378686n);
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
        r45.kg4 kg4Var = (r45.kg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kg4Var.f378679d = aVar2.k(intValue);
                return 0;
            case 2:
                kg4Var.f378680e = aVar2.k(intValue);
                return 0;
            case 3:
                kg4Var.f378681f = aVar2.k(intValue);
                return 0;
            case 4:
                kg4Var.f378682g = aVar2.k(intValue);
                return 0;
            case 5:
                kg4Var.f378683h = aVar2.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                kg4Var.f378684i = aVar2.k(intValue);
                return 0;
            case 8:
                kg4Var.f378685m = aVar2.k(intValue);
                return 0;
            case 9:
                kg4Var.f378686n = aVar2.c(intValue);
                return 0;
        }
    }
}
