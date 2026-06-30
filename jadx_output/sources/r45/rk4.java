package r45;

/* loaded from: classes8.dex */
public class rk4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384964d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384965e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384966f;

    /* renamed from: g, reason: collision with root package name */
    public int f384967g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384968h;

    /* renamed from: i, reason: collision with root package name */
    public int f384969i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rk4)) {
            return false;
        }
        r45.rk4 rk4Var = (r45.rk4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384964d), java.lang.Integer.valueOf(rk4Var.f384964d)) && n51.f.a(this.f384965e, rk4Var.f384965e) && n51.f.a(this.f384966f, rk4Var.f384966f) && n51.f.a(java.lang.Integer.valueOf(this.f384967g), java.lang.Integer.valueOf(rk4Var.f384967g)) && n51.f.a(this.f384968h, rk4Var.f384968h) && n51.f.a(java.lang.Integer.valueOf(this.f384969i), java.lang.Integer.valueOf(rk4Var.f384969i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384964d);
            java.lang.String str = this.f384965e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384966f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f384967g);
            java.lang.String str3 = this.f384968h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f384969i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384964d) + 0;
            java.lang.String str4 = this.f384965e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f384966f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f384967g);
            java.lang.String str6 = this.f384968h;
            if (str6 != null) {
                e18 += b36.f.j(5, str6);
            }
            return e18 + b36.f.e(6, this.f384969i);
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
        r45.rk4 rk4Var = (r45.rk4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rk4Var.f384964d = aVar2.g(intValue);
                return 0;
            case 2:
                rk4Var.f384965e = aVar2.k(intValue);
                return 0;
            case 3:
                rk4Var.f384966f = aVar2.k(intValue);
                return 0;
            case 4:
                rk4Var.f384967g = aVar2.g(intValue);
                return 0;
            case 5:
                rk4Var.f384968h = aVar2.k(intValue);
                return 0;
            case 6:
                rk4Var.f384969i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
