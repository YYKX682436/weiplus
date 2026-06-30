package r45;

/* loaded from: classes4.dex */
public class lh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379474e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379475f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379476g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379477h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379478i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh0)) {
            return false;
        }
        r45.lh0 lh0Var = (r45.lh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379473d), java.lang.Integer.valueOf(lh0Var.f379473d)) && n51.f.a(this.f379474e, lh0Var.f379474e) && n51.f.a(this.f379475f, lh0Var.f379475f) && n51.f.a(this.f379476g, lh0Var.f379476g) && n51.f.a(this.f379477h, lh0Var.f379477h) && n51.f.a(this.f379478i, lh0Var.f379478i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379473d);
            java.lang.String str = this.f379474e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379475f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379476g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379477h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379478i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379473d) + 0;
            java.lang.String str6 = this.f379474e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f379475f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f379476g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f379477h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f379478i;
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
        r45.lh0 lh0Var = (r45.lh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lh0Var.f379473d = aVar2.g(intValue);
                return 0;
            case 2:
                lh0Var.f379474e = aVar2.k(intValue);
                return 0;
            case 3:
                lh0Var.f379475f = aVar2.k(intValue);
                return 0;
            case 4:
                lh0Var.f379476g = aVar2.k(intValue);
                return 0;
            case 5:
                lh0Var.f379477h = aVar2.k(intValue);
                return 0;
            case 6:
                lh0Var.f379478i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
