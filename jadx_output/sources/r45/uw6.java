package r45;

/* loaded from: classes11.dex */
public class uw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387703e;

    /* renamed from: f, reason: collision with root package name */
    public int f387704f;

    /* renamed from: g, reason: collision with root package name */
    public int f387705g;

    /* renamed from: h, reason: collision with root package name */
    public long f387706h;

    /* renamed from: i, reason: collision with root package name */
    public long f387707i;

    /* renamed from: m, reason: collision with root package name */
    public long f387708m;

    /* renamed from: n, reason: collision with root package name */
    public long f387709n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uw6)) {
            return false;
        }
        r45.uw6 uw6Var = (r45.uw6) fVar;
        return n51.f.a(this.f387702d, uw6Var.f387702d) && n51.f.a(this.f387703e, uw6Var.f387703e) && n51.f.a(java.lang.Integer.valueOf(this.f387704f), java.lang.Integer.valueOf(uw6Var.f387704f)) && n51.f.a(java.lang.Integer.valueOf(this.f387705g), java.lang.Integer.valueOf(uw6Var.f387705g)) && n51.f.a(java.lang.Long.valueOf(this.f387706h), java.lang.Long.valueOf(uw6Var.f387706h)) && n51.f.a(java.lang.Long.valueOf(this.f387707i), java.lang.Long.valueOf(uw6Var.f387707i)) && n51.f.a(java.lang.Long.valueOf(this.f387708m), java.lang.Long.valueOf(uw6Var.f387708m)) && n51.f.a(java.lang.Long.valueOf(this.f387709n), java.lang.Long.valueOf(uw6Var.f387709n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387702d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387703e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f387704f);
            fVar.e(4, this.f387705g);
            fVar.h(5, this.f387706h);
            fVar.h(6, this.f387707i);
            fVar.h(7, this.f387708m);
            fVar.h(8, this.f387709n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387702d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f387703e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f387704f) + b36.f.e(4, this.f387705g) + b36.f.h(5, this.f387706h) + b36.f.h(6, this.f387707i) + b36.f.h(7, this.f387708m) + b36.f.h(8, this.f387709n);
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
        r45.uw6 uw6Var = (r45.uw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uw6Var.f387702d = aVar2.k(intValue);
                return 0;
            case 2:
                uw6Var.f387703e = aVar2.k(intValue);
                return 0;
            case 3:
                uw6Var.f387704f = aVar2.g(intValue);
                return 0;
            case 4:
                uw6Var.f387705g = aVar2.g(intValue);
                return 0;
            case 5:
                uw6Var.f387706h = aVar2.i(intValue);
                return 0;
            case 6:
                uw6Var.f387707i = aVar2.i(intValue);
                return 0;
            case 7:
                uw6Var.f387708m = aVar2.i(intValue);
                return 0;
            case 8:
                uw6Var.f387709n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
