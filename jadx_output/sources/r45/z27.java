package r45;

/* loaded from: classes14.dex */
public class z27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391638d;

    /* renamed from: e, reason: collision with root package name */
    public int f391639e;

    /* renamed from: f, reason: collision with root package name */
    public int f391640f;

    /* renamed from: g, reason: collision with root package name */
    public int f391641g;

    /* renamed from: h, reason: collision with root package name */
    public int f391642h;

    /* renamed from: i, reason: collision with root package name */
    public int f391643i;

    /* renamed from: m, reason: collision with root package name */
    public int f391644m;

    /* renamed from: n, reason: collision with root package name */
    public int f391645n;

    /* renamed from: o, reason: collision with root package name */
    public int f391646o;

    /* renamed from: p, reason: collision with root package name */
    public int f391647p;

    /* renamed from: r, reason: collision with root package name */
    public int f391649r;

    /* renamed from: t, reason: collision with root package name */
    public int f391651t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f391653v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f391654w;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f391648q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f391650s = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f391652u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z27)) {
            return false;
        }
        r45.z27 z27Var = (r45.z27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391638d), java.lang.Integer.valueOf(z27Var.f391638d)) && n51.f.a(java.lang.Integer.valueOf(this.f391639e), java.lang.Integer.valueOf(z27Var.f391639e)) && n51.f.a(java.lang.Integer.valueOf(this.f391640f), java.lang.Integer.valueOf(z27Var.f391640f)) && n51.f.a(java.lang.Integer.valueOf(this.f391641g), java.lang.Integer.valueOf(z27Var.f391641g)) && n51.f.a(java.lang.Integer.valueOf(this.f391642h), java.lang.Integer.valueOf(z27Var.f391642h)) && n51.f.a(java.lang.Integer.valueOf(this.f391643i), java.lang.Integer.valueOf(z27Var.f391643i)) && n51.f.a(java.lang.Integer.valueOf(this.f391644m), java.lang.Integer.valueOf(z27Var.f391644m)) && n51.f.a(java.lang.Integer.valueOf(this.f391645n), java.lang.Integer.valueOf(z27Var.f391645n)) && n51.f.a(java.lang.Integer.valueOf(this.f391646o), java.lang.Integer.valueOf(z27Var.f391646o)) && n51.f.a(java.lang.Integer.valueOf(this.f391647p), java.lang.Integer.valueOf(z27Var.f391647p)) && n51.f.a(this.f391648q, z27Var.f391648q) && n51.f.a(java.lang.Integer.valueOf(this.f391649r), java.lang.Integer.valueOf(z27Var.f391649r)) && n51.f.a(this.f391650s, z27Var.f391650s) && n51.f.a(java.lang.Integer.valueOf(this.f391651t), java.lang.Integer.valueOf(z27Var.f391651t)) && n51.f.a(this.f391652u, z27Var.f391652u) && n51.f.a(this.f391653v, z27Var.f391653v) && n51.f.a(this.f391654w, z27Var.f391654w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391652u;
        java.util.LinkedList linkedList2 = this.f391650s;
        java.util.LinkedList linkedList3 = this.f391648q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391638d);
            fVar.e(2, this.f391639e);
            fVar.e(3, this.f391640f);
            fVar.e(4, this.f391641g);
            fVar.e(5, this.f391642h);
            fVar.e(6, this.f391643i);
            fVar.e(7, this.f391644m);
            fVar.e(8, this.f391645n);
            fVar.e(9, this.f391646o);
            fVar.e(10, this.f391647p);
            fVar.g(11, 2, linkedList3);
            fVar.e(12, this.f391649r);
            fVar.g(13, 2, linkedList2);
            fVar.e(14, this.f391651t);
            fVar.g(15, 2, linkedList);
            java.lang.String str = this.f391653v;
            if (str != null) {
                fVar.j(16, str);
            }
            java.lang.String str2 = this.f391654w;
            if (str2 != null) {
                fVar.j(17, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391638d) + 0 + b36.f.e(2, this.f391639e) + b36.f.e(3, this.f391640f) + b36.f.e(4, this.f391641g) + b36.f.e(5, this.f391642h) + b36.f.e(6, this.f391643i) + b36.f.e(7, this.f391644m) + b36.f.e(8, this.f391645n) + b36.f.e(9, this.f391646o) + b36.f.e(10, this.f391647p) + b36.f.g(11, 2, linkedList3) + b36.f.e(12, this.f391649r) + b36.f.g(13, 2, linkedList2) + b36.f.e(14, this.f391651t) + b36.f.g(15, 2, linkedList);
            java.lang.String str3 = this.f391653v;
            if (str3 != null) {
                e17 += b36.f.j(16, str3);
            }
            java.lang.String str4 = this.f391654w;
            return str4 != null ? e17 + b36.f.j(17, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.z27 z27Var = (r45.z27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z27Var.f391638d = aVar2.g(intValue);
                return 0;
            case 2:
                z27Var.f391639e = aVar2.g(intValue);
                return 0;
            case 3:
                z27Var.f391640f = aVar2.g(intValue);
                return 0;
            case 4:
                z27Var.f391641g = aVar2.g(intValue);
                return 0;
            case 5:
                z27Var.f391642h = aVar2.g(intValue);
                return 0;
            case 6:
                z27Var.f391643i = aVar2.g(intValue);
                return 0;
            case 7:
                z27Var.f391644m = aVar2.g(intValue);
                return 0;
            case 8:
                z27Var.f391645n = aVar2.g(intValue);
                return 0;
            case 9:
                z27Var.f391646o = aVar2.g(intValue);
                return 0;
            case 10:
                z27Var.f391647p = aVar2.g(intValue);
                return 0;
            case 11:
                z27Var.f391648q.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                z27Var.f391649r = aVar2.g(intValue);
                return 0;
            case 13:
                z27Var.f391650s.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 14:
                z27Var.f391651t = aVar2.g(intValue);
                return 0;
            case 15:
                z27Var.f391652u.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 16:
                z27Var.f391653v = aVar2.k(intValue);
                return 0;
            case 17:
                z27Var.f391654w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
