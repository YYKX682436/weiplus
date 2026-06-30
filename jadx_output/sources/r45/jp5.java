package r45;

/* loaded from: classes11.dex */
public class jp5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378009d;

    /* renamed from: e, reason: collision with root package name */
    public long f378010e;

    /* renamed from: f, reason: collision with root package name */
    public int f378011f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f378012g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f378013h;

    /* renamed from: i, reason: collision with root package name */
    public int f378014i;

    /* renamed from: m, reason: collision with root package name */
    public int f378015m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378016n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp5)) {
            return false;
        }
        r45.jp5 jp5Var = (r45.jp5) fVar;
        return n51.f.a(this.f378009d, jp5Var.f378009d) && n51.f.a(java.lang.Long.valueOf(this.f378010e), java.lang.Long.valueOf(jp5Var.f378010e)) && n51.f.a(java.lang.Integer.valueOf(this.f378011f), java.lang.Integer.valueOf(jp5Var.f378011f)) && n51.f.a(java.lang.Boolean.valueOf(this.f378012g), java.lang.Boolean.valueOf(jp5Var.f378012g)) && n51.f.a(java.lang.Boolean.valueOf(this.f378013h), java.lang.Boolean.valueOf(jp5Var.f378013h)) && n51.f.a(java.lang.Integer.valueOf(this.f378014i), java.lang.Integer.valueOf(jp5Var.f378014i)) && n51.f.a(java.lang.Integer.valueOf(this.f378015m), java.lang.Integer.valueOf(jp5Var.f378015m)) && n51.f.a(java.lang.Boolean.valueOf(this.f378016n), java.lang.Boolean.valueOf(jp5Var.f378016n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378009d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f378010e);
            fVar.e(3, this.f378011f);
            fVar.a(4, this.f378012g);
            fVar.a(5, this.f378013h);
            fVar.e(6, this.f378014i);
            fVar.e(7, this.f378015m);
            fVar.a(8, this.f378016n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f378009d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f378010e) + b36.f.e(3, this.f378011f) + b36.f.a(4, this.f378012g) + b36.f.a(5, this.f378013h) + b36.f.e(6, this.f378014i) + b36.f.e(7, this.f378015m) + b36.f.a(8, this.f378016n);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.jp5 jp5Var = (r45.jp5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jp5Var.f378009d = aVar2.k(intValue);
                return 0;
            case 2:
                jp5Var.f378010e = aVar2.i(intValue);
                return 0;
            case 3:
                jp5Var.f378011f = aVar2.g(intValue);
                return 0;
            case 4:
                jp5Var.f378012g = aVar2.c(intValue);
                return 0;
            case 5:
                jp5Var.f378013h = aVar2.c(intValue);
                return 0;
            case 6:
                jp5Var.f378014i = aVar2.g(intValue);
                return 0;
            case 7:
                jp5Var.f378015m = aVar2.g(intValue);
                return 0;
            case 8:
                jp5Var.f378016n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
