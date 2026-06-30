package r45;

/* loaded from: classes7.dex */
public class ze5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f391953d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391954e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391955f;

    /* renamed from: g, reason: collision with root package name */
    public int f391956g;

    /* renamed from: h, reason: collision with root package name */
    public int f391957h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391958i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f391959m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ze5)) {
            return false;
        }
        r45.ze5 ze5Var = (r45.ze5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f391953d), java.lang.Boolean.valueOf(ze5Var.f391953d)) && n51.f.a(this.f391954e, ze5Var.f391954e) && n51.f.a(this.f391955f, ze5Var.f391955f) && n51.f.a(java.lang.Integer.valueOf(this.f391956g), java.lang.Integer.valueOf(ze5Var.f391956g)) && n51.f.a(java.lang.Integer.valueOf(this.f391957h), java.lang.Integer.valueOf(ze5Var.f391957h)) && n51.f.a(this.f391958i, ze5Var.f391958i) && n51.f.a(java.lang.Boolean.valueOf(this.f391959m), java.lang.Boolean.valueOf(ze5Var.f391959m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f391953d);
            java.lang.String str = this.f391954e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391955f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f391956g);
            fVar.e(5, this.f391957h);
            java.lang.String str3 = this.f391958i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f391959m);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f391953d) + 0;
            java.lang.String str4 = this.f391954e;
            if (str4 != null) {
                a17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f391955f;
            if (str5 != null) {
                a17 += b36.f.j(3, str5);
            }
            int e17 = a17 + b36.f.e(4, this.f391956g) + b36.f.e(5, this.f391957h);
            java.lang.String str6 = this.f391958i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.a(7, this.f391959m);
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
        r45.ze5 ze5Var = (r45.ze5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ze5Var.f391953d = aVar2.c(intValue);
                return 0;
            case 2:
                ze5Var.f391954e = aVar2.k(intValue);
                return 0;
            case 3:
                ze5Var.f391955f = aVar2.k(intValue);
                return 0;
            case 4:
                ze5Var.f391956g = aVar2.g(intValue);
                return 0;
            case 5:
                ze5Var.f391957h = aVar2.g(intValue);
                return 0;
            case 6:
                ze5Var.f391958i = aVar2.k(intValue);
                return 0;
            case 7:
                ze5Var.f391959m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
