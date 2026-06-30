package r45;

/* loaded from: classes4.dex */
public class y87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390864d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390865e;

    /* renamed from: f, reason: collision with root package name */
    public int f390866f;

    /* renamed from: g, reason: collision with root package name */
    public int f390867g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390868h;

    /* renamed from: i, reason: collision with root package name */
    public int f390869i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390870m;

    /* renamed from: n, reason: collision with root package name */
    public int f390871n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390872o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y87)) {
            return false;
        }
        r45.y87 y87Var = (r45.y87) fVar;
        return n51.f.a(this.f390864d, y87Var.f390864d) && n51.f.a(this.f390865e, y87Var.f390865e) && n51.f.a(java.lang.Integer.valueOf(this.f390866f), java.lang.Integer.valueOf(y87Var.f390866f)) && n51.f.a(java.lang.Integer.valueOf(this.f390867g), java.lang.Integer.valueOf(y87Var.f390867g)) && n51.f.a(this.f390868h, y87Var.f390868h) && n51.f.a(java.lang.Integer.valueOf(this.f390869i), java.lang.Integer.valueOf(y87Var.f390869i)) && n51.f.a(this.f390870m, y87Var.f390870m) && n51.f.a(java.lang.Integer.valueOf(this.f390871n), java.lang.Integer.valueOf(y87Var.f390871n)) && n51.f.a(this.f390872o, y87Var.f390872o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390864d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390865e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f390866f);
            fVar.e(4, this.f390867g);
            java.lang.String str3 = this.f390868h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f390869i);
            java.lang.String str4 = this.f390870m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f390871n);
            java.lang.String str5 = this.f390872o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f390864d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f390865e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f390866f) + b36.f.e(4, this.f390867g);
            java.lang.String str8 = this.f390868h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            int e18 = e17 + b36.f.e(6, this.f390869i);
            java.lang.String str9 = this.f390870m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            int e19 = e18 + b36.f.e(8, this.f390871n);
            java.lang.String str10 = this.f390872o;
            return str10 != null ? e19 + b36.f.j(9, str10) : e19;
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
        r45.y87 y87Var = (r45.y87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y87Var.f390864d = aVar2.k(intValue);
                return 0;
            case 2:
                y87Var.f390865e = aVar2.k(intValue);
                return 0;
            case 3:
                y87Var.f390866f = aVar2.g(intValue);
                return 0;
            case 4:
                y87Var.f390867g = aVar2.g(intValue);
                return 0;
            case 5:
                y87Var.f390868h = aVar2.k(intValue);
                return 0;
            case 6:
                y87Var.f390869i = aVar2.g(intValue);
                return 0;
            case 7:
                y87Var.f390870m = aVar2.k(intValue);
                return 0;
            case 8:
                y87Var.f390871n = aVar2.g(intValue);
                return 0;
            case 9:
                y87Var.f390872o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
