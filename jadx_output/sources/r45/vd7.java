package r45;

/* loaded from: classes7.dex */
public class vd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f388138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388139e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388140f;

    /* renamed from: g, reason: collision with root package name */
    public int f388141g;

    /* renamed from: h, reason: collision with root package name */
    public int f388142h;

    /* renamed from: i, reason: collision with root package name */
    public int f388143i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f388144m;

    /* renamed from: n, reason: collision with root package name */
    public int f388145n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vd7)) {
            return false;
        }
        r45.vd7 vd7Var = (r45.vd7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f388138d), java.lang.Boolean.valueOf(vd7Var.f388138d)) && n51.f.a(this.f388139e, vd7Var.f388139e) && n51.f.a(this.f388140f, vd7Var.f388140f) && n51.f.a(java.lang.Integer.valueOf(this.f388141g), java.lang.Integer.valueOf(vd7Var.f388141g)) && n51.f.a(java.lang.Integer.valueOf(this.f388142h), java.lang.Integer.valueOf(vd7Var.f388142h)) && n51.f.a(java.lang.Integer.valueOf(this.f388143i), java.lang.Integer.valueOf(vd7Var.f388143i)) && n51.f.a(java.lang.Boolean.valueOf(this.f388144m), java.lang.Boolean.valueOf(vd7Var.f388144m)) && n51.f.a(java.lang.Integer.valueOf(this.f388145n), java.lang.Integer.valueOf(vd7Var.f388145n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f388138d);
            java.lang.String str = this.f388139e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f388140f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f388141g);
            fVar.e(5, this.f388142h);
            fVar.e(6, this.f388143i);
            fVar.a(9, this.f388144m);
            fVar.e(10, this.f388145n);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f388138d) + 0;
            java.lang.String str2 = this.f388139e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388140f;
            if (gVar2 != null) {
                a17 += b36.f.b(3, gVar2);
            }
            return a17 + b36.f.e(4, this.f388141g) + b36.f.e(5, this.f388142h) + b36.f.e(6, this.f388143i) + b36.f.a(9, this.f388144m) + b36.f.e(10, this.f388145n);
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
        r45.vd7 vd7Var = (r45.vd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vd7Var.f388138d = aVar2.c(intValue);
                return 0;
            case 2:
                vd7Var.f388139e = aVar2.k(intValue);
                return 0;
            case 3:
                vd7Var.f388140f = aVar2.d(intValue);
                return 0;
            case 4:
                vd7Var.f388141g = aVar2.g(intValue);
                return 0;
            case 5:
                vd7Var.f388142h = aVar2.g(intValue);
                return 0;
            case 6:
                vd7Var.f388143i = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            default:
                return -1;
            case 9:
                vd7Var.f388144m = aVar2.c(intValue);
                return 0;
            case 10:
                vd7Var.f388145n = aVar2.g(intValue);
                return 0;
        }
    }
}
