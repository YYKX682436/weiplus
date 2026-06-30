package r45;

/* loaded from: classes8.dex */
public class uk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387431d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387432e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387433f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387434g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387435h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387436i;

    /* renamed from: m, reason: collision with root package name */
    public int f387437m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uk4)) {
            return false;
        }
        r45.uk4 uk4Var = (r45.uk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387431d), java.lang.Integer.valueOf(uk4Var.f387431d)) && n51.f.a(this.f387432e, uk4Var.f387432e) && n51.f.a(this.f387433f, uk4Var.f387433f) && n51.f.a(this.f387434g, uk4Var.f387434g) && n51.f.a(this.f387435h, uk4Var.f387435h) && n51.f.a(this.f387436i, uk4Var.f387436i) && n51.f.a(java.lang.Integer.valueOf(this.f387437m), java.lang.Integer.valueOf(uk4Var.f387437m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387431d);
            java.lang.String str = this.f387432e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387433f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387434g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387435h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f387436i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f387437m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387431d) + 0;
            java.lang.String str6 = this.f387432e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f387433f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f387434g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f387435h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f387436i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f387437m);
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
        r45.uk4 uk4Var = (r45.uk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uk4Var.f387431d = aVar2.g(intValue);
                return 0;
            case 2:
                uk4Var.f387432e = aVar2.k(intValue);
                return 0;
            case 3:
                uk4Var.f387433f = aVar2.k(intValue);
                return 0;
            case 4:
                uk4Var.f387434g = aVar2.k(intValue);
                return 0;
            case 5:
                uk4Var.f387435h = aVar2.k(intValue);
                return 0;
            case 6:
                uk4Var.f387436i = aVar2.k(intValue);
                return 0;
            case 7:
                uk4Var.f387437m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
