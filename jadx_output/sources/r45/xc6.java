package r45;

/* loaded from: classes14.dex */
public class xc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389969d;

    /* renamed from: e, reason: collision with root package name */
    public int f389970e;

    /* renamed from: f, reason: collision with root package name */
    public int f389971f;

    /* renamed from: g, reason: collision with root package name */
    public int f389972g;

    /* renamed from: h, reason: collision with root package name */
    public int f389973h;

    /* renamed from: i, reason: collision with root package name */
    public int f389974i;

    /* renamed from: m, reason: collision with root package name */
    public int f389975m;

    /* renamed from: o, reason: collision with root package name */
    public int f389977o;

    /* renamed from: p, reason: collision with root package name */
    public int f389978p;

    /* renamed from: r, reason: collision with root package name */
    public int f389980r;

    /* renamed from: s, reason: collision with root package name */
    public int f389981s;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f389976n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f389979q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xc6)) {
            return false;
        }
        r45.xc6 xc6Var = (r45.xc6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389969d), java.lang.Integer.valueOf(xc6Var.f389969d)) && n51.f.a(java.lang.Integer.valueOf(this.f389970e), java.lang.Integer.valueOf(xc6Var.f389970e)) && n51.f.a(java.lang.Integer.valueOf(this.f389971f), java.lang.Integer.valueOf(xc6Var.f389971f)) && n51.f.a(java.lang.Integer.valueOf(this.f389972g), java.lang.Integer.valueOf(xc6Var.f389972g)) && n51.f.a(java.lang.Integer.valueOf(this.f389973h), java.lang.Integer.valueOf(xc6Var.f389973h)) && n51.f.a(java.lang.Integer.valueOf(this.f389974i), java.lang.Integer.valueOf(xc6Var.f389974i)) && n51.f.a(java.lang.Integer.valueOf(this.f389975m), java.lang.Integer.valueOf(xc6Var.f389975m)) && n51.f.a(this.f389976n, xc6Var.f389976n) && n51.f.a(java.lang.Integer.valueOf(this.f389977o), java.lang.Integer.valueOf(xc6Var.f389977o)) && n51.f.a(java.lang.Integer.valueOf(this.f389978p), java.lang.Integer.valueOf(xc6Var.f389978p)) && n51.f.a(this.f389979q, xc6Var.f389979q) && n51.f.a(java.lang.Integer.valueOf(this.f389980r), java.lang.Integer.valueOf(xc6Var.f389980r)) && n51.f.a(java.lang.Integer.valueOf(this.f389981s), java.lang.Integer.valueOf(xc6Var.f389981s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389979q;
        java.util.LinkedList linkedList2 = this.f389976n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389969d);
            fVar.e(2, this.f389970e);
            fVar.e(3, this.f389971f);
            fVar.e(4, this.f389972g);
            fVar.e(5, this.f389973h);
            fVar.e(6, this.f389974i);
            fVar.e(7, this.f389975m);
            fVar.g(8, 2, linkedList2);
            fVar.e(9, this.f389977o);
            fVar.e(10, this.f389978p);
            fVar.g(11, 2, linkedList);
            fVar.e(12, this.f389980r);
            fVar.e(13, this.f389981s);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f389969d) + 0 + b36.f.e(2, this.f389970e) + b36.f.e(3, this.f389971f) + b36.f.e(4, this.f389972g) + b36.f.e(5, this.f389973h) + b36.f.e(6, this.f389974i) + b36.f.e(7, this.f389975m) + b36.f.g(8, 2, linkedList2) + b36.f.e(9, this.f389977o) + b36.f.e(10, this.f389978p) + b36.f.g(11, 2, linkedList) + b36.f.e(12, this.f389980r) + b36.f.e(13, this.f389981s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.xc6 xc6Var = (r45.xc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xc6Var.f389969d = aVar2.g(intValue);
                return 0;
            case 2:
                xc6Var.f389970e = aVar2.g(intValue);
                return 0;
            case 3:
                xc6Var.f389971f = aVar2.g(intValue);
                return 0;
            case 4:
                xc6Var.f389972g = aVar2.g(intValue);
                return 0;
            case 5:
                xc6Var.f389973h = aVar2.g(intValue);
                return 0;
            case 6:
                xc6Var.f389974i = aVar2.g(intValue);
                return 0;
            case 7:
                xc6Var.f389975m = aVar2.g(intValue);
                return 0;
            case 8:
                xc6Var.f389976n.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 9:
                xc6Var.f389977o = aVar2.g(intValue);
                return 0;
            case 10:
                xc6Var.f389978p = aVar2.g(intValue);
                return 0;
            case 11:
                xc6Var.f389979q.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                xc6Var.f389980r = aVar2.g(intValue);
                return 0;
            case 13:
                xc6Var.f389981s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
