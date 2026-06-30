package r45;

/* loaded from: classes4.dex */
public class zs4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392351f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392352g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392353h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f392354i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f392355m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f392356n;

    /* renamed from: o, reason: collision with root package name */
    public int f392357o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f392358p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f392359q;

    /* renamed from: r, reason: collision with root package name */
    public int f392360r;

    /* renamed from: s, reason: collision with root package name */
    public int f392361s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f392362t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392363u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zs4)) {
            return false;
        }
        r45.zs4 zs4Var = (r45.zs4) fVar;
        return n51.f.a(this.f392349d, zs4Var.f392349d) && n51.f.a(this.f392350e, zs4Var.f392350e) && n51.f.a(this.f392351f, zs4Var.f392351f) && n51.f.a(this.f392352g, zs4Var.f392352g) && n51.f.a(this.f392353h, zs4Var.f392353h) && n51.f.a(java.lang.Boolean.valueOf(this.f392354i), java.lang.Boolean.valueOf(zs4Var.f392354i)) && n51.f.a(java.lang.Boolean.valueOf(this.f392355m), java.lang.Boolean.valueOf(zs4Var.f392355m)) && n51.f.a(java.lang.Boolean.valueOf(this.f392356n), java.lang.Boolean.valueOf(zs4Var.f392356n)) && n51.f.a(java.lang.Integer.valueOf(this.f392357o), java.lang.Integer.valueOf(zs4Var.f392357o)) && n51.f.a(java.lang.Boolean.valueOf(this.f392358p), java.lang.Boolean.valueOf(zs4Var.f392358p)) && n51.f.a(java.lang.Boolean.valueOf(this.f392359q), java.lang.Boolean.valueOf(zs4Var.f392359q)) && n51.f.a(java.lang.Integer.valueOf(this.f392360r), java.lang.Integer.valueOf(zs4Var.f392360r)) && n51.f.a(java.lang.Integer.valueOf(this.f392361s), java.lang.Integer.valueOf(zs4Var.f392361s)) && n51.f.a(java.lang.Boolean.valueOf(this.f392362t), java.lang.Boolean.valueOf(zs4Var.f392362t)) && n51.f.a(this.f392363u, zs4Var.f392363u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392349d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f392350e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f392351f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f392352g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f392353h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.a(7, this.f392354i);
            fVar.a(8, this.f392355m);
            fVar.a(9, this.f392356n);
            fVar.e(10, this.f392357o);
            fVar.a(11, this.f392358p);
            fVar.a(12, this.f392359q);
            fVar.e(13, this.f392360r);
            fVar.e(14, this.f392361s);
            fVar.a(15, this.f392362t);
            java.lang.String str5 = this.f392363u;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f392349d;
            int j17 = str6 != null ? b36.f.j(2, str6) + 0 : 0;
            java.lang.String str7 = this.f392350e;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f392351f;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f392352g;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f392353h;
            if (gVar2 != null) {
                j17 += b36.f.b(6, gVar2);
            }
            int a17 = j17 + b36.f.a(7, this.f392354i) + b36.f.a(8, this.f392355m) + b36.f.a(9, this.f392356n) + b36.f.e(10, this.f392357o) + b36.f.a(11, this.f392358p) + b36.f.a(12, this.f392359q) + b36.f.e(13, this.f392360r) + b36.f.e(14, this.f392361s) + b36.f.a(15, this.f392362t);
            java.lang.String str10 = this.f392363u;
            return str10 != null ? a17 + b36.f.j(16, str10) : a17;
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
        r45.zs4 zs4Var = (r45.zs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                zs4Var.f392349d = aVar2.k(intValue);
                return 0;
            case 3:
                zs4Var.f392350e = aVar2.k(intValue);
                return 0;
            case 4:
                zs4Var.f392351f = aVar2.k(intValue);
                return 0;
            case 5:
                zs4Var.f392352g = aVar2.k(intValue);
                return 0;
            case 6:
                zs4Var.f392353h = aVar2.d(intValue);
                return 0;
            case 7:
                zs4Var.f392354i = aVar2.c(intValue);
                return 0;
            case 8:
                zs4Var.f392355m = aVar2.c(intValue);
                return 0;
            case 9:
                zs4Var.f392356n = aVar2.c(intValue);
                return 0;
            case 10:
                zs4Var.f392357o = aVar2.g(intValue);
                return 0;
            case 11:
                zs4Var.f392358p = aVar2.c(intValue);
                return 0;
            case 12:
                zs4Var.f392359q = aVar2.c(intValue);
                return 0;
            case 13:
                zs4Var.f392360r = aVar2.g(intValue);
                return 0;
            case 14:
                zs4Var.f392361s = aVar2.g(intValue);
                return 0;
            case 15:
                zs4Var.f392362t = aVar2.c(intValue);
                return 0;
            case 16:
                zs4Var.f392363u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
