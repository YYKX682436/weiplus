package r45;

/* loaded from: classes7.dex */
public class wm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389292d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f389293e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389294f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389295g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389296h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389297i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389298m;

    /* renamed from: n, reason: collision with root package name */
    public long f389299n;

    /* renamed from: o, reason: collision with root package name */
    public int f389300o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389301p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm6)) {
            return false;
        }
        r45.wm6 wm6Var = (r45.wm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389292d), java.lang.Integer.valueOf(wm6Var.f389292d)) && n51.f.a(java.lang.Integer.valueOf(this.f389293e), java.lang.Integer.valueOf(wm6Var.f389293e)) && n51.f.a(this.f389294f, wm6Var.f389294f) && n51.f.a(this.f389295g, wm6Var.f389295g) && n51.f.a(this.f389296h, wm6Var.f389296h) && n51.f.a(this.f389297i, wm6Var.f389297i) && n51.f.a(this.f389298m, wm6Var.f389298m) && n51.f.a(java.lang.Long.valueOf(this.f389299n), java.lang.Long.valueOf(wm6Var.f389299n)) && n51.f.a(java.lang.Integer.valueOf(this.f389300o), java.lang.Integer.valueOf(wm6Var.f389300o)) && n51.f.a(this.f389301p, wm6Var.f389301p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389292d);
            fVar.e(2, this.f389293e);
            java.lang.String str = this.f389294f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389295g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389296h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389297i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389298m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f389299n);
            fVar.e(9, this.f389300o);
            java.lang.String str6 = this.f389301p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389292d) + 0 + b36.f.e(2, this.f389293e);
            java.lang.String str7 = this.f389294f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f389295g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f389296h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f389297i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f389298m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int h17 = e17 + b36.f.h(8, this.f389299n) + b36.f.e(9, this.f389300o);
            java.lang.String str12 = this.f389301p;
            return str12 != null ? h17 + b36.f.j(10, str12) : h17;
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
        r45.wm6 wm6Var = (r45.wm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wm6Var.f389292d = aVar2.g(intValue);
                return 0;
            case 2:
                wm6Var.f389293e = aVar2.g(intValue);
                return 0;
            case 3:
                wm6Var.f389294f = aVar2.k(intValue);
                return 0;
            case 4:
                wm6Var.f389295g = aVar2.k(intValue);
                return 0;
            case 5:
                wm6Var.f389296h = aVar2.k(intValue);
                return 0;
            case 6:
                wm6Var.f389297i = aVar2.k(intValue);
                return 0;
            case 7:
                wm6Var.f389298m = aVar2.k(intValue);
                return 0;
            case 8:
                wm6Var.f389299n = aVar2.i(intValue);
                return 0;
            case 9:
                wm6Var.f389300o = aVar2.g(intValue);
                return 0;
            case 10:
                wm6Var.f389301p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
