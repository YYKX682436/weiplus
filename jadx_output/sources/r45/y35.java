package r45;

/* loaded from: classes8.dex */
public class y35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390752f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390753g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390755i;

    /* renamed from: m, reason: collision with root package name */
    public int f390756m;

    /* renamed from: n, reason: collision with root package name */
    public int f390757n;

    /* renamed from: o, reason: collision with root package name */
    public int f390758o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y35)) {
            return false;
        }
        r45.y35 y35Var = (r45.y35) fVar;
        return n51.f.a(this.f390750d, y35Var.f390750d) && n51.f.a(this.f390751e, y35Var.f390751e) && n51.f.a(this.f390752f, y35Var.f390752f) && n51.f.a(this.f390753g, y35Var.f390753g) && n51.f.a(this.f390754h, y35Var.f390754h) && n51.f.a(this.f390755i, y35Var.f390755i) && n51.f.a(java.lang.Integer.valueOf(this.f390756m), java.lang.Integer.valueOf(y35Var.f390756m)) && n51.f.a(java.lang.Integer.valueOf(this.f390757n), java.lang.Integer.valueOf(y35Var.f390757n)) && n51.f.a(java.lang.Integer.valueOf(this.f390758o), java.lang.Integer.valueOf(y35Var.f390758o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390750d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390751e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390752f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390753g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f390754h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f390755i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f390756m);
            fVar.e(8, this.f390757n);
            fVar.e(9, this.f390758o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f390750d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f390751e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f390752f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f390753g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f390754h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f390755i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.e(7, this.f390756m) + b36.f.e(8, this.f390757n) + b36.f.e(9, this.f390758o);
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
        r45.y35 y35Var = (r45.y35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y35Var.f390750d = aVar2.k(intValue);
                return 0;
            case 2:
                y35Var.f390751e = aVar2.k(intValue);
                return 0;
            case 3:
                y35Var.f390752f = aVar2.k(intValue);
                return 0;
            case 4:
                y35Var.f390753g = aVar2.k(intValue);
                return 0;
            case 5:
                y35Var.f390754h = aVar2.k(intValue);
                return 0;
            case 6:
                y35Var.f390755i = aVar2.k(intValue);
                return 0;
            case 7:
                y35Var.f390756m = aVar2.g(intValue);
                return 0;
            case 8:
                y35Var.f390757n = aVar2.g(intValue);
                return 0;
            case 9:
                y35Var.f390758o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
