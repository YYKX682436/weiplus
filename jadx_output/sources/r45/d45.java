package r45;

/* loaded from: classes15.dex */
public class d45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372097d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372098e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372103m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372104n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f372107q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f372108r;

    /* renamed from: f, reason: collision with root package name */
    public int f372099f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f372100g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f372101h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f372102i = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f372105o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f372106p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d45)) {
            return false;
        }
        r45.d45 d45Var = (r45.d45) fVar;
        return n51.f.a(this.f372097d, d45Var.f372097d) && n51.f.a(this.f372098e, d45Var.f372098e) && n51.f.a(java.lang.Integer.valueOf(this.f372099f), java.lang.Integer.valueOf(d45Var.f372099f)) && n51.f.a(java.lang.Long.valueOf(this.f372100g), java.lang.Long.valueOf(d45Var.f372100g)) && n51.f.a(java.lang.Long.valueOf(this.f372101h), java.lang.Long.valueOf(d45Var.f372101h)) && n51.f.a(java.lang.Long.valueOf(this.f372102i), java.lang.Long.valueOf(d45Var.f372102i)) && n51.f.a(this.f372103m, d45Var.f372103m) && n51.f.a(this.f372104n, d45Var.f372104n) && n51.f.a(java.lang.Integer.valueOf(this.f372105o), java.lang.Integer.valueOf(d45Var.f372105o)) && n51.f.a(this.f372106p, d45Var.f372106p) && n51.f.a(this.f372107q, d45Var.f372107q) && n51.f.a(this.f372108r, d45Var.f372108r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372106p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372097d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372098e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372099f);
            fVar.h(4, this.f372100g);
            fVar.h(5, this.f372101h);
            fVar.h(6, this.f372102i);
            java.lang.String str3 = this.f372103m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f372104n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f372105o);
            fVar.g(10, 3, linkedList);
            java.lang.String str5 = this.f372107q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f372108r;
            if (str6 == null) {
                return 0;
            }
            fVar.j(12, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f372097d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f372098e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f372099f) + b36.f.h(4, this.f372100g) + b36.f.h(5, this.f372101h) + b36.f.h(6, this.f372102i);
            java.lang.String str9 = this.f372103m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f372104n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            int e18 = e17 + b36.f.e(9, this.f372105o) + b36.f.g(10, 3, linkedList);
            java.lang.String str11 = this.f372107q;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f372108r;
            return str12 != null ? e18 + b36.f.j(12, str12) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.d45 d45Var = (r45.d45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d45Var.f372097d = aVar2.k(intValue);
                return 0;
            case 2:
                d45Var.f372098e = aVar2.k(intValue);
                return 0;
            case 3:
                d45Var.f372099f = aVar2.g(intValue);
                return 0;
            case 4:
                d45Var.f372100g = aVar2.i(intValue);
                return 0;
            case 5:
                d45Var.f372101h = aVar2.i(intValue);
                return 0;
            case 6:
                d45Var.f372102i = aVar2.i(intValue);
                return 0;
            case 7:
                d45Var.f372103m = aVar2.k(intValue);
                return 0;
            case 8:
                d45Var.f372104n = aVar2.k(intValue);
                return 0;
            case 9:
                d45Var.f372105o = aVar2.g(intValue);
                return 0;
            case 10:
                d45Var.f372106p.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 11:
                d45Var.f372107q = aVar2.k(intValue);
                return 0;
            case 12:
                d45Var.f372108r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
