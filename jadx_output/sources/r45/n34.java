package r45;

/* loaded from: classes9.dex */
public class n34 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381048d;

    /* renamed from: e, reason: collision with root package name */
    public int f381049e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381050f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381051g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381052h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381053i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n34)) {
            return false;
        }
        r45.n34 n34Var = (r45.n34) fVar;
        return n51.f.a(this.f381048d, n34Var.f381048d) && n51.f.a(java.lang.Integer.valueOf(this.f381049e), java.lang.Integer.valueOf(n34Var.f381049e)) && n51.f.a(this.f381050f, n34Var.f381050f) && n51.f.a(this.f381051g, n34Var.f381051g) && n51.f.a(this.f381052h, n34Var.f381052h) && n51.f.a(this.f381053i, n34Var.f381053i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381048d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f381049e);
            java.lang.String str2 = this.f381050f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381051g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f381052h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f381053i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f381048d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f381049e);
            java.lang.String str7 = this.f381050f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f381051g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f381052h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f381053i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.n34 n34Var = (r45.n34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n34Var.f381048d = aVar2.k(intValue);
                return 0;
            case 2:
                n34Var.f381049e = aVar2.g(intValue);
                return 0;
            case 3:
                n34Var.f381050f = aVar2.k(intValue);
                return 0;
            case 4:
                n34Var.f381051g = aVar2.k(intValue);
                return 0;
            case 5:
                n34Var.f381052h = aVar2.k(intValue);
                return 0;
            case 6:
                n34Var.f381053i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
