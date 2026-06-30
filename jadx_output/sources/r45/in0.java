package r45;

/* loaded from: classes10.dex */
public class in0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377159d;

    /* renamed from: e, reason: collision with root package name */
    public int f377160e;

    /* renamed from: f, reason: collision with root package name */
    public int f377161f;

    /* renamed from: g, reason: collision with root package name */
    public int f377162g;

    /* renamed from: h, reason: collision with root package name */
    public int f377163h;

    /* renamed from: i, reason: collision with root package name */
    public int f377164i;

    /* renamed from: m, reason: collision with root package name */
    public int f377165m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in0)) {
            return false;
        }
        r45.in0 in0Var = (r45.in0) fVar;
        return n51.f.a(this.f377159d, in0Var.f377159d) && n51.f.a(java.lang.Integer.valueOf(this.f377160e), java.lang.Integer.valueOf(in0Var.f377160e)) && n51.f.a(java.lang.Integer.valueOf(this.f377161f), java.lang.Integer.valueOf(in0Var.f377161f)) && n51.f.a(java.lang.Integer.valueOf(this.f377162g), java.lang.Integer.valueOf(in0Var.f377162g)) && n51.f.a(java.lang.Integer.valueOf(this.f377163h), java.lang.Integer.valueOf(in0Var.f377163h)) && n51.f.a(java.lang.Integer.valueOf(this.f377164i), java.lang.Integer.valueOf(in0Var.f377164i)) && n51.f.a(java.lang.Integer.valueOf(this.f377165m), java.lang.Integer.valueOf(in0Var.f377165m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377159d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377160e);
            fVar.e(3, this.f377161f);
            fVar.e(4, this.f377162g);
            fVar.e(5, this.f377163h);
            fVar.e(6, this.f377164i);
            fVar.e(7, this.f377165m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377159d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f377160e) + b36.f.e(3, this.f377161f) + b36.f.e(4, this.f377162g) + b36.f.e(5, this.f377163h) + b36.f.e(6, this.f377164i) + b36.f.e(7, this.f377165m);
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
        r45.in0 in0Var = (r45.in0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                in0Var.f377159d = aVar2.k(intValue);
                return 0;
            case 2:
                in0Var.f377160e = aVar2.g(intValue);
                return 0;
            case 3:
                in0Var.f377161f = aVar2.g(intValue);
                return 0;
            case 4:
                in0Var.f377162g = aVar2.g(intValue);
                return 0;
            case 5:
                in0Var.f377163h = aVar2.g(intValue);
                return 0;
            case 6:
                in0Var.f377164i = aVar2.g(intValue);
                return 0;
            case 7:
                in0Var.f377165m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
