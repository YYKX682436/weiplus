package r45;

/* loaded from: classes12.dex */
public class j07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377477d;

    /* renamed from: e, reason: collision with root package name */
    public int f377478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f377479f;

    /* renamed from: g, reason: collision with root package name */
    public long f377480g;

    /* renamed from: h, reason: collision with root package name */
    public long f377481h;

    /* renamed from: i, reason: collision with root package name */
    public long f377482i;

    /* renamed from: m, reason: collision with root package name */
    public int f377483m;

    /* renamed from: n, reason: collision with root package name */
    public long f377484n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377485o;

    /* renamed from: p, reason: collision with root package name */
    public int f377486p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j07)) {
            return false;
        }
        r45.j07 j07Var = (r45.j07) fVar;
        return n51.f.a(this.f377477d, j07Var.f377477d) && n51.f.a(java.lang.Integer.valueOf(this.f377478e), java.lang.Integer.valueOf(j07Var.f377478e)) && n51.f.a(java.lang.Boolean.valueOf(this.f377479f), java.lang.Boolean.valueOf(j07Var.f377479f)) && n51.f.a(java.lang.Long.valueOf(this.f377480g), java.lang.Long.valueOf(j07Var.f377480g)) && n51.f.a(java.lang.Long.valueOf(this.f377481h), java.lang.Long.valueOf(j07Var.f377481h)) && n51.f.a(java.lang.Long.valueOf(this.f377482i), java.lang.Long.valueOf(j07Var.f377482i)) && n51.f.a(java.lang.Integer.valueOf(this.f377483m), java.lang.Integer.valueOf(j07Var.f377483m)) && n51.f.a(java.lang.Long.valueOf(this.f377484n), java.lang.Long.valueOf(j07Var.f377484n)) && n51.f.a(this.f377485o, j07Var.f377485o) && n51.f.a(java.lang.Integer.valueOf(this.f377486p), java.lang.Integer.valueOf(j07Var.f377486p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377477d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377478e);
            fVar.a(3, this.f377479f);
            fVar.h(4, this.f377480g);
            fVar.h(5, this.f377481h);
            fVar.h(6, this.f377482i);
            fVar.e(7, this.f377483m);
            fVar.h(8, this.f377484n);
            java.lang.String str2 = this.f377485o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f377486p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f377477d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f377478e) + b36.f.a(3, this.f377479f) + b36.f.h(4, this.f377480g) + b36.f.h(5, this.f377481h) + b36.f.h(6, this.f377482i) + b36.f.e(7, this.f377483m) + b36.f.h(8, this.f377484n);
            java.lang.String str4 = this.f377485o;
            if (str4 != null) {
                j17 += b36.f.j(9, str4);
            }
            return j17 + b36.f.e(10, this.f377486p);
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
        r45.j07 j07Var = (r45.j07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j07Var.f377477d = aVar2.k(intValue);
                return 0;
            case 2:
                j07Var.f377478e = aVar2.g(intValue);
                return 0;
            case 3:
                j07Var.f377479f = aVar2.c(intValue);
                return 0;
            case 4:
                j07Var.f377480g = aVar2.i(intValue);
                return 0;
            case 5:
                j07Var.f377481h = aVar2.i(intValue);
                return 0;
            case 6:
                j07Var.f377482i = aVar2.i(intValue);
                return 0;
            case 7:
                j07Var.f377483m = aVar2.g(intValue);
                return 0;
            case 8:
                j07Var.f377484n = aVar2.i(intValue);
                return 0;
            case 9:
                j07Var.f377485o = aVar2.k(intValue);
                return 0;
            case 10:
                j07Var.f377486p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
