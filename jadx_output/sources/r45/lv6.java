package r45;

/* loaded from: classes4.dex */
public class lv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379860d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379861e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379862f;

    /* renamed from: g, reason: collision with root package name */
    public int f379863g;

    /* renamed from: h, reason: collision with root package name */
    public int f379864h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379865i;

    /* renamed from: m, reason: collision with root package name */
    public int f379866m;

    /* renamed from: n, reason: collision with root package name */
    public int f379867n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lv6)) {
            return false;
        }
        r45.lv6 lv6Var = (r45.lv6) fVar;
        return n51.f.a(this.f379860d, lv6Var.f379860d) && n51.f.a(this.f379861e, lv6Var.f379861e) && n51.f.a(this.f379862f, lv6Var.f379862f) && n51.f.a(java.lang.Integer.valueOf(this.f379863g), java.lang.Integer.valueOf(lv6Var.f379863g)) && n51.f.a(java.lang.Integer.valueOf(this.f379864h), java.lang.Integer.valueOf(lv6Var.f379864h)) && n51.f.a(this.f379865i, lv6Var.f379865i) && n51.f.a(java.lang.Integer.valueOf(this.f379866m), java.lang.Integer.valueOf(lv6Var.f379866m)) && n51.f.a(java.lang.Integer.valueOf(this.f379867n), java.lang.Integer.valueOf(lv6Var.f379867n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379860d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379861e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379862f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f379863g);
            fVar.e(5, this.f379864h);
            java.lang.String str4 = this.f379865i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f379866m);
            fVar.e(8, this.f379867n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f379860d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f379861e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f379862f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f379863g) + b36.f.e(5, this.f379864h);
            java.lang.String str8 = this.f379865i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f379866m) + b36.f.e(8, this.f379867n);
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
        r45.lv6 lv6Var = (r45.lv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lv6Var.f379860d = aVar2.k(intValue);
                return 0;
            case 2:
                lv6Var.f379861e = aVar2.k(intValue);
                return 0;
            case 3:
                lv6Var.f379862f = aVar2.k(intValue);
                return 0;
            case 4:
                lv6Var.f379863g = aVar2.g(intValue);
                return 0;
            case 5:
                lv6Var.f379864h = aVar2.g(intValue);
                return 0;
            case 6:
                lv6Var.f379865i = aVar2.k(intValue);
                return 0;
            case 7:
                lv6Var.f379866m = aVar2.g(intValue);
                return 0;
            case 8:
                lv6Var.f379867n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
