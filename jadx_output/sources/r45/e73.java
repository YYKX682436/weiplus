package r45;

/* loaded from: classes4.dex */
public class e73 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373065d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373066e;

    /* renamed from: f, reason: collision with root package name */
    public int f373067f;

    /* renamed from: g, reason: collision with root package name */
    public int f373068g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373069h;

    /* renamed from: i, reason: collision with root package name */
    public int f373070i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373071m;

    /* renamed from: n, reason: collision with root package name */
    public int f373072n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e73)) {
            return false;
        }
        r45.e73 e73Var = (r45.e73) fVar;
        return n51.f.a(this.f373065d, e73Var.f373065d) && n51.f.a(this.f373066e, e73Var.f373066e) && n51.f.a(java.lang.Integer.valueOf(this.f373067f), java.lang.Integer.valueOf(e73Var.f373067f)) && n51.f.a(java.lang.Integer.valueOf(this.f373068g), java.lang.Integer.valueOf(e73Var.f373068g)) && n51.f.a(this.f373069h, e73Var.f373069h) && n51.f.a(java.lang.Integer.valueOf(this.f373070i), java.lang.Integer.valueOf(e73Var.f373070i)) && n51.f.a(this.f373071m, e73Var.f373071m) && n51.f.a(java.lang.Integer.valueOf(this.f373072n), java.lang.Integer.valueOf(e73Var.f373072n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373065d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373066e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f373067f);
            fVar.e(4, this.f373068g);
            java.lang.String str3 = this.f373069h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373070i);
            java.lang.String str4 = this.f373071m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f373072n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f373065d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f373066e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f373067f) + b36.f.e(4, this.f373068g);
            java.lang.String str7 = this.f373069h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f373070i);
            java.lang.String str8 = this.f373071m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            return e18 + b36.f.e(8, this.f373072n);
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
        r45.e73 e73Var = (r45.e73) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e73Var.f373065d = aVar2.k(intValue);
                return 0;
            case 2:
                e73Var.f373066e = aVar2.k(intValue);
                return 0;
            case 3:
                e73Var.f373067f = aVar2.g(intValue);
                return 0;
            case 4:
                e73Var.f373068g = aVar2.g(intValue);
                return 0;
            case 5:
                e73Var.f373069h = aVar2.k(intValue);
                return 0;
            case 6:
                e73Var.f373070i = aVar2.g(intValue);
                return 0;
            case 7:
                e73Var.f373071m = aVar2.k(intValue);
                return 0;
            case 8:
                e73Var.f373072n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
