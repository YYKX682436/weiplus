package r45;

/* loaded from: classes8.dex */
public class lm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379592d;

    /* renamed from: e, reason: collision with root package name */
    public int f379593e;

    /* renamed from: f, reason: collision with root package name */
    public int f379594f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379595g;

    /* renamed from: h, reason: collision with root package name */
    public int f379596h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379597i;

    /* renamed from: m, reason: collision with root package name */
    public long f379598m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379599n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm0)) {
            return false;
        }
        r45.lm0 lm0Var = (r45.lm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379592d), java.lang.Integer.valueOf(lm0Var.f379592d)) && n51.f.a(java.lang.Integer.valueOf(this.f379593e), java.lang.Integer.valueOf(lm0Var.f379593e)) && n51.f.a(java.lang.Integer.valueOf(this.f379594f), java.lang.Integer.valueOf(lm0Var.f379594f)) && n51.f.a(this.f379595g, lm0Var.f379595g) && n51.f.a(java.lang.Integer.valueOf(this.f379596h), java.lang.Integer.valueOf(lm0Var.f379596h)) && n51.f.a(this.f379597i, lm0Var.f379597i) && n51.f.a(java.lang.Long.valueOf(this.f379598m), java.lang.Long.valueOf(lm0Var.f379598m)) && n51.f.a(this.f379599n, lm0Var.f379599n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379592d);
            fVar.e(2, this.f379593e);
            fVar.e(3, this.f379594f);
            java.lang.String str = this.f379595g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f379596h);
            java.lang.String str2 = this.f379597i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.h(7, this.f379598m);
            java.lang.String str3 = this.f379599n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379592d) + 0 + b36.f.e(2, this.f379593e) + b36.f.e(3, this.f379594f);
            java.lang.String str4 = this.f379595g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int e18 = e17 + b36.f.e(5, this.f379596h);
            java.lang.String str5 = this.f379597i;
            if (str5 != null) {
                e18 += b36.f.j(6, str5);
            }
            int h17 = e18 + b36.f.h(7, this.f379598m);
            java.lang.String str6 = this.f379599n;
            return str6 != null ? h17 + b36.f.j(8, str6) : h17;
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
        r45.lm0 lm0Var = (r45.lm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lm0Var.f379592d = aVar2.g(intValue);
                return 0;
            case 2:
                lm0Var.f379593e = aVar2.g(intValue);
                return 0;
            case 3:
                lm0Var.f379594f = aVar2.g(intValue);
                return 0;
            case 4:
                lm0Var.f379595g = aVar2.k(intValue);
                return 0;
            case 5:
                lm0Var.f379596h = aVar2.g(intValue);
                return 0;
            case 6:
                lm0Var.f379597i = aVar2.k(intValue);
                return 0;
            case 7:
                lm0Var.f379598m = aVar2.i(intValue);
                return 0;
            case 8:
                lm0Var.f379599n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
