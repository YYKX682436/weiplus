package r45;

/* loaded from: classes2.dex */
public class x47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f389776d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389777e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389778f;

    /* renamed from: g, reason: collision with root package name */
    public int f389779g;

    /* renamed from: h, reason: collision with root package name */
    public int f389780h;

    /* renamed from: i, reason: collision with root package name */
    public int f389781i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x47)) {
            return false;
        }
        r45.x47 x47Var = (r45.x47) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f389776d), java.lang.Boolean.valueOf(x47Var.f389776d)) && n51.f.a(this.f389777e, x47Var.f389777e) && n51.f.a(this.f389778f, x47Var.f389778f) && n51.f.a(java.lang.Integer.valueOf(this.f389779g), java.lang.Integer.valueOf(x47Var.f389779g)) && n51.f.a(java.lang.Integer.valueOf(this.f389780h), java.lang.Integer.valueOf(x47Var.f389780h)) && n51.f.a(java.lang.Integer.valueOf(this.f389781i), java.lang.Integer.valueOf(x47Var.f389781i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f389776d);
            java.lang.String str = this.f389777e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389778f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f389779g);
            fVar.e(5, this.f389780h);
            fVar.e(6, this.f389781i);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f389776d) + 0;
            java.lang.String str3 = this.f389777e;
            if (str3 != null) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f389778f;
            if (str4 != null) {
                a17 += b36.f.j(3, str4);
            }
            return a17 + b36.f.e(4, this.f389779g) + b36.f.e(5, this.f389780h) + b36.f.e(6, this.f389781i);
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
        r45.x47 x47Var = (r45.x47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x47Var.f389776d = aVar2.c(intValue);
                return 0;
            case 2:
                x47Var.f389777e = aVar2.k(intValue);
                return 0;
            case 3:
                x47Var.f389778f = aVar2.k(intValue);
                return 0;
            case 4:
                x47Var.f389779g = aVar2.g(intValue);
                return 0;
            case 5:
                x47Var.f389780h = aVar2.g(intValue);
                return 0;
            case 6:
                x47Var.f389781i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
