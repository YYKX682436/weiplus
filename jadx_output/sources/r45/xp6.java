package r45;

/* loaded from: classes2.dex */
public class xp6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390319d;

    /* renamed from: e, reason: collision with root package name */
    public long f390320e;

    /* renamed from: f, reason: collision with root package name */
    public long f390321f;

    /* renamed from: g, reason: collision with root package name */
    public double f390322g;

    /* renamed from: h, reason: collision with root package name */
    public double f390323h;

    /* renamed from: i, reason: collision with root package name */
    public double f390324i;

    /* renamed from: m, reason: collision with root package name */
    public double f390325m;

    /* renamed from: n, reason: collision with root package name */
    public long f390326n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xp6)) {
            return false;
        }
        r45.xp6 xp6Var = (r45.xp6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390319d), java.lang.Long.valueOf(xp6Var.f390319d)) && n51.f.a(java.lang.Long.valueOf(this.f390320e), java.lang.Long.valueOf(xp6Var.f390320e)) && n51.f.a(java.lang.Long.valueOf(this.f390321f), java.lang.Long.valueOf(xp6Var.f390321f)) && n51.f.a(java.lang.Double.valueOf(this.f390322g), java.lang.Double.valueOf(xp6Var.f390322g)) && n51.f.a(java.lang.Double.valueOf(this.f390323h), java.lang.Double.valueOf(xp6Var.f390323h)) && n51.f.a(java.lang.Double.valueOf(this.f390324i), java.lang.Double.valueOf(xp6Var.f390324i)) && n51.f.a(java.lang.Double.valueOf(this.f390325m), java.lang.Double.valueOf(xp6Var.f390325m)) && n51.f.a(java.lang.Long.valueOf(this.f390326n), java.lang.Long.valueOf(xp6Var.f390326n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390319d);
            fVar.h(2, this.f390320e);
            fVar.h(3, this.f390321f);
            fVar.c(4, this.f390322g);
            fVar.c(5, this.f390323h);
            fVar.c(6, this.f390324i);
            fVar.c(7, this.f390325m);
            fVar.h(8, this.f390326n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f390319d) + 0 + b36.f.h(2, this.f390320e) + b36.f.h(3, this.f390321f) + b36.f.c(4, this.f390322g) + b36.f.c(5, this.f390323h) + b36.f.c(6, this.f390324i) + b36.f.c(7, this.f390325m) + b36.f.h(8, this.f390326n);
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
        r45.xp6 xp6Var = (r45.xp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xp6Var.f390319d = aVar2.i(intValue);
                return 0;
            case 2:
                xp6Var.f390320e = aVar2.i(intValue);
                return 0;
            case 3:
                xp6Var.f390321f = aVar2.i(intValue);
                return 0;
            case 4:
                xp6Var.f390322g = aVar2.e(intValue);
                return 0;
            case 5:
                xp6Var.f390323h = aVar2.e(intValue);
                return 0;
            case 6:
                xp6Var.f390324i = aVar2.e(intValue);
                return 0;
            case 7:
                xp6Var.f390325m = aVar2.e(intValue);
                return 0;
            case 8:
                xp6Var.f390326n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
