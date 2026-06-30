package r45;

/* loaded from: classes8.dex */
public class re6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384775e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384776f;

    /* renamed from: g, reason: collision with root package name */
    public int f384777g;

    /* renamed from: h, reason: collision with root package name */
    public int f384778h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384779i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384780m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re6)) {
            return false;
        }
        r45.re6 re6Var = (r45.re6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384774d), java.lang.Integer.valueOf(re6Var.f384774d)) && n51.f.a(this.f384775e, re6Var.f384775e) && n51.f.a(this.f384776f, re6Var.f384776f) && n51.f.a(java.lang.Integer.valueOf(this.f384777g), java.lang.Integer.valueOf(re6Var.f384777g)) && n51.f.a(java.lang.Integer.valueOf(this.f384778h), java.lang.Integer.valueOf(re6Var.f384778h)) && n51.f.a(this.f384779i, re6Var.f384779i) && n51.f.a(this.f384780m, re6Var.f384780m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384774d);
            java.lang.String str = this.f384775e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384776f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f384777g);
            fVar.e(5, this.f384778h);
            java.lang.String str3 = this.f384779i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f384780m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384774d) + 0;
            java.lang.String str5 = this.f384775e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f384776f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f384777g) + b36.f.e(5, this.f384778h);
            java.lang.String str7 = this.f384779i;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f384780m;
            return str8 != null ? e18 + b36.f.j(7, str8) : e18;
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
        r45.re6 re6Var = (r45.re6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                re6Var.f384774d = aVar2.g(intValue);
                return 0;
            case 2:
                re6Var.f384775e = aVar2.k(intValue);
                return 0;
            case 3:
                re6Var.f384776f = aVar2.k(intValue);
                return 0;
            case 4:
                re6Var.f384777g = aVar2.g(intValue);
                return 0;
            case 5:
                re6Var.f384778h = aVar2.g(intValue);
                return 0;
            case 6:
                re6Var.f384779i = aVar2.k(intValue);
                return 0;
            case 7:
                re6Var.f384780m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
