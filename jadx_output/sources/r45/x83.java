package r45;

/* loaded from: classes8.dex */
public class x83 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389857d;

    /* renamed from: e, reason: collision with root package name */
    public int f389858e;

    /* renamed from: f, reason: collision with root package name */
    public int f389859f;

    /* renamed from: g, reason: collision with root package name */
    public int f389860g;

    /* renamed from: h, reason: collision with root package name */
    public int f389861h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389862i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389863m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389864n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x83)) {
            return false;
        }
        r45.x83 x83Var = (r45.x83) fVar;
        return n51.f.a(this.f389857d, x83Var.f389857d) && n51.f.a(java.lang.Integer.valueOf(this.f389858e), java.lang.Integer.valueOf(x83Var.f389858e)) && n51.f.a(java.lang.Integer.valueOf(this.f389859f), java.lang.Integer.valueOf(x83Var.f389859f)) && n51.f.a(java.lang.Integer.valueOf(this.f389860g), java.lang.Integer.valueOf(x83Var.f389860g)) && n51.f.a(java.lang.Integer.valueOf(this.f389861h), java.lang.Integer.valueOf(x83Var.f389861h)) && n51.f.a(this.f389862i, x83Var.f389862i) && n51.f.a(this.f389863m, x83Var.f389863m) && n51.f.a(this.f389864n, x83Var.f389864n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389857d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389858e);
            fVar.e(3, this.f389859f);
            fVar.e(4, this.f389860g);
            fVar.e(5, this.f389861h);
            java.lang.String str2 = this.f389862i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f389863m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f389864n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f389857d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f389858e) + b36.f.e(3, this.f389859f) + b36.f.e(4, this.f389860g) + b36.f.e(5, this.f389861h);
            java.lang.String str6 = this.f389862i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f389863m;
            if (str7 != null) {
                j17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f389864n;
            return str8 != null ? j17 + b36.f.j(8, str8) : j17;
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
        r45.x83 x83Var = (r45.x83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x83Var.f389857d = aVar2.k(intValue);
                return 0;
            case 2:
                x83Var.f389858e = aVar2.g(intValue);
                return 0;
            case 3:
                x83Var.f389859f = aVar2.g(intValue);
                return 0;
            case 4:
                x83Var.f389860g = aVar2.g(intValue);
                return 0;
            case 5:
                x83Var.f389861h = aVar2.g(intValue);
                return 0;
            case 6:
                x83Var.f389862i = aVar2.k(intValue);
                return 0;
            case 7:
                x83Var.f389863m = aVar2.k(intValue);
                return 0;
            case 8:
                x83Var.f389864n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
