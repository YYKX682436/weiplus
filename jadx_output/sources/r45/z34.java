package r45;

/* loaded from: classes10.dex */
public class z34 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391674e;

    /* renamed from: f, reason: collision with root package name */
    public int f391675f;

    /* renamed from: g, reason: collision with root package name */
    public int f391676g;

    /* renamed from: h, reason: collision with root package name */
    public int f391677h;

    /* renamed from: i, reason: collision with root package name */
    public int f391678i;

    /* renamed from: m, reason: collision with root package name */
    public int f391679m;

    /* renamed from: n, reason: collision with root package name */
    public int f391680n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z34)) {
            return false;
        }
        r45.z34 z34Var = (r45.z34) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391673d), java.lang.Integer.valueOf(z34Var.f391673d)) && n51.f.a(this.f391674e, z34Var.f391674e) && n51.f.a(java.lang.Integer.valueOf(this.f391675f), java.lang.Integer.valueOf(z34Var.f391675f)) && n51.f.a(java.lang.Integer.valueOf(this.f391676g), java.lang.Integer.valueOf(z34Var.f391676g)) && n51.f.a(java.lang.Integer.valueOf(this.f391677h), java.lang.Integer.valueOf(z34Var.f391677h)) && n51.f.a(java.lang.Integer.valueOf(this.f391678i), java.lang.Integer.valueOf(z34Var.f391678i)) && n51.f.a(java.lang.Integer.valueOf(this.f391679m), java.lang.Integer.valueOf(z34Var.f391679m)) && n51.f.a(java.lang.Integer.valueOf(this.f391680n), java.lang.Integer.valueOf(z34Var.f391680n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391673d);
            java.lang.String str = this.f391674e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391675f);
            fVar.e(4, this.f391676g);
            fVar.e(5, this.f391677h);
            fVar.e(6, this.f391678i);
            fVar.e(7, this.f391679m);
            fVar.e(8, this.f391680n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391673d) + 0;
            java.lang.String str2 = this.f391674e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f391675f) + b36.f.e(4, this.f391676g) + b36.f.e(5, this.f391677h) + b36.f.e(6, this.f391678i) + b36.f.e(7, this.f391679m) + b36.f.e(8, this.f391680n);
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
        r45.z34 z34Var = (r45.z34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z34Var.f391673d = aVar2.g(intValue);
                return 0;
            case 2:
                z34Var.f391674e = aVar2.k(intValue);
                return 0;
            case 3:
                z34Var.f391675f = aVar2.g(intValue);
                return 0;
            case 4:
                z34Var.f391676g = aVar2.g(intValue);
                return 0;
            case 5:
                z34Var.f391677h = aVar2.g(intValue);
                return 0;
            case 6:
                z34Var.f391678i = aVar2.g(intValue);
                return 0;
            case 7:
                z34Var.f391679m = aVar2.g(intValue);
                return 0;
            case 8:
                z34Var.f391680n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
