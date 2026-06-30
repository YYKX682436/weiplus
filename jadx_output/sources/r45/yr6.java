package r45;

/* loaded from: classes9.dex */
public class yr6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391328d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391329e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391330f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391331g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391332h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391333i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr6)) {
            return false;
        }
        r45.yr6 yr6Var = (r45.yr6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391328d), java.lang.Integer.valueOf(yr6Var.f391328d)) && n51.f.a(this.f391329e, yr6Var.f391329e) && n51.f.a(this.f391330f, yr6Var.f391330f) && n51.f.a(this.f391331g, yr6Var.f391331g) && n51.f.a(this.f391332h, yr6Var.f391332h) && n51.f.a(this.f391333i, yr6Var.f391333i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391328d);
            java.lang.String str = this.f391329e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391330f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f391331g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f391332h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f391333i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391328d) + 0;
            java.lang.String str6 = this.f391329e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f391330f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f391331g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f391332h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f391333i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.yr6 yr6Var = (r45.yr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yr6Var.f391328d = aVar2.g(intValue);
                return 0;
            case 2:
                yr6Var.f391329e = aVar2.k(intValue);
                return 0;
            case 3:
                yr6Var.f391330f = aVar2.k(intValue);
                return 0;
            case 4:
                yr6Var.f391331g = aVar2.k(intValue);
                return 0;
            case 5:
                yr6Var.f391332h = aVar2.k(intValue);
                return 0;
            case 6:
                yr6Var.f391333i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
