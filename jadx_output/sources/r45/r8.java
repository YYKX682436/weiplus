package r45;

/* loaded from: classes8.dex */
public class r8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384601d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384602e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384603f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384604g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384605h;

    /* renamed from: i, reason: collision with root package name */
    public int f384606i;

    /* renamed from: m, reason: collision with root package name */
    public int f384607m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r8)) {
            return false;
        }
        r45.r8 r8Var = (r45.r8) fVar;
        return n51.f.a(this.f384601d, r8Var.f384601d) && n51.f.a(this.f384602e, r8Var.f384602e) && n51.f.a(this.f384603f, r8Var.f384603f) && n51.f.a(this.f384604g, r8Var.f384604g) && n51.f.a(this.f384605h, r8Var.f384605h) && n51.f.a(java.lang.Integer.valueOf(this.f384606i), java.lang.Integer.valueOf(r8Var.f384606i)) && n51.f.a(java.lang.Integer.valueOf(this.f384607m), java.lang.Integer.valueOf(r8Var.f384607m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384601d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384602e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384603f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384604g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f384605h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f384606i);
            fVar.e(7, this.f384607m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f384601d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f384602e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f384603f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f384604g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f384605h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f384606i) + b36.f.e(7, this.f384607m);
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
        r45.r8 r8Var = (r45.r8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r8Var.f384601d = aVar2.k(intValue);
                return 0;
            case 2:
                r8Var.f384602e = aVar2.k(intValue);
                return 0;
            case 3:
                r8Var.f384603f = aVar2.k(intValue);
                return 0;
            case 4:
                r8Var.f384604g = aVar2.k(intValue);
                return 0;
            case 5:
                r8Var.f384605h = aVar2.k(intValue);
                return 0;
            case 6:
                r8Var.f384606i = aVar2.g(intValue);
                return 0;
            case 7:
                r8Var.f384607m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
