package r45;

/* loaded from: classes8.dex */
public class pk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383132d;

    /* renamed from: e, reason: collision with root package name */
    public int f383133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383134f;

    /* renamed from: g, reason: collision with root package name */
    public int f383135g;

    /* renamed from: h, reason: collision with root package name */
    public int f383136h;

    /* renamed from: i, reason: collision with root package name */
    public int f383137i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383138m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383139n;

    /* renamed from: o, reason: collision with root package name */
    public int f383140o;

    /* renamed from: p, reason: collision with root package name */
    public int f383141p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383142q;

    /* renamed from: r, reason: collision with root package name */
    public long f383143r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pk5)) {
            return false;
        }
        r45.pk5 pk5Var = (r45.pk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383132d), java.lang.Integer.valueOf(pk5Var.f383132d)) && n51.f.a(java.lang.Integer.valueOf(this.f383133e), java.lang.Integer.valueOf(pk5Var.f383133e)) && n51.f.a(this.f383134f, pk5Var.f383134f) && n51.f.a(java.lang.Integer.valueOf(this.f383135g), java.lang.Integer.valueOf(pk5Var.f383135g)) && n51.f.a(java.lang.Integer.valueOf(this.f383136h), java.lang.Integer.valueOf(pk5Var.f383136h)) && n51.f.a(java.lang.Integer.valueOf(this.f383137i), java.lang.Integer.valueOf(pk5Var.f383137i)) && n51.f.a(this.f383138m, pk5Var.f383138m) && n51.f.a(this.f383139n, pk5Var.f383139n) && n51.f.a(java.lang.Integer.valueOf(this.f383140o), java.lang.Integer.valueOf(pk5Var.f383140o)) && n51.f.a(java.lang.Integer.valueOf(this.f383141p), java.lang.Integer.valueOf(pk5Var.f383141p)) && n51.f.a(this.f383142q, pk5Var.f383142q) && n51.f.a(java.lang.Long.valueOf(this.f383143r), java.lang.Long.valueOf(pk5Var.f383143r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383132d);
            fVar.e(2, this.f383133e);
            java.lang.String str = this.f383134f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f383135g);
            fVar.e(5, this.f383136h);
            fVar.e(6, this.f383137i);
            java.lang.String str2 = this.f383138m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f383139n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f383140o);
            fVar.e(10, this.f383141p);
            java.lang.String str4 = this.f383142q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.h(12, this.f383143r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383132d) + 0 + b36.f.e(2, this.f383133e);
            java.lang.String str5 = this.f383134f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f383135g) + b36.f.e(5, this.f383136h) + b36.f.e(6, this.f383137i);
            java.lang.String str6 = this.f383138m;
            if (str6 != null) {
                e18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f383139n;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            int e19 = e18 + b36.f.e(9, this.f383140o) + b36.f.e(10, this.f383141p);
            java.lang.String str8 = this.f383142q;
            if (str8 != null) {
                e19 += b36.f.j(11, str8);
            }
            return e19 + b36.f.h(12, this.f383143r);
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
        r45.pk5 pk5Var = (r45.pk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pk5Var.f383132d = aVar2.g(intValue);
                return 0;
            case 2:
                pk5Var.f383133e = aVar2.g(intValue);
                return 0;
            case 3:
                pk5Var.f383134f = aVar2.k(intValue);
                return 0;
            case 4:
                pk5Var.f383135g = aVar2.g(intValue);
                return 0;
            case 5:
                pk5Var.f383136h = aVar2.g(intValue);
                return 0;
            case 6:
                pk5Var.f383137i = aVar2.g(intValue);
                return 0;
            case 7:
                pk5Var.f383138m = aVar2.k(intValue);
                return 0;
            case 8:
                pk5Var.f383139n = aVar2.k(intValue);
                return 0;
            case 9:
                pk5Var.f383140o = aVar2.g(intValue);
                return 0;
            case 10:
                pk5Var.f383141p = aVar2.g(intValue);
                return 0;
            case 11:
                pk5Var.f383142q = aVar2.k(intValue);
                return 0;
            case 12:
                pk5Var.f383143r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
