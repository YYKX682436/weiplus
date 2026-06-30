package r45;

/* loaded from: classes4.dex */
public class ib6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376911f;

    /* renamed from: g, reason: collision with root package name */
    public long f376912g;

    /* renamed from: h, reason: collision with root package name */
    public long f376913h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376914i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376915m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f376916n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ib6)) {
            return false;
        }
        r45.ib6 ib6Var = (r45.ib6) fVar;
        return n51.f.a(this.f376909d, ib6Var.f376909d) && n51.f.a(this.f376910e, ib6Var.f376910e) && n51.f.a(this.f376911f, ib6Var.f376911f) && n51.f.a(java.lang.Long.valueOf(this.f376912g), java.lang.Long.valueOf(ib6Var.f376912g)) && n51.f.a(java.lang.Long.valueOf(this.f376913h), java.lang.Long.valueOf(ib6Var.f376913h)) && n51.f.a(this.f376914i, ib6Var.f376914i) && n51.f.a(this.f376915m, ib6Var.f376915m) && n51.f.a(java.lang.Boolean.valueOf(this.f376916n), java.lang.Boolean.valueOf(ib6Var.f376916n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376909d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376910e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376911f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f376912g);
            fVar.h(5, this.f376913h);
            java.lang.String str4 = this.f376914i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f376915m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f376916n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f376909d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f376910e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f376911f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int h17 = j17 + b36.f.h(4, this.f376912g) + b36.f.h(5, this.f376913h);
            java.lang.String str9 = this.f376914i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f376915m;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            return h17 + b36.f.a(8, this.f376916n);
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
        r45.ib6 ib6Var = (r45.ib6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ib6Var.f376909d = aVar2.k(intValue);
                return 0;
            case 2:
                ib6Var.f376910e = aVar2.k(intValue);
                return 0;
            case 3:
                ib6Var.f376911f = aVar2.k(intValue);
                return 0;
            case 4:
                ib6Var.f376912g = aVar2.i(intValue);
                return 0;
            case 5:
                ib6Var.f376913h = aVar2.i(intValue);
                return 0;
            case 6:
                ib6Var.f376914i = aVar2.k(intValue);
                return 0;
            case 7:
                ib6Var.f376915m = aVar2.k(intValue);
                return 0;
            case 8:
                ib6Var.f376916n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
