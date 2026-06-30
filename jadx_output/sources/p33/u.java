package p33;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351646d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351647e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351648f;

    /* renamed from: g, reason: collision with root package name */
    public int f351649g;

    /* renamed from: h, reason: collision with root package name */
    public int f351650h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f351651i;

    /* renamed from: m, reason: collision with root package name */
    public int f351652m;

    /* renamed from: n, reason: collision with root package name */
    public long f351653n;

    /* renamed from: o, reason: collision with root package name */
    public int f351654o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.u)) {
            return false;
        }
        p33.u uVar = (p33.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351646d), java.lang.Integer.valueOf(uVar.f351646d)) && n51.f.a(this.f351647e, uVar.f351647e) && n51.f.a(this.f351648f, uVar.f351648f) && n51.f.a(java.lang.Integer.valueOf(this.f351649g), java.lang.Integer.valueOf(uVar.f351649g)) && n51.f.a(java.lang.Integer.valueOf(this.f351650h), java.lang.Integer.valueOf(uVar.f351650h)) && n51.f.a(java.lang.Boolean.valueOf(this.f351651i), java.lang.Boolean.valueOf(uVar.f351651i)) && n51.f.a(java.lang.Integer.valueOf(this.f351652m), java.lang.Integer.valueOf(uVar.f351652m)) && n51.f.a(java.lang.Long.valueOf(this.f351653n), java.lang.Long.valueOf(uVar.f351653n)) && n51.f.a(java.lang.Integer.valueOf(this.f351654o), java.lang.Integer.valueOf(uVar.f351654o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351646d);
            java.lang.String str = this.f351647e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f351648f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f351649g);
            fVar.e(5, this.f351650h);
            fVar.a(6, this.f351651i);
            fVar.e(7, this.f351652m);
            fVar.h(8, this.f351653n);
            fVar.e(9, this.f351654o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f351646d) + 0;
            java.lang.String str3 = this.f351647e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f351648f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f351649g) + b36.f.e(5, this.f351650h) + b36.f.a(6, this.f351651i) + b36.f.e(7, this.f351652m) + b36.f.h(8, this.f351653n) + b36.f.e(9, this.f351654o);
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
        p33.u uVar = (p33.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uVar.f351646d = aVar2.g(intValue);
                return 0;
            case 2:
                uVar.f351647e = aVar2.k(intValue);
                return 0;
            case 3:
                uVar.f351648f = aVar2.k(intValue);
                return 0;
            case 4:
                uVar.f351649g = aVar2.g(intValue);
                return 0;
            case 5:
                uVar.f351650h = aVar2.g(intValue);
                return 0;
            case 6:
                uVar.f351651i = aVar2.c(intValue);
                return 0;
            case 7:
                uVar.f351652m = aVar2.g(intValue);
                return 0;
            case 8:
                uVar.f351653n = aVar2.i(intValue);
                return 0;
            case 9:
                uVar.f351654o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
