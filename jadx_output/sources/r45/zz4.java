package r45;

/* loaded from: classes11.dex */
public class zz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392485e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392486f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392487g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392488h;

    /* renamed from: i, reason: collision with root package name */
    public int f392489i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392490m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392491n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392492o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zz4)) {
            return false;
        }
        r45.zz4 zz4Var = (r45.zz4) fVar;
        return n51.f.a(this.f392484d, zz4Var.f392484d) && n51.f.a(this.f392485e, zz4Var.f392485e) && n51.f.a(this.f392486f, zz4Var.f392486f) && n51.f.a(this.f392487g, zz4Var.f392487g) && n51.f.a(this.f392488h, zz4Var.f392488h) && n51.f.a(java.lang.Integer.valueOf(this.f392489i), java.lang.Integer.valueOf(zz4Var.f392489i)) && n51.f.a(this.f392490m, zz4Var.f392490m) && n51.f.a(this.f392491n, zz4Var.f392491n) && n51.f.a(this.f392492o, zz4Var.f392492o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392484d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392485e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f392486f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f392487g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f392488h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f392489i);
            java.lang.String str6 = this.f392490m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f392491n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f392492o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f392484d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f392485e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f392486f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f392487g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f392488h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            int e17 = j17 + b36.f.e(6, this.f392489i);
            java.lang.String str14 = this.f392490m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f392491n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f392492o;
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
        r45.zz4 zz4Var = (r45.zz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zz4Var.f392484d = aVar2.k(intValue);
                return 0;
            case 2:
                zz4Var.f392485e = aVar2.k(intValue);
                return 0;
            case 3:
                zz4Var.f392486f = aVar2.k(intValue);
                return 0;
            case 4:
                zz4Var.f392487g = aVar2.k(intValue);
                return 0;
            case 5:
                zz4Var.f392488h = aVar2.k(intValue);
                return 0;
            case 6:
                zz4Var.f392489i = aVar2.g(intValue);
                return 0;
            case 7:
                zz4Var.f392490m = aVar2.k(intValue);
                return 0;
            case 8:
                zz4Var.f392491n = aVar2.k(intValue);
                return 0;
            case 9:
                zz4Var.f392492o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
