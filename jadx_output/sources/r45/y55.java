package r45;

/* loaded from: classes8.dex */
public class y55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390802d;

    /* renamed from: e, reason: collision with root package name */
    public int f390803e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390804f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390805g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390806h;

    /* renamed from: i, reason: collision with root package name */
    public int f390807i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390808m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390809n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y55)) {
            return false;
        }
        r45.y55 y55Var = (r45.y55) fVar;
        return n51.f.a(this.f390802d, y55Var.f390802d) && n51.f.a(java.lang.Integer.valueOf(this.f390803e), java.lang.Integer.valueOf(y55Var.f390803e)) && n51.f.a(this.f390804f, y55Var.f390804f) && n51.f.a(this.f390805g, y55Var.f390805g) && n51.f.a(this.f390806h, y55Var.f390806h) && n51.f.a(java.lang.Integer.valueOf(this.f390807i), java.lang.Integer.valueOf(y55Var.f390807i)) && n51.f.a(this.f390808m, y55Var.f390808m) && n51.f.a(this.f390809n, y55Var.f390809n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390802d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f390803e);
            java.lang.String str2 = this.f390804f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f390805g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f390806h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f390807i);
            java.lang.String str5 = this.f390808m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f390809n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f390802d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f390803e);
            java.lang.String str8 = this.f390804f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f390805g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f390806h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f390807i);
            java.lang.String str11 = this.f390808m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f390809n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.y55 y55Var = (r45.y55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y55Var.f390802d = aVar2.k(intValue);
                return 0;
            case 2:
                y55Var.f390803e = aVar2.g(intValue);
                return 0;
            case 3:
                y55Var.f390804f = aVar2.k(intValue);
                return 0;
            case 4:
                y55Var.f390805g = aVar2.k(intValue);
                return 0;
            case 5:
                y55Var.f390806h = aVar2.k(intValue);
                return 0;
            case 6:
                y55Var.f390807i = aVar2.g(intValue);
                return 0;
            case 7:
                y55Var.f390808m = aVar2.k(intValue);
                return 0;
            case 8:
                y55Var.f390809n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
